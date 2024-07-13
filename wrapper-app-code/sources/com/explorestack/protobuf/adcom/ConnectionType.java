package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum ConnectionType implements ProtocolMessageEnum {
    CONNECTION_TYPE_INVALID(0),
    CONNECTION_TYPE_ETHERNET(1),
    CONNECTION_TYPE_WIFI(2),
    CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN(3),
    CONNECTION_TYPE_CELLULAR_NETWORK_2G(4),
    CONNECTION_TYPE_CELLULAR_NETWORK_3G(5),
    CONNECTION_TYPE_CELLULAR_NETWORK_4G(6),
    CONNECTION_TYPE_CELLULAR_NETWORK_5G(7),
    UNRECOGNIZED(-1);
    
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_2G_VALUE = 4;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_3G_VALUE = 5;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_4G_VALUE = 6;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_5G_VALUE = 7;
    public static final int CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN_VALUE = 3;
    public static final int CONNECTION_TYPE_ETHERNET_VALUE = 1;
    public static final int CONNECTION_TYPE_INVALID_VALUE = 0;
    public static final int CONNECTION_TYPE_WIFI_VALUE = 2;
    private static final ConnectionType[] VALUES = null;
    private static final Internal.EnumLiteMap<ConnectionType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<ConnectionType>() {
            public ConnectionType findValueByNumber(int i) {
                return ConnectionType.forNumber(i);
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
    public static ConnectionType valueOf(int i) {
        return forNumber(i);
    }

    public static ConnectionType forNumber(int i) {
        switch (i) {
            case 0:
                return CONNECTION_TYPE_INVALID;
            case 1:
                return CONNECTION_TYPE_ETHERNET;
            case 2:
                return CONNECTION_TYPE_WIFI;
            case 3:
                return CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN;
            case 4:
                return CONNECTION_TYPE_CELLULAR_NETWORK_2G;
            case 5:
                return CONNECTION_TYPE_CELLULAR_NETWORK_3G;
            case 6:
                return CONNECTION_TYPE_CELLULAR_NETWORK_4G;
            case 7:
                return CONNECTION_TYPE_CELLULAR_NETWORK_5G;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ConnectionType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(5);
    }

    public static ConnectionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ConnectionType(int i) {
        this.value = i;
    }
}
