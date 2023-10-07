package com.grpc.demo.service;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello1(HelloMessage.HelloRequest request, StreamObserver<HelloMessage.HelloResponse> responseObserver) {
        // 1. 获取客户端的请求参数，校验
        log.info("请求:{}", request.getName());

        // 2. 业务处理

        // 3. 封装应答对象,并发送客户端
        HelloMessage.HelloResponse.Builder builder = HelloMessage.HelloResponse.newBuilder();
        HelloMessage.HelloResponse response = builder.setResult("ok").build();
        responseObserver.onNext(response);

        // 4. 关闭stream
        responseObserver.onCompleted();
    }

    @Override
    public void hello2(HelloMessage.HelloRequest request, StreamObserver<HelloMessage.HelloResponse> responseObserver) {
        // 1. 获取客户端的请求参数，校验
        log.info("请求:{}", request.getName());

        for (int i = 0; i < 4; i++) {
            HelloMessage.HelloResponse.Builder builder = HelloMessage.HelloResponse.newBuilder();
            HelloMessage.HelloResponse response = builder.setResult("ok" + (i + 1)).build();
            responseObserver.onNext(response);
        }

        // 4. 关闭stream
        responseObserver.onCompleted();
    }
}
