package com.appodeal.consent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/appodeal/consent/ConsentInfoUpdateListener;", "Lcom/appodeal/consent/IConsentInfoUpdateListener;", "()V", "onConsentInfoUpdated", "", "consent", "Lcom/appodeal/consent/Consent;", "onFailedToUpdateConsentInfo", "error", "Lcom/appodeal/consent/ConsentManagerError;", "apd_consent"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ConsentInfoUpdateListener implements IConsentInfoUpdateListener {
    public void onConsentInfoUpdated(Consent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
    }

    public void onFailedToUpdateConsentInfo(ConsentManagerError consentManagerError) {
        Intrinsics.checkNotNullParameter(consentManagerError, "error");
    }
}
