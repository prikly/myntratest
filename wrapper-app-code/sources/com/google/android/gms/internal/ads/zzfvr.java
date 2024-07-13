package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfvr extends zzfwk {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfvr() {
    }

    public final zzfwk zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfwk zzb(int i) {
        this.zza = i;
        this.zzc = 1;
        return this;
    }

    public final zzfwl zzc() {
        if (this.zzc == 1) {
            return new zzfvt(this.zza, this.zzb, (zzfvs) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
