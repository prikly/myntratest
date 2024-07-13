package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzelp implements zzekx {
    private final Context zza;
    private final zzcxy zzb;

    zzelp(Context context, zzcxy zzcxy) {
        this.zza = context;
        this.zzb = zzcxy;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzenb zzenb = new zzenb(zzfil, (zzbxq) zzekt.zzb, AdFormat.APP_OPEN_AD);
        zzcxv zza2 = this.zzb.zza(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdmz(zzenb, (zzcno) null), new zzcxw(zzfil.zzab));
        zzenb.zzb(zza2.zzc());
        ((zzems) zzekt.zzc).zzc(zza2.zzh());
        return zza2.zza();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        try {
            ((zzbxq) zzekt.zzb).zzq(zzfil.zzaa);
            ((zzbxq) zzekt.zzb).zzi(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzelo(zzekt, (zzeln) null), (zzbvz) zzekt.zzc);
        } catch (RemoteException e2) {
            zze.zzb("Remote exception loading an app open RTB ad", e2);
            throw new zzfjl(e2);
        }
    }
}
