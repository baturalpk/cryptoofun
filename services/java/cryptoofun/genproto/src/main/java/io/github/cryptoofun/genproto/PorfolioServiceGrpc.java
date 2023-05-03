package io.github.cryptoofun.genproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: portfolio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PorfolioServiceGrpc {

  private PorfolioServiceGrpc() {}

  public static final String SERVICE_NAME = "PorfolioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.github.cryptoofun.genproto.AskPortfolioRequest,
      io.github.cryptoofun.genproto.AskPortfolioResponse> getAskPortfolioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AskPortfolio",
      requestType = io.github.cryptoofun.genproto.AskPortfolioRequest.class,
      responseType = io.github.cryptoofun.genproto.AskPortfolioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.cryptoofun.genproto.AskPortfolioRequest,
      io.github.cryptoofun.genproto.AskPortfolioResponse> getAskPortfolioMethod() {
    io.grpc.MethodDescriptor<io.github.cryptoofun.genproto.AskPortfolioRequest, io.github.cryptoofun.genproto.AskPortfolioResponse> getAskPortfolioMethod;
    if ((getAskPortfolioMethod = PorfolioServiceGrpc.getAskPortfolioMethod) == null) {
      synchronized (PorfolioServiceGrpc.class) {
        if ((getAskPortfolioMethod = PorfolioServiceGrpc.getAskPortfolioMethod) == null) {
          PorfolioServiceGrpc.getAskPortfolioMethod = getAskPortfolioMethod =
              io.grpc.MethodDescriptor.<io.github.cryptoofun.genproto.AskPortfolioRequest, io.github.cryptoofun.genproto.AskPortfolioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AskPortfolio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.cryptoofun.genproto.AskPortfolioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.cryptoofun.genproto.AskPortfolioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PorfolioServiceMethodDescriptorSupplier("AskPortfolio"))
              .build();
        }
      }
    }
    return getAskPortfolioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.github.cryptoofun.genproto.ModifySingleTickerRequest,
      io.github.cryptoofun.genproto.ModifySingleTickerResponse> getModifySingleTickerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySingleTicker",
      requestType = io.github.cryptoofun.genproto.ModifySingleTickerRequest.class,
      responseType = io.github.cryptoofun.genproto.ModifySingleTickerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.cryptoofun.genproto.ModifySingleTickerRequest,
      io.github.cryptoofun.genproto.ModifySingleTickerResponse> getModifySingleTickerMethod() {
    io.grpc.MethodDescriptor<io.github.cryptoofun.genproto.ModifySingleTickerRequest, io.github.cryptoofun.genproto.ModifySingleTickerResponse> getModifySingleTickerMethod;
    if ((getModifySingleTickerMethod = PorfolioServiceGrpc.getModifySingleTickerMethod) == null) {
      synchronized (PorfolioServiceGrpc.class) {
        if ((getModifySingleTickerMethod = PorfolioServiceGrpc.getModifySingleTickerMethod) == null) {
          PorfolioServiceGrpc.getModifySingleTickerMethod = getModifySingleTickerMethod =
              io.grpc.MethodDescriptor.<io.github.cryptoofun.genproto.ModifySingleTickerRequest, io.github.cryptoofun.genproto.ModifySingleTickerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifySingleTicker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.cryptoofun.genproto.ModifySingleTickerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.cryptoofun.genproto.ModifySingleTickerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PorfolioServiceMethodDescriptorSupplier("ModifySingleTicker"))
              .build();
        }
      }
    }
    return getModifySingleTickerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PorfolioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PorfolioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PorfolioServiceStub>() {
        @java.lang.Override
        public PorfolioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PorfolioServiceStub(channel, callOptions);
        }
      };
    return PorfolioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PorfolioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PorfolioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PorfolioServiceBlockingStub>() {
        @java.lang.Override
        public PorfolioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PorfolioServiceBlockingStub(channel, callOptions);
        }
      };
    return PorfolioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PorfolioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PorfolioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PorfolioServiceFutureStub>() {
        @java.lang.Override
        public PorfolioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PorfolioServiceFutureStub(channel, callOptions);
        }
      };
    return PorfolioServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void askPortfolio(io.github.cryptoofun.genproto.AskPortfolioRequest request,
        io.grpc.stub.StreamObserver<io.github.cryptoofun.genproto.AskPortfolioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAskPortfolioMethod(), responseObserver);
    }

    /**
     */
    default void modifySingleTicker(io.github.cryptoofun.genproto.ModifySingleTickerRequest request,
        io.grpc.stub.StreamObserver<io.github.cryptoofun.genproto.ModifySingleTickerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifySingleTickerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PorfolioService.
   */
  public static abstract class PorfolioServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PorfolioServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PorfolioService.
   */
  public static final class PorfolioServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PorfolioServiceStub> {
    private PorfolioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PorfolioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PorfolioServiceStub(channel, callOptions);
    }

    /**
     */
    public void askPortfolio(io.github.cryptoofun.genproto.AskPortfolioRequest request,
        io.grpc.stub.StreamObserver<io.github.cryptoofun.genproto.AskPortfolioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAskPortfolioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifySingleTicker(io.github.cryptoofun.genproto.ModifySingleTickerRequest request,
        io.grpc.stub.StreamObserver<io.github.cryptoofun.genproto.ModifySingleTickerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifySingleTickerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PorfolioService.
   */
  public static final class PorfolioServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PorfolioServiceBlockingStub> {
    private PorfolioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PorfolioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PorfolioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.github.cryptoofun.genproto.AskPortfolioResponse askPortfolio(io.github.cryptoofun.genproto.AskPortfolioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAskPortfolioMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.github.cryptoofun.genproto.ModifySingleTickerResponse modifySingleTicker(io.github.cryptoofun.genproto.ModifySingleTickerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifySingleTickerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PorfolioService.
   */
  public static final class PorfolioServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PorfolioServiceFutureStub> {
    private PorfolioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PorfolioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PorfolioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.cryptoofun.genproto.AskPortfolioResponse> askPortfolio(
        io.github.cryptoofun.genproto.AskPortfolioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAskPortfolioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.cryptoofun.genproto.ModifySingleTickerResponse> modifySingleTicker(
        io.github.cryptoofun.genproto.ModifySingleTickerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifySingleTickerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASK_PORTFOLIO = 0;
  private static final int METHODID_MODIFY_SINGLE_TICKER = 1;

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
        case METHODID_ASK_PORTFOLIO:
          serviceImpl.askPortfolio((io.github.cryptoofun.genproto.AskPortfolioRequest) request,
              (io.grpc.stub.StreamObserver<io.github.cryptoofun.genproto.AskPortfolioResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SINGLE_TICKER:
          serviceImpl.modifySingleTicker((io.github.cryptoofun.genproto.ModifySingleTickerRequest) request,
              (io.grpc.stub.StreamObserver<io.github.cryptoofun.genproto.ModifySingleTickerResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAskPortfolioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.github.cryptoofun.genproto.AskPortfolioRequest,
              io.github.cryptoofun.genproto.AskPortfolioResponse>(
                service, METHODID_ASK_PORTFOLIO)))
        .addMethod(
          getModifySingleTickerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.github.cryptoofun.genproto.ModifySingleTickerRequest,
              io.github.cryptoofun.genproto.ModifySingleTickerResponse>(
                service, METHODID_MODIFY_SINGLE_TICKER)))
        .build();
  }

  private static abstract class PorfolioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PorfolioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.cryptoofun.genproto.Portfolio.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PorfolioService");
    }
  }

  private static final class PorfolioServiceFileDescriptorSupplier
      extends PorfolioServiceBaseDescriptorSupplier {
    PorfolioServiceFileDescriptorSupplier() {}
  }

  private static final class PorfolioServiceMethodDescriptorSupplier
      extends PorfolioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PorfolioServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PorfolioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PorfolioServiceFileDescriptorSupplier())
              .addMethod(getAskPortfolioMethod())
              .addMethod(getModifySingleTickerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
