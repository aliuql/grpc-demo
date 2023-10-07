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
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello1",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello1Method() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello1Method;
    if ((getHello1Method = HelloServiceGrpc.getHello1Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello1Method = HelloServiceGrpc.getHello1Method) == null) {
          HelloServiceGrpc.getHello1Method = getHello1Method =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello1"))
              .build();
        }
      }
    }
    return getHello1Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello2",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello2Method() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello2Method;
    if ((getHello2Method = HelloServiceGrpc.getHello2Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello2Method = HelloServiceGrpc.getHello2Method) == null) {
          HelloServiceGrpc.getHello2Method = getHello2Method =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello2"))
              .build();
        }
      }
    }
    return getHello2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello3",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello3Method() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello3Method;
    if ((getHello3Method = HelloServiceGrpc.getHello3Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello3Method = HelloServiceGrpc.getHello3Method) == null) {
          HelloServiceGrpc.getHello3Method = getHello3Method =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello3"))
              .build();
        }
      }
    }
    return getHello3Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello4",
      requestType = com.grpc.demo.api.grpc.HelloMessage.HelloRequest.class,
      responseType = com.grpc.demo.api.grpc.HelloMessage.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
      com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello4Method() {
    io.grpc.MethodDescriptor<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse> getHello4Method;
    if ((getHello4Method = HelloServiceGrpc.getHello4Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello4Method = HelloServiceGrpc.getHello4Method) == null) {
          HelloServiceGrpc.getHello4Method = getHello4Method =
              io.grpc.MethodDescriptor.<com.grpc.demo.api.grpc.HelloMessage.HelloRequest, com.grpc.demo.api.grpc.HelloMessage.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.api.grpc.HelloMessage.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello4"))
              .build();
        }
      }
    }
    return getHello4Method;
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
    default void hello1(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello1Method(), responseObserver);
    }

    /**
     */
    default void hello2(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello2Method(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> hello3(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHello3Method(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> hello4(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHello4Method(), responseObserver);
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
    public void hello1(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHello1Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello2(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getHello2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> hello3(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHello3Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloRequest> hello4(
        io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getHello4Method(), getCallOptions()), responseObserver);
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
    public com.grpc.demo.api.grpc.HelloMessage.HelloResponse hello1(com.grpc.demo.api.grpc.HelloMessage.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHello1Method(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> hello2(
        com.grpc.demo.api.grpc.HelloMessage.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getHello2Method(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.api.grpc.HelloMessage.HelloResponse> hello1(
        com.grpc.demo.api.grpc.HelloMessage.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHello1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO1 = 0;
  private static final int METHODID_HELLO2 = 1;
  private static final int METHODID_HELLO3 = 2;
  private static final int METHODID_HELLO4 = 3;

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
        case METHODID_HELLO1:
          serviceImpl.hello1((com.grpc.demo.api.grpc.HelloMessage.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO2:
          serviceImpl.hello2((com.grpc.demo.api.grpc.HelloMessage.HelloRequest) request,
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
        case METHODID_HELLO3:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.hello3(
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
        case METHODID_HELLO4:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.hello4(
              (io.grpc.stub.StreamObserver<com.grpc.demo.api.grpc.HelloMessage.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHello1Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_HELLO1)))
        .addMethod(
          getHello2Method(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_HELLO2)))
        .addMethod(
          getHello3Method(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_HELLO3)))
        .addMethod(
          getHello4Method(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.grpc.demo.api.grpc.HelloMessage.HelloRequest,
              com.grpc.demo.api.grpc.HelloMessage.HelloResponse>(
                service, METHODID_HELLO4)))
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
              .addMethod(getHello1Method())
              .addMethod(getHello2Method())
              .addMethod(getHello3Method())
              .addMethod(getHello4Method())
              .build();
        }
      }
    }
    return result;
  }
}
