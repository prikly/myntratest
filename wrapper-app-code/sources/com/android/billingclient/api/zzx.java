package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzx implements Runnable {
    public final /* synthetic */ PurchaseHistoryResponseListener zza;

    public /* synthetic */ zzx(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = purchaseHistoryResponseListener;
    }

    public final void run() {
        this.zza.onPurchaseHistoryResponse(zzbc.zzn, (List<PurchaseHistoryRecord>) null);
    }
}
