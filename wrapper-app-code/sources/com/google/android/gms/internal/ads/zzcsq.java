package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcsq implements zzeap {
    private final zzcre zza;
    private Context zzb;
    private zzbra zzc;

    /* synthetic */ zzcsq(zzcre zzcre, zzcsp zzcsp) {
        this.zza = zzcre;
    }

    public final /* synthetic */ zzeap zza(zzbra zzbra) {
        if (zzbra != null) {
            this.zzc = zzbra;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzeap zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzeaq zzc() {
        zzhex.zzc(this.zzb, Context.class);
        zzhex.zzc(this.zzc, zzbra.class);
        return new zzcss(this.zza, this.zzb, this.zzc, (zzcsr) null);
    }
}
