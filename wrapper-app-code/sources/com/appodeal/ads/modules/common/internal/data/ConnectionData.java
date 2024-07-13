package com.appodeal.ads.modules.common.internal.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J+\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/ConnectionData;", "", "", "component1", "component2", "", "component3", "type", "subType", "isFast", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getSubType", "setSubType", "(Ljava/lang/String;)V", "c", "Z", "()Z", "setFast", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
public final class ConnectionData {

    /* renamed from: a  reason: collision with root package name */
    public final String f16622a;

    /* renamed from: b  reason: collision with root package name */
    public String f16623b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16624c;

    public ConnectionData(String str, String str2, boolean z) {
        this.f16622a = str;
        this.f16623b = str2;
        this.f16624c = z;
    }

    public static /* synthetic */ ConnectionData copy$default(ConnectionData connectionData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionData.f16622a;
        }
        if ((i & 2) != 0) {
            str2 = connectionData.f16623b;
        }
        if ((i & 4) != 0) {
            z = connectionData.f16624c;
        }
        return connectionData.copy(str, str2, z);
    }

    public final String component1() {
        return this.f16622a;
    }

    public final String component2() {
        return this.f16623b;
    }

    public final boolean component3() {
        return this.f16624c;
    }

    public final ConnectionData copy(String str, String str2, boolean z) {
        return new ConnectionData(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionData)) {
            return false;
        }
        ConnectionData connectionData = (ConnectionData) obj;
        return Intrinsics.areEqual((Object) this.f16622a, (Object) connectionData.f16622a) && Intrinsics.areEqual((Object) this.f16623b, (Object) connectionData.f16623b) && this.f16624c == connectionData.f16624c;
    }

    public final String getSubType() {
        return this.f16623b;
    }

    public final String getType() {
        return this.f16622a;
    }

    public int hashCode() {
        String str = this.f16622a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16623b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f16624c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isFast() {
        return this.f16624c;
    }

    public final void setFast(boolean z) {
        this.f16624c = z;
    }

    public final void setSubType(String str) {
        this.f16623b = str;
    }

    public String toString() {
        return "ConnectionData(type=" + this.f16622a + ", subType=" + this.f16623b + ", isFast=" + this.f16624c + ')';
    }
}
