package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class zzgw implements Runnable {
    public final /* synthetic */ zzhx zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzgw(zzhx zzhx, Bundle bundle) {
        this.zza = zzhx;
        this.zzb = bundle;
    }

    public final void run() {
        this.zza.zzC(this.zzb);
    }
}
