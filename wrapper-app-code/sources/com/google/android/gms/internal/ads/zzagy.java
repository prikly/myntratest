package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzagy implements zzzj {
    public static final zzzq zza = zzagx.zza;
    private final zzagz zzb;
    private final zzef zzc;
    private final zzef zzd;
    private final zzee zze;
    private zzzm zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzagy() {
        this(0);
    }

    public final int zza(zzzk zzzk, zzaaj zzaaj) throws IOException {
        zzdd.zzb(this.zzf);
        int zza2 = zzzk.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzaal(-9223372036854775807L, 0));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    public final void zzb(zzzm zzzm) {
        this.zzf = zzzm;
        this.zzb.zzb(zzzm, new zzaip(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzzm.zzC();
    }

    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    public final boolean zzd(zzzk zzzk) throws IOException {
        zzyz zzyz;
        int i = 0;
        while (true) {
            zzyz = (zzyz) zzzk;
            zzyz.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj2 = this.zzd.zzj();
            i += zzj2 + 10;
            zzyz.zzl(zzj2, false);
        }
        zzzk.zzj();
        zzyz.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzyz.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (!zzagz.zzf(this.zzd.zzo())) {
                i2++;
                zzzk.zzj();
                zzyz.zzl(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzyz.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzh(14);
                int zzc2 = this.zze.zzc(13);
                if (zzc2 <= 6) {
                    i2++;
                    zzzk.zzj();
                    zzyz.zzl(i2, false);
                } else {
                    zzyz.zzl(zzc2 - 6, false);
                    i4 += zzc2;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzagy(int i) {
        this.zzb = new zzagz(true, (String) null);
        this.zzc = new zzef(2048);
        this.zzh = -1;
        zzef zzef = new zzef(10);
        this.zzd = zzef;
        byte[] zzH = zzef.zzH();
        this.zze = new zzee(zzH, zzH.length);
    }
}
