package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum DisplayContextType implements ProtocolMessageEnum {
    DISPLAY_CONTEXT_TYPE_INVALID(0),
    DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT(10),
    DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT(11),
    DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT(12),
    DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT(13),
    DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT(14),
    DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT(15),
    DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT(20),
    DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT(21),
    DISPLAY_CONTEXT_TYPE_CHAT_CONTENT(22),
    DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT(30),
    DISPLAY_CONTEXT_TYPE_APP_STORE(31),
    DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS(32),
    UNRECOGNIZED(-1);
    
    public static final int DISPLAY_CONTEXT_TYPE_APP_STORE_VALUE = 31;
    public static final int DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT_VALUE = 11;
    public static final int DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT_VALUE = 13;
    public static final int DISPLAY_CONTEXT_TYPE_CHAT_CONTENT_VALUE = 22;
    public static final int DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT_VALUE = 10;
    public static final int DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT_VALUE = 21;
    public static final int DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT_VALUE = 14;
    public static final int DISPLAY_CONTEXT_TYPE_INVALID_VALUE = 0;
    public static final int DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT_VALUE = 30;
    public static final int DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS_VALUE = 32;
    public static final int DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT_VALUE = 20;
    public static final int DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT_VALUE = 15;
    public static final int DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT_VALUE = 12;
    private static final DisplayContextType[] VALUES = null;
    private static final Internal.EnumLiteMap<DisplayContextType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<DisplayContextType>() {
            public DisplayContextType findValueByNumber(int i) {
                return DisplayContextType.forNumber(i);
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
    public static DisplayContextType valueOf(int i) {
        return forNumber(i);
    }

    public static DisplayContextType forNumber(int i) {
        if (i == 0) {
            return DISPLAY_CONTEXT_TYPE_INVALID;
        }
        switch (i) {
            case 10:
                return DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT;
            case 11:
                return DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT;
            case 12:
                return DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT;
            case 13:
                return DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT;
            case 14:
                return DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT;
            case 15:
                return DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT;
            default:
                switch (i) {
                    case 20:
                        return DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT;
                    case 21:
                        return DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT;
                    case 22:
                        return DISPLAY_CONTEXT_TYPE_CHAT_CONTENT;
                    default:
                        switch (i) {
                            case 30:
                                return DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT;
                            case 31:
                                return DISPLAY_CONTEXT_TYPE_APP_STORE;
                            case 32:
                                return DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS;
                            default:
                                return null;
                        }
                }
        }
    }

    public static Internal.EnumLiteMap<DisplayContextType> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(10);
    }

    public static DisplayContextType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private DisplayContextType(int i) {
        this.value = i;
    }
}
