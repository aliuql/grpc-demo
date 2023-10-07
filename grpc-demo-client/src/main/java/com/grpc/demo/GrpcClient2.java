package com.grpc.demo;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
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
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();

        try {
            serverStream(managedChannel);
        } catch (Exception e) {
            log.error("发生异常", e);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void serverStream(ManagedChannel managedChannel) {
        // 获取stub代理对象（异步监听）
        HelloServiceGrpc.HelloServiceStub helloService = HelloServiceGrpc.newStub(managedChannel);

        // 完成RPC调用
        HelloMessage.HelloRequest helloRequest = HelloMessage.HelloRequest.newBuilder().setName("aliuql").build();
        helloService.hello2(helloRequest, new StreamObserver<HelloMessage.HelloResponse>() {
            @Override
            public void onNext(HelloMessage.HelloResponse helloResponse) {
                log.info("应答:{}", helloResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onCompleted() {
                log.info("应答结束");
            }
        });

        try {
            managedChannel.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException ignored) {
        }
    }
}
