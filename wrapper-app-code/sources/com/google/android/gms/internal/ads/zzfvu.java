package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfvu extends zzfwn {
    private String zza;
    private String zzb;

    zzfvu() {
    }

    public final zzfwn zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfwn zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzfwo zzc() {
        return new zzfvw(this.zza, this.zzb, (zzfvv) null);
    }
}
