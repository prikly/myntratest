package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum HeaderBiddingType implements ProtocolMessageEnum {
    HEADER_BIDDING_TYPE_INVALID(0),
    HEADER_BIDDING_TYPE_DISABLED(-1),
    HEADER_BIDDING_TYPE_ENABLED(1),
    UNRECOGNIZED(-1);
    
    public static final int HEADER_BIDDING_TYPE_DISABLED_VALUE = -1;
    public static final int HEADER_BIDDING_TYPE_ENABLED_VALUE = 1;
    public static final int HEADER_BIDDING_TYPE_INVALID_VALUE = 0;
    private static final HeaderBiddingType[] VALUES = null;
    private static final Internal.EnumLiteMap<HeaderBiddingType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<HeaderBiddingType>() {
            public HeaderBiddingType findValueByNumber(int i) {
                return HeaderBiddingType.forNumber(i);
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
    public static HeaderBiddingType valueOf(int i) {
        return forNumber(i);
    }

    public static HeaderBiddingType forNumber(int i) {
        if (i == -1) {
            return HEADER_BIDDING_TYPE_DISABLED;
        }
        if (i == 0) {
            return HEADER_BIDDING_TYPE_INVALID;
        }
        if (i != 1) {
            return null;
        }
        return HEADER_BIDDING_TYPE_ENABLED;
    }

    public static Internal.EnumLiteMap<HeaderBiddingType> internalGetValueMap() {
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
        return ExtensionsProto.getDescriptor().getEnumTypes().get(3);
    }

    public static HeaderBiddingType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private HeaderBiddingType(int i) {
        this.value = i;
    }
}
