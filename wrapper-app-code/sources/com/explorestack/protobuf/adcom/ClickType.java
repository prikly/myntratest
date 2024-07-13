package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum ClickType implements ProtocolMessageEnum {
    CLICK_TYPE_NON_CLICKABLE(0),
    CLICK_TYPE_CLICKABLE_UNKNOWN(1),
    CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER(2),
    CLICK_TYPE_CLICKABLE_NATIVE_BROWSER(3),
    UNRECOGNIZED(-1);
    
    public static final int CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER_VALUE = 2;
    public static final int CLICK_TYPE_CLICKABLE_NATIVE_BROWSER_VALUE = 3;
    public static final int CLICK_TYPE_CLICKABLE_UNKNOWN_VALUE = 1;
    public static final int CLICK_TYPE_NON_CLICKABLE_VALUE = 0;
    private static final ClickType[] VALUES = null;
    private static final Internal.EnumLiteMap<ClickType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<ClickType>() {
            public ClickType findValueByNumber(int i) {
                return ClickType.forNumber(i);
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
    public static ClickType valueOf(int i) {
        return forNumber(i);
    }

    public static ClickType forNumber(int i) {
        if (i == 0) {
            return CLICK_TYPE_NON_CLICKABLE;
        }
        if (i == 1) {
            return CLICK_TYPE_CLICKABLE_UNKNOWN;
        }
        if (i == 2) {
            return CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER;
        }
        if (i != 3) {
            return null;
        }
        return CLICK_TYPE_CLICKABLE_NATIVE_BROWSER;
    }

    public static Internal.EnumLiteMap<ClickType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(3);
    }

    public static ClickType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ClickType(int i) {
        this.value = i;
    }
}
