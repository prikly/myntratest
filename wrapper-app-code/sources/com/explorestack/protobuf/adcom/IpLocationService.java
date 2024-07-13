package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum IpLocationService implements ProtocolMessageEnum {
    IP_LOCATION_SERVICE_INVALID(0),
    IP_LOCATION_SERVICE_IP2LOCATION(1),
    IP_LOCATION_SERVICE_NEUSTAR(2),
    IP_LOCATION_SERVICE_MAXMIND(3),
    IP_LOCATION_SERVICE_NETAQUITY(4),
    UNRECOGNIZED(-1);
    
    public static final int IP_LOCATION_SERVICE_INVALID_VALUE = 0;
    public static final int IP_LOCATION_SERVICE_IP2LOCATION_VALUE = 1;
    public static final int IP_LOCATION_SERVICE_MAXMIND_VALUE = 3;
    public static final int IP_LOCATION_SERVICE_NETAQUITY_VALUE = 4;
    public static final int IP_LOCATION_SERVICE_NEUSTAR_VALUE = 2;
    private static final IpLocationService[] VALUES = null;
    private static final Internal.EnumLiteMap<IpLocationService> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<IpLocationService>() {
            public IpLocationService findValueByNumber(int i) {
                return IpLocationService.forNumber(i);
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
    public static IpLocationService valueOf(int i) {
        return forNumber(i);
    }

    public static IpLocationService forNumber(int i) {
        if (i == 0) {
            return IP_LOCATION_SERVICE_INVALID;
        }
        if (i == 1) {
            return IP_LOCATION_SERVICE_IP2LOCATION;
        }
        if (i == 2) {
            return IP_LOCATION_SERVICE_NEUSTAR;
        }
        if (i == 3) {
            return IP_LOCATION_SERVICE_MAXMIND;
        }
        if (i != 4) {
            return null;
        }
        return IP_LOCATION_SERVICE_NETAQUITY;
    }

    public static Internal.EnumLiteMap<IpLocationService> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(16);
    }

    public static IpLocationService valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private IpLocationService(int i) {
        this.value = i;
    }
}
