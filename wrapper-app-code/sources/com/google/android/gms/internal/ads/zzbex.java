package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzbex implements Runnable {
    public final /* synthetic */ zzbfc zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbex(zzbfc zzbfc, Context context) {
        this.zza = zzbfc;
        this.zzb = context;
    }

    public final void run() {
        this.zza.zzb(this.zzb);
    }
}
