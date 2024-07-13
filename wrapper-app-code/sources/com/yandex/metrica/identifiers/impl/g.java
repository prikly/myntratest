package com.yandex.metrica.identifiers.impl;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final l f3655a;

    /* renamed from: b  reason: collision with root package name */
    private final f f3656b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3657c;

    public g(l lVar, f fVar, String str) {
        Intrinsics.checkNotNullParameter(lVar, "status");
        this.f3655a = lVar;
        this.f3656b = fVar;
        this.f3657c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l lVar, f fVar, String str, int i) {
        this(lVar, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : str);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        f fVar = this.f3656b;
        if (fVar != null) {
            bundle.putBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO", fVar.a());
        }
        bundle.putString("com.yandex.metrica.identifiers.extra.STATUS", this.f3655a.a());
        bundle.putString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE", this.f3657c);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual((Object) this.f3655a, (Object) gVar.f3655a) && Intrinsics.areEqual((Object) this.f3656b, (Object) gVar.f3656b) && Intrinsics.areEqual((Object) this.f3657c, (Object) gVar.f3657c);
    }

    public int hashCode() {
        l lVar = this.f3655a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        f fVar = this.f3656b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f3657c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AdsIdResult(status=" + this.f3655a + ", adsIdInfo=" + this.f3656b + ", errorExplanation=" + this.f3657c + ")";
    }
}
