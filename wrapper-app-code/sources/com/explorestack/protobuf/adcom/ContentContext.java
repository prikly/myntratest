package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum ContentContext implements ProtocolMessageEnum {
    CONTENT_CONTEXT_INVALID(0),
    CONTENT_CONTEXT_VIDEO(1),
    CONTENT_CONTEXT_GAME(2),
    CONTENT_CONTEXT_MUSIC(3),
    CONTENT_CONTEXT_APPLICATION(4),
    CONTENT_CONTEXT_TEXT(5),
    CONTENT_CONTEXT_OTHER(6),
    CONTENT_CONTEXT_UNKNOWN(7),
    UNRECOGNIZED(-1);
    
    public static final int CONTENT_CONTEXT_APPLICATION_VALUE = 4;
    public static final int CONTENT_CONTEXT_GAME_VALUE = 2;
    public static final int CONTENT_CONTEXT_INVALID_VALUE = 0;
    public static final int CONTENT_CONTEXT_MUSIC_VALUE = 3;
    public static final int CONTENT_CONTEXT_OTHER_VALUE = 6;
    public static final int CONTENT_CONTEXT_TEXT_VALUE = 5;
    public static final int CONTENT_CONTEXT_UNKNOWN_VALUE = 7;
    public static final int CONTENT_CONTEXT_VIDEO_VALUE = 1;
    private static final ContentContext[] VALUES = null;
    private static final Internal.EnumLiteMap<ContentContext> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<ContentContext>() {
            public ContentContext findValueByNumber(int i) {
                return ContentContext.forNumber(i);
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
    public static ContentContext valueOf(int i) {
        return forNumber(i);
    }

    public static ContentContext forNumber(int i) {
        switch (i) {
            case 0:
                return CONTENT_CONTEXT_INVALID;
            case 1:
                return CONTENT_CONTEXT_VIDEO;
            case 2:
                return CONTENT_CONTEXT_GAME;
            case 3:
                return CONTENT_CONTEXT_MUSIC;
            case 4:
                return CONTENT_CONTEXT_APPLICATION;
            case 5:
                return CONTENT_CONTEXT_TEXT;
            case 6:
                return CONTENT_CONTEXT_OTHER;
            case 7:
                return CONTENT_CONTEXT_UNKNOWN;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ContentContext> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(6);
    }

    public static ContentContext valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ContentContext(int i) {
        this.value = i;
    }
}
