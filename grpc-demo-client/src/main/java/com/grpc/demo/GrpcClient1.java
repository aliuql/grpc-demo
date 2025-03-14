package com.grpc.demo;

import com.grpc.demo.api.Constants;
import com.grpc.demo.api.grpc.HelloRequest;
import com.grpc.demo.api.grpc.HelloResponse;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import com.grpc.demo.api.utils.TimeUtils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * request -> response 一元操作unary模式
 */
@Slf4j
public class GrpcClient1 {

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress(Constants.SERVER_IP, Constants.SERVER_PORT)
                .keepAliveTime(1, TimeUnit.DAYS)
                .usePlaintext()
                .build();

        try {
            c2s(managedChannel);

            TimeUtils.sleepDays(1);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void c2s(ManagedChannel managedChannel) {
        // 获取stub代理对象（同步阻塞）
        HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(managedChannel);

        // 完成RPC调用
        HelloRequest request = HelloRequest.newBuilder().setName("aliuql").build();
        log.info("发送:{}", request.getName());

        HelloResponse response = helloService.c2s(request);
        log.info("接收:{}", response.getResult());
    }
}
