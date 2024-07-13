package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum DisplayPlacementType implements ProtocolMessageEnum {
    DISPLAY_PLACEMENT_TYPE_INVALID(0),
    DISPLAY_PLACEMENT_TYPE_IN_FEED_DISPLAY(1),
    DISPLAY_PLACEMENT_TYPE_IN_ATOMIC_UNIT(2),
    DISPLAY_PLACEMENT_TYPE_OUTSIDE_CORE_CONTENT(3),
    DISPLAY_PLACEMENT_TYPE_RECOMMENDATION_WIDGET(4),
    UNRECOGNIZED(-1);
    
    public static final int DISPLAY_PLACEMENT_TYPE_INVALID_VALUE = 0;
    public static final int DISPLAY_PLACEMENT_TYPE_IN_ATOMIC_UNIT_VALUE = 2;
    public static final int DISPLAY_PLACEMENT_TYPE_IN_FEED_DISPLAY_VALUE = 1;
    public static final int DISPLAY_PLACEMENT_TYPE_OUTSIDE_CORE_CONTENT_VALUE = 3;
    public static final int DISPLAY_PLACEMENT_TYPE_RECOMMENDATION_WIDGET_VALUE = 4;
    private static final DisplayPlacementType[] VALUES = null;
    private static final Internal.EnumLiteMap<DisplayPlacementType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<DisplayPlacementType>() {
            public DisplayPlacementType findValueByNumber(int i) {
                return DisplayPlacementType.forNumber(i);
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
    public static DisplayPlacementType valueOf(int i) {
        return forNumber(i);
    }

    public static DisplayPlacementType forNumber(int i) {
        if (i == 0) {
            return DISPLAY_PLACEMENT_TYPE_INVALID;
        }
        if (i == 1) {
            return DISPLAY_PLACEMENT_TYPE_IN_FEED_DISPLAY;
        }
        if (i == 2) {
            return DISPLAY_PLACEMENT_TYPE_IN_ATOMIC_UNIT;
        }
        if (i == 3) {
            return DISPLAY_PLACEMENT_TYPE_OUTSIDE_CORE_CONTENT;
        }
        if (i != 4) {
            return null;
        }
        return DISPLAY_PLACEMENT_TYPE_RECOMMENDATION_WIDGET;
    }

    public static Internal.EnumLiteMap<DisplayPlacementType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(12);
    }

    public static DisplayPlacementType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private DisplayPlacementType(int i) {
        this.value = i;
    }
}
