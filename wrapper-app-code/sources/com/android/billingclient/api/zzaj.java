package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzaj implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzaj(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchasesResponseListener;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbj zzi = BillingClientImpl.zzi(this.zzc, this.zza);
        if (zzi.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzi.zza(), zzi.zzb());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzi.zza(), zzu.zzl());
        return null;
    }
}
