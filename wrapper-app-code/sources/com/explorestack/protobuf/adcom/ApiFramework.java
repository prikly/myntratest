package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum ApiFramework implements ProtocolMessageEnum {
    API_FRAMEWORK_INVALID(0),
    API_FRAMEWORK_VPAID_1_0(1),
    API_FRAMEWORK_VPAID_2_0(2),
    API_FRAMEWORK_MRAID_1_0(3),
    API_FRAMEWORK_ORMMA(4),
    API_FRAMEWORK_MRAID_2_0(5),
    API_FRAMEWORK_MRAID_3_0(6),
    API_FRAMEWORK_OMID_1_0(7),
    UNRECOGNIZED(-1);
    
    public static final int API_FRAMEWORK_INVALID_VALUE = 0;
    public static final int API_FRAMEWORK_MRAID_1_0_VALUE = 3;
    public static final int API_FRAMEWORK_MRAID_2_0_VALUE = 5;
    public static final int API_FRAMEWORK_MRAID_3_0_VALUE = 6;
    public static final int API_FRAMEWORK_OMID_1_0_VALUE = 7;
    public static final int API_FRAMEWORK_ORMMA_VALUE = 4;
    public static final int API_FRAMEWORK_VPAID_1_0_VALUE = 1;
    public static final int API_FRAMEWORK_VPAID_2_0_VALUE = 2;
    private static final ApiFramework[] VALUES = null;
    private static final Internal.EnumLiteMap<ApiFramework> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<ApiFramework>() {
            public ApiFramework findValueByNumber(int i) {
                return ApiFramework.forNumber(i);
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
    public static ApiFramework valueOf(int i) {
        return forNumber(i);
    }

    public static ApiFramework forNumber(int i) {
        switch (i) {
            case 0:
                return API_FRAMEWORK_INVALID;
            case 1:
                return API_FRAMEWORK_VPAID_1_0;
            case 2:
                return API_FRAMEWORK_VPAID_2_0;
            case 3:
                return API_FRAMEWORK_MRAID_1_0;
            case 4:
                return API_FRAMEWORK_ORMMA;
            case 5:
                return API_FRAMEWORK_MRAID_2_0;
            case 6:
                return API_FRAMEWORK_MRAID_3_0;
            case 7:
                return API_FRAMEWORK_OMID_1_0;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ApiFramework> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(1);
    }

    public static ApiFramework valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ApiFramework(int i) {
        this.value = i;
    }
}
