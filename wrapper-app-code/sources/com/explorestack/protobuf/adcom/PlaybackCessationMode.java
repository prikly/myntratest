package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum PlaybackCessationMode implements ProtocolMessageEnum {
    PLAYBACK_CESSATION_MODE_INVALID(0),
    PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION(1),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT(2),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING(3),
    UNRECOGNIZED(-1);
    
    public static final int PLAYBACK_CESSATION_MODE_INVALID_VALUE = 0;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING_VALUE = 3;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_VALUE = 2;
    public static final int PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION_VALUE = 1;
    private static final PlaybackCessationMode[] VALUES = null;
    private static final Internal.EnumLiteMap<PlaybackCessationMode> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<PlaybackCessationMode>() {
            public PlaybackCessationMode findValueByNumber(int i) {
                return PlaybackCessationMode.forNumber(i);
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
    public static PlaybackCessationMode valueOf(int i) {
        return forNumber(i);
    }

    public static PlaybackCessationMode forNumber(int i) {
        if (i == 0) {
            return PLAYBACK_CESSATION_MODE_INVALID;
        }
        if (i == 1) {
            return PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION;
        }
        if (i == 2) {
            return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT;
        }
        if (i != 3) {
            return null;
        }
        return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING;
    }

    public static Internal.EnumLiteMap<PlaybackCessationMode> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(23);
    }

    public static PlaybackCessationMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private PlaybackCessationMode(int i) {
        this.value = i;
    }
}
