package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum ExpandableDirection implements ProtocolMessageEnum {
    EXPANDABLE_DIRECTION_INVALID(0),
    EXPANDABLE_DIRECTION_LEFT(1),
    EXPANDABLE_DIRECTION_RIGHT(2),
    EXPANDABLE_DIRECTION_UP(3),
    EXPANDABLE_DIRECTION_DOWN(4),
    EXPANDABLE_DIRECTION_FULL_SCREEN(5),
    UNRECOGNIZED(-1);
    
    public static final int EXPANDABLE_DIRECTION_DOWN_VALUE = 4;
    public static final int EXPANDABLE_DIRECTION_FULL_SCREEN_VALUE = 5;
    public static final int EXPANDABLE_DIRECTION_INVALID_VALUE = 0;
    public static final int EXPANDABLE_DIRECTION_LEFT_VALUE = 1;
    public static final int EXPANDABLE_DIRECTION_RIGHT_VALUE = 2;
    public static final int EXPANDABLE_DIRECTION_UP_VALUE = 3;
    private static final ExpandableDirection[] VALUES = null;
    private static final Internal.EnumLiteMap<ExpandableDirection> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<ExpandableDirection>() {
            public ExpandableDirection findValueByNumber(int i) {
                return ExpandableDirection.forNumber(i);
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
    public static ExpandableDirection valueOf(int i) {
        return forNumber(i);
    }

    public static ExpandableDirection forNumber(int i) {
        if (i == 0) {
            return EXPANDABLE_DIRECTION_INVALID;
        }
        if (i == 1) {
            return EXPANDABLE_DIRECTION_LEFT;
        }
        if (i == 2) {
            return EXPANDABLE_DIRECTION_RIGHT;
        }
        if (i == 3) {
            return EXPANDABLE_DIRECTION_UP;
        }
        if (i == 4) {
            return EXPANDABLE_DIRECTION_DOWN;
        }
        if (i != 5) {
            return null;
        }
        return EXPANDABLE_DIRECTION_FULL_SCREEN;
    }

    public static Internal.EnumLiteMap<ExpandableDirection> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(13);
    }

    public static ExpandableDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ExpandableDirection(int i) {
        this.value = i;
    }
}
