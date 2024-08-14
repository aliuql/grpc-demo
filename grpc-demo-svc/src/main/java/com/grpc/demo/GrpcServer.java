package com.grpc.demo;

import com.grpc.demo.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.concurrent.TimeUnit;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9092)
                .handshakeTimeout(1, TimeUnit.DAYS)
                .keepAliveTime(1, TimeUnit.DAYS)
                .keepAliveTimeout(20, TimeUnit.SECONDS)
                .addService(new HelloServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
