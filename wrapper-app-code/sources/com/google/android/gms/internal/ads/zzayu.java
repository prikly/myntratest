package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzayu implements zzavp {
    private final zzayr zza = new zzayr();
    private final zzayq zzb = new zzayq();
    private final zzbar zzc = new zzbar(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private zzays zze;
    private zzays zzf;
    private zzatd zzg;
    private zzatd zzh;
    private long zzi;
    private int zzj = 65536;
    private zzayt zzk;
    private final zzazw zzl;

    public zzayu(zzazw zzazw, byte[] bArr) {
        this.zzl = zzazw;
        zzays zzays = new zzays(0, 65536);
        this.zze = zzays;
        this.zzf = zzays;
    }

    private final int zzo(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzays zzays = this.zzf;
            if (zzays.zzc) {
                this.zzf = zzays.zze;
            }
            zzays zzays2 = this.zzf;
            zzazq zzb2 = this.zzl.zzb();
            zzays zzays3 = new zzays(this.zzf.zzb, 65536);
            zzays2.zzd = zzb2;
            zzays2.zze = zzays3;
            zzays2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzays zzays = this.zze;
        if (zzays.zzc) {
            zzays zzays2 = this.zzf;
            int i = (zzays2.zzc ? 1 : 0) + (((int) (zzays2.zza - zzays.zza)) / 65536);
            zzazq[] zzazqArr = new zzazq[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzazqArr[i2] = zzays.zzd;
                zzays.zzd = null;
                zzays = zzays.zze;
            }
            this.zzl.zzd(zzazqArr);
        }
        zzays zzays3 = new zzays(0, 65536);
        this.zze = zzays3;
        this.zzf = zzays3;
        this.zzi = 0;
        this.zzj = 65536;
        this.zzl.zzg();
    }

    private final void zzq(long j) {
        while (true) {
            zzays zzays = this.zze;
            if (j >= zzays.zzb) {
                this.zzl.zzc(zzays.zzd);
                zzays zzays2 = this.zze;
                zzays2.zzd = null;
                this.zze = zzays2.zze;
            } else {
                return;
            }
        }
    }

    private final void zzr() {
        if (!this.zzd.compareAndSet(1, 0)) {
            zzp();
        }
    }

    private final void zzs(long j, byte[] bArr, int i) {
        zzq(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, 65536 - i3);
            zzazq zzazq = this.zze.zzd;
            System.arraycopy(zzazq.zza, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzc(zzazq);
                zzays zzays = this.zze;
                zzays.zzd = null;
                this.zze = zzays.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    public final void zza(zzatd zzatd) {
        zzatd zzatd2 = zzatd == null ? null : zzatd;
        boolean zzk2 = this.zza.zzk(zzatd2);
        this.zzh = zzatd;
        zzayt zzayt = this.zzk;
        if (zzayt != null && zzk2) {
            zzayt.zzv(zzatd2);
        }
    }

    public final void zzb(zzbar zzbar, int i) {
        if (zzt()) {
            while (i > 0) {
                int zzo = zzo(i);
                zzbar.zzq(this.zzf.zzd.zza, this.zzj, zzo);
                this.zzj += zzo;
                this.zzi += (long) zzo;
                i -= zzo;
            }
            zzr();
            return;
        }
        zzbar.zzw(i);
    }

    public final void zzc(long j, int i, int i2, int i3, zzavo zzavo) {
        if (zzt()) {
            try {
                this.zza.zzh(j, i, this.zzi - ((long) i2), i2, zzavo);
            } finally {
                zzr();
            }
        } else {
            long j2 = j;
            this.zza.zzi(j);
        }
    }

    public final int zzd(zzavf zzavf, int i, boolean z) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb2 = zzavf.zzb(i);
            if (zzb2 != -1) {
                return zzb2;
            }
            throw new EOFException();
        }
        try {
            int zza2 = zzavf.zza(this.zzf.zzd.zza, this.zzj, zzo(i));
            if (zza2 != -1) {
                this.zzj += zza2;
                this.zzi += (long) zza2;
                return zza2;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzate zzate, zzauy zzauy, boolean z, boolean z2, long j) {
        int i;
        zzauy zzauy2 = zzauy;
        int zzb2 = this.zza.zzb(zzate, zzauy, z, z2, this.zzg, this.zzb);
        if (zzb2 == -5) {
            this.zzg = zzate.zza;
            return -5;
        } else if (zzb2 != -4) {
            return -3;
        } else {
            if (!zzauy.zzf()) {
                if (zzauy2.zzc < j) {
                    zzauy2.zza(RecyclerView.UNDEFINED_DURATION);
                }
                if (zzauy.zzi()) {
                    zzayq zzayq = this.zzb;
                    long j2 = zzayq.zzb;
                    this.zzc.zzs(1);
                    zzs(j2, this.zzc.zza, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.zzc.zza[0];
                    boolean z3 = (b2 & 128) != 0;
                    byte b3 = b2 & Ascii.DEL;
                    zzauw zzauw = zzauy2.zza;
                    if (zzauw.zza == null) {
                        zzauw.zza = new byte[16];
                    }
                    zzs(j3, zzauw.zza, b3);
                    long j4 = j3 + ((long) b3);
                    if (z3) {
                        this.zzc.zzs(2);
                        zzs(j4, this.zzc.zza, 2);
                        j4 += 2;
                        i = this.zzc.zzj();
                    } else {
                        i = 1;
                    }
                    zzauw zzauw2 = zzauy2.zza;
                    int[] iArr = zzauw2.zzd;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzauw2.zze;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i2 = i * 6;
                        this.zzc.zzs(i2);
                        zzs(j4, this.zzc.zza, i2);
                        j4 += (long) i2;
                        this.zzc.zzv(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.zzc.zzj();
                            iArr4[i3] = this.zzc.zzi();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzayq.zza - ((int) (j4 - zzayq.zzb));
                    }
                    zzavo zzavo = zzayq.zzd;
                    zzauw zzauw3 = zzauy2.zza;
                    byte[] bArr = zzavo.zzb;
                    byte[] bArr2 = zzauw3.zza;
                    int i4 = zzavo.zza;
                    zzauw3.zzb(i, iArr2, iArr4, bArr, bArr2, 1);
                    long j5 = zzayq.zzb;
                    int i5 = (int) (j4 - j5);
                    zzayq.zzb = j5 + ((long) i5);
                    zzayq.zza -= i5;
                }
                zzauy2.zzh(this.zzb.zza);
                zzayq zzayq2 = this.zzb;
                long j6 = zzayq2.zzb;
                ByteBuffer byteBuffer = zzauy2.zzb;
                int i6 = zzayq2.zza;
                zzq(j6);
                while (i6 > 0) {
                    int i7 = (int) (j6 - this.zze.zza);
                    int min = Math.min(i6, 65536 - i7);
                    zzazq zzazq = this.zze.zzd;
                    byteBuffer.put(zzazq.zza, i7, min);
                    j6 += (long) min;
                    i6 -= min;
                    if (j6 == this.zze.zzb) {
                        this.zzl.zzc(zzazq);
                        zzays zzays = this.zze;
                        zzays.zzd = null;
                        this.zze = zzays.zze;
                    }
                }
                zzq(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzatd zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzayt zzayt) {
        this.zzk = zzayt;
    }

    public final void zzl() {
        long zzd2 = this.zza.zzd();
        if (zzd2 != -1) {
            zzq(zzd2);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j, boolean z) {
        long zze2 = this.zza.zze(j, z);
        if (zze2 == -1) {
            return false;
        }
        zzq(zze2);
        return true;
    }
}
