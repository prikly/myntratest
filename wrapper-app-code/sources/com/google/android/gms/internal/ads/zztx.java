package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zztx implements zzaaq {
    private boolean zzA;
    private boolean zzB;
    private zzpp zzC;
    private final zztr zza;
    private final zztt zzb = new zztt();
    private final zzue zzc = new zzue(zzts.zza);
    private final zzpo zzd;
    private final zzpi zze;
    private zztw zzf;
    private zzaf zzg;
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private int[] zzk = new int[1000];
    private int[] zzl = new int[1000];
    private long[] zzm = new long[1000];
    private zzaap[] zzn = new zzaap[1000];
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzv;
    private boolean zzw = true;
    private boolean zzx = true;
    private zzaf zzy;
    private zzaf zzz;

    protected zztx(zzwi zzwi, zzpo zzpo, zzpi zzpi, byte[] bArr) {
        this.zzd = zzpo;
        this.zze = zzpi;
        this.zza = new zztr(zzwi, (byte[]) null);
    }

    private final int zzA(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int zzB(com.google.android.gms.internal.ads.zzje r6, com.google.android.gms.internal.ads.zzgi r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.zztt r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.zzc = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.zzJ()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.zzv     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.zzaf r7 = r5.zzz     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzaf r8 = r5.zzg     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.zzG(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.zzc(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.zzue r9 = r5.zzc     // Catch:{ all -> 0x0083 }
            int r0 = r5.zzp     // Catch:{ all -> 0x0083 }
            int r4 = r5.zzr     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.zza(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zztv r9 = (com.google.android.gms.internal.ads.zztv) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzaf r9 = r9.zza     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.zzaf r8 = r5.zzg     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.zzr     // Catch:{ all -> 0x0083 }
            int r6 = r5.zzA(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.zzK(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.zzc = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.zzl     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.zzc(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.zzm     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.zzd = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.zzs     // Catch:{ all -> 0x0083 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.zza(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.zzk     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.zza = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.zzj     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.zzb = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzaap[] r7 = r5.zzn     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.zzc = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.zzG(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztx.zzB(com.google.android.gms.internal.ads.zzje, com.google.android.gms.internal.ads.zzgi, boolean, boolean, com.google.android.gms.internal.ads.zztt):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long zzC(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.zzo     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.zzm     // Catch:{ all -> 0x002f }
            int r4 = r9.zzq     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.zzr     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.zzz(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.zzE(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztx.zzC(long, boolean, boolean):long");
    }

    private final synchronized long zzD() {
        int i = this.zzo;
        if (i == 0) {
            return -1;
        }
        return zzE(i);
    }

    private final synchronized void zzF(long j, int i, long j2, int i2, zzaap zzaap) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int zzA2 = zzA(i3 - 1);
            zzdd.zzd(this.zzj[zzA2] + ((long) this.zzk[zzA2]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int zzA3 = zzA(this.zzo);
        this.zzm[zzA3] = j;
        this.zzj[zzA3] = j2;
        this.zzk[zzA3] = i2;
        this.zzl[zzA3] = i;
        this.zzn[zzA3] = zzaap;
        this.zzi[zzA3] = 0;
        if (this.zzc.zzf() || !((zztv) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzpn zzpn = zzpn.zzb;
            zzue zzue = this.zzc;
            int i4 = this.zzp + this.zzo;
            zzaf zzaf = this.zzz;
            if (zzaf != null) {
                zzue.zzc(i4, new zztv(zzaf, zzpn, (zztu) null));
            } else {
                throw null;
            }
        }
        int i5 = this.zzo + 1;
        this.zzo = i5;
        int i6 = this.zzh;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zzaap[] zzaapArr = new zzaap[i7];
            int i8 = this.zzq;
            int i9 = i6 - i8;
            System.arraycopy(this.zzj, i8, jArr, 0, i9);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i9);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i9);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i9);
            System.arraycopy(this.zzn, this.zzq, zzaapArr, 0, i9);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i9);
            int i10 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i9, i10);
            System.arraycopy(this.zzm, 0, jArr2, i9, i10);
            System.arraycopy(this.zzl, 0, iArr2, i9, i10);
            System.arraycopy(this.zzk, 0, iArr3, i9, i10);
            System.arraycopy(this.zzn, 0, zzaapArr, i9, i10);
            System.arraycopy(this.zzi, 0, iArr, i9, i10);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzaapArr;
            this.zzi = iArr;
            this.zzq = 0;
            this.zzh = i7;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzaf zzaf) {
        this.zzx = false;
        if (zzen.zzT(zzaf, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zztv) this.zzc.zzb()).zza.equals(zzaf)) {
            this.zzz = zzaf;
        } else {
            this.zzz = ((zztv) this.zzc.zzb()).zza;
        }
        zzaf zzaf2 = this.zzz;
        this.zzA = zzbt.zzf(zzaf2.zzm, zzaf2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzl(zztv zztv) {
        zzpn zzpn = zztv.zzb;
        int i = zzpm.zza;
    }

    private final int zzz(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.zzm[i] > j ? 1 : (this.zzm[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int zzb(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzr     // Catch:{ all -> 0x0038 }
            int r2 = r8.zzA(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.zzJ()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.zzm     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.zzu     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.zzo     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.zzo     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.zzz(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztx.zzb(long, boolean):int");
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzd(com.google.android.gms.internal.ads.zzje r9, com.google.android.gms.internal.ads.zzgi r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zztt r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zztr r9 = r8.zza
            com.google.android.gms.internal.ads.zztt r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.zztr r9 = r8.zza
            com.google.android.gms.internal.ads.zztt r11 = r8.zzb
            r9.zze(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztx.zzd(com.google.android.gms.internal.ads.zzje, com.google.android.gms.internal.ads.zzgi, int, boolean):int");
    }

    public final /* synthetic */ int zze(zzr zzr2, int i, boolean z) {
        return zzaao.zza(this, zzr2, i, z);
    }

    public final int zzf(zzr zzr2, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzr2, i, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzaf zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j, boolean z, boolean z2) {
        this.zza.zzc(zzC(j, false, z2));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    public final void zzk(zzaf zzaf) {
        this.zzy = zzaf;
        boolean zzL = zzL(zzaf);
        zztw zztw = this.zzf;
        if (zztw != null && zzL) {
            zztw.zzL(zzaf);
        }
    }

    public final void zzm() throws IOException {
        zzpp zzpp = this.zzC;
        if (zzpp != null) {
            throw zzpp.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    public final /* synthetic */ void zzq(zzef zzef, int i) {
        zzaao.zzb(this, zzef, i);
    }

    public final void zzr(zzef zzef, int i, int i2) {
        this.zza.zzh(zzef, i);
    }

    public final void zzs(long j, int i, int i2, int i3, zzaap zzaap) {
        int i4 = i & 1;
        if (this.zzw) {
            if (i4 != 0) {
                this.zzw = false;
            } else {
                return;
            }
        }
        if (this.zzA) {
            if (j >= this.zzs) {
                if (i4 == 0) {
                    if (!this.zzB) {
                        zzdw.zze("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                        this.zzB = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        zzF(j, i, (this.zza.zzb() - ((long) i2)) - ((long) i3), i2, zzaap);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zztw zztw) {
        this.zzf = zztw;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdd.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzx(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzJ()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.zzv     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzaf r4 = r3.zzz     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzaf r2 = r3.zzg     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.zzue r4 = r3.zzc     // Catch:{ all -> 0x003e }
            int r0 = r3.zzp     // Catch:{ all -> 0x003e }
            int r2 = r3.zzr     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.zza(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zztv r4 = (com.google.android.gms.internal.ads.zztv) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzaf r4 = r4.zza     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzaf r0 = r3.zzg     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.zzr     // Catch:{ all -> 0x003e }
            int r4 = r3.zzA(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.zzK(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztx.zzx(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzy(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.zzI()     // Catch:{ all -> 0x003d }
            int r0 = r8.zzr     // Catch:{ all -> 0x003d }
            int r2 = r8.zzA(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r8.zzJ()     // Catch:{ all -> 0x003d }
            r7 = 0
            if (r1 == 0) goto L_0x003b
            long[] r1 = r8.zzm     // Catch:{ all -> 0x003d }
            r3 = r1[r2]     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x003b
            long r3 = r8.zzu     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003b
        L_0x0021:
            int r11 = r8.zzo     // Catch:{ all -> 0x003d }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.zzz(r2, r3, r4, r6)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r11 != r0) goto L_0x0031
            monitor-exit(r8)
            return r7
        L_0x0031:
            r8.zzs = r9     // Catch:{ all -> 0x003d }
            int r9 = r8.zzr     // Catch:{ all -> 0x003d }
            int r9 = r9 + r11
            r8.zzr = r9     // Catch:{ all -> 0x003d }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003b:
            monitor-exit(r8)
            return r7
        L_0x003d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztx.zzy(long, boolean):boolean");
    }

    private final void zzG(zzaf zzaf, zzje zzje) {
        zzx zzx2;
        zzaf zzaf2 = this.zzg;
        boolean z = zzaf2 == null;
        zzpp zzpp = null;
        if (z) {
            zzx2 = null;
        } else {
            zzx2 = zzaf2.zzp;
        }
        this.zzg = zzaf;
        zzx zzx3 = zzaf.zzp;
        zzje.zza = zzaf.zzc(this.zzd.zza(zzaf));
        zzje.zzb = this.zzC;
        if (z || !zzen.zzT(zzx2, zzx3)) {
            if (zzaf.zzp != null) {
                zzpp = new zzpp(new zzpg(new zzpr(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
            this.zzC = zzpp;
            zzje.zzb = zzpp;
        }
    }

    private final long zzE(int i) {
        long j = this.zzt;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzA2 = zzA(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzm[zzA2]);
                if ((this.zzl[zzA2] & 1) != 0) {
                    break;
                }
                zzA2--;
                if (zzA2 == -1) {
                    zzA2 = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, j2);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        int i8 = i7 - 1;
        return this.zzj[i8] + ((long) this.zzk[i8]);
    }
}
