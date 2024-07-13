package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzos implements zznw {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private zzne[] zzH;
    private ByteBuffer[] zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    /* access modifiers changed from: private */
    public boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzl zzU;
    /* access modifiers changed from: private */
    public long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzoi zzY;
    private final zznb zzd;
    private final zzoc zze = new zzoc();
    private final zzpd zzf = new zzpd();
    private final zzne[] zzg;
    private final zzne[] zzh;
    private final zzdg zzi;
    private final zzoa zzj = new zzoa(new zzon(this, (zzom) null));
    private final ArrayDeque zzk;
    private zzoq zzl;
    private final zzol zzm;
    private final zzol zzn;
    private final zzof zzo;
    private zzmz zzp;
    /* access modifiers changed from: private */
    public zznt zzq;
    private zzoh zzr;
    private zzoh zzs;
    /* access modifiers changed from: private */
    public AudioTrack zzt;
    private zzk zzu;
    private zzok zzv;
    private zzok zzw;
    private final zzby zzx;
    private long zzy;
    private long zzz;

    /* synthetic */ zzos(zzog zzog, zzor zzor) {
        this.zzd = zzog.zzb;
        this.zzY = zzog.zzc;
        int i = zzen.zza;
        this.zzo = zzog.zza;
        zzdg zzdg = new zzdg(zzde.zza);
        this.zzi = zzdg;
        zzdg.zze();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzob[]{new zzoz(), this.zze, this.zzf});
        Collections.addAll(arrayList, this.zzY.zze());
        this.zzg = (zzne[]) arrayList.toArray(new zzne[0]);
        this.zzh = new zzne[]{new zzov()};
        this.zzG = 1.0f;
        this.zzu = zzk.zza;
        this.zzT = 0;
        this.zzU = new zzl(0, 0.0f);
        this.zzw = new zzok(zzby.zza, false, 0, 0, (zzoj) null);
        this.zzx = zzby.zza;
        this.zzO = -1;
        this.zzH = new zzne[0];
        this.zzI = new ByteBuffer[0];
        this.zzk = new ArrayDeque();
        this.zzm = new zzol(100);
        this.zzn = new zzol(100);
    }

    static /* synthetic */ void zzC(AudioTrack audioTrack, zzdg zzdg) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzdg.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzdg.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public final long zzE() {
        zzoh zzoh = this.zzs;
        return zzoh.zzc == 0 ? this.zzy / ((long) zzoh.zzb) : this.zzz;
    }

    /* access modifiers changed from: private */
    public final long zzF() {
        zzoh zzoh = this.zzs;
        return zzoh.zzc == 0 ? this.zzA / ((long) zzoh.zzd) : this.zzB;
    }

    private final AudioTrack zzG(zzoh zzoh) throws zzns {
        try {
            return zzoh.zzb(false, this.zzu, this.zzT);
        } catch (zzns e2) {
            zznt zznt = this.zzq;
            if (zznt != null) {
                zznt.zza(e2);
            }
            throw e2;
        }
    }

    private final zzok zzH() {
        zzok zzok = this.zzv;
        if (zzok != null) {
            return zzok;
        }
        return !this.zzk.isEmpty() ? (zzok) this.zzk.getLast() : this.zzw;
    }

    private final void zzI(long j) {
        zzby zzby;
        boolean z;
        if (zzS()) {
            zzoi zzoi = this.zzY;
            zzby = zzH().zza;
            zzoi.zzc(zzby);
        } else {
            zzby = zzby.zza;
        }
        zzby zzby2 = zzby;
        if (zzS()) {
            zzoi zzoi2 = this.zzY;
            boolean z2 = zzH().zzb;
            zzoi2.zzd(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzk.add(new zzok(zzby2, z, Math.max(0, j), this.zzs.zza(zzF()), (zzoj) null));
        zzne[] zzneArr = this.zzs.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzne zzne : zzneArr) {
            if (zzne.zzg()) {
                arrayList.add(zzne);
            } else {
                zzne.zzc();
            }
        }
        int size = arrayList.size();
        this.zzH = (zzne[]) arrayList.toArray(new zzne[size]);
        this.zzI = new ByteBuffer[size];
        zzJ();
        zznt zznt = this.zzq;
        if (zznt != null) {
            ((zzox) zznt).zza.zzc.zzs(z);
        }
    }

    private final void zzJ() {
        int i = 0;
        while (true) {
            zzne[] zzneArr = this.zzH;
            if (i < zzneArr.length) {
                zzne zzne = zzneArr[i];
                zzne.zzc();
                this.zzI[i] = zzne.zzb();
                i++;
            } else {
                return;
            }
        }
    }

    private final void zzK() {
        if (!this.zzQ) {
            this.zzQ = true;
            this.zzj.zzc(zzF());
            this.zzt.stop();
        }
    }

    private final void zzL(long j) throws zznv {
        ByteBuffer byteBuffer;
        int length = this.zzH.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzI[i - 1];
            } else {
                byteBuffer = this.zzJ;
                if (byteBuffer == null) {
                    byteBuffer = zzne.zza;
                }
            }
            if (i == length) {
                zzO(byteBuffer, j);
            } else {
                zzne zzne = this.zzH[i];
                if (i > this.zzO) {
                    zzne.zze(byteBuffer);
                }
                ByteBuffer zzb2 = zzne.zzb();
                this.zzI[i] = zzb2;
                if (zzb2.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private final void zzM(zzby zzby, boolean z) {
        zzok zzH2 = zzH();
        if (!zzby.equals(zzH2.zza) || z != zzH2.zzb) {
            zzok zzok = new zzok(zzby, z, -9223372036854775807L, -9223372036854775807L, (zzoj) null);
            if (zzQ()) {
                this.zzv = zzok;
            } else {
                this.zzw = zzok;
            }
        }
    }

    private final void zzN() {
        if (zzQ()) {
            if (zzen.zza >= 21) {
                this.zzt.setVolume(this.zzG);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f2 = this.zzG;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private final void zzO(ByteBuffer byteBuffer, long j) throws zznv {
        int i;
        zznt zznt;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            boolean z = true;
            if (byteBuffer2 != null) {
                zzdd.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                if (zzen.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzM;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzM = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzM, 0, remaining);
                    byteBuffer.position(position);
                    this.zzN = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzen.zza < 21) {
                int zza2 = this.zzj.zza(this.zzA);
                if (zza2 > 0) {
                    i = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                    if (i > 0) {
                        this.zzN += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.zzt.write(byteBuffer, remaining2, 1);
            }
            this.zzV = SystemClock.elapsedRealtime();
            if (i < 0) {
                if (((zzen.zza < 24 || i != -6) && i != -32) || this.zzB <= 0) {
                    z = false;
                }
                zznv zznv = new zznv(i, this.zzs.zza, z);
                zznt zznt2 = this.zzq;
                if (zznt2 != null) {
                    zznt2.zza(zznv);
                }
                if (!zznv.zzb) {
                    this.zzn.zzb(zznv);
                    return;
                }
                throw zznv;
            }
            this.zzn.zza();
            if (zzR(this.zzt)) {
                if (this.zzB > 0) {
                    this.zzX = false;
                }
                if (this.zzR && (zznt = this.zzq) != null && i < remaining2 && !this.zzX) {
                    zzoy zzoy = ((zzox) zznt).zza;
                    if (zzoy.zzl != null) {
                        zzoy.zzl.zza();
                    }
                }
            }
            int i2 = this.zzs.zzc;
            if (i2 == 0) {
                this.zzA += (long) i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.zzJ) {
                        z = false;
                    }
                    zzdd.zzf(z);
                    this.zzB += ((long) this.zzC) * ((long) this.zzK);
                }
                this.zzL = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzP() throws com.google.android.gms.internal.ads.zznv {
        /*
            r9 = this;
            int r0 = r9.zzO
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.zzO = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.zzO
            com.google.android.gms.internal.ads.zzne[] r5 = r9.zzH
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.zzd()
        L_0x001f:
            r9.zzL(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.zzO
            int r0 = r0 + r2
            r9.zzO = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.zzL
            if (r0 == 0) goto L_0x003b
            r9.zzO(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzL
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.zzO = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzos.zzP():boolean");
    }

    private final boolean zzQ() {
        return this.zzt != null;
    }

    private static boolean zzR(AudioTrack audioTrack) {
        return zzen.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzS() {
        if (!"audio/raw".equals(this.zzs.zza.zzm)) {
            return false;
        }
        int i = this.zzs.zza.zzB;
        return true;
    }

    public final int zza(zzaf zzaf) {
        if (!"audio/raw".equals(zzaf.zzm)) {
            if (!this.zzW) {
                int i = zzen.zza;
            }
            return this.zzd.zza(zzaf) != null ? 2 : 0;
        } else if (!zzen.zzV(zzaf.zzB)) {
            int i2 = zzaf.zzB;
            zzdw.zze("DefaultAudioSink", "Invalid PCM encoding: " + i2);
            return 0;
        } else if (zzaf.zzB != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public final long zzb(boolean z) {
        long j;
        if (!zzQ() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zzb(z), this.zzs.zza(zzF()));
        while (!this.zzk.isEmpty() && min >= ((zzok) this.zzk.getFirst()).zzd) {
            this.zzw = (zzok) this.zzk.remove();
        }
        zzok zzok = this.zzw;
        long j2 = min - zzok.zzd;
        if (zzok.zza.equals(zzby.zza)) {
            j = this.zzw.zzc + j2;
        } else if (this.zzk.isEmpty()) {
            j = this.zzY.zza(j2) + this.zzw.zzc;
        } else {
            zzok zzok2 = (zzok) this.zzk.getFirst();
            j = zzok2.zzc - zzen.zzs(zzok2.zzd - min, this.zzw.zza.zzc);
        }
        return j + this.zzs.zza(this.zzY.zzb());
    }

    public final zzby zzc() {
        return zzH().zza;
    }

    public final void zzd(zzaf zzaf, int i, int[] iArr) throws zznr {
        zzne[] zzneArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        zzaf zzaf2 = zzaf;
        if ("audio/raw".equals(zzaf2.zzm)) {
            zzdd.zzd(zzen.zzV(zzaf2.zzB));
            i7 = zzen.zzo(zzaf2.zzB, zzaf2.zzz);
            int i9 = zzaf2.zzB;
            zzne[] zzneArr2 = this.zzg;
            this.zzf.zzq(zzaf2.zzC, zzaf2.zzD);
            if (zzen.zza < 21 && zzaf2.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    iArr2[i10] = i10;
                }
            } else {
                iArr2 = iArr;
            }
            this.zze.zzo(iArr2);
            zznc zznc = new zznc(zzaf2.zzA, zzaf2.zzz, zzaf2.zzB);
            int length = zzneArr2.length;
            int i11 = 0;
            while (i11 < length) {
                zzne zzne = zzneArr2[i11];
                try {
                    zznc zza2 = zzne.zza(zznc);
                    if (true == zzne.zzg()) {
                        zznc = zza2;
                    }
                    i11++;
                } catch (zznd e2) {
                    throw new zznr((Throwable) e2, zzaf2);
                }
            }
            int i12 = zznc.zzd;
            int i13 = zznc.zzb;
            int i14 = zznc.zzc;
            int zzj2 = zzen.zzj(i14);
            zzneArr = zzneArr2;
            i6 = zzen.zzo(i12, i14);
            i5 = i13;
            i3 = 0;
            int i15 = zzj2;
            i2 = i12;
            i4 = i15;
        } else {
            zzne[] zzneArr3 = new zzne[0];
            int i16 = zzaf2.zzA;
            int i17 = zzen.zza;
            Pair zza3 = this.zzd.zza(zzaf2);
            if (zza3 != null) {
                i3 = 2;
                zzneArr = zzneArr3;
                i2 = ((Integer) zza3.first).intValue();
                i7 = -1;
                i4 = ((Integer) zza3.second).intValue();
                i5 = i16;
                i6 = -1;
            } else {
                throw new zznr("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzaf))), zzaf2);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i4, i2);
        zzdd.zzf(minBufferSize != -2);
        int i18 = 250000;
        if (i3 == 0) {
            int i19 = i6;
            i8 = zzen.zzf(minBufferSize * 4, zzou.zza(250000, i5, i6), zzou.zza(750000, i5, i6));
        } else if (i3 != 1) {
            int i20 = 5;
            if (i2 == 5) {
                i18 = 500000;
                i2 = 5;
            } else {
                i20 = i2;
            }
            i8 = zzgcz.zza((((long) i18) * ((long) zzou.zzb(i2))) / 1000000);
            i6 = i6;
            i2 = i20;
        } else {
            int i21 = i6;
            i8 = zzgcz.zza((((long) zzou.zzb(i2)) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, (int) ((double) i8)) + i6) - 1) / i6) * i6;
        if (i2 == 0) {
            String valueOf = String.valueOf(zzaf);
            throw new zznr("Invalid output encoding (mode=" + i3 + ") for: " + valueOf, zzaf);
        } else if (i4 != 0) {
            this.zzW = false;
            zzoh zzoh = new zzoh(zzaf, i7, i3, i6, i5, i4, i2, max, zzneArr);
            if (zzQ()) {
                this.zzr = zzoh;
            } else {
                this.zzs = zzoh;
            }
        } else {
            String valueOf2 = String.valueOf(zzaf);
            throw new zznr("Invalid output channel config (mode=" + i3 + ") for: " + valueOf2, zzaf);
        }
    }

    public final void zze() {
        if (zzQ()) {
            this.zzy = 0;
            this.zzz = 0;
            this.zzA = 0;
            this.zzB = 0;
            this.zzX = false;
            this.zzC = 0;
            this.zzw = new zzok(zzH().zza, zzH().zzb, 0, 0, (zzoj) null);
            this.zzF = 0;
            this.zzv = null;
            this.zzk.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzO = -1;
            this.zzf.zzp();
            zzJ();
            if (this.zzj.zzh()) {
                this.zzt.pause();
            }
            if (zzR(this.zzt)) {
                zzoq zzoq = this.zzl;
                if (zzoq != null) {
                    zzoq.zzb(this.zzt);
                } else {
                    throw null;
                }
            }
            if (zzen.zza < 21 && !this.zzS) {
                this.zzT = 0;
            }
            zzoh zzoh = this.zzr;
            if (zzoh != null) {
                this.zzs = zzoh;
                this.zzr = null;
            }
            this.zzj.zzd();
            AudioTrack audioTrack = this.zzt;
            zzdg zzdg = this.zzi;
            zzdg.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzen.zzQ("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new zzod(audioTrack, zzdg));
            }
            this.zzt = null;
        }
        this.zzn.zza();
        this.zzm.zza();
    }

    public final void zzf() {
        this.zzD = true;
    }

    public final void zzg() {
        this.zzR = false;
        if (zzQ() && this.zzj.zzk()) {
            this.zzt.pause();
        }
    }

    public final void zzh() {
        this.zzR = true;
        if (zzQ()) {
            this.zzj.zzf();
            this.zzt.play();
        }
    }

    public final void zzi() throws zznv {
        if (!this.zzP && zzQ() && zzP()) {
            zzK();
            this.zzP = true;
        }
    }

    public final void zzj() {
        zze();
        for (zzne zzf2 : this.zzg) {
            zzf2.zzf();
        }
        zzne[] zzneArr = this.zzh;
        int length = zzneArr.length;
        for (int i = 0; i <= 0; i++) {
            zzneArr[i].zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    public final void zzk(zzk zzk2) {
        if (!this.zzu.equals(zzk2)) {
            this.zzu = zzk2;
            zze();
        }
    }

    public final void zzl(int i) {
        if (this.zzT != i) {
            this.zzT = i;
            this.zzS = i != 0;
            zze();
        }
    }

    public final void zzm(zzl zzl2) {
        if (!this.zzU.equals(zzl2)) {
            int i = zzl2.zza;
            float f2 = zzl2.zzb;
            if (this.zzt != null) {
                int i2 = this.zzU.zza;
            }
            this.zzU = zzl2;
        }
    }

    public final void zzn(zznt zznt) {
        this.zzq = zznt;
    }

    public final void zzo(zzby zzby) {
        zzM(new zzby(zzen.zza(zzby.zzc, 0.1f, 8.0f), zzen.zza(zzby.zzd, 0.1f, 8.0f)), zzH().zzb);
    }

    public final void zzp(zzmz zzmz) {
        this.zzp = zzmz;
    }

    public final void zzq(boolean z) {
        zzM(zzH().zza, z);
    }

    public final void zzr(float f2) {
        if (this.zzG != f2) {
            this.zzG = f2;
            zzN();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:42|43|44|45|(3:47|48|49)|72|73|(0)|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0258, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02cb, code lost:
        r1.zzC = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02cd, code lost:
        if (r0 == 0) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d0, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0152, code lost:
        r1.zzW = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x014a */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0152 A[Catch:{ zzns -> 0x009a, zzns -> 0x0156 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00d2=Splitter:B:50:0x00d2, B:72:0x014a=Splitter:B:72:0x014a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzs(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.zzns, com.google.android.gms.internal.ads.zznv {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            java.nio.ByteBuffer r0 = r1.zzJ
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0013
            if (r2 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzr
            r8 = 0
            if (r0 == 0) goto L_0x007f
            boolean r0 = r24.zzP()
            if (r0 != 0) goto L_0x0023
            return r6
        L_0x0023:
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzr
            com.google.android.gms.internal.ads.zzoh r9 = r1.zzs
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L_0x006f
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L_0x006f
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L_0x006f
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L_0x006f
            int r9 = r9.zzd
            int r10 = r0.zzd
            if (r9 != r10) goto L_0x006f
            r1.zzs = r0
            r1.zzr = r8
            android.media.AudioTrack r0 = r1.zzt
            boolean r0 = zzR(r0)
            if (r0 == 0) goto L_0x007c
            android.media.AudioTrack r0 = r1.zzt
            int r0 = r0.getPlayState()
            r9 = 3
            if (r0 != r9) goto L_0x005f
            android.media.AudioTrack r0 = r1.zzt
            r0.setOffloadEndOfStream()
        L_0x005f:
            android.media.AudioTrack r0 = r1.zzt
            com.google.android.gms.internal.ads.zzoh r9 = r1.zzs
            com.google.android.gms.internal.ads.zzaf r9 = r9.zza
            int r10 = r9.zzC
            int r9 = r9.zzD
            r0.setOffloadDelayPadding(r10, r9)
            r1.zzX = r7
            goto L_0x007c
        L_0x006f:
            r24.zzK()
            boolean r0 = r24.zzt()
            if (r0 == 0) goto L_0x0079
            return r6
        L_0x0079:
            r24.zze()
        L_0x007c:
            r1.zzI(r3)
        L_0x007f:
            boolean r0 = r24.zzQ()
            r9 = 31
            if (r0 != 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzdg r0 = r1.zzi     // Catch:{ zzns -> 0x0156 }
            boolean r0 = r0.zzd()     // Catch:{ zzns -> 0x0156 }
            if (r0 != 0) goto L_0x0090
            return r6
        L_0x0090:
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs     // Catch:{ zzns -> 0x009a }
            if (r0 == 0) goto L_0x0099
            android.media.AudioTrack r0 = r1.zzG(r0)     // Catch:{ zzns -> 0x009a }
            goto L_0x00d2
        L_0x0099:
            throw r8     // Catch:{ zzns -> 0x009a }
        L_0x009a:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs     // Catch:{ zzns -> 0x0156 }
            int r12 = r0.zzh     // Catch:{ zzns -> 0x0156 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x014a
            com.google.android.gms.internal.ads.zzoh r12 = new com.google.android.gms.internal.ads.zzoh     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzaf r15 = r0.zza     // Catch:{ zzns -> 0x0156 }
            int r13 = r0.zzb     // Catch:{ zzns -> 0x0156 }
            int r14 = r0.zzc     // Catch:{ zzns -> 0x0156 }
            int r8 = r0.zzd     // Catch:{ zzns -> 0x0156 }
            int r6 = r0.zze     // Catch:{ zzns -> 0x0156 }
            int r7 = r0.zzf     // Catch:{ zzns -> 0x0156 }
            int r10 = r0.zzg     // Catch:{ zzns -> 0x0156 }
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.zzne[] r0 = r0.zzi     // Catch:{ zzns -> 0x0156 }
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r6
            r20 = r7
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ zzns -> 0x0156 }
            android.media.AudioTrack r0 = r1.zzG(r12)     // Catch:{ zzns -> 0x0131 }
            r1.zzs = r12     // Catch:{ zzns -> 0x0131 }
        L_0x00d2:
            r1.zzt = r0     // Catch:{ zzns -> 0x0156 }
            boolean r0 = zzR(r0)     // Catch:{ zzns -> 0x0156 }
            if (r0 == 0) goto L_0x00f9
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzoq r6 = r1.zzl     // Catch:{ zzns -> 0x0156 }
            if (r6 != 0) goto L_0x00e7
            com.google.android.gms.internal.ads.zzoq r6 = new com.google.android.gms.internal.ads.zzoq     // Catch:{ zzns -> 0x0156 }
            r6.<init>(r1)     // Catch:{ zzns -> 0x0156 }
            r1.zzl = r6     // Catch:{ zzns -> 0x0156 }
        L_0x00e7:
            com.google.android.gms.internal.ads.zzoq r6 = r1.zzl     // Catch:{ zzns -> 0x0156 }
            r6.zza(r0)     // Catch:{ zzns -> 0x0156 }
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzoh r6 = r1.zzs     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzaf r6 = r6.zza     // Catch:{ zzns -> 0x0156 }
            int r7 = r6.zzC     // Catch:{ zzns -> 0x0156 }
            int r6 = r6.zzD     // Catch:{ zzns -> 0x0156 }
            r0.setOffloadDelayPadding(r7, r6)     // Catch:{ zzns -> 0x0156 }
        L_0x00f9:
            int r0 = com.google.android.gms.internal.ads.zzen.zza     // Catch:{ zzns -> 0x0156 }
            if (r0 < r9) goto L_0x0106
            com.google.android.gms.internal.ads.zzmz r0 = r1.zzp     // Catch:{ zzns -> 0x0156 }
            if (r0 == 0) goto L_0x0106
            android.media.AudioTrack r6 = r1.zzt     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzoe.zza(r6, r0)     // Catch:{ zzns -> 0x0156 }
        L_0x0106:
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzns -> 0x0156 }
            int r0 = r0.getAudioSessionId()     // Catch:{ zzns -> 0x0156 }
            r1.zzT = r0     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzoa r10 = r1.zzj     // Catch:{ zzns -> 0x0156 }
            android.media.AudioTrack r11 = r1.zzt     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs     // Catch:{ zzns -> 0x0156 }
            int r6 = r0.zzc     // Catch:{ zzns -> 0x0156 }
            r7 = 2
            if (r6 != r7) goto L_0x011b
            r12 = 1
            goto L_0x011c
        L_0x011b:
            r12 = 0
        L_0x011c:
            int r13 = r0.zzg     // Catch:{ zzns -> 0x0156 }
            int r14 = r0.zzd     // Catch:{ zzns -> 0x0156 }
            int r15 = r0.zzh     // Catch:{ zzns -> 0x0156 }
            r10.zze(r11, r12, r13, r14, r15)     // Catch:{ zzns -> 0x0156 }
            r24.zzN()     // Catch:{ zzns -> 0x0156 }
            com.google.android.gms.internal.ads.zzl r0 = r1.zzU     // Catch:{ zzns -> 0x0156 }
            int r0 = r0.zza     // Catch:{ zzns -> 0x0156 }
            r6 = 1
            r1.zzE = r6     // Catch:{ zzns -> 0x0156 }
            r6 = 0
            goto L_0x0163
        L_0x0131:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x014a }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x014a }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x014a }
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x014a }
            r5[r4] = r0     // Catch:{ Exception -> 0x014a }
            r2.invoke(r11, r5)     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs     // Catch:{ zzns -> 0x0156 }
            boolean r0 = r0.zzc()     // Catch:{ zzns -> 0x0156 }
            if (r0 == 0) goto L_0x0155
            r2 = 1
            r1.zzW = r2     // Catch:{ zzns -> 0x0156 }
        L_0x0155:
            throw r11     // Catch:{ zzns -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x0162
            com.google.android.gms.internal.ads.zzol r2 = r1.zzm
            r2.zzb(r0)
            r6 = 0
            return r6
        L_0x0162:
            throw r0
        L_0x0163:
            com.google.android.gms.internal.ads.zzol r0 = r1.zzm
            r0.zza()
            boolean r0 = r1.zzE
            r7 = 0
            if (r0 == 0) goto L_0x0182
            long r10 = java.lang.Math.max(r7, r3)
            r1.zzF = r10
            r1.zzD = r6
            r1.zzE = r6
            r1.zzI(r3)
            boolean r0 = r1.zzR
            if (r0 == 0) goto L_0x0182
            r24.zzh()
        L_0x0182:
            com.google.android.gms.internal.ads.zzoa r0 = r1.zzj
            long r10 = r24.zzF()
            boolean r0 = r0.zzj(r10)
            if (r0 != 0) goto L_0x0190
            r6 = 0
            return r6
        L_0x0190:
            java.nio.ByteBuffer r0 = r1.zzJ
            if (r0 != 0) goto L_0x0363
            java.nio.ByteOrder r0 = r25.order()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r6) goto L_0x019e
            r0 = 1
            goto L_0x019f
        L_0x019e:
            r0 = 0
        L_0x019f:
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            boolean r0 = r25.hasRemaining()
            if (r0 != 0) goto L_0x01aa
            r6 = 1
            return r6
        L_0x01aa:
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs
            int r6 = r0.zzc
            if (r6 == 0) goto L_0x02d1
            int r6 = r1.zzC
            if (r6 != 0) goto L_0x02d1
            int r0 = r0.zzg
            r6 = 1024(0x400, float:1.435E-42)
            r10 = -2
            r11 = 16
            r12 = -1
            switch(r0) {
                case 5: goto L_0x02c6;
                case 6: goto L_0x02c6;
                case 7: goto L_0x0260;
                case 8: goto L_0x0260;
                case 9: goto L_0x024a;
                case 10: goto L_0x0247;
                case 11: goto L_0x0244;
                case 12: goto L_0x0244;
                case 13: goto L_0x01bf;
                case 14: goto L_0x01f4;
                case 15: goto L_0x01f1;
                case 16: goto L_0x0247;
                case 17: goto L_0x01d6;
                case 18: goto L_0x02c6;
                default: goto L_0x01bf;
            }
        L_0x01bf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01d6:
            int r0 = com.google.android.gms.internal.ads.zzyn.zza
            byte[] r0 = new byte[r11]
            int r6 = r25.position()
            r2.get(r0)
            r2.position(r6)
            com.google.android.gms.internal.ads.zzee r6 = new com.google.android.gms.internal.ads.zzee
            r6.<init>(r0, r11)
            com.google.android.gms.internal.ads.zzym r0 = com.google.android.gms.internal.ads.zzyn.zza(r6)
            int r0 = r0.zzc
            goto L_0x0258
        L_0x01f1:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0258
        L_0x01f4:
            int r0 = com.google.android.gms.internal.ads.zzyk.zza
            int r0 = r25.position()
            int r6 = r25.limit()
            int r6 = r6 + -10
            r9 = r0
        L_0x0201:
            if (r9 > r6) goto L_0x0214
            int r13 = r9 + 4
            int r13 = com.google.android.gms.internal.ads.zzen.zzk(r2, r13)
            r13 = r13 & r10
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x0211
            int r9 = r9 - r0
            goto L_0x0215
        L_0x0211:
            int r9 = r9 + 1
            goto L_0x0201
        L_0x0214:
            r9 = -1
        L_0x0215:
            if (r9 != r12) goto L_0x0219
            r0 = 0
            goto L_0x0258
        L_0x0219:
            int r0 = r25.position()
            int r0 = r0 + r9
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            int r6 = r25.position()
            int r6 = r6 + r9
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = 187(0xbb, float:2.62E-43)
            if (r0 != r9) goto L_0x0232
            r0 = 9
            goto L_0x0234
        L_0x0232:
            r0 = 8
        L_0x0234:
            r9 = 40
            int r6 = r6 + r0
            byte r0 = r2.get(r6)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r9 << r0
            int r0 = r0 * 16
            goto L_0x0258
        L_0x0244:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0258
        L_0x0247:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0258
        L_0x024a:
            int r0 = r25.position()
            int r0 = com.google.android.gms.internal.ads.zzen.zzk(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzaad.zzc(r0)
            if (r0 == r12) goto L_0x025a
        L_0x0258:
            r10 = 1
            goto L_0x02cb
        L_0x025a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0260:
            int r0 = com.google.android.gms.internal.ads.zzzg.zza
            int r0 = r25.position()
            byte r6 = r2.get(r0)
            if (r6 == r10) goto L_0x02ad
            if (r6 == r12) goto L_0x0296
            if (r6 == r9) goto L_0x0284
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r9 = 1
            r6 = r6 & r9
            int r6 = r6 << 6
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x02a9
        L_0x0284:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x02a7
        L_0x0296:
            r9 = 2
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x02a7:
            r0 = r0 & 60
        L_0x02a9:
            int r0 = r0 >> r9
            r0 = r0 | r6
            r10 = 1
            goto L_0x02c2
        L_0x02ad:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r10 = 1
            r6 = r6 & r10
            int r6 = r6 << 6
            int r0 = r0 + 4
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            int r0 = r0 >> r9
            r0 = r0 | r6
        L_0x02c2:
            int r0 = r0 + r10
            int r0 = r0 * 32
            goto L_0x02cb
        L_0x02c6:
            r10 = 1
            int r0 = com.google.android.gms.internal.ads.zzyk.zza(r25)
        L_0x02cb:
            r1.zzC = r0
            if (r0 == 0) goto L_0x02d0
            goto L_0x02d1
        L_0x02d0:
            return r10
        L_0x02d1:
            com.google.android.gms.internal.ads.zzok r0 = r1.zzv
            if (r0 == 0) goto L_0x02e3
            boolean r0 = r24.zzP()
            if (r0 != 0) goto L_0x02dd
            r6 = 0
            return r6
        L_0x02dd:
            r1.zzI(r3)
            r6 = 0
            r1.zzv = r6
        L_0x02e3:
            long r9 = r1.zzF
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs
            long r11 = r24.zzE()
            com.google.android.gms.internal.ads.zzpd r6 = r1.zzf
            long r13 = r6.zzo()
            long r11 = r11 - r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r13
            com.google.android.gms.internal.ads.zzaf r0 = r0.zza
            int r0 = r0.zzA
            long r13 = (long) r0
            long r11 = r11 / r13
            long r9 = r9 + r11
            boolean r0 = r1.zzD
            if (r0 != 0) goto L_0x031c
            long r11 = r9 - r3
            long r11 = java.lang.Math.abs(r11)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x031c
            com.google.android.gms.internal.ads.zznt r0 = r1.zzq
            com.google.android.gms.internal.ads.zznu r6 = new com.google.android.gms.internal.ads.zznu
            r6.<init>(r3, r9)
            r0.zza(r6)
            r6 = 1
            r1.zzD = r6
        L_0x031c:
            boolean r0 = r1.zzD
            if (r0 == 0) goto L_0x0343
            boolean r0 = r24.zzP()
            r6 = 0
            if (r0 != 0) goto L_0x0328
            return r6
        L_0x0328:
            long r9 = r3 - r9
            long r11 = r1.zzF
            long r11 = r11 + r9
            r1.zzF = r11
            r1.zzD = r6
            r1.zzI(r3)
            com.google.android.gms.internal.ads.zznt r0 = r1.zzq
            if (r0 == 0) goto L_0x0343
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0343
            com.google.android.gms.internal.ads.zzox r0 = (com.google.android.gms.internal.ads.zzox) r0
            com.google.android.gms.internal.ads.zzoy r0 = r0.zza
            r0.zzab()
        L_0x0343:
            com.google.android.gms.internal.ads.zzoh r0 = r1.zzs
            int r0 = r0.zzc
            if (r0 != 0) goto L_0x0354
            long r6 = r1.zzy
            int r0 = r25.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.zzy = r6
            goto L_0x035f
        L_0x0354:
            long r6 = r1.zzz
            int r0 = r1.zzC
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzz = r6
        L_0x035f:
            r1.zzJ = r2
            r1.zzK = r5
        L_0x0363:
            r1.zzL(r3)
            java.nio.ByteBuffer r0 = r1.zzJ
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0376
            r2 = 0
            r1.zzJ = r2
            r2 = 0
            r1.zzK = r2
            r3 = 1
            return r3
        L_0x0376:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zzoa r0 = r1.zzj
            long r4 = r24.zzF()
            boolean r0 = r0.zzi(r4)
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzdw.zze(r0, r2)
            r24.zze()
            return r3
        L_0x038f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzos.zzs(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean zzt() {
        return zzQ() && this.zzj.zzg(zzF());
    }

    public final boolean zzu() {
        return !zzQ() || (this.zzP && !zzt());
    }

    public final boolean zzv(zzaf zzaf) {
        return zza(zzaf) != 0;
    }
}
