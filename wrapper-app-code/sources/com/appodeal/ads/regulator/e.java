package com.appodeal.ads.regulator;

import com.appodeal.ads.regulator.a;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.ConsentFormListener;
import kotlin.jvm.internal.Intrinsics;

public final class e extends ConsentFormListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f17152a;

    public e(d dVar) {
        this.f17152a = dVar;
    }

    public final void onConsentFormClosed(Consent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        d.a(this.f17152a, new a.C0196a(consent));
    }

    public final void onConsentFormLoaded(ConsentForm consentForm) {
        Intrinsics.checkNotNullParameter(consentForm, "consentForm");
        d.a(this.f17152a, new a.e(consentForm));
    }
}
