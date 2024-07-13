package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

public interface BlockingRpcChannel {
    Message callBlockingMethod(Descriptors.MethodDescriptor methodDescriptor, RpcController rpcController, Message message, Message message2) throws ServiceException;
}
