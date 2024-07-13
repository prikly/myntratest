package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzz implements Runnable {
    public final /* synthetic */ SkuDetailsResponseListener zza;

    public /* synthetic */ zzz(SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = skuDetailsResponseListener;
    }

    public final void run() {
        this.zza.onSkuDetailsResponse(zzbc.zzn, (List<SkuDetails>) null);
    }
}
