package com.yandex.metrica.identifiers.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f3652a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3653b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f3654c;

    public f(String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, IronSourceConstants.EVENTS_PROVIDER);
        this.f3652a = str;
        this.f3653b = str2;
        this.f3654c = bool;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.f3652a);
        bundle.putString("com.yandex.metrica.identifiers.extra.ID", this.f3653b);
        Boolean bool = this.f3654c;
        if (bool != null) {
            bundle.putBoolean("com.yandex.metrica.identifiers.extra.LIMITED", bool.booleanValue());
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual((Object) this.f3652a, (Object) fVar.f3652a) && Intrinsics.areEqual((Object) this.f3653b, (Object) fVar.f3653b) && Intrinsics.areEqual((Object) this.f3654c, (Object) fVar.f3654c);
    }

    public int hashCode() {
        String str = this.f3652a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3653b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f3654c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AdsIdInfo(provider=" + this.f3652a + ", advId=" + this.f3653b + ", limitedAdTracking=" + this.f3654c + ")";
    }
}
