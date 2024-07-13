package com.explorestack.protobuf;

import com.explorestack.protobuf.GeneratedMessageV3;

final class NewInstanceSchemaFull implements NewInstanceSchema {
    NewInstanceSchemaFull() {
    }

    public Object newInstance(Object obj) {
        return ((GeneratedMessageV3) obj).newInstance(GeneratedMessageV3.UnusedPrivateParameter.INSTANCE);
    }
}
