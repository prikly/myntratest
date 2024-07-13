package com.onesignal.influence.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/onesignal/influence/domain/OSInfluenceType;", "", "(Ljava/lang/String;I)V", "isAttributed", "", "isDirect", "isDisabled", "isIndirect", "isUnattributed", "DIRECT", "INDIRECT", "UNATTRIBUTED", "DISABLED", "Companion", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSInfluenceType.kt */
public enum OSInfluenceType {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;
    
    public static final Companion Companion = null;

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public static final OSInfluenceType fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/onesignal/influence/domain/OSInfluenceType$Companion;", "", "()V", "fromString", "Lcom/onesignal/influence/domain/OSInfluenceType;", "value", "", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: OSInfluenceType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OSInfluenceType fromString(String str) {
            OSInfluenceType oSInfluenceType;
            if (str != null) {
                OSInfluenceType[] values = OSInfluenceType.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        oSInfluenceType = null;
                        break;
                    }
                    oSInfluenceType = values[length];
                    if (StringsKt.equals(oSInfluenceType.name(), str, true)) {
                        break;
                    }
                }
                if (oSInfluenceType != null) {
                    return oSInfluenceType;
                }
            }
            return OSInfluenceType.UNATTRIBUTED;
        }
    }
}
