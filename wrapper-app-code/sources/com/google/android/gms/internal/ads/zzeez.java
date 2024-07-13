package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzeez implements zzdhi {
    private final Context zza;
    private final zzcft zzb;

    zzeez(Context context, zzcft zzcft) {
        this.zza = context;
        this.zzb = zzcft;
    }

    public final void zzb(zzfix zzfix) {
        if (!TextUtils.isEmpty(zzfix.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzfix.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzfix.zzb.zzb.zzd);
        }
    }

    public final void zzbG(zzccb zzccb) {
    }
}
