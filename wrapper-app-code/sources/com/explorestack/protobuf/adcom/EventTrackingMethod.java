package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum EventTrackingMethod implements ProtocolMessageEnum {
    EVENT_TRACKING_METHOD_INVALID(0),
    EVENT_TRACKING_METHOD_IMAGE_PIXEL(1),
    EVENT_TRACKING_METHOD_JAVASCRIPT(2),
    UNRECOGNIZED(-1);
    
    public static final int EVENT_TRACKING_METHOD_IMAGE_PIXEL_VALUE = 1;
    public static final int EVENT_TRACKING_METHOD_INVALID_VALUE = 0;
    public static final int EVENT_TRACKING_METHOD_JAVASCRIPT_VALUE = 2;
    private static final EventTrackingMethod[] VALUES = null;
    private static final Internal.EnumLiteMap<EventTrackingMethod> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<EventTrackingMethod>() {
            public EventTrackingMethod findValueByNumber(int i) {
                return EventTrackingMethod.forNumber(i);
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
    public static EventTrackingMethod valueOf(int i) {
        return forNumber(i);
    }

    public static EventTrackingMethod forNumber(int i) {
        if (i == 0) {
            return EVENT_TRACKING_METHOD_INVALID;
        }
        if (i == 1) {
            return EVENT_TRACKING_METHOD_IMAGE_PIXEL;
        }
        if (i != 2) {
            return null;
        }
        return EVENT_TRACKING_METHOD_JAVASCRIPT;
    }

    public static Internal.EnumLiteMap<EventTrackingMethod> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(14);
    }

    public static EventTrackingMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private EventTrackingMethod(int i) {
        this.value = i;
    }
}
