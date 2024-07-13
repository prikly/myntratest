package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zztr {
    private final zzef zza = new zzef(32);
    private zztq zzb;
    private zztq zzc;
    private zztq zzd;
    private long zze;
    private final zzwi zzf;

    public zztr(zzwi zzwi, byte[] bArr) {
        this.zzf = zzwi;
        zztq zztq = new zztq(0, 65536);
        this.zzb = zztq;
        this.zzc = zztq;
        this.zzd = zztq;
    }

    private final int zzi(int i) {
        zztq zztq = this.zzd;
        if (zztq.zzc == null) {
            zzwb zzb2 = this.zzf.zzb();
            zztq zztq2 = new zztq(this.zzd.zzb, 65536);
            zztq.zzc = zzb2;
            zztq.zzd = zztq2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zztq zzj(zztq zztq, long j) {
        while (j >= zztq.zzb) {
            zztq = zztq.zzd;
        }
        return zztq;
    }

    private static zztq zzk(zztq zztq, long j, ByteBuffer byteBuffer, int i) {
        zztq zzj = zzj(zztq, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztq zzl(zztq zztq, long j, byte[] bArr, int i) {
        zztq zzj = zzj(zztq, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztq zzm(zztq zztq, zzgi zzgi, zztt zztt, zzef zzef) {
        zztq zztq2;
        int i;
        zzgi zzgi2 = zzgi;
        zztt zztt2 = zztt;
        zzef zzef2 = zzef;
        if (zzgi.zzk()) {
            long j = zztt2.zzb;
            zzef2.zzC(1);
            zztq zzl = zzl(zztq, j, zzef.zzH(), 1);
            long j2 = j + 1;
            byte b2 = zzef.zzH()[0];
            boolean z = (b2 & 128) != 0;
            byte b3 = b2 & Ascii.DEL;
            zzgf zzgf = zzgi2.zza;
            byte[] bArr = zzgf.zza;
            if (bArr == null) {
                zzgf.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztq2 = zzl(zzl, j2, zzgf.zza, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                zzef2.zzC(2);
                zztq2 = zzl(zztq2, j3, zzef.zzH(), 2);
                j3 += 2;
                i = zzef.zzo();
            } else {
                i = 1;
            }
            int[] iArr = zzgf.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgf.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = i * 6;
                zzef2.zzC(i2);
                zztq2 = zzl(zztq2, j3, zzef.zzH(), i2);
                j3 += (long) i2;
                zzef2.zzF(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = zzef.zzo();
                    iArr4[i3] = zzef.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztt2.zza - ((int) (j3 - zztt2.zzb));
            }
            zzaap zzaap = zztt2.zzc;
            int i4 = zzen.zza;
            zzgf.zzc(i, iArr2, iArr4, zzaap.zzb, zzgf.zza, zzaap.zza, zzaap.zzc, zzaap.zzd);
            long j4 = zztt2.zzb;
            int i5 = (int) (j3 - j4);
            zztt2.zzb = j4 + ((long) i5);
            zztt2.zza -= i5;
        } else {
            zztq2 = zztq;
        }
        if (zzgi.zze()) {
            zzef2.zzC(4);
            zztq zzl2 = zzl(zztq2, zztt2.zzb, zzef.zzH(), 4);
            int zzn = zzef.zzn();
            zztt2.zzb += 4;
            zztt2.zza -= 4;
            zzgi2.zzi(zzn);
            zztq zzk = zzk(zzl2, zztt2.zzb, zzgi2.zzb, zzn);
            zztt2.zzb += (long) zzn;
            int i6 = zztt2.zza - zzn;
            zztt2.zza = i6;
            ByteBuffer byteBuffer = zzgi2.zze;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                zzgi2.zze = ByteBuffer.allocate(i6);
            } else {
                zzgi2.zze.clear();
            }
            return zzk(zzk, zztt2.zzb, zzgi2.zze, zztt2.zza);
        }
        zzgi2.zzi(zztt2.zza);
        return zzk(zztq2, zztt2.zzb, zzgi2.zzb, zztt2.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zztq zztq = this.zzd;
        if (j == zztq.zzb) {
            this.zzd = zztq.zzd;
        }
    }

    public final int zza(zzr zzr, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zztq zztq = this.zzd;
        int zza2 = zzr.zza(zztq.zzc.zza, zztq.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zztq zztq;
        if (j != -1) {
            while (true) {
                zztq = this.zzb;
                if (j < zztq.zzb) {
                    break;
                }
                this.zzf.zzc(zztq.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztq.zza) {
                this.zzc = zztq;
            }
        }
    }

    public final void zzd(zzgi zzgi, zztt zztt) {
        zzm(this.zzc, zzgi, zztt, this.zza);
    }

    public final void zze(zzgi zzgi, zztt zztt) {
        this.zzc = zzm(this.zzc, zzgi, zztt, this.zza);
    }

    public final void zzf() {
        zztq zztq = this.zzb;
        if (zztq.zzc != null) {
            this.zzf.zzd(zztq);
            zztq.zzb();
        }
        this.zzb.zze(0, 65536);
        zztq zztq2 = this.zzb;
        this.zzc = zztq2;
        this.zzd = zztq2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzef zzef, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zztq zztq = this.zzd;
            zzef.zzB(zztq.zzc.zza, zztq.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
