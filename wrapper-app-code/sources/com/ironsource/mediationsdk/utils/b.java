package com.ironsource.mediationsdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ironsource/mediationsdk/utils/ApplicationGeneralSettings;", "", "isExternalArmEventsEnabled", "", "externalArmEventsUrl", "", "shouldUseAppSet", "(ZLjava/lang/String;Z)V", "getExternalArmEventsUrl", "()Ljava/lang/String;", "()Z", "getShouldUseAppSet", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mediationsdk_release"}, k = 1, mv = {1, 4, 2})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8891a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8892b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8893c;

    public b() {
        this(false, (String) null, false, 7);
    }

    public b(boolean z, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "externalArmEventsUrl");
        this.f8891a = z;
        this.f8892b = str;
        this.f8893c = z2;
    }

    private /* synthetic */ b(boolean z, String str, boolean z2, int i) {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8891a == bVar.f8891a && Intrinsics.areEqual((Object) this.f8892b, (Object) bVar.f8892b) && this.f8893c == bVar.f8893c;
    }

    public final int hashCode() {
        boolean z = this.f8891a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f8892b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f8893c;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f8891a + ", externalArmEventsUrl=" + this.f8892b + ", shouldUseAppSet=" + this.f8893c + ")";
    }
}
