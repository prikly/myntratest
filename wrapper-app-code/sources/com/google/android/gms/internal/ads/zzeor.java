package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeor implements zzekx {
    private final Context zza;
    private final Executor zzb;
    private final zzdvy zzc;

    public zzeor(Context context, Executor executor, zzdvy zzdvy) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvy;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzdvu zze = this.zzc.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdvv(new zzeoq(zzekt)));
        zze.zzd().zzj(new zzcvy((zzfkb) zzekt.zzb), this.zzb);
        ((zzems) zzekt.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        try {
            zzfjg zzfjg = zzfix.zza.zza;
            if (zzfjg.zzo.zza == 3) {
                ((zzfkb) zzekt.zzb).zzr(this.zza, zzfjg.zzd, zzfil.zzw.toString(), (zzbvz) zzekt.zzc);
            } else {
                ((zzfkb) zzekt.zzb).zzq(this.zza, zzfjg.zzd, zzfil.zzw.toString(), (zzbvz) zzekt.zzc);
            }
        } catch (Exception e2) {
            zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzekt.zza)), e2);
        }
    }
}
