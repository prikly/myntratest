package com.criteo.publisher.logging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogMessage.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f2633a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2634b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f2635c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2636d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2633a == eVar.f2633a && Intrinsics.areEqual((Object) this.f2634b, (Object) eVar.f2634b) && Intrinsics.areEqual((Object) this.f2635c, (Object) eVar.f2635c) && Intrinsics.areEqual((Object) this.f2636d, (Object) eVar.f2636d);
    }

    public int hashCode() {
        int i = this.f2633a * 31;
        String str = this.f2634b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.f2635c;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        String str2 = this.f2636d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "LogMessage(level=" + this.f2633a + ", message=" + this.f2634b + ", throwable=" + this.f2635c + ", logId=" + this.f2636d + ")";
    }

    public e(int i, String str, Throwable th, String str2) {
        this.f2633a = i;
        this.f2634b = str;
        this.f2635c = th;
        this.f2636d = str2;
    }

    public final int a() {
        return this.f2633a;
    }

    public final String c() {
        return this.f2634b;
    }

    public final Throwable d() {
        return this.f2635c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, String str, Throwable th, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4 : i, str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : str2);
    }

    public final String b() {
        return this.f2636d;
    }
}
