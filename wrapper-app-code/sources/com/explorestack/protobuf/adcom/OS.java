package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum OS implements ProtocolMessageEnum {
    OS_INVALID(0),
    OS_ANDROID(2),
    OS_IOS(13),
    UNRECOGNIZED(-1);
    
    public static final int OS_ANDROID_VALUE = 2;
    public static final int OS_INVALID_VALUE = 0;
    public static final int OS_IOS_VALUE = 13;
    private static final OS[] VALUES = null;
    private static final Internal.EnumLiteMap<OS> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<OS>() {
            public OS findValueByNumber(int i) {
                return OS.forNumber(i);
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
    public static OS valueOf(int i) {
        return forNumber(i);
    }

    public static OS forNumber(int i) {
        if (i == 0) {
            return OS_INVALID;
        }
        if (i == 2) {
            return OS_ANDROID;
        }
        if (i != 13) {
            return null;
        }
        return OS_IOS;
    }

    public static Internal.EnumLiteMap<OS> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(22);
    }

    public static OS valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private OS(int i) {
        this.value = i;
    }
}
