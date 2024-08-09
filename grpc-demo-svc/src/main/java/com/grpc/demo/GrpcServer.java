package com.grpc.demo;

import com.grpc.demo.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.concurrent.TimeUnit;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9092).handshakeTimeout(86400, TimeUnit.SECONDS)
                .addService(new HelloServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
