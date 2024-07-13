package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbau implements zzban {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzath zzd = zzath.zza;

    public final long zzI() {
        long j;
        long j2 = this.zzb;
        if (!this.zza) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzath zzath = this.zzd;
        if (zzath.zzb == 1.0f) {
            j = zzaso.zza(elapsedRealtime);
        } else {
            j = zzath.zza(elapsedRealtime);
        }
        return j2 + j;
    }

    public final zzath zzJ() {
        throw null;
    }

    public final zzath zzK(zzath zzath) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzath;
        return zzath;
    }

    public final void zza(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zzc() {
        if (this.zza) {
            zza(zzI());
            this.zza = false;
        }
    }

    public final void zzd(zzban zzban) {
        zza(zzban.zzI());
        this.zzd = zzban.zzJ();
    }
}
