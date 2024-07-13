package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzsw implements zzty {
    private final zzty zza;
    private final long zzb;

    public zzsw(zzty zzty, long j) {
        this.zza = zzty;
        this.zzb = j;
    }

    public final int zza(zzje zzje, zzgi zzgi, int i) {
        int zza2 = this.zza.zza(zzje, zzgi, i);
        if (zza2 != -4) {
            return zza2;
        }
        zzgi.zzd = Math.max(0, zzgi.zzd + this.zzb);
        return -4;
    }

    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzty zzc() {
        return this.zza;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
