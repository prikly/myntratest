package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbbr {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzbbs zzb;

    public zzbbr(Handler handler, zzbbs zzbbs) {
        if (handler != null) {
            this.zza = handler;
            this.zzb = zzbbs;
            return;
        }
        throw null;
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzbbl(this, str, j, j2));
    }

    public final void zzc(zzaux zzaux) {
        this.zza.post(new zzbbq(this, zzaux));
    }

    public final void zzd(int i, long j) {
        this.zza.post(new zzbbn(this, i, j));
    }

    public final void zze(zzaux zzaux) {
        this.zza.post(new zzbbk(this, zzaux));
    }

    public final void zzf(zzatd zzatd) {
        this.zza.post(new zzbbm(this, zzatd));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbbp(this, surface));
    }

    public final void zzh(int i, int i2, int i3, float f2) {
        this.zza.post(new zzbbo(this, i, i2, i3, f2));
    }
}
