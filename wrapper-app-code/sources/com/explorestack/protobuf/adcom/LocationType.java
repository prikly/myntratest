package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum LocationType implements ProtocolMessageEnum {
    LOCATION_TYPE_INVALID(0),
    LOCATION_TYPE_GPS(1),
    LOCATION_TYPE_IP(2),
    LOCATION_TYPE_USER(3),
    UNRECOGNIZED(-1);
    
    public static final int LOCATION_TYPE_GPS_VALUE = 1;
    public static final int LOCATION_TYPE_INVALID_VALUE = 0;
    public static final int LOCATION_TYPE_IP_VALUE = 2;
    public static final int LOCATION_TYPE_USER_VALUE = 3;
    private static final LocationType[] VALUES = null;
    private static final Internal.EnumLiteMap<LocationType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<LocationType>() {
            public LocationType findValueByNumber(int i) {
                return LocationType.forNumber(i);
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
    public static LocationType valueOf(int i) {
        return forNumber(i);
    }

    public static LocationType forNumber(int i) {
        if (i == 0) {
            return LOCATION_TYPE_INVALID;
        }
        if (i == 1) {
            return LOCATION_TYPE_GPS;
        }
        if (i == 2) {
            return LOCATION_TYPE_IP;
        }
        if (i != 3) {
            return null;
        }
        return LOCATION_TYPE_USER;
    }

    public static Internal.EnumLiteMap<LocationType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(18);
    }

    public static LocationType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private LocationType(int i) {
        this.value = i;
    }
}
