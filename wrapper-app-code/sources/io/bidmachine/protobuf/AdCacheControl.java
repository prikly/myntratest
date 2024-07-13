package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum AdCacheControl implements ProtocolMessageEnum {
    AD_CACHE_CONTROL_DISABLED(0),
    AD_CACHE_CONTROL_ENABLED(1),
    UNRECOGNIZED(-1);
    
    public static final int AD_CACHE_CONTROL_DISABLED_VALUE = 0;
    public static final int AD_CACHE_CONTROL_ENABLED_VALUE = 1;
    private static final AdCacheControl[] VALUES = null;
    private static final Internal.EnumLiteMap<AdCacheControl> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<AdCacheControl>() {
            public AdCacheControl findValueByNumber(int i) {
                return AdCacheControl.forNumber(i);
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
    public static AdCacheControl valueOf(int i) {
        return forNumber(i);
    }

    public static AdCacheControl forNumber(int i) {
        if (i == 0) {
            return AD_CACHE_CONTROL_DISABLED;
        }
        if (i != 1) {
            return null;
        }
        return AD_CACHE_CONTROL_ENABLED;
    }

    public static Internal.EnumLiteMap<AdCacheControl> internalGetValueMap() {
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
        return ExtensionsProto.getDescriptor().getEnumTypes().get(4);
    }

    public static AdCacheControl valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private AdCacheControl(int i) {
        this.value = i;
    }
}
