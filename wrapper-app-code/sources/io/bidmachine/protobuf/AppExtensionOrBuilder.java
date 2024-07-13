package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;

public interface AppExtensionOrBuilder extends MessageOrBuilder {
    Timestamp getInstallTime();

    TimestampOrBuilder getInstallTimeOrBuilder();

    long getUptime();

    boolean hasInstallTime();
}
