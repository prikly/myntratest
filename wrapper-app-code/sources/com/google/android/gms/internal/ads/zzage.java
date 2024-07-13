package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzage extends zzago {
    private zzzw zza;
    private zzagd zzb;

    zzage() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long zza(zzef zzef) {
        if (!zzd(zzef.zzH())) {
            return -1;
        }
        int i = (zzef.zzH()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza2 = zzzs.zza(zzef, i);
            zzef.zzF(0);
            return (long) zza2;
        }
        zzef.zzG(4);
        zzef.zzu();
        int zza22 = zzzs.zza(zzef, i);
        zzef.zzF(0);
        return (long) zza22;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzef zzef, long j, zzagl zzagl) {
        byte[] zzH = zzef.zzH();
        zzzw zzzw = this.zza;
        if (zzzw == null) {
            zzzw zzzw2 = new zzzw(zzH, 17);
            this.zza = zzzw2;
            zzagl.zza = zzzw2.zzc(Arrays.copyOfRange(zzH, 9, zzef.zzd()), (zzbq) null);
            return true;
        } else if ((zzH[0] & Ascii.DEL) == 3) {
            zzzv zzb2 = zzzt.zzb(zzef);
            zzzw zzf = zzzw.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzagd(zzf, zzb2);
            return true;
        } else if (!zzd(zzH)) {
            return true;
        } else {
            zzagd zzagd = this.zzb;
            if (zzagd != null) {
                zzagd.zza(j);
                zzagl.zzb = this.zzb;
            }
            if (zzagl.zza != null) {
                return false;
            }
            throw null;
        }
    }
}
