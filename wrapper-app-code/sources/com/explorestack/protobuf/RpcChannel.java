package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

public interface RpcChannel {
    void callMethod(Descriptors.MethodDescriptor methodDescriptor, RpcController rpcController, Message message, Message message2, RpcCallback<Message> rpcCallback);
}
