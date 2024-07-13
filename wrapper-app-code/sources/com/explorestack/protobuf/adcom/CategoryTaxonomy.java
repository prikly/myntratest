package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum CategoryTaxonomy implements ProtocolMessageEnum {
    CATEGORY_TAXONOMY_INVALID(0),
    CATEGORY_TAXONOMY_IAB_CONTENT_1_0(1),
    CATEGORY_TAXONOMY_IAB_CONTENT_2_0(2),
    CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0(3),
    UNRECOGNIZED(-1);
    
    public static final int CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0_VALUE = 3;
    public static final int CATEGORY_TAXONOMY_IAB_CONTENT_1_0_VALUE = 1;
    public static final int CATEGORY_TAXONOMY_IAB_CONTENT_2_0_VALUE = 2;
    public static final int CATEGORY_TAXONOMY_INVALID_VALUE = 0;
    private static final CategoryTaxonomy[] VALUES = null;
    private static final Internal.EnumLiteMap<CategoryTaxonomy> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<CategoryTaxonomy>() {
            public CategoryTaxonomy findValueByNumber(int i) {
                return CategoryTaxonomy.forNumber(i);
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
    public static CategoryTaxonomy valueOf(int i) {
        return forNumber(i);
    }

    public static CategoryTaxonomy forNumber(int i) {
        if (i == 0) {
            return CATEGORY_TAXONOMY_INVALID;
        }
        if (i == 1) {
            return CATEGORY_TAXONOMY_IAB_CONTENT_1_0;
        }
        if (i == 2) {
            return CATEGORY_TAXONOMY_IAB_CONTENT_2_0;
        }
        if (i != 3) {
            return null;
        }
        return CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0;
    }

    public static Internal.EnumLiteMap<CategoryTaxonomy> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(2);
    }

    public static CategoryTaxonomy valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private CategoryTaxonomy(int i) {
        this.value = i;
    }
}
