package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum ProductionQuality implements ProtocolMessageEnum {
    PRODUCTION_QUALITY_INVALID(0),
    PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED(1),
    PRODUCTION_QUALITY_PROSUMER(2),
    PRODUCTION_QUALITY_USER_GENERATED(3),
    UNRECOGNIZED(-1);
    
    public static final int PRODUCTION_QUALITY_INVALID_VALUE = 0;
    public static final int PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED_VALUE = 1;
    public static final int PRODUCTION_QUALITY_PROSUMER_VALUE = 2;
    public static final int PRODUCTION_QUALITY_USER_GENERATED_VALUE = 3;
    private static final ProductionQuality[] VALUES = null;
    private static final Internal.EnumLiteMap<ProductionQuality> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<ProductionQuality>() {
            public ProductionQuality findValueByNumber(int i) {
                return ProductionQuality.forNumber(i);
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
    public static ProductionQuality valueOf(int i) {
        return forNumber(i);
    }

    public static ProductionQuality forNumber(int i) {
        if (i == 0) {
            return PRODUCTION_QUALITY_INVALID;
        }
        if (i == 1) {
            return PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED;
        }
        if (i == 2) {
            return PRODUCTION_QUALITY_PROSUMER;
        }
        if (i != 3) {
            return null;
        }
        return PRODUCTION_QUALITY_USER_GENERATED;
    }

    public static Internal.EnumLiteMap<ProductionQuality> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(26);
    }

    public static ProductionQuality valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ProductionQuality(int i) {
        this.value = i;
    }
}
