package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzepn implements zzekx {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdvy zzc;

    public zzepn(Context context, Executor executor, zzdvy zzdvy) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvy;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzfix zzfix, zzfil zzfil, zzekt zzekt) {
        try {
            ((zzfkb) zzekt.zzb).zzk(zzfix.zza.zza.zzd, zzfil.zzw.toString());
        } catch (Exception e2) {
            zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzekt.zza)), e2);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzdvu zze = this.zzc.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdvv(new zzepj(zzekt)));
        zze.zzd().zzj(new zzcvy((zzfkb) zzekt.zzb), this.zzb);
        zzdfu zze2 = zze.zze();
        zzdel zzb2 = zze.zzb();
        ((zzemt) zzekt.zzc).zzc(new zzepm(this, zze.zza(), zzb2, zze2, zze.zzg()));
        return zze.zzk();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        if (!((zzfkb) zzekt.zzb).zzC()) {
            ((zzemt) zzekt.zzc).zzd(new zzepl(this, zzfix, zzfil, zzekt));
            ((zzfkb) zzekt.zzb).zzh(this.zza, zzfix.zza.zza.zzd, (String) null, (zzcdc) zzekt.zzc, zzfil.zzw.toString());
            return;
        }
        zze(zzfix, zzfil, zzekt);
    }
}
