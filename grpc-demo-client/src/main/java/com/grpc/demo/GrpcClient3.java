package com.grpc.demo;

import com.grpc.demo.api.grpc.HelloRequest;
import com.grpc.demo.api.grpc.HelloResponse;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import com.grpc.demo.api.utils.TimeUtils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * StreamObserver<request> -> response (物联网设备，如传感器，定时上报信息）
 */
@Slf4j
public class GrpcClient3 {

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9092)
                .keepAliveTime(1, TimeUnit.DAYS)
                .usePlaintext()
                .build();

        try {
            cs2s(managedChannel);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void cs2s(ManagedChannel managedChannel) {
        // 获取stub代理对象（异步监听）
        HelloServiceGrpc.HelloServiceStub helloService = HelloServiceGrpc.newStub(managedChannel);

        // 完成RPC调用
        StreamObserver<HelloRequest> helloRequestStreamObserver = helloService.cs2s(new StreamObserver<HelloResponse>() {
            @Override
            public void onNext(HelloResponse helloResponse) {
                log.info("接收:{}", helloResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                log.info("接收结束");
            }
        });

        for (int i = 0; i < 4; i++) {
            HelloRequest helloRequest = HelloRequest.newBuilder().setName("aliuql" + (i + 1)).build();
            log.info("发送:{}", helloRequest.getName());
            helloRequestStreamObserver.onNext(helloRequest);
        }

        log.info("发送结束");
        helloRequestStreamObserver.onCompleted();

        TimeUtils.sleepSeconds(24 * 60 * 60);
    }
}
