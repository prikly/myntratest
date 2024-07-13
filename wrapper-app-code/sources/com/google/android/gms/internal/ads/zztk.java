package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zztk implements zzsf, zztw, zzwo, zzwt, zzzm {
    /* access modifiers changed from: private */
    public static final Map zzb;
    /* access modifiers changed from: private */
    public static final zzaf zzc;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwm zzM;
    private final zzwi zzN;
    private final Uri zzd;
    private final zzex zze;
    private final zzpo zzf;
    private final zzsq zzg;
    private final zzpi zzh;
    private final zztg zzi;
    /* access modifiers changed from: private */
    public final long zzj;
    private final zzww zzk = new zzww("ProgressiveMediaPeriod");
    private final zzta zzl;
    private final zzdg zzm;
    private final Runnable zzn;
    /* access modifiers changed from: private */
    public final Runnable zzo;
    /* access modifiers changed from: private */
    public final Handler zzp;
    private zzse zzq;
    /* access modifiers changed from: private */
    public zzacn zzr;
    private zztx[] zzs;
    private zzti[] zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztj zzx;
    private zzaam zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzad = new zzad();
        zzad.zzH("icy");
        zzad.zzS("application/x-icy");
        zzc = zzad.zzY();
    }

    public zztk(Uri uri, zzex zzex, zzta zzta, zzpo zzpo, zzpi zzpi, zzwm zzwm, zzsq zzsq, zztg zztg, zzwi zzwi, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzex;
        this.zzf = zzpo;
        this.zzh = zzpi;
        this.zzM = zzwm;
        this.zzg = zzsq;
        this.zzi = zztg;
        this.zzN = zzwi;
        this.zzj = (long) i;
        this.zzl = zzta;
        this.zzm = new zzdg(zzde.zza);
        this.zzn = new zztb(this);
        this.zzo = new zztc(this);
        this.zzp = zzen.zzD((Handler.Callback) null);
        this.zzt = new zzti[0];
        this.zzs = new zztx[0];
        this.zzH = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = 1;
    }

    private final int zzP() {
        int i = 0;
        for (zztx zzc2 : this.zzs) {
            i += zzc2.zzc();
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final long zzQ(boolean z) {
        long j = Long.MIN_VALUE;
        int i = 0;
        while (true) {
            zztx[] zztxArr = this.zzs;
            if (i >= zztxArr.length) {
                return j;
            }
            if (!z) {
                zztj zztj = this.zzx;
                if (zztj == null) {
                    throw null;
                } else if (!zztj.zzc[i]) {
                    i++;
                }
            }
            j = Math.max(j, zztxArr[i].zzg());
            i++;
        }
    }

    private final zzaaq zzR(zzti zzti) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzti.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzwi zzwi = this.zzN;
        zzpo zzpo = this.zzf;
        zzpi zzpi = this.zzh;
        if (zzpo != null) {
            zztx zztx = new zztx(zzwi, zzpo, zzpi, (byte[]) null);
            zztx.zzu(this);
            int i2 = length + 1;
            zzti[] zztiArr = (zzti[]) Arrays.copyOf(this.zzt, i2);
            zztiArr[length] = zzti;
            this.zzt = (zzti[]) zzen.zzac(zztiArr);
            zztx[] zztxArr = (zztx[]) Arrays.copyOf(this.zzs, i2);
            zztxArr[length] = zztx;
            this.zzs = (zztx[]) zzen.zzac(zztxArr);
            return zztx;
        }
        throw null;
    }

    private final void zzS() {
        zzdd.zzf(this.zzv);
        if (this.zzx == null) {
            throw null;
        } else if (this.zzy == null) {
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzT() {
        int i;
        zzbq zzbq;
        if (!this.zzL && !this.zzv && this.zzu && this.zzy != null) {
            zztx[] zztxArr = this.zzs;
            int length = zztxArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (zztxArr[i2].zzh() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.zzm.zzc();
            int length2 = this.zzs.length;
            zzcp[] zzcpArr = new zzcp[length2];
            boolean[] zArr = new boolean[length2];
            int i3 = 0;
            while (i3 < length2) {
                zzaf zzh2 = this.zzs[i3].zzh();
                if (zzh2 != null) {
                    String str = zzh2.zzm;
                    boolean zzg2 = zzbt.zzg(str);
                    boolean z = zzg2 || zzbt.zzh(str);
                    zArr[i3] = z;
                    this.zzw = z | this.zzw;
                    zzacn zzacn = this.zzr;
                    if (zzacn != null) {
                        if (zzg2 || this.zzt[i3].zzb) {
                            zzbq zzbq2 = zzh2.zzk;
                            if (zzbq2 == null) {
                                zzbq = new zzbq(-9223372036854775807L, zzacn);
                            } else {
                                zzbq = zzbq2.zzc(zzacn);
                            }
                            zzad zzb2 = zzh2.zzb();
                            zzb2.zzM(zzbq);
                            zzh2 = zzb2.zzY();
                        }
                        if (zzg2 && zzh2.zzg == -1 && zzh2.zzh == -1 && (i = zzacn.zza) != -1) {
                            zzad zzb3 = zzh2.zzb();
                            zzb3.zzv(i);
                            zzh2 = zzb3.zzY();
                        }
                    }
                    zzcpArr[i3] = new zzcp(Integer.toString(i3), zzh2.zzc(this.zzf.zza(zzh2)));
                    i3++;
                } else {
                    throw null;
                }
            }
            this.zzx = new zztj(new zzug(zzcpArr), zArr);
            this.zzv = true;
            zzse zzse = this.zzq;
            if (zzse != null) {
                zzse.zzi(this);
                return;
            }
            throw null;
        }
    }

    private final void zzU(int i) {
        zzS();
        zztj zztj = this.zzx;
        boolean[] zArr = zztj.zzd;
        if (!zArr[i]) {
            zzaf zzb2 = zztj.zza.zzb(i).zzb(0);
            this.zzg.zzd(zzbt.zzb(zzb2.zzm), zzb2, 0, (Object) null, this.zzG);
            zArr[i] = true;
        }
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0;
            this.zzJ = 0;
            for (zztx zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
            zzse zzse = this.zzq;
            if (zzse != null) {
                zzse.zzg(this);
                return;
            }
            throw null;
        }
    }

    private final void zzW() {
        zztf zztf = new zztf(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdd.zzf(zzX());
            long j = this.zzz;
            if (j == -9223372036854775807L || this.zzH <= j) {
                zzaam zzaam = this.zzy;
                if (zzaam != null) {
                    zztf.zzf(zztf, zzaam.zzg(this.zzH).zza.zzc, this.zzH);
                    for (zztx zzt2 : this.zzs) {
                        zzt2.zzt(this.zzH);
                    }
                    this.zzH = -9223372036854775807L;
                } else {
                    throw null;
                }
            } else {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zztf, this, zzwm.zza(this.zzB));
        zzfc zzd2 = zztf.zzl;
        this.zzg.zzl(new zzry(zztf.zzb, zzd2, zzd2.zza, Collections.emptyMap(), zza, 0, 0), 1, -1, (zzaf) null, 0, (Object) null, zztf.zzk, this.zzz);
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    /* access modifiers changed from: package-private */
    public final void zzG() throws IOException {
        this.zzk.zzi(zzwm.zza(this.zzB));
    }

    /* access modifiers changed from: package-private */
    public final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    public final /* bridge */ /* synthetic */ void zzI(zzws zzws, long j, long j2, boolean z) {
        zztf zztf = (zztf) zzws;
        zzfy zze2 = zztf.zzd;
        zzry zzry = new zzry(zztf.zzb, zztf.zzl, zze2.zzh(), zze2.zzi(), j, j2, zze2.zzg());
        long unused = zztf.zzb;
        this.zzg.zzf(zzry, 1, -1, (zzaf) null, 0, (Object) null, zztf.zzk, this.zzz);
        if (!z) {
            for (zztx zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
            if (this.zzE > 0) {
                zzse zzse = this.zzq;
                if (zzse != null) {
                    zzse.zzg(this);
                    return;
                }
                throw null;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzJ(zzws zzws, long j, long j2) {
        zzaam zzaam;
        if (this.zzz == -9223372036854775807L && (zzaam = this.zzy) != null) {
            boolean zzh2 = zzaam.zzh();
            long zzQ = zzQ(true);
            long j3 = zzQ == Long.MIN_VALUE ? 0 : zzQ + 10000;
            this.zzz = j3;
            this.zzi.zza(j3, zzh2, this.zzA);
        }
        zztf zztf = (zztf) zzws;
        zzfy zze2 = zztf.zzd;
        zzry zzry = new zzry(zztf.zzb, zztf.zzl, zze2.zzh(), zze2.zzi(), j, j2, zze2.zzg());
        long unused = zztf.zzb;
        this.zzg.zzh(zzry, 1, -1, (zzaf) null, 0, (Object) null, zztf.zzk, this.zzz);
        this.zzK = true;
        zzse zzse = this.zzq;
        if (zzse != null) {
            zzse.zzg(this);
            return;
        }
        throw null;
    }

    public final void zzK() {
        for (zztx zzo2 : this.zzs) {
            zzo2.zzo();
        }
        this.zzl.zze();
    }

    public final void zzL(zzaf zzaf) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zztx zzn2 : this.zzs) {
                zzn2.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages((Object) null);
        this.zzq = null;
        this.zzL = true;
    }

    public final void zzN(zzaam zzaam) {
        this.zzp.post(new zzte(this, zzaam));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    public final long zza(long j, zzkb zzkb) {
        long j2;
        long j3 = j;
        zzkb zzkb2 = zzkb;
        zzS();
        if (!this.zzy.zzh()) {
            return 0;
        }
        zzaak zzg2 = this.zzy.zzg(j3);
        long j4 = zzg2.zza.zzb;
        long j5 = zzg2.zzb.zzb;
        long j6 = zzkb2.zzf;
        if (j6 != 0) {
            j2 = j6;
        } else if (zzkb2.zzg == 0) {
            return j3;
        } else {
            j2 = 0;
        }
        long j7 = j;
        long zzx2 = zzen.zzx(j7, j2, Long.MIN_VALUE);
        long zzq2 = zzen.zzq(j7, zzkb2.zzg, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = zzx2 <= j4 && j4 <= zzq2;
        if (zzx2 > j5 || j5 > zzq2) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j5 : zzx2;
            }
        } else if (Math.abs(j4 - j3) > Math.abs(j5 - j3)) {
            return j5;
        }
        return j4;
    }

    public final long zzb() {
        long j;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zztj zztj = this.zzx;
                if (zztj.zzb[i] && zztj.zzc[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzQ(false);
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    public final long zzc() {
        return zzb();
    }

    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzP() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    public final long zze(long j) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            int i = 0;
            while (i < length) {
                if (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) {
                    i++;
                }
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzww zzww = this.zzk;
        if (zzww.zzl()) {
            for (zztx zzj2 : this.zzs) {
                zzj2.zzj();
            }
            this.zzk.zzg();
        } else {
            zzww.zzh();
            for (zztx zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r2 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzvt[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzty[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.zzS()
            com.google.android.gms.internal.ads.zztj r0 = r7.zzx
            com.google.android.gms.internal.ads.zzug r1 = r0.zza
            boolean[] r0 = r0.zzc
            int r2 = r7.zzE
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.android.gms.internal.ads.zzth r5 = (com.google.android.gms.internal.ads.zzth) r5
            int r5 = r5.zzb
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.zzdd.zzf(r6)
            int r6 = r7.zzE
            int r6 = r6 + -1
            r7.zzE = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.zzC
            r4 = 0
            r6 = 1
            if (r9 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x0046
            goto L_0x0043
        L_0x003f:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0045
        L_0x0043:
            r9 = 1
            goto L_0x0047
        L_0x0045:
            r12 = r4
        L_0x0046:
            r9 = 0
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x00a1
            r4 = r10[r2]
            if (r4 != 0) goto L_0x009e
            r4 = r8[r2]
            if (r4 == 0) goto L_0x009e
            int r5 = r4.zzc()
            if (r5 != r6) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            com.google.android.gms.internal.ads.zzdd.zzf(r5)
            int r5 = r4.zza(r3)
            if (r5 != 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            com.google.android.gms.internal.ads.zzdd.zzf(r5)
            com.google.android.gms.internal.ads.zzcp r4 = r4.zze()
            int r4 = r1.zza(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.gms.internal.ads.zzdd.zzf(r5)
            int r5 = r7.zzE
            int r5 = r5 + r6
            r7.zzE = r5
            r0[r4] = r6
            com.google.android.gms.internal.ads.zzth r5 = new com.google.android.gms.internal.ads.zzth
            r5.<init>(r7, r4)
            r10[r2] = r5
            r11[r2] = r6
            if (r9 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.zztx[] r9 = r7.zzs
            r9 = r9[r4]
            boolean r4 = r9.zzy(r12, r6)
            if (r4 != 0) goto L_0x009d
            int r9 = r9.zza()
            if (r9 == 0) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x00a1:
            int r8 = r7.zzE
            if (r8 != 0) goto L_0x00d2
            r7.zzI = r3
            r7.zzD = r3
            com.google.android.gms.internal.ads.zzww r8 = r7.zzk
            boolean r8 = r8.zzl()
            if (r8 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zztx[] r8 = r7.zzs
            int r9 = r8.length
        L_0x00b4:
            if (r3 >= r9) goto L_0x00be
            r10 = r8[r3]
            r10.zzj()
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x00be:
            com.google.android.gms.internal.ads.zzww r8 = r7.zzk
            r8.zzg()
            goto L_0x00e4
        L_0x00c4:
            com.google.android.gms.internal.ads.zztx[] r8 = r7.zzs
            int r9 = r8.length
            r10 = 0
        L_0x00c8:
            if (r10 >= r9) goto L_0x00e4
            r11 = r8[r10]
            r11.zzp(r3)
            int r10 = r10 + 1
            goto L_0x00c8
        L_0x00d2:
            if (r9 == 0) goto L_0x00e4
            long r12 = r7.zze(r12)
        L_0x00d8:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e4
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e1
            r11[r3] = r6
        L_0x00e1:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00e4:
            r7.zzC = r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztk.zzf(com.google.android.gms.internal.ads.zzvt[], boolean[], com.google.android.gms.internal.ads.zzty[], boolean[], long):long");
    }

    /* access modifiers changed from: package-private */
    public final int zzg(int i, zzje zzje, zzgi zzgi, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int zzd2 = this.zzs[i].zzd(zzje, zzgi, i2, this.zzK);
        if (zzd2 == -3) {
            zzV(i);
        }
        return zzd2;
    }

    public final zzug zzh() {
        zzS();
        return this.zzx.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zztx zztx = this.zzs[i];
        int zzb2 = zztx.zzb(j, this.zzK);
        zztx.zzv(zzb2);
        if (zzb2 != 0) {
            return zzb2;
        }
        zzV(i);
        return 0;
    }

    public final void zzj(long j, boolean z) {
        zzS();
        if (!zzX()) {
            boolean[] zArr = this.zzx.zzc;
            int length = this.zzs.length;
            for (int i = 0; i < length; i++) {
                this.zzs[i].zzi(j, false, zArr[i]);
            }
        }
    }

    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzbu.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final void zzl(zzse zzse, long j) {
        this.zzq = zzse;
        this.zzm.zze();
        zzW();
    }

    public final void zzm(long j) {
    }

    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze2 = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze2;
        }
        zzW();
        return true;
    }

    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzwq zzt(com.google.android.gms.internal.ads.zzws r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.zztf r1 = (com.google.android.gms.internal.ads.zztf) r1
            com.google.android.gms.internal.ads.zzfy r2 = r1.zzd
            com.google.android.gms.internal.ads.zzry r15 = new com.google.android.gms.internal.ads.zzry
            long r4 = r1.zzb
            com.google.android.gms.internal.ads.zzfc r6 = r1.zzl
            android.net.Uri r7 = r2.zzh()
            java.util.Map r8 = r2.zzi()
            long r13 = r2.zzg()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.zzsd r2 = new com.google.android.gms.internal.ads.zzsd
            long r3 = r1.zzk
            long r22 = com.google.android.gms.internal.ads.zzen.zzz(r3)
            long r3 = r0.zzz
            long r24 = com.google.android.gms.internal.ads.zzen.zzz(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.zzwn r3 = new com.google.android.gms.internal.ads.zzwn
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.zzc
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzbu
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzfp
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwv
            if (r4 != 0) goto L_0x008a
        L_0x0067:
            if (r2 == 0) goto L_0x007c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzey
            if (r4 == 0) goto L_0x0077
            r4 = r2
            com.google.android.gms.internal.ads.zzey r4 = (com.google.android.gms.internal.ads.zzey) r4
            int r4 = r4.zza
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x0077
            goto L_0x008a
        L_0x0077:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x0067
        L_0x007c:
            int r2 = r3.zzd
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008b
        L_0x008a:
            r2 = r5
        L_0x008b:
            r4 = 1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzwq r2 = com.google.android.gms.internal.ads.zzww.zzd
            goto L_0x00df
        L_0x0093:
            int r7 = r26.zzP()
            int r8 = r0.zzJ
            r9 = 0
            if (r7 <= r8) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            boolean r10 = r0.zzF
            if (r10 != 0) goto L_0x00d9
            com.google.android.gms.internal.ads.zzaam r10 = r0.zzy
            if (r10 == 0) goto L_0x00b0
            long r10 = r10.zze()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00b0
            goto L_0x00d9
        L_0x00b0:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x00bf
            boolean r6 = r26.zzY()
            if (r6 != 0) goto L_0x00bf
            r0.zzI = r4
            com.google.android.gms.internal.ads.zzwq r2 = com.google.android.gms.internal.ads.zzww.zzc
            goto L_0x00df
        L_0x00bf:
            r0.zzD = r5
            r5 = 0
            r0.zzG = r5
            r0.zzJ = r9
            com.google.android.gms.internal.ads.zztx[] r7 = r0.zzs
            int r10 = r7.length
            r11 = 0
        L_0x00cb:
            if (r11 >= r10) goto L_0x00d5
            r12 = r7[r11]
            r12.zzp(r9)
            int r11 = r11 + 1
            goto L_0x00cb
        L_0x00d5:
            com.google.android.gms.internal.ads.zztf.zzf(r1, r5, r5)
            goto L_0x00db
        L_0x00d9:
            r0.zzJ = r7
        L_0x00db:
            com.google.android.gms.internal.ads.zzwq r2 = com.google.android.gms.internal.ads.zzww.zzb(r8, r2)
        L_0x00df:
            boolean r3 = r2.zzc()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.zzsq r3 = r0.zzg
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.zzk
            long r12 = r0.zzz
            r4 = r15
            r14 = r32
            r15 = r16
            r3.zzj(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x00ff
            long unused = r1.zzb
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztk.zzt(com.google.android.gms.internal.ads.zzws, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzwq");
    }

    /* access modifiers changed from: package-private */
    public final zzaaq zzu() {
        return zzR(new zzti(0, true));
    }

    public final zzaaq zzv(int i, int i2) {
        return zzR(new zzti(i, false));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzD() {
        if (!this.zzL) {
            zzse zzse = this.zzq;
            if (zzse != null) {
                zzse.zzg(this);
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(zzaam zzaam) {
        zzaam zzaam2;
        if (this.zzr == null) {
            zzaam2 = zzaam;
        } else {
            zzaam2 = new zzaal(-9223372036854775807L, 0);
        }
        this.zzy = zzaam2;
        this.zzz = zzaam.zze();
        boolean z = false;
        int i = 1;
        if (!this.zzF && zzaam.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        if (true == z) {
            i = 7;
        }
        this.zzB = i;
        this.zzi.zza(this.zzz, zzaam.zzh(), this.zzA);
        if (!this.zzv) {
            zzT();
        }
    }
}
