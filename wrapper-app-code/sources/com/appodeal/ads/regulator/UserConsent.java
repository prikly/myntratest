package com.appodeal.ads.regulator;

import com.appodeal.consent.Consent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/regulator/UserConsent;", "", "status", "Lcom/appodeal/consent/Consent$Status;", "getStatus", "()Lcom/appodeal/consent/Consent$Status;", "zone", "Lcom/appodeal/consent/Consent$Zone;", "getZone", "()Lcom/appodeal/consent/Consent$Zone;", "apd_core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface UserConsent {
    Consent.Status getStatus();

    Consent.Zone getZone();
}
