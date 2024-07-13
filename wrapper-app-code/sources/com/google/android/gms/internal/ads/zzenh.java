package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzenh implements zzekx {
    private final Context zza;
    private final zzdnw zzb;

    public zzenh(Context context, zzdnw zzdnw) {
        this.zza = context;
        this.zzb = zzdnw;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzenb zzenb = new zzenb(zzfil, (zzbxq) zzekt.zzb, AdFormat.INTERSTITIAL);
        zzdmw zze = this.zzb.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdmz(zzenb, (zzcno) null));
        zzenb.zzb(zze.zzc());
        ((zzems) zzekt.zzc).zzc(zze.zzh());
        return zze.zzg();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        try {
            ((zzbxq) zzekt.zzb).zzq(zzfil.zzaa);
            ((zzbxq) zzekt.zzb).zzl(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeng(this, zzekt, (zzenf) null), (zzbvz) zzekt.zzc);
        } catch (RemoteException e2) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e2);
            throw new zzfjl(e2);
        }
    }
}
