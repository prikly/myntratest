package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcta implements zzfgq {
    private final zzcre zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcta(zzcre zzcre, zzcsz zzcsz) {
        this.zza = zzcre;
    }

    public final /* synthetic */ zzfgq zza(zzq zzq) {
        if (zzq != null) {
            this.zzd = zzq;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzfgq zzb(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzfgq zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzfgr zzd() {
        zzhex.zzc(this.zzb, Context.class);
        zzhex.zzc(this.zzc, String.class);
        zzhex.zzc(this.zzd, zzq.class);
        return new zzctc(this.zza, this.zzb, this.zzc, this.zzd, (zzctb) null);
    }
}
