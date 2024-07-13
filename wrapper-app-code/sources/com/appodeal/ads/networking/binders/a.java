package com.appodeal.ads.networking.binders;

import com.appodeal.ads.h0;
import kotlin.jvm.internal.Intrinsics;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16888a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16889b;

    public a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "adapterVersion");
        Intrinsics.checkNotNullParameter(str2, "adapterSdkVersion");
        this.f16888a = str;
        this.f16889b = str2;
    }

    public final String a() {
        return this.f16889b;
    }

    public final String b() {
        return this.f16888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual((Object) this.f16888a, (Object) aVar.f16888a) && Intrinsics.areEqual((Object) this.f16889b, (Object) aVar.f16889b);
    }

    public final int hashCode() {
        return this.f16889b.hashCode() + (this.f16888a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a2 = h0.a("ModuleInfo(adapterVersion=");
        a2.append(this.f16888a);
        a2.append(", adapterSdkVersion=");
        a2.append(this.f16889b);
        a2.append(')');
        return a2.toString();
    }
}
