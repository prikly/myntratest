package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzeeg implements zzgen {
    final /* synthetic */ zzeeh zza;

    zzeeg(zzeeh zzeeh) {
        this.zza = zzeeh;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue()) {
            Matcher matcher = zzeeh.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfix zzfix = (zzfix) obj;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue()) {
            this.zza.zzf.zzi(zzfix.zzb.zzb.zze);
            this.zza.zzf.zzj(zzfix.zzb.zzb.zzf);
        }
    }
}
