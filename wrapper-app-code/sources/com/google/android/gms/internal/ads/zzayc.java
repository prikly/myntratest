package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzayc implements zzbaf {
    final /* synthetic */ zzayf zza;
    private final Uri zzb;
    private final zzazt zzc;
    private final zzayd zzd;
    private final zzbal zze;
    private final zzavl zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    /* access modifiers changed from: private */
    public long zzj;

    public zzayc(zzayf zzayf, Uri uri, zzazt zzazt, zzayd zzayd, zzbal zzbal) {
        this.zza = zzayf;
        if (uri != null) {
            this.zzb = uri;
            if (zzazt != null) {
                this.zzc = zzazt;
                if (zzayd != null) {
                    this.zzd = zzayd;
                    this.zze = zzbal;
                    this.zzf = new zzavl();
                    this.zzh = true;
                    this.zzj = -1;
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void zzb() {
        this.zzg = true;
    }

    public final void zzc() throws IOException, InterruptedException {
        zzavf zzavf;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                zzazt zzazt = this.zzc;
                zzazv zzazv = r4;
                long j3 = j2;
                zzazv zzazv2 = new zzazv(this.zzb, (byte[]) null, j2, j2, -1, (String) null, 0);
                long zzb2 = zzazt.zzb(zzazv);
                this.zzj = zzb2;
                if (zzb2 != -1) {
                    j = j3;
                    zzb2 += j;
                    this.zzj = zzb2;
                } else {
                    j = j3;
                }
                zzavf = new zzavf(this.zzc, j, zzb2);
                try {
                    zzavg zzb3 = this.zzd.zzb(zzavf, this.zzc.zzc());
                    if (this.zzh) {
                        zzb3.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    long j4 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zza();
                            i2 = zzb3.zzf(zzavf, this.zzf);
                            if (zzavf.zzd() > this.zza.zzg + j4) {
                                j4 = zzavf.zzd();
                                this.zze.zzb();
                                zzayf zzayf = this.zza;
                                zzayf.zzm.post(zzayf.zzl);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (!(i == 1 || zzavf == null)) {
                                this.zzf.zza = zzavf.zzd();
                            }
                            zzbay.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzavf.zzd();
                        i = i2;
                    }
                    zzbay.zzm(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.zzf.zza = zzavf.zzd();
                    zzbay.zzm(this.zzc);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                zzavf = null;
                this.zzf.zza = zzavf.zzd();
                zzbay.zzm(this.zzc);
                throw th;
            }
        }
    }

    public final void zzd(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    public final boolean zze() {
        return this.zzg;
    }
}
