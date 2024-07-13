package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzzi implements zzaaq {
    private final byte[] zza = new byte[4096];

    public final /* synthetic */ int zze(zzr zzr, int i, boolean z) {
        return zzaao.zza(this, zzr, i, z);
    }

    public final int zzf(zzr zzr, int i, boolean z, int i2) throws IOException {
        int zza2 = zzr.zza(this.zza, 0, Math.min(4096, i));
        if (zza2 != -1) {
            return zza2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzk(zzaf zzaf) {
    }

    public final /* synthetic */ void zzq(zzef zzef, int i) {
        zzaao.zzb(this, zzef, i);
    }

    public final void zzr(zzef zzef, int i, int i2) {
        zzef.zzG(i);
    }

    public final void zzs(long j, int i, int i2, int i3, zzaap zzaap) {
    }
}
