package com.grpc.demo.service;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    public static final Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public void hello(HelloMessage.HelloRequest request, StreamObserver<HelloMessage.HelloResponse> responseObserver) {
        // 1. 获取客户端的请求参数，校验
        String name = request.getName();
        log.info("请求:{}", request.getName());

        // 2. 业务处理

        // 3. 封装应答对象,并发送客户端
        HelloMessage.HelloResponse.Builder builder = HelloMessage.HelloResponse.newBuilder();
        HelloMessage.HelloResponse response = builder.setResult("ok").build();
        responseObserver.onNext(response);

        // 4. 关闭stream
        responseObserver.onCompleted();
    }
}
