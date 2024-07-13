package com.appodeal.ads.regulator.data;

import com.appodeal.consent.Consent;
import kotlin.jvm.internal.Intrinsics;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Consent f17150a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17151b;

    public a(Consent consent, boolean z) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        this.f17150a = consent;
        this.f17151b = z;
    }

    public final Consent a() {
        return this.f17150a;
    }

    public final boolean b() {
        return this.f17151b;
    }
}
