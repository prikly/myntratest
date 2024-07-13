package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzatz {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzaua zzb;

    public zzatz(Handler handler, zzaua zzaua) {
        if (handler != null) {
            this.zza = handler;
            this.zzb = zzaua;
            return;
        }
        throw null;
    }

    public final void zzb(int i) {
        this.zza.post(new zzaty(this, i));
    }

    public final void zzc(int i, long j, long j2) {
        this.zza.post(new zzatw(this, i, j, j2));
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.post(new zzatu(this, str, j, j2));
    }

    public final void zze(zzaux zzaux) {
        this.zza.post(new zzatx(this, zzaux));
    }

    public final void zzf(zzaux zzaux) {
        this.zza.post(new zzatt(this, zzaux));
    }

    public final void zzg(zzatd zzatd) {
        this.zza.post(new zzatv(this, zzatd));
    }
}
