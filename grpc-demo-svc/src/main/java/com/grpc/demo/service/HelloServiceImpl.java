package com.grpc.demo.service;

import com.grpc.demo.api.grpc.HelloRequest;
import com.grpc.demo.api.grpc.HelloResponse;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void c2s(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        // 1. 获取客户端请求
        log.info("接收:{}", request.getName());

        // 2. 封装应答对象,并发送客户端
        HelloResponse.Builder builder = HelloResponse.newBuilder();
        HelloResponse response = builder.setResult("ok").build();

        log.info("发送:{}", response.getResult());
        responseObserver.onNext(response);

        // 3. 关闭stream
        log.info("发送结束");
        responseObserver.onCompleted();
    }

    @Override
    public void c2ss(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        // 1. 获取客户端请求
        log.info("接收:{}", request.getName());

        for (int i = 0; i < 2; i++) {
            HelloResponse.Builder builder = HelloResponse.newBuilder();
            HelloResponse response = builder.setResult("ok" + (i + 1)).build();

            log.info("发送:{}", response.getResult());
            responseObserver.onNext(response);
        }

        // 2. 关闭stream
        log.info("发送结束");
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<HelloRequest> cs2s(StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest request) {
                log.info("接收:{}", request.getName());
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onCompleted() {
                log.info("接收结束");

                HelloResponse.Builder builder = HelloResponse.newBuilder();
                HelloResponse response = builder.setResult("ok").build();

                log.info("发送:{}", response.getResult());
                responseObserver.onNext(response);

                log.info("发送结束");
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<HelloRequest> cs2ss(StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest request) {
                log.info("接收:{}", request.getName());

                HelloResponse.Builder builder = HelloResponse.newBuilder();
                HelloResponse response = builder.setResult("ok").build();

                log.info("发送:{}", response.getResult());
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onCompleted() {
                log.info("接收结束");

                log.info("发送结束");
                responseObserver.onCompleted();
            }
        };
    }
}
