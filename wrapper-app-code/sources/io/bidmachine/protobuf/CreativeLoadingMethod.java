package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum CreativeLoadingMethod implements ProtocolMessageEnum {
    FullLoad(0),
    Stream(1),
    PartialLoad(2),
    UNRECOGNIZED(-1);
    
    public static final int FullLoad_VALUE = 0;
    public static final int PartialLoad_VALUE = 2;
    public static final int Stream_VALUE = 1;
    private static final CreativeLoadingMethod[] VALUES = null;
    private static final Internal.EnumLiteMap<CreativeLoadingMethod> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<CreativeLoadingMethod>() {
            public CreativeLoadingMethod findValueByNumber(int i) {
                return CreativeLoadingMethod.forNumber(i);
            }
        };
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CreativeLoadingMethod valueOf(int i) {
        return forNumber(i);
    }

    public static CreativeLoadingMethod forNumber(int i) {
        if (i == 0) {
            return FullLoad;
        }
        if (i == 1) {
            return Stream;
        }
        if (i != 2) {
            return null;
        }
        return PartialLoad;
    }

    public static Internal.EnumLiteMap<CreativeLoadingMethod> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(5);
    }

    public static CreativeLoadingMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private CreativeLoadingMethod(int i) {
        this.value = i;
    }
}
