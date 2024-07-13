package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum AuditStatusCode implements ProtocolMessageEnum {
    AUDIT_STATUS_CODE_INVALID(0),
    AUDIT_STATUS_CODE_PENDING_AUDIT(1),
    AUDIT_STATUS_CODE_PRE_APPROVED(2),
    AUDIT_STATUS_CODE_APPROVED(3),
    AUDIT_STATUS_CODE_DENIED(4),
    AUDIT_STATUS_CODE_CHANGED(5),
    UNRECOGNIZED(-1);
    
    public static final int AUDIT_STATUS_CODE_APPROVED_VALUE = 3;
    public static final int AUDIT_STATUS_CODE_CHANGED_VALUE = 5;
    public static final int AUDIT_STATUS_CODE_DENIED_VALUE = 4;
    public static final int AUDIT_STATUS_CODE_INVALID_VALUE = 0;
    public static final int AUDIT_STATUS_CODE_PENDING_AUDIT_VALUE = 1;
    public static final int AUDIT_STATUS_CODE_PRE_APPROVED_VALUE = 2;
    private static final AuditStatusCode[] VALUES = null;
    private static final Internal.EnumLiteMap<AuditStatusCode> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<AuditStatusCode>() {
            public AuditStatusCode findValueByNumber(int i) {
                return AuditStatusCode.forNumber(i);
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
    public static AuditStatusCode valueOf(int i) {
        return forNumber(i);
    }

    public static AuditStatusCode forNumber(int i) {
        if (i == 0) {
            return AUDIT_STATUS_CODE_INVALID;
        }
        if (i == 1) {
            return AUDIT_STATUS_CODE_PENDING_AUDIT;
        }
        if (i == 2) {
            return AUDIT_STATUS_CODE_PRE_APPROVED;
        }
        if (i == 3) {
            return AUDIT_STATUS_CODE_APPROVED;
        }
        if (i == 4) {
            return AUDIT_STATUS_CODE_DENIED;
        }
        if (i != 5) {
            return null;
        }
        return AUDIT_STATUS_CODE_CHANGED;
    }

    public static Internal.EnumLiteMap<AuditStatusCode> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(0);
    }

    public static AuditStatusCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private AuditStatusCode(int i) {
        this.value = i;
    }
}
