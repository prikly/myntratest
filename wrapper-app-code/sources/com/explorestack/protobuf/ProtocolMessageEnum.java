package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

public interface ProtocolMessageEnum extends Internal.EnumLite {
    Descriptors.EnumDescriptor getDescriptorForType();

    int getNumber();

    Descriptors.EnumValueDescriptor getValueDescriptor();
}
