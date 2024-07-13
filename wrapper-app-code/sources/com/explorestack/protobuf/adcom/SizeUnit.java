package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum SizeUnit implements ProtocolMessageEnum {
    SIZE_UNIT_INVALID(0),
    SIZE_UNIT_DIPS(1),
    SIZE_UNIT_INCHES(2),
    SIZE_UNIT_CENTIMETERS(3),
    UNRECOGNIZED(-1);
    
    public static final int SIZE_UNIT_CENTIMETERS_VALUE = 3;
    public static final int SIZE_UNIT_DIPS_VALUE = 1;
    public static final int SIZE_UNIT_INCHES_VALUE = 2;
    public static final int SIZE_UNIT_INVALID_VALUE = 0;
    private static final SizeUnit[] VALUES = null;
    private static final Internal.EnumLiteMap<SizeUnit> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<SizeUnit>() {
            public SizeUnit findValueByNumber(int i) {
                return SizeUnit.forNumber(i);
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
    public static SizeUnit valueOf(int i) {
        return forNumber(i);
    }

    public static SizeUnit forNumber(int i) {
        if (i == 0) {
            return SIZE_UNIT_INVALID;
        }
        if (i == 1) {
            return SIZE_UNIT_DIPS;
        }
        if (i == 2) {
            return SIZE_UNIT_INCHES;
        }
        if (i != 3) {
            return null;
        }
        return SIZE_UNIT_CENTIMETERS;
    }

    public static Internal.EnumLiteMap<SizeUnit> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(27);
    }

    public static SizeUnit valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private SizeUnit(int i) {
        this.value = i;
    }
}
