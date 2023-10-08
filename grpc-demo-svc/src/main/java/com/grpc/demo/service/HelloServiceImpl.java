package com.grpc.demo.service;

import com.grpc.demo.api.grpc.HelloMessage;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void c2s(HelloMessage.HelloRequest request, StreamObserver<HelloMessage.HelloResponse> responseObserver) {
        // 1. 获取客户端请求
        log.info("接收:{}", request.getName());

        // 2. 封装应答对象,并发送客户端
        HelloMessage.HelloResponse.Builder builder = HelloMessage.HelloResponse.newBuilder();
        HelloMessage.HelloResponse response = builder.setResult("ok").build();

        log.info("发送:{}", response.getResult());
        responseObserver.onNext(response);

        // 3. 关闭stream
        log.info("发送结束");
        responseObserver.onCompleted();
    }

    @Override
    public void c2ss(HelloMessage.HelloRequest request, StreamObserver<HelloMessage.HelloResponse> responseObserver) {
        // 1. 获取客户端请求
        log.info("接收:{}", request.getName());

        for (int i = 0; i < 4; i++) {
            HelloMessage.HelloResponse.Builder builder = HelloMessage.HelloResponse.newBuilder();
            HelloMessage.HelloResponse response = builder.setResult("ok" + (i + 1)).build();

            log.info("发送:{}", response.getResult());
            responseObserver.onNext(response);
        }

        // 2. 关闭stream
        log.info("发送结束");
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<HelloMessage.HelloRequest> cs2s(StreamObserver<HelloMessage.HelloResponse> responseObserver) {
        return new StreamObserver<HelloMessage.HelloRequest>() {
            @Override
            public void onNext(HelloMessage.HelloRequest request) {
                log.info("接收:{}", request.getName());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                log.info("接收结束");

                HelloMessage.HelloResponse.Builder builder = HelloMessage.HelloResponse.newBuilder();
                HelloMessage.HelloResponse response = builder.setResult("ok").build();

                log.info("发送:{}", response.getResult());
                responseObserver.onNext(response);

                log.info("发送结束");
                responseObserver.onCompleted();
            }
        };
    }
}
