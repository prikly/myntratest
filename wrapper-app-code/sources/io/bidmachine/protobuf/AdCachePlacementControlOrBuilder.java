package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageOrBuilder;

public interface AdCachePlacementControlOrBuilder extends MessageOrBuilder {
    int getMaxAge();

    int getMaxCacheSize();

    int getMaxRetainCount();
}
