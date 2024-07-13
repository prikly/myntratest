package com.appodeal.consent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/appodeal/consent/ConsentFormListener;", "Lcom/appodeal/consent/IConsentFormListener;", "()V", "onConsentFormClosed", "", "consent", "Lcom/appodeal/consent/Consent;", "onConsentFormError", "error", "Lcom/appodeal/consent/ConsentManagerError;", "onConsentFormLoaded", "consentForm", "Lcom/appodeal/consent/ConsentForm;", "onConsentFormOpened", "apd_consent"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ConsentFormListener implements IConsentFormListener {
    public void onConsentFormClosed(Consent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
    }

    public void onConsentFormError(ConsentManagerError consentManagerError) {
        Intrinsics.checkNotNullParameter(consentManagerError, "error");
    }

    public void onConsentFormLoaded(ConsentForm consentForm) {
        Intrinsics.checkNotNullParameter(consentForm, "consentForm");
    }

    public void onConsentFormOpened() {
    }
}
