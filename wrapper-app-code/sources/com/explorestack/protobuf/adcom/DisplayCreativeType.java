package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum DisplayCreativeType implements ProtocolMessageEnum {
    DISPLAY_CREATIVE_TYPE_INVALID(0),
    DISPLAY_CREATIVE_TYPE_HTML(1),
    DISPLAY_CREATIVE_TYPE_AMPHTML(2),
    DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT(3),
    DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT(4),
    UNRECOGNIZED(-1);
    
    public static final int DISPLAY_CREATIVE_TYPE_AMPHTML_VALUE = 2;
    public static final int DISPLAY_CREATIVE_TYPE_HTML_VALUE = 1;
    public static final int DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT_VALUE = 3;
    public static final int DISPLAY_CREATIVE_TYPE_INVALID_VALUE = 0;
    public static final int DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT_VALUE = 4;
    private static final DisplayCreativeType[] VALUES = null;
    private static final Internal.EnumLiteMap<DisplayCreativeType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<DisplayCreativeType>() {
            public DisplayCreativeType findValueByNumber(int i) {
                return DisplayCreativeType.forNumber(i);
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
    public static DisplayCreativeType valueOf(int i) {
        return forNumber(i);
    }

    public static DisplayCreativeType forNumber(int i) {
        if (i == 0) {
            return DISPLAY_CREATIVE_TYPE_INVALID;
        }
        if (i == 1) {
            return DISPLAY_CREATIVE_TYPE_HTML;
        }
        if (i == 2) {
            return DISPLAY_CREATIVE_TYPE_AMPHTML;
        }
        if (i == 3) {
            return DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT;
        }
        if (i != 4) {
            return null;
        }
        return DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT;
    }

    public static Internal.EnumLiteMap<DisplayCreativeType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(11);
    }

    public static DisplayCreativeType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private DisplayCreativeType(int i) {
        this.value = i;
    }
}
