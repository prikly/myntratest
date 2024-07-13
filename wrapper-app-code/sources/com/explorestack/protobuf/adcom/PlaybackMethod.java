package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum PlaybackMethod implements ProtocolMessageEnum {
    PLAYBACK_METHOD_INVALID(0),
    PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON(1),
    PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF(2),
    PLAYBACK_METHOD_ON_CLICK_SOUND_ON(3),
    PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON(4),
    PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON(5),
    PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF(6),
    UNRECOGNIZED(-1);
    
    public static final int PLAYBACK_METHOD_INVALID_VALUE = 0;
    public static final int PLAYBACK_METHOD_ON_CLICK_SOUND_ON_VALUE = 3;
    public static final int PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF_VALUE = 6;
    public static final int PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON_VALUE = 5;
    public static final int PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON_VALUE = 4;
    public static final int PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF_VALUE = 2;
    public static final int PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON_VALUE = 1;
    private static final PlaybackMethod[] VALUES = null;
    private static final Internal.EnumLiteMap<PlaybackMethod> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<PlaybackMethod>() {
            public PlaybackMethod findValueByNumber(int i) {
                return PlaybackMethod.forNumber(i);
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
    public static PlaybackMethod valueOf(int i) {
        return forNumber(i);
    }

    public static PlaybackMethod forNumber(int i) {
        switch (i) {
            case 0:
                return PLAYBACK_METHOD_INVALID;
            case 1:
                return PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON;
            case 2:
                return PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF;
            case 3:
                return PLAYBACK_METHOD_ON_CLICK_SOUND_ON;
            case 4:
                return PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON;
            case 5:
                return PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON;
            case 6:
                return PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<PlaybackMethod> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(24);
    }

    public static PlaybackMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private PlaybackMethod(int i) {
        this.value = i;
    }
}
