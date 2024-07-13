package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum MediaRating implements ProtocolMessageEnum {
    MEDIA_RATING_INVALID(0),
    MEDIA_RATING_ALL_AUDIENCES(1),
    MEDIA_RATING_EVERYONE_OVER_AGE_12(2),
    MEDIA_RATING_MATURE_AUDIENCES(3),
    UNRECOGNIZED(-1);
    
    public static final int MEDIA_RATING_ALL_AUDIENCES_VALUE = 1;
    public static final int MEDIA_RATING_EVERYONE_OVER_AGE_12_VALUE = 2;
    public static final int MEDIA_RATING_INVALID_VALUE = 0;
    public static final int MEDIA_RATING_MATURE_AUDIENCES_VALUE = 3;
    private static final MediaRating[] VALUES = null;
    private static final Internal.EnumLiteMap<MediaRating> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<MediaRating>() {
            public MediaRating findValueByNumber(int i) {
                return MediaRating.forNumber(i);
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
    public static MediaRating valueOf(int i) {
        return forNumber(i);
    }

    public static MediaRating forNumber(int i) {
        if (i == 0) {
            return MEDIA_RATING_INVALID;
        }
        if (i == 1) {
            return MEDIA_RATING_ALL_AUDIENCES;
        }
        if (i == 2) {
            return MEDIA_RATING_EVERYONE_OVER_AGE_12;
        }
        if (i != 3) {
            return null;
        }
        return MEDIA_RATING_MATURE_AUDIENCES;
    }

    public static Internal.EnumLiteMap<MediaRating> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(19);
    }

    public static MediaRating valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private MediaRating(int i) {
        this.value = i;
    }
}
