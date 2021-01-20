package com.kirill.org;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: shop.proto")
public final class shopGrpc {

  private shopGrpc() {}

  public static final String SERVICE_NAME = "shop";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kirill.org.Shop.Empty,
      com.kirill.org.Shop.APIResponse> getGetallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getall",
      requestType = com.kirill.org.Shop.Empty.class,
      responseType = com.kirill.org.Shop.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kirill.org.Shop.Empty,
      com.kirill.org.Shop.APIResponse> getGetallMethod() {
    io.grpc.MethodDescriptor<com.kirill.org.Shop.Empty, com.kirill.org.Shop.APIResponse> getGetallMethod;
    if ((getGetallMethod = shopGrpc.getGetallMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetallMethod = shopGrpc.getGetallMethod) == null) {
          shopGrpc.getGetallMethod = getGetallMethod = 
              io.grpc.MethodDescriptor.<com.kirill.org.Shop.Empty, com.kirill.org.Shop.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "getall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("getall"))
                  .build();
          }
        }
     }
     return getGetallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kirill.org.Shop.Request,
      com.kirill.org.Shop.OneResponse> getGetOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOne",
      requestType = com.kirill.org.Shop.Request.class,
      responseType = com.kirill.org.Shop.OneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kirill.org.Shop.Request,
      com.kirill.org.Shop.OneResponse> getGetOneMethod() {
    io.grpc.MethodDescriptor<com.kirill.org.Shop.Request, com.kirill.org.Shop.OneResponse> getGetOneMethod;
    if ((getGetOneMethod = shopGrpc.getGetOneMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetOneMethod = shopGrpc.getGetOneMethod) == null) {
          shopGrpc.getGetOneMethod = getGetOneMethod = 
              io.grpc.MethodDescriptor.<com.kirill.org.Shop.Request, com.kirill.org.Shop.OneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "getOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.OneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("getOne"))
                  .build();
          }
        }
     }
     return getGetOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kirill.org.Shop.PurchReq,
      com.kirill.org.Shop.PurchRes> getPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "purchase",
      requestType = com.kirill.org.Shop.PurchReq.class,
      responseType = com.kirill.org.Shop.PurchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kirill.org.Shop.PurchReq,
      com.kirill.org.Shop.PurchRes> getPurchaseMethod() {
    io.grpc.MethodDescriptor<com.kirill.org.Shop.PurchReq, com.kirill.org.Shop.PurchRes> getPurchaseMethod;
    if ((getPurchaseMethod = shopGrpc.getPurchaseMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getPurchaseMethod = shopGrpc.getPurchaseMethod) == null) {
          shopGrpc.getPurchaseMethod = getPurchaseMethod = 
              io.grpc.MethodDescriptor.<com.kirill.org.Shop.PurchReq, com.kirill.org.Shop.PurchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "purchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.PurchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.PurchRes.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("purchase"))
                  .build();
          }
        }
     }
     return getPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kirill.org.Shop.PLReq,
      com.kirill.org.Shop.PLRes> getGetPurchListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPurchList",
      requestType = com.kirill.org.Shop.PLReq.class,
      responseType = com.kirill.org.Shop.PLRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kirill.org.Shop.PLReq,
      com.kirill.org.Shop.PLRes> getGetPurchListMethod() {
    io.grpc.MethodDescriptor<com.kirill.org.Shop.PLReq, com.kirill.org.Shop.PLRes> getGetPurchListMethod;
    if ((getGetPurchListMethod = shopGrpc.getGetPurchListMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetPurchListMethod = shopGrpc.getGetPurchListMethod) == null) {
          shopGrpc.getGetPurchListMethod = getGetPurchListMethod = 
              io.grpc.MethodDescriptor.<com.kirill.org.Shop.PLReq, com.kirill.org.Shop.PLRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "getPurchList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.PLReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.PLRes.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("getPurchList"))
                  .build();
          }
        }
     }
     return getGetPurchListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kirill.org.Shop.OnePLReq,
      com.kirill.org.Shop.OnePLRes> getGetOnePurchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOnePurch",
      requestType = com.kirill.org.Shop.OnePLReq.class,
      responseType = com.kirill.org.Shop.OnePLRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kirill.org.Shop.OnePLReq,
      com.kirill.org.Shop.OnePLRes> getGetOnePurchMethod() {
    io.grpc.MethodDescriptor<com.kirill.org.Shop.OnePLReq, com.kirill.org.Shop.OnePLRes> getGetOnePurchMethod;
    if ((getGetOnePurchMethod = shopGrpc.getGetOnePurchMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetOnePurchMethod = shopGrpc.getGetOnePurchMethod) == null) {
          shopGrpc.getGetOnePurchMethod = getGetOnePurchMethod = 
              io.grpc.MethodDescriptor.<com.kirill.org.Shop.OnePLReq, com.kirill.org.Shop.OnePLRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "getOnePurch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.OnePLReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kirill.org.Shop.OnePLRes.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("getOnePurch"))
                  .build();
          }
        }
     }
     return getGetOnePurchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static shopStub newStub(io.grpc.Channel channel) {
    return new shopStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static shopBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new shopBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static shopFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new shopFutureStub(channel);
  }

  /**
   */
  public static abstract class shopImplBase implements io.grpc.BindableService {

    /**
     */
    public void getall(com.kirill.org.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetallMethod(), responseObserver);
    }

    /**
     */
    public void getOne(com.kirill.org.Shop.Request request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.OneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOneMethod(), responseObserver);
    }

    /**
     */
    public void purchase(com.kirill.org.Shop.PurchReq request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.PurchRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPurchaseMethod(), responseObserver);
    }

    /**
     */
    public void getPurchList(com.kirill.org.Shop.PLReq request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.PLRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPurchListMethod(), responseObserver);
    }

    /**
     */
    public void getOnePurch(com.kirill.org.Shop.OnePLReq request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.OnePLRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOnePurchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kirill.org.Shop.Empty,
                com.kirill.org.Shop.APIResponse>(
                  this, METHODID_GETALL)))
          .addMethod(
            getGetOneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kirill.org.Shop.Request,
                com.kirill.org.Shop.OneResponse>(
                  this, METHODID_GET_ONE)))
          .addMethod(
            getPurchaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kirill.org.Shop.PurchReq,
                com.kirill.org.Shop.PurchRes>(
                  this, METHODID_PURCHASE)))
          .addMethod(
            getGetPurchListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kirill.org.Shop.PLReq,
                com.kirill.org.Shop.PLRes>(
                  this, METHODID_GET_PURCH_LIST)))
          .addMethod(
            getGetOnePurchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kirill.org.Shop.OnePLReq,
                com.kirill.org.Shop.OnePLRes>(
                  this, METHODID_GET_ONE_PURCH)))
          .build();
    }
  }

  /**
   */
  public static final class shopStub extends io.grpc.stub.AbstractStub<shopStub> {
    private shopStub(io.grpc.Channel channel) {
      super(channel);
    }

    private shopStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected shopStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new shopStub(channel, callOptions);
    }

    /**
     */
    public void getall(com.kirill.org.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOne(com.kirill.org.Shop.Request request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.OneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchase(com.kirill.org.Shop.PurchReq request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.PurchRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPurchList(com.kirill.org.Shop.PLReq request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.PLRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPurchListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOnePurch(com.kirill.org.Shop.OnePLReq request,
        io.grpc.stub.StreamObserver<com.kirill.org.Shop.OnePLRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOnePurchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class shopBlockingStub extends io.grpc.stub.AbstractStub<shopBlockingStub> {
    private shopBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private shopBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected shopBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new shopBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kirill.org.Shop.APIResponse getall(com.kirill.org.Shop.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kirill.org.Shop.OneResponse getOne(com.kirill.org.Shop.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetOneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kirill.org.Shop.PurchRes purchase(com.kirill.org.Shop.PurchReq request) {
      return blockingUnaryCall(
          getChannel(), getPurchaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kirill.org.Shop.PLRes getPurchList(com.kirill.org.Shop.PLReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPurchListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kirill.org.Shop.OnePLRes getOnePurch(com.kirill.org.Shop.OnePLReq request) {
      return blockingUnaryCall(
          getChannel(), getGetOnePurchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class shopFutureStub extends io.grpc.stub.AbstractStub<shopFutureStub> {
    private shopFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private shopFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected shopFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new shopFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kirill.org.Shop.APIResponse> getall(
        com.kirill.org.Shop.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kirill.org.Shop.OneResponse> getOne(
        com.kirill.org.Shop.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kirill.org.Shop.PurchRes> purchase(
        com.kirill.org.Shop.PurchReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kirill.org.Shop.PLRes> getPurchList(
        com.kirill.org.Shop.PLReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPurchListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kirill.org.Shop.OnePLRes> getOnePurch(
        com.kirill.org.Shop.OnePLReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOnePurchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GETALL = 0;
  private static final int METHODID_GET_ONE = 1;
  private static final int METHODID_PURCHASE = 2;
  private static final int METHODID_GET_PURCH_LIST = 3;
  private static final int METHODID_GET_ONE_PURCH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final shopImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(shopImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GETALL:
          serviceImpl.getall((com.kirill.org.Shop.Empty) request,
              (io.grpc.stub.StreamObserver<com.kirill.org.Shop.APIResponse>) responseObserver);
          break;
        case METHODID_GET_ONE:
          serviceImpl.getOne((com.kirill.org.Shop.Request) request,
              (io.grpc.stub.StreamObserver<com.kirill.org.Shop.OneResponse>) responseObserver);
          break;
        case METHODID_PURCHASE:
          serviceImpl.purchase((com.kirill.org.Shop.PurchReq) request,
              (io.grpc.stub.StreamObserver<com.kirill.org.Shop.PurchRes>) responseObserver);
          break;
        case METHODID_GET_PURCH_LIST:
          serviceImpl.getPurchList((com.kirill.org.Shop.PLReq) request,
              (io.grpc.stub.StreamObserver<com.kirill.org.Shop.PLRes>) responseObserver);
          break;
        case METHODID_GET_ONE_PURCH:
          serviceImpl.getOnePurch((com.kirill.org.Shop.OnePLReq) request,
              (io.grpc.stub.StreamObserver<com.kirill.org.Shop.OnePLRes>) responseObserver);
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

  private static abstract class shopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    shopBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kirill.org.Shop.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("shop");
    }
  }

  private static final class shopFileDescriptorSupplier
      extends shopBaseDescriptorSupplier {
    shopFileDescriptorSupplier() {}
  }

  private static final class shopMethodDescriptorSupplier
      extends shopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    shopMethodDescriptorSupplier(String methodName) {
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
      synchronized (shopGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new shopFileDescriptorSupplier())
              .addMethod(getGetallMethod())
              .addMethod(getGetOneMethod())
              .addMethod(getPurchaseMethod())
              .addMethod(getGetPurchListMethod())
              .addMethod(getGetOnePurchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
