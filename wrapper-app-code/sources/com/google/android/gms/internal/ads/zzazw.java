package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzazw {
    private final zzazq[] zza = new zzazq[1];
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzazq[] zze = new zzazq[100];

    public zzazw(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzc * 65536;
    }

    public final synchronized zzazq zzb() {
        zzazq zzazq;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzazq[] zzazqArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzazq = zzazqArr[i2];
            zzazqArr[i2] = null;
        } else {
            zzazq = new zzazq(new byte[65536], 0);
        }
        return zzazq;
    }

    public final synchronized void zzc(zzazq zzazq) {
        zzazq[] zzazqArr = this.zza;
        zzazqArr[0] = zzazq;
        zzd(zzazqArr);
    }

    public final synchronized void zzd(zzazq[] zzazqArr) {
        int i = this.zzd;
        int i2 = i + r1;
        zzazq[] zzazqArr2 = this.zze;
        int length = zzazqArr2.length;
        if (i2 >= length) {
            this.zze = (zzazq[]) Arrays.copyOf(zzazqArr2, Math.max(length + length, i2));
        }
        for (zzazq zzazq : zzazqArr) {
            byte[] bArr = zzazq.zza;
            zzazq[] zzazqArr3 = this.zze;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            zzazqArr3[i3] = zzazq;
        }
        this.zzc -= zzazqArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzbay.zzd(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max < i) {
            Arrays.fill(this.zze, max, i, (Object) null);
            this.zzd = max;
        }
    }
}
