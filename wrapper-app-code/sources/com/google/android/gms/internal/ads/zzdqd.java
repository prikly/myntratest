package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdqd {
    private zzbmi zza;

    public zzdqd(zzdpr zzdpr) {
        this.zza = zzdpr;
    }

    public final synchronized zzbmi zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbmi zzbmi) {
        this.zza = zzbmi;
    }
}
