package com.grpc.demo;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * request -> response unary模式
 */
@Slf4j
public class GrpcClient1 {

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();

        try {
            unary(managedChannel);
        } catch (Exception e) {
            log.error("发生异常", e);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void unary(ManagedChannel managedChannel) {
        // 获取stub代理对象（同步阻塞）
        HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(managedChannel);

        // 完成RPC调用
        HelloMessage.HelloRequest helloRequest = HelloMessage.HelloRequest.newBuilder().setName("aliuql").build();
        HelloMessage.HelloResponse helloResponse = helloService.hello1(helloRequest);

        log.info("应答:{}", helloResponse.getResult());
    }
}
