package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcrs implements zzfdj {
    private final zzcre zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcrs(zzcre zzcre, zzcrr zzcrr) {
        this.zza = zzcre;
    }

    public final /* synthetic */ zzfdj zza(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzfdj zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzfdk zzc() {
        zzhex.zzc(this.zzb, Context.class);
        zzhex.zzc(this.zzc, String.class);
        return new zzcru(this.zza, this.zzb, this.zzc, (zzcrt) null);
    }
}
