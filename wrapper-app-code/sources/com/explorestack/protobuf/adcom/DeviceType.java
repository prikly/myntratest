package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum DeviceType implements ProtocolMessageEnum {
    DEVICE_TYPE_INVALID(0),
    DEVICE_TYPE_MOBILE(1),
    DEVICE_TYPE_PHONE_DEVICE(4),
    DEVICE_TYPE_TABLET(5),
    UNRECOGNIZED(-1);
    
    public static final int DEVICE_TYPE_INVALID_VALUE = 0;
    public static final int DEVICE_TYPE_MOBILE_VALUE = 1;
    public static final int DEVICE_TYPE_PHONE_DEVICE_VALUE = 4;
    public static final int DEVICE_TYPE_TABLET_VALUE = 5;
    private static final DeviceType[] VALUES = null;
    private static final Internal.EnumLiteMap<DeviceType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<DeviceType>() {
            public DeviceType findValueByNumber(int i) {
                return DeviceType.forNumber(i);
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
    public static DeviceType valueOf(int i) {
        return forNumber(i);
    }

    public static DeviceType forNumber(int i) {
        if (i == 0) {
            return DEVICE_TYPE_INVALID;
        }
        if (i == 1) {
            return DEVICE_TYPE_MOBILE;
        }
        if (i == 4) {
            return DEVICE_TYPE_PHONE_DEVICE;
        }
        if (i != 5) {
            return null;
        }
        return DEVICE_TYPE_TABLET;
    }

    public static Internal.EnumLiteMap<DeviceType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(9);
    }

    public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private DeviceType(int i) {
        this.value = i;
    }
}
