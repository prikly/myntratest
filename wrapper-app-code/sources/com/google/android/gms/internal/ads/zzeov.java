package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeov implements zzekx {
    private final Context zza;
    private final zzdvy zzb;

    public zzeov(Context context, zzdvy zzdvy) {
        this.zza = context;
        this.zzb = zzdvy;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        zzenb zzenb = new zzenb(zzfil, (zzbxq) zzekt.zzb, AdFormat.REWARDED);
        zzdvu zze = this.zzb.zze(new zzdbc(zzfix, zzfil, zzekt.zza), new zzdvv(zzenb));
        zzenb.zzb(zze.zzc());
        ((zzems) zzekt.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        try {
            ((zzbxq) zzekt.zzb).zzq(zzfil.zzaa);
            if (zzfix.zza.zza.zzo.zza == 3) {
                ((zzbxq) zzekt.zzb).zzo(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeou(this, zzekt, (zzeot) null), (zzbvz) zzekt.zzc);
            } else {
                ((zzbxq) zzekt.zzb).zzp(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeou(this, zzekt, (zzeot) null), (zzbvz) zzekt.zzc);
            }
        } catch (RemoteException e2) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e2);
        }
    }
}
