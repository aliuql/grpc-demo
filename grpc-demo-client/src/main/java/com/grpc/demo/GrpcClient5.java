package com.grpc.demo;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.grpc.demo.api.grpc.HelloRequest;
import com.grpc.demo.api.grpc.HelloResponse;
import com.grpc.demo.api.grpc.HelloServiceGrpc;
import com.grpc.demo.api.utils.TimeUtils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * future只能用户一元操作unary，很少用到。
 * 如果一元操作想用异步模式的话，可以用future的异步模式
 */
@Slf4j
public class GrpcClient5 {

    public static void main(String[] args) {
        // 1. 创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9092)
                .keepAliveTime(1, TimeUnit.DAYS)
                .usePlaintext()
                .build();

        try {
            // 支持同步和异步两种方式
            c2sSync(managedChannel);
//            c2sAsync(managedChannel);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static void c2sSync(ManagedChannel managedChannel) {
        // 获取stub代理对象（类似netty的future模式,只支持unary模式,一次请求,一次应答.
        HelloServiceGrpc.HelloServiceFutureStub helloService = HelloServiceGrpc.newFutureStub(managedChannel);

        HelloRequest request = HelloRequest.newBuilder().setName("aliuql").build();
        log.info("发送:{}", request.getName());

        ListenableFuture<HelloResponse> future = helloService.c2s(request);

        try {
            HelloResponse response = future.get(1, TimeUnit.DAYS);
            log.info("同步接收:{}", response.getResult());

        } catch (InterruptedException e) {
            log.error("被中断", e);
        } catch (ExecutionException e) {
            log.error("执行中断", e);
        } catch (TimeoutException e) {
            log.error("执行超时", e);
        }
    }

    private static void c2sAsync(ManagedChannel managedChannel) {
        // 获取stub代理对象（类似netty的future模式,只支持unary模式,一次请求,一次应答.
        HelloServiceGrpc.HelloServiceFutureStub helloService = HelloServiceGrpc.newFutureStub(managedChannel);

        HelloRequest request = HelloRequest.newBuilder().setName("aliuql").build();
        log.info("发送:{}", request.getName());

        ListenableFuture<HelloResponse> future = helloService.c2s(request);

        Futures.addCallback(future, new FutureCallback<HelloResponse>() {
            @Override
            public void onSuccess(HelloResponse response) {
                log.info("异步接收:{}", response.getResult());
            }

            @Override
            public void onFailure(Throwable t) {
                log.info("异步接收失败");
            }
        }, Executors.newSingleThreadExecutor());

        TimeUtils.sleepSeconds(24 * 60 * 60);
    }
}
