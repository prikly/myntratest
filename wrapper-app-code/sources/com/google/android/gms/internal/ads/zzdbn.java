package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdbn implements Callable {
    public final /* synthetic */ zzdbu zza;
    public final /* synthetic */ zzgfb zzb;
    public final /* synthetic */ zzgfb zzc;
    public final /* synthetic */ zzgfb zzd;

    public /* synthetic */ zzdbn(zzdbu zzdbu, zzgfb zzgfb, zzgfb zzgfb2, zzgfb zzgfb3) {
        this.zza = zzdbu;
        this.zzb = zzgfb;
        this.zzc = zzgfb2;
        this.zzd = zzgfb3;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}
