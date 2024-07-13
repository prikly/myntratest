package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzenw implements zzekx {
    private final Context zza;
    private final zzdos zzb;
    /* access modifiers changed from: private */
    public zzbwi zzc;
    private final zzchu zzd;

    public zzenw(Context context, zzdos zzdos, zzchu zzchu) {
        this.zza = context;
        this.zzb = zzdos;
        this.zzd = zzchu;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        if (zzfix.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdqg zzs = zzdqg.zzs(this.zzc);
            if (zzfix.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
                zzdqi zze = this.zzb.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdqs(zzs), new zzdsh((zzbwf) null, (zzbwe) null, this.zzc, (byte[]) null));
                ((zzems) zzekt.zzc).zzc(zze.zzh());
                return zze.zza();
            }
            throw new zzeom(1, "No corresponding native ad listener");
        }
        throw new zzeom(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        try {
            ((zzbxq) zzekt.zzb).zzq(zzfil.zzaa);
            if (this.zzd.zzc < ((Integer) zzba.zzc().zzb(zzbjj.zzbx)).intValue()) {
                ((zzbxq) zzekt.zzb).zzm(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzenv(this, zzekt, (zzenu) null), (zzbvz) zzekt.zzc);
            } else {
                ((zzbxq) zzekt.zzb).zzn(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzenv(this, zzekt, (zzenu) null), (zzbvz) zzekt.zzc, zzfix.zza.zza.zzi);
            }
        } catch (RemoteException e2) {
            throw new zzfjl(e2);
        }
    }
}
