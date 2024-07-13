package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaiz {
    public final int zza;
    public final long zzb;

    private zzaiz(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaiz zza(zzzk zzzk, zzef zzef) throws IOException {
        ((zzyz) zzzk).zzm(zzef.zzH(), 0, 8, false);
        zzef.zzF(0);
        return new zzaiz(zzef.zze(), zzef.zzq());
    }
}
