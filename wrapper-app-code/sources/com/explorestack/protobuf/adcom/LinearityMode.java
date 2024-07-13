package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum LinearityMode implements ProtocolMessageEnum {
    LINEARITY_MODE_INVALID(0),
    LINEARITY_MODE_LINEAR(1),
    LINEARITY_MODE_NON_LINEAR(2),
    UNRECOGNIZED(-1);
    
    public static final int LINEARITY_MODE_INVALID_VALUE = 0;
    public static final int LINEARITY_MODE_LINEAR_VALUE = 1;
    public static final int LINEARITY_MODE_NON_LINEAR_VALUE = 2;
    private static final LinearityMode[] VALUES = null;
    private static final Internal.EnumLiteMap<LinearityMode> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<LinearityMode>() {
            public LinearityMode findValueByNumber(int i) {
                return LinearityMode.forNumber(i);
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
    public static LinearityMode valueOf(int i) {
        return forNumber(i);
    }

    public static LinearityMode forNumber(int i) {
        if (i == 0) {
            return LINEARITY_MODE_INVALID;
        }
        if (i == 1) {
            return LINEARITY_MODE_LINEAR;
        }
        if (i != 2) {
            return null;
        }
        return LINEARITY_MODE_NON_LINEAR;
    }

    public static Internal.EnumLiteMap<LinearityMode> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(17);
    }

    public static LinearityMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private LinearityMode(int i) {
        this.value = i;
    }
}
