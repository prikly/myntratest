package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaye implements zzayv {
    final /* synthetic */ zzayf zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzaye(zzayf zzayf, int i) {
        this.zza = zzayf;
        this.zzb = i;
    }

    public final int zzb(zzate zzate, zzauy zzauy, boolean z) {
        return this.zza.zze(this.zzb, zzate, zzauy, z);
    }

    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    public final void zzd(long j) {
        this.zza.zzy(this.zzb, j);
    }

    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
