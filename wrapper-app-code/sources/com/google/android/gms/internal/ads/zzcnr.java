package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcnr implements Runnable {
    public final /* synthetic */ zzcnv zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzcep zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzcnr(zzcnv zzcnv, View view, zzcep zzcep, int i) {
        this.zza = zzcnv;
        this.zzb = view;
        this.zzc = zzcep;
        this.zzd = i;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd);
    }
}
