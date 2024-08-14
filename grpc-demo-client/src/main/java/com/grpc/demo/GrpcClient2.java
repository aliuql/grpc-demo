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
 * request -> StreamObserver<response> 异步监听模式
 */
@Slf4j
public class GrpcClient2 {

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9092)
                .keepAliveTime(1, TimeUnit.DAYS)
                .usePlaintext()
                .build();

        try {
            c2ss(managedChannel);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void c2ss(ManagedChannel managedChannel) {
        // 获取stub代理对象（异步监听）
        HelloServiceGrpc.HelloServiceStub helloService = HelloServiceGrpc.newStub(managedChannel);

        // 完成RPC调用
        HelloRequest request = HelloRequest.newBuilder().setName("aliuql").build();
        log.info("发送:{}", request.getName());

        helloService.c2ss(request, new StreamObserver<HelloResponse>() {
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

        TimeUtils.sleepSeconds(24 * 60 * 60);
    }
}
