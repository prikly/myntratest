package com.google.android.gms.internal.ads;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgw implements zzjf {
    private final zzwi zza;
    private final long zzb = zzen.zzv(50000);
    private final long zzc = zzen.zzv(50000);
    private final long zzd = zzen.zzv(2500);
    private final long zze = zzen.zzv(5000);
    private final long zzf = zzen.zzv(0);
    private int zzg = 13107200;
    private boolean zzh;

    public zzgw() {
        zzwi zzwi = new zzwi(true, 65536);
        zzj(IronSourceConstants.IS_INSTANCE_NOT_FOUND, 0, "bufferForPlaybackMs", BuildConfig.ADAPTER_VERSION);
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", BuildConfig.ADAPTER_VERSION);
        zzj(50000, IronSourceConstants.IS_INSTANCE_NOT_FOUND, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", BuildConfig.ADAPTER_VERSION);
        this.zza = zzwi;
    }

    private static void zzj(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        zzdd.zze(z, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final void zzb() {
        zzk(false);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final void zze(zzjy[] zzjyArr, zzug zzug, zzvt[] zzvtArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzjyArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (zzvtArr[i] != null) {
                    if (zzjyArr[i].zzb() != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j, long j2, float f2) {
        int zza2 = this.zza.zza();
        int i = this.zzg;
        long j3 = this.zzb;
        if (f2 > 1.0f) {
            j3 = Math.min(zzen.zzs(j3, f2), this.zzc);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000)) {
            if (zza2 < i) {
                z = true;
            }
            this.zzh = z;
            if (!z && j2 < 500000) {
                zzdw.zze("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || zza2 >= i) {
            this.zzh = false;
        }
        return this.zzh;
    }

    public final boolean zzh(long j, float f2, boolean z, long j2) {
        long j3;
        long zzu = zzen.zzu(j, f2);
        if (z) {
            j3 = this.zze;
        } else {
            j3 = this.zzd;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzu >= j3 || this.zza.zza() >= this.zzg;
    }

    public final zzwi zzi() {
        return this.zza;
    }
}
