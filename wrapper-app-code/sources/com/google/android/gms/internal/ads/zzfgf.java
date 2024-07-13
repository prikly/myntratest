package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfgf implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzfgf(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    /* renamed from: zza */
    public final zzfga zzb() {
        zzcgr zzcgr;
        Context context = (Context) this.zza.zzb();
        zzfko zzfko = (zzfko) this.zzb.zzb();
        zzflg zzflg = (zzflg) this.zzc.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfM)).booleanValue()) {
            zzcgr = zzt.zzo().zzh().zzh();
        } else {
            zzcgr = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcgr != null && zzcgr.zzh()) {
            z = true;
        }
        if (((Integer) zzba.zzc().zzb(zzbjj.zzfO)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzfL)).booleanValue() || z) {
                zzflf zza2 = zzflg.zza(zzfkw.Rewarded, context, zzfko, new zzffe(new zzffb()));
                return new zzffg(new zzffq(new zzffp()), new zzffm(zza2.zza, zzcib.zza), zza2.zzb, zza2.zza.zza().zzf, zzcib.zza);
            }
        }
        return new zzffp();
    }
}
