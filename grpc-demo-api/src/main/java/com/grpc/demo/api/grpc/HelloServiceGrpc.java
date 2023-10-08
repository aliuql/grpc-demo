package com.grpc.demo.api.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getC2sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "c2s",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getC2sMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getC2sMethod;
    if ((getC2sMethod = HelloServiceGrpc.getC2sMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getC2sMethod = HelloServiceGrpc.getC2sMethod) == null) {
          HelloServiceGrpc.getC2sMethod = getC2sMethod =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "c2s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("c2s"))
              .build();
        }
      }
    }
    return getC2sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getC2ssMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "c2ss",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getC2ssMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getC2ssMethod;
    if ((getC2ssMethod = HelloServiceGrpc.getC2ssMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getC2ssMethod = HelloServiceGrpc.getC2ssMethod) == null) {
          HelloServiceGrpc.getC2ssMethod = getC2ssMethod =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "c2ss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("c2ss"))
              .build();
        }
      }
    }
    return getC2ssMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getCs2sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cs2s",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getCs2sMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getCs2sMethod;
    if ((getCs2sMethod = HelloServiceGrpc.getCs2sMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCs2sMethod = HelloServiceGrpc.getCs2sMethod) == null) {
          HelloServiceGrpc.getCs2sMethod = getCs2sMethod =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cs2s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("cs2s"))
              .build();
        }
      }
    }
    return getCs2sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getCs2ssMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cs2ss",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getCs2ssMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getCs2ssMethod;
    if ((getCs2ssMethod = HelloServiceGrpc.getCs2ssMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCs2ssMethod = HelloServiceGrpc.getCs2ssMethod) == null) {
          HelloServiceGrpc.getCs2ssMethod = getCs2ssMethod =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cs2ss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("cs2ss"))
              .build();
        }
      }
    }
    return getCs2ssMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void c2s(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getC2sMethod(), responseObserver);
    }

    /**
     */
    default void c2ss(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getC2ssMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> cs2s(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCs2sMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> cs2ss(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCs2ssMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloService.
   */
  public static abstract class HelloServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void c2s(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getC2sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void c2ss(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getC2ssMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> cs2s(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCs2sMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> cs2ss(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCs2ssMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.demo.api.grpc.HelloMessage.HelloResponse c2s(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getC2sMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> c2ss(
        com.grpc.demo.api.grpc.HelloMessage.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getC2ssMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloService.
   */
  public static final class HelloServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> c2s(
        com.grpc.demo.api.grpc.HelloMessage.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getC2sMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_C2S = 0;
  private static final int METHODID_C2SS = 1;
  private static final int METHODID_CS2S = 2;
  private static final int METHODID_CS2SS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_C2S:
          serviceImpl.c2s((com.grpc.demo.api.grpc.HelloMessage.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
          break;
        case METHODID_C2SS:
          serviceImpl.c2ss((com.grpc.demo.api.grpc.HelloMessage.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CS2S:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cs2s(
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
        case METHODID_CS2SS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cs2ss(
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getC2sMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_C2S)))
        .addMethod(
          getC2ssMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_C2SS)))
        .addMethod(
          getCs2sMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_CS2S)))
        .addMethod(
          getCs2ssMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_CS2SS)))
        .build();
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.demo.api.grpc.HelloMessage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HelloServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getC2sMethod())
              .addMethod(getC2ssMethod())
              .addMethod(getCs2sMethod())
              .addMethod(getCs2ssMethod())
              .build();
        }
      }
    }
    return result;
  }
}