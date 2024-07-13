package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcwf implements zzgen {
    final /* synthetic */ zzcwh zza;

    zzcwf(zzcwh zzcwh) {
        this.zza = zzcwh;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcwh zzcwh = this.zza;
        zzfjp zzd = zzcwh.zzh;
        List zzd2 = zzcwh.zzg.zzd(zzcwh.zze, zzcwh.zzf, false, "", (String) obj, zzcwh.zzf.zzc);
        int i = 1;
        if (true == zzt.zzo().zzx(this.zza.zza)) {
            i = 2;
        }
        zzd.zzc(zzd2, i);
    }
}
