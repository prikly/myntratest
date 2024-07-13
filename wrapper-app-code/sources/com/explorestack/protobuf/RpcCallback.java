package com.explorestack.protobuf;

public interface RpcCallback<ParameterType> {
    void run(ParameterType parametertype);
}
