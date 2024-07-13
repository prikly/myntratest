package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzp {
    private final Context zza;
    /* access modifiers changed from: private */
    public final zzo zzb;

    zzp(Context context, zzbf zzbf) {
        this.zza = context;
        this.zzb = new zzo(this, (zzbf) null, (zzn) null);
    }

    /* access modifiers changed from: package-private */
    public final zzbf zzb() {
        zzbf unused = this.zzb.zzc;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final PurchasesUpdatedListener zzc() {
        return this.zzb.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzd() {
        this.zzb.zzd(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final void zze() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzb.zzc(this.zza, intentFilter);
    }

    zzp(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzc) {
        this.zza = context;
        this.zzb = new zzo(this, purchasesUpdatedListener, zzc, (zzn) null);
    }
}
