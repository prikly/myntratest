package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;

public interface SessionOrBuilder extends MessageOrBuilder {
    String getId();

    ByteString getIdBytes();

    long getUptime();
}
