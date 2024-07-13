package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzebe implements Runnable {
    public final /* synthetic */ zzebj zza;
    public final /* synthetic */ zzfkb zzb;
    public final /* synthetic */ zzbsd zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzebe(zzebj zzebj, zzfkb zzfkb, zzbsd zzbsd, List list, String str) {
        this.zza = zzebj;
        this.zzb = zzfkb;
        this.zzc = zzbsd;
        this.zzd = list;
        this.zze = str;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
