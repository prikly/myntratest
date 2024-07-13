package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzab implements Runnable {
    public final /* synthetic */ AcknowledgePurchaseResponseListener zza;

    public /* synthetic */ zzab(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = acknowledgePurchaseResponseListener;
    }

    public final void run() {
        this.zza.onAcknowledgePurchaseResponse(zzbc.zzn);
    }
}
