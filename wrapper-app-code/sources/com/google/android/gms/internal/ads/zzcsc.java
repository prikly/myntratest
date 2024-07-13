package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcsc implements zzfex {
    private final zzcre zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcsc(zzcre zzcre, zzcsb zzcsb) {
        this.zza = zzcre;
    }

    public final /* synthetic */ zzfex zza(zzq zzq) {
        if (zzq != null) {
            this.zzd = zzq;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzfex zzb(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzfex zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzfey zzd() {
        zzhex.zzc(this.zzb, Context.class);
        zzhex.zzc(this.zzc, String.class);
        zzhex.zzc(this.zzd, zzq.class);
        return new zzcse(this.zza, this.zzb, this.zzc, this.zzd, (zzcsd) null);
    }
}
