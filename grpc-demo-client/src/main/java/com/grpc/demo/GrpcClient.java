package com.grpc.demo;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcClient {

    public static final Logger log = LoggerFactory.getLogger(GrpcClient.class);

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();
        // 2. 获取stub代理对象（同步阻塞）
        HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(managedChannel);

        // 3. 完成RPC调用
        // 3.1 准备参数
        HelloMessage.HelloRequest helloRequest = HelloMessage.HelloRequest.newBuilder().setName("aliuql").build();
        HelloMessage.HelloResponse helloResponse = helloService.hello(helloRequest);

        log.info("应答:{}", helloResponse.getResult());
    }
}
