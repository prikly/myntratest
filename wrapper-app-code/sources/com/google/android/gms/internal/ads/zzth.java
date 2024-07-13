package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzth implements zzty {
    final /* synthetic */ zztk zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzth(zztk zztk, int i) {
        this.zza = zztk;
        this.zzb = i;
    }

    public final int zza(zzje zzje, zzgi zzgi, int i) {
        return this.zza.zzg(this.zzb, zzje, zzgi, i);
    }

    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
