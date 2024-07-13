package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzell implements zzekx {
    private final Context zza;
    private final zzcxy zzb;
    private final Executor zzc;

    zzell(Context context, zzcxy zzcxy, Executor executor) {
        this.zza = context;
        this.zzb = zzcxy;
        this.zzc = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzcxv zza2 = this.zzb.zza(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdmz(new zzelk(zzekt), (zzcno) null), new zzcxw(zzfil.zzab));
        zza2.zzd().zzj(new zzcvy((zzfkb) zzekt.zzb), this.zzc);
        ((zzems) zzekt.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        ((zzfkb) zzekt.zzb).zzl(this.zza, zzfix.zza.zza.zzd, zzfil.zzw.toString(), (zzbvz) zzekt.zzc);
    }
}
