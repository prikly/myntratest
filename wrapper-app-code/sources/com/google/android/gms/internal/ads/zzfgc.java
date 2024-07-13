package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfgc {
    static zzfga zza(Context context, zzfko zzfko, zzflg zzflg) {
        return zzc(context, zzfko, zzflg);
    }

    static zzfga zzb(Context context, zzfko zzfko, zzflg zzflg) {
        return zzc(context, zzfko, zzflg);
    }

    private static zzfga zzc(Context context, zzfko zzfko, zzflg zzflg) {
        zzcgr zzcgr;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfM)).booleanValue()) {
            zzcgr = zzt.zzo().zzh().zzh();
        } else {
            zzcgr = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcgr != null && zzcgr.zzh()) {
            z = true;
        }
        if (((Integer) zzba.zzc().zzb(zzbjj.zzgc)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzfL)).booleanValue() || z) {
                zzflf zza = zzflg.zza(zzfkw.AppOpen, context, zzfko, new zzffe(new zzffb()));
                return new zzffg(new zzffq(new zzffp()), new zzffm(zza.zza, zzcib.zza), zza.zzb, zza.zza.zza().zzf, zzcib.zza);
            }
        }
        return new zzffp();
    }
}
