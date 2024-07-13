package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdpt implements Runnable {
    public final /* synthetic */ zzdqb zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdpt(zzdqb zzdqb, View view, boolean z, int i) {
        this.zza = zzdqb;
        this.zzb = view;
        this.zzc = z;
        this.zzd = i;
    }

    public final void run() {
        this.zza.zzt(this.zzb, this.zzc, this.zzd);
    }
}
