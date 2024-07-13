package com.criteo.publisher.model;

import com.criteo.publisher.n0.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheAdUnit.kt */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final AdSize f2823a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2824b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2825c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual((Object) c(), (Object) nVar.c()) && Intrinsics.areEqual((Object) b(), (Object) nVar.b()) && Intrinsics.areEqual((Object) a(), (Object) nVar.a());
    }

    public int hashCode() {
        AdSize c2 = c();
        int i = 0;
        int hashCode = (c2 != null ? c2.hashCode() : 0) * 31;
        String b2 = b();
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        a a2 = a();
        if (a2 != null) {
            i = a2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CacheAdUnit(size=" + c() + ", placementId=" + b() + ", adUnitType=" + a() + ")";
    }

    public n(AdSize adSize, String str, a aVar) {
        Intrinsics.checkParameterIsNotNull(adSize, "size");
        Intrinsics.checkParameterIsNotNull(str, "placementId");
        Intrinsics.checkParameterIsNotNull(aVar, "adUnitType");
        this.f2823a = adSize;
        this.f2824b = str;
        this.f2825c = aVar;
    }

    public AdSize c() {
        return this.f2823a;
    }

    public String b() {
        return this.f2824b;
    }

    public a a() {
        return this.f2825c;
    }
}
