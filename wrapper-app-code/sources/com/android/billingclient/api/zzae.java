package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzae implements Runnable {
    public final /* synthetic */ PurchasesResponseListener zza;

    public /* synthetic */ zzae(PurchasesResponseListener purchasesResponseListener) {
        this.zza = purchasesResponseListener;
    }

    public final void run() {
        this.zza.onQueryPurchasesResponse(zzbc.zzn, zzu.zzl());
    }
}
