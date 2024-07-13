package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdrd implements Runnable {
    public final /* synthetic */ zzdrg zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdrd(zzdrg zzdrg, ViewGroup viewGroup) {
        this.zza = zzdrg;
        this.zzb = viewGroup;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
