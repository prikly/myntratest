package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzr implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ SkuDetailsResponseListener zzd;

    public /* synthetic */ zzr(BillingClientImpl billingClientImpl, String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = str;
        this.zzc = list;
        this.zzd = skuDetailsResponseListener;
    }

    public final Object call() {
        this.zza.zzn(this.zzb, this.zzc, (String) null, this.zzd);
        return null;
    }
}
