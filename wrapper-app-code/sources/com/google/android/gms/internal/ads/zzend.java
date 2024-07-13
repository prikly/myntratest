package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzend implements zzekx {
    private final Context zza;
    private final zzdnw zzb;
    private final zzchu zzc;
    private final Executor zzd;

    public zzend(Context context, zzchu zzchu, zzdnw zzdnw, Executor executor) {
        this.zza = context;
        this.zzc = zzchu;
        this.zzb = zzdnw;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzdmw zze = this.zzb.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdmz(new zzenc(this, zzekt), (zzcno) null));
        zze.zzd().zzj(new zzcvy((zzfkb) zzekt.zzb), this.zzd);
        ((zzems) zzekt.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        ((zzfkb) zzekt.zzb).zzo(this.zza, zzfix.zza.zza.zzd, zzfil.zzw.toString(), zzbu.zzl(zzfil.zzt), (zzbvz) zzekt.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzekt zzekt, boolean z, Context context, zzdfa zzdfa) throws zzdod {
        try {
            ((zzfkb) zzekt.zzb).zzv(z);
            if (this.zzc.zzc < ((Integer) zzba.zzc().zzb(zzbjj.zzaB)).intValue()) {
                ((zzfkb) zzekt.zzb).zzx();
            } else {
                ((zzfkb) zzekt.zzb).zzy(context);
            }
        } catch (zzfjl e2) {
            zze.zzi("Cannot show interstitial.");
            throw new zzdod(e2.getCause());
        }
    }
}
