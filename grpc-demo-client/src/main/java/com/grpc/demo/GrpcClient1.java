package com.grpc.demo;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * request -> response 一元操作unary模式
 */
@Slf4j
public class GrpcClient1 {

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();

        try {
            c2s(managedChannel);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void c2s(ManagedChannel managedChannel) {
        // 获取stub代理对象（同步阻塞）
        HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(managedChannel);

        // 完成RPC调用
        HelloMessage.HelloRequest request = HelloMessage.HelloRequest.newBuilder().setName("aliuql").build();
        log.info("发送:{}", request.getName());

        HelloMessage.HelloResponse response = helloService.c2s(request);
        log.info("接收:{}", response.getResult());
    }
}
