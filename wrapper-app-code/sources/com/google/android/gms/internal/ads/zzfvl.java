package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfvl extends zzfvx {
    private String zza;
    private String zzb;

    zzfvl() {
    }

    public final zzfvx zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfvx zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzfvy zzc() {
        return new zzfvn(this.zza, this.zzb, (zzfvm) null);
    }
}
