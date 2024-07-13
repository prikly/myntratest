package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.openrtb.Openrtb;

public interface OpenrtbOrBuilder extends MessageOrBuilder {
    String getDomainspec();

    ByteString getDomainspecBytes();

    String getDomainver();

    ByteString getDomainverBytes();

    Openrtb.PayloadCase getPayloadCase();

    Request getRequest();

    RequestOrBuilder getRequestOrBuilder();

    Response getResponse();

    ResponseOrBuilder getResponseOrBuilder();

    String getVer();

    ByteString getVerBytes();

    boolean hasRequest();

    boolean hasResponse();
}
