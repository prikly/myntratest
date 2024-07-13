package com.android.billingclient.api;

import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ ProductDetailsResponseListener zza;

    public /* synthetic */ zzu(ProductDetailsResponseListener productDetailsResponseListener) {
        this.zza = productDetailsResponseListener;
    }

    public final void run() {
        this.zza.onProductDetailsResponse(zzbc.zzn, new ArrayList());
    }
}
