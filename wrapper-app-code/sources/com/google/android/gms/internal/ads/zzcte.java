package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcte implements zzfie {
    private final zzcre zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcte(zzcre zzcre, zzctd zzctd) {
        this.zza = zzcre;
    }

    public final /* synthetic */ zzfie zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzfie zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzfif zzc() {
        zzhex.zzc(this.zzb, Context.class);
        return new zzctg(this.zza, this.zzb, this.zzc, (zzctf) null);
    }
}
