package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzens implements zzekx {
    private final Context zza;
    private final zzdos zzb;
    private final Executor zzc;

    public zzens(Context context, zzdos zzdos, Executor executor) {
        this.zza = context;
        this.zzb = zzdos;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfix zzfix, int i) {
        return zzfix.zza.zza.zzg.contains(Integer.toString(i));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzdqg zzdqg;
        zzbwe zzD = ((zzfkb) zzekt.zzb).zzD();
        zzbwf zzE = ((zzfkb) zzekt.zzb).zzE();
        zzbwi zzd = ((zzfkb) zzekt.zzb).zzd();
        if (zzd != null && zzc(zzfix, 6)) {
            zzdqg = zzdqg.zzs(zzd);
        } else if (zzD != null && zzc(zzfix, 6)) {
            zzdqg = zzdqg.zzad(zzD);
        } else if (zzD != null && zzc(zzfix, 2)) {
            zzdqg = zzdqg.zzab(zzD);
        } else if (zzE != null && zzc(zzfix, 6)) {
            zzdqg = zzdqg.zzae(zzE);
        } else if (zzE == null || !zzc(zzfix, 1)) {
            throw new zzeom(1, "No native ad mappers");
        } else {
            zzdqg = zzdqg.zzac(zzE);
        }
        if (zzfix.zza.zza.zzg.contains(Integer.toString(zzdqg.zzc()))) {
            zzdqi zze = this.zzb.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdqs(zzdqg), new zzdsh(zzE, zzD, zzd, (byte[]) null));
            ((zzems) zzekt.zzc).zzc(zze.zzi());
            zze.zzd().zzj(new zzcvy((zzfkb) zzekt.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeom(1, "No corresponding native ad listener");
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        zzfjg zzfjg = zzfix.zza.zza;
        ((zzfkb) zzekt.zzb).zzp(this.zza, zzfix.zza.zza.zzd, zzfil.zzw.toString(), zzbu.zzl(zzfil.zzt), (zzbvz) zzekt.zzc, zzfjg.zzi, zzfjg.zzg);
    }
}
