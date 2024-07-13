package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzenb implements zzdoe {
    private final zzfil zza;
    private final zzbxq zzb;
    private final AdFormat zzc;
    private zzdff zzd = null;

    zzenb(zzfil zzfil, zzbxq zzbxq, AdFormat adFormat) {
        this.zza = zzfil;
        this.zzb = zzbxq;
        this.zzc = adFormat;
    }

    public final void zza(boolean z, Context context, zzdfa zzdfa) throws zzdod {
        boolean z2;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                z2 = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal != 2) {
                if (ordinal == 6) {
                    z2 = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzdod("Adapter failed to show.");
            } else {
                z2 = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (z2) {
                if (this.zzd != null) {
                    if (!((Boolean) zzba.zzc().zzb(zzbjj.zzbp)).booleanValue() && this.zza.zzZ == 2) {
                        this.zzd.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdod("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdod(th);
        }
    }

    public final void zzb(zzdff zzdff) {
        this.zzd = zzdff;
    }
}
