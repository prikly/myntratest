package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaul {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzats[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzaum zza;
    private final zzaus zzb;
    private final zzats[] zzc;
    private final zzauh zzd;
    /* access modifiers changed from: private */
    public final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzaud zzg;
    private final LinkedList zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzath zzq;
    private zzath zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzaul(zzatq zzatq, zzats[] zzatsArr, zzauh zzauh) {
        this.zzd = zzauh;
        if (zzbay.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzbay.zza >= 19) {
            this.zzg = new zzaue();
        } else {
            this.zzg = new zzaud((zzauc) null);
        }
        this.zza = new zzaum();
        this.zzb = new zzaus();
        zzats[] zzatsArr2 = new zzats[3];
        this.zzc = zzatsArr2;
        zzatsArr2[0] = new zzauq();
        zzatsArr2[1] = this.zza;
        System.arraycopy(zzatsArr, 0, zzatsArr2, 2, 0);
        this.zzc[2] = this.zzb;
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzath.zza;
        this.zzT = -1;
        this.zzN = new zzats[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList();
    }

    private final long zzp(long j) {
        return (j * ((long) this.zzj)) / 1000000;
    }

    private final long zzq(long j) {
        return (j * 1000000) / ((long) this.zzj);
    }

    private final long zzr() {
        return this.zzn ? this.zzG : this.zzF / ((long) this.zzE);
    }

    private final void zzs(long j) throws zzauk {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzO[i - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzats.zza;
                }
            }
            if (i == length) {
                zzz(byteBuffer, j);
            } else {
                zzats zzats = this.zzN[i];
                zzats.zzf(byteBuffer);
                ByteBuffer zzc2 = zzats.zzc();
                this.zzO[i] = zzc2;
                if (zzc2.hasRemaining()) {
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

    private final void zzt() {
        ArrayList arrayList = new ArrayList();
        zzats[] zzatsArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzats zzats = zzatsArr[i];
            if (zzats.zzi()) {
                arrayList.add(zzats);
            } else {
                zzats.zzd();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzats[]) arrayList.toArray(new zzats[size]);
        this.zzO = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzats zzats2 = this.zzN[i2];
            zzats2.zzd();
            this.zzO[i2] = zzats2.zzc();
        }
    }

    private final void zzu() {
        this.zzw = 0;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = 0;
    }

    private final void zzv() {
        if (zzx()) {
            if (zzbay.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f2 = this.zzM;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzw() throws com.google.android.gms.internal.ads.zzauk {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.zzn
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzats[] r0 = r9.zzN
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.zzT = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzats[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.zze()
        L_0x0028:
            r9.zzs(r7)
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.zzT
            int r0 = r0 + r2
            r9.zzT = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L_0x0044
            r9.zzz(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.zzT = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaul.zzw():boolean");
    }

    private final boolean zzx() {
        return this.zzi != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.zzm;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzy() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.zzbay.zza
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.zzm
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaul.zzy():boolean");
    }

    private final boolean zzz(ByteBuffer byteBuffer, long j) throws zzauk {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.zzQ;
        if (byteBuffer2 != null) {
            zzbaj.zzc(byteBuffer2 == byteBuffer);
        } else {
            this.zzQ = byteBuffer;
            if (zzbay.zza < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzR;
                if (bArr == null || bArr.length < remaining) {
                    this.zzR = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzR, 0, remaining);
                byteBuffer.position(position);
                this.zzS = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zzbay.zza < 21) {
            int zza2 = this.zzo - ((int) (this.zzF - (this.zzg.zza() * ((long) this.zzE))));
            if (zza2 > 0) {
                i = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zza2));
                if (i > 0) {
                    this.zzS += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.zzi.write(byteBuffer, remaining2, 1);
        }
        this.zzY = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.zzn;
            if (!z) {
                this.zzF += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z) {
                this.zzG += (long) this.zzH;
            }
            this.zzQ = null;
            return true;
        }
        throw new zzauk(i);
    }

    public final long zza(boolean z) {
        long j;
        long j2;
        if (!zzx() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zzb2 = this.zzg.zzb();
            if (zzb2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= 30000) {
                    long[] jArr = this.zzf;
                    int i = this.zzu;
                    jArr[i] = zzb2 - nanoTime;
                    this.zzu = (i + 1) % 10;
                    int i2 = this.zzv;
                    if (i2 < 10) {
                        this.zzv = i2 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzv;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzw += this.zzf[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzy() && nanoTime - this.zzz >= 500000) {
                    boolean zzh2 = this.zzg.zzh();
                    this.zzy = zzh2;
                    if (zzh2) {
                        long zzd2 = this.zzg.zzd() / 1000;
                        long zzc2 = this.zzg.zzc();
                        if (zzd2 < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzd2 - nanoTime) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + zzc2 + ", " + zzd2 + ", " + nanoTime + ", " + zzb2);
                            this.zzy = false;
                        } else if (Math.abs(zzq(zzc2) - zzb2) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + zzc2 + ", " + zzd2 + ", " + nanoTime + ", " + zzb2);
                            this.zzy = false;
                        }
                    }
                    Method method = this.zzA;
                    if (method != null && !this.zzn) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.zzi, (Object[]) null)).intValue()) * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0);
                            this.zzL = max;
                            if (max > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + max);
                                this.zzL = 0;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            j = zzq(this.zzg.zzc() + zzp(nanoTime2 - (this.zzg.zzd() / 1000)));
        } else {
            j = this.zzv == 0 ? this.zzg.zzb() : nanoTime2 + this.zzw;
            if (!z) {
                j -= this.zzL;
            }
        }
        long j3 = this.zzJ;
        while (!this.zzh.isEmpty() && j >= ((zzauj) this.zzh.getFirst()).zzc) {
            zzauj zzauj = (zzauj) this.zzh.remove();
            this.zzr = zzauj.zza;
            this.zzt = zzauj.zzc;
            this.zzs = zzauj.zzb - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j2 = (j + this.zzs) - this.zzt;
        } else {
            if (this.zzh.isEmpty()) {
                zzaus zzaus = this.zzb;
                if (zzaus.zzn() >= 1024) {
                    j2 = zzbay.zzj(j - this.zzt, zzaus.zzm(), zzaus.zzn()) + this.zzs;
                }
            }
            j2 = ((long) (((double) this.zzr.zzb) * ((double) (j - this.zzt)))) + this.zzs;
        }
        return j3 + j2;
    }

    public final zzath zzc() {
        return this.zzr;
    }

    public final zzath zzd(zzath zzath) {
        if (this.zzn) {
            zzath zzath2 = zzath.zza;
            this.zzr = zzath2;
            return zzath2;
        }
        float zzl2 = this.zzb.zzl(zzath.zzb);
        zzaus zzaus = this.zzb;
        float f2 = zzath.zzc;
        zzaus.zzk(1.0f);
        zzath zzath3 = new zzath(zzl2, 1.0f);
        zzath zzath4 = this.zzq;
        if (zzath4 == null) {
            if (!this.zzh.isEmpty()) {
                zzath4 = ((zzauj) this.zzh.getLast()).zza;
            } else {
                zzath4 = this.zzr;
            }
        }
        if (!zzath3.equals(zzath4)) {
            if (zzx()) {
                this.zzq = zzath3;
            } else {
                this.zzr = zzath3;
            }
        }
        return this.zzr;
    }

    public final void zzf() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final void zzg() {
        this.zzV = false;
        if (zzx()) {
            zzu();
            this.zzg.zzf();
        }
    }

    public final void zzh() {
        this.zzV = true;
        if (zzx()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zzi() throws zzauk {
        if (!this.zzU && zzx() && zzw()) {
            this.zzg.zze(zzr());
            this.zzU = true;
        }
    }

    public final void zzj() {
        zzk();
        zzats[] zzatsArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzatsArr[i].zzg();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    public final void zzl(float f2) {
        if (this.zzM != f2) {
            this.zzM = f2;
            zzv();
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer, long j) throws zzaug, zzauk {
        long j2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.zzP;
        zzbaj.zzc(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!zzx()) {
            this.zze.block();
            int i2 = this.zzW;
            if (i2 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i2);
            }
            int state = this.zzi.getState();
            if (state == 1) {
                int audioSessionId = this.zzi.getAudioSessionId();
                if (this.zzW != audioSessionId) {
                    this.zzW = audioSessionId;
                    ((zzauo) this.zzd).zza.zzb.zzb(audioSessionId);
                }
                this.zzg.zzg(this.zzi, zzy());
                zzv();
                this.zzX = false;
                if (this.zzV) {
                    zzh();
                }
            } else {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzaug(state, this.zzj, this.zzk, this.zzo);
            }
        }
        if (zzy()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zza() != 0) {
                return false;
            }
        }
        boolean z = this.zzX;
        boolean zzn2 = zzn();
        this.zzX = zzn2;
        if (z && !zzn2 && this.zzi.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = this.zzY;
            zzauh zzauh = this.zzd;
            ((zzauo) zzauh).zza.zzb.zzc(this.zzo, zzaso.zzb(this.zzp), elapsedRealtime - j4);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i3 = this.zzm;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = zzatp.zza;
                    i = 1536;
                } else if (i3 == 6) {
                    i = zzatp.zza(byteBuffer);
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i3);
                }
                this.zzH = i;
            }
            if (this.zzq != null) {
                if (!zzw()) {
                    return false;
                }
                this.zzh.add(new zzauj(this.zzq, Math.max(0, j3), zzq(zzr()), (zzaui) null));
                this.zzq = null;
                zzt();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0, j3);
                this.zzI = 1;
            } else {
                long j5 = this.zzJ;
                if (this.zzn) {
                    j2 = this.zzD;
                } else {
                    j2 = this.zzC / ((long) this.zzB);
                }
                long zzq2 = j5 + zzq(j2);
                if (this.zzI == 1 && Math.abs(zzq2 - j3) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + zzq2 + ", got " + j3 + "]");
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ += j3 - zzq2;
                    this.zzI = 1;
                    ((zzauo) this.zzd).zza.zzh = true;
                }
            }
            if (this.zzn) {
                this.zzD += (long) this.zzH;
            } else {
                this.zzC += (long) byteBuffer.remaining();
            }
            this.zzP = byteBuffer2;
        }
        if (this.zzn) {
            zzz(this.zzP, j3);
        } else {
            zzs(j3);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final boolean zzn() {
        if (zzx()) {
            if (zzr() > this.zzg.zza()) {
                return true;
            }
            if (zzy() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean zzo() {
        return !zzx() || (this.zzU && !zzn());
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(java.lang.String r6, int r7, int r8, int r9, int r10, int[] r11) throws com.google.android.gms.internal.ads.zzauf {
        /*
            r5 = this;
            int r6 = com.google.android.gms.internal.ads.zzbay.zzi(r9, r7)
            r5.zzB = r6
            com.google.android.gms.internal.ads.zzaum r6 = r5.zza
            r6.zzk(r11)
            com.google.android.gms.internal.ads.zzats[] r6 = r5.zzc
            r10 = 0
            r11 = 0
            r0 = 0
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r11 >= r1) goto L_0x0033
            r1 = r6[r11]
            boolean r3 = r1.zzh(r8, r7, r9)     // Catch:{ zzatr -> 0x002c }
            r0 = r0 | r3
            boolean r3 = r1.zzi()
            if (r3 == 0) goto L_0x0029
            int r7 = r1.zza()
            r1.zzb()
            r9 = 2
        L_0x0029:
            int r11 = r11 + 1
            goto L_0x0010
        L_0x002c:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzauf r7 = new com.google.android.gms.internal.ads.zzauf
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r5.zzt()
        L_0x0038:
            r6 = 252(0xfc, float:3.53E-43)
            switch(r7) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0066;
                case 3: goto L_0x0063;
                case 4: goto L_0x0060;
                case 5: goto L_0x005d;
                case 6: goto L_0x005a;
                case 7: goto L_0x0057;
                case 8: goto L_0x0054;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.zzauf r6 = new com.google.android.gms.internal.ads.zzauf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unsupported channel count: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0054:
            int r11 = com.google.android.gms.internal.ads.zzaso.zza
            goto L_0x006a
        L_0x0057:
            r11 = 1276(0x4fc, float:1.788E-42)
            goto L_0x006a
        L_0x005a:
            r11 = 252(0xfc, float:3.53E-43)
            goto L_0x006a
        L_0x005d:
            r11 = 220(0xdc, float:3.08E-43)
            goto L_0x006a
        L_0x0060:
            r11 = 204(0xcc, float:2.86E-43)
            goto L_0x006a
        L_0x0063:
            r11 = 28
            goto L_0x006a
        L_0x0066:
            r11 = 12
            goto L_0x006a
        L_0x0069:
            r11 = 4
        L_0x006a:
            int r3 = com.google.android.gms.internal.ads.zzbay.zza
            r4 = 23
            if (r3 > r4) goto L_0x0090
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbay.zzb
            java.lang.String r4 = "foster"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbay.zzc
            java.lang.String r4 = "NVIDIA"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0090
            if (r7 == r1) goto L_0x0091
            r1 = 5
            if (r7 == r1) goto L_0x0091
            r6 = 7
            if (r7 == r6) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            int r6 = com.google.android.gms.internal.ads.zzaso.zza
            goto L_0x0091
        L_0x0090:
            r6 = r11
        L_0x0091:
            int r11 = com.google.android.gms.internal.ads.zzbay.zza
            r1 = 25
            if (r11 > r1) goto L_0x009f
            java.lang.String r11 = com.google.android.gms.internal.ads.zzbay.zzb
            java.lang.String r1 = "fugu"
            boolean r11 = r1.equals(r11)
        L_0x009f:
            if (r0 != 0) goto L_0x00b5
            boolean r11 = r5.zzx()
            if (r11 == 0) goto L_0x00b5
            int r11 = r5.zzl
            if (r11 != r9) goto L_0x00b5
            int r11 = r5.zzj
            if (r11 != r8) goto L_0x00b5
            int r11 = r5.zzk
            if (r11 == r6) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            return
        L_0x00b5:
            r5.zzk()
            r5.zzl = r9
            r5.zzn = r10
            r5.zzj = r8
            r5.zzk = r6
            r5.zzm = r2
            int r7 = com.google.android.gms.internal.ads.zzbay.zzi(r2, r7)
            r5.zzE = r7
            int r7 = r5.zzm
            int r6 = android.media.AudioTrack.getMinBufferSize(r8, r6, r7)
            r7 = -2
            if (r6 == r7) goto L_0x00d2
            r10 = 1
        L_0x00d2:
            com.google.android.gms.internal.ads.zzbaj.zze(r10)
            int r7 = r6 * 4
            r8 = 250000(0x3d090, double:1.235164E-318)
            long r8 = r5.zzp(r8)
            int r10 = r5.zzE
            int r9 = (int) r8
            int r9 = r9 * r10
            long r0 = (long) r6
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r5.zzp(r2)
            long r10 = (long) r10
            long r2 = r2 * r10
            long r10 = java.lang.Math.max(r0, r2)
            int r6 = (int) r10
            if (r7 >= r9) goto L_0x00f7
            r7 = r9
            goto L_0x00fa
        L_0x00f7:
            if (r7 <= r6) goto L_0x00fa
            r7 = r6
        L_0x00fa:
            r5.zzo = r7
            int r6 = r5.zzE
            int r7 = r7 / r6
            long r6 = (long) r7
            long r6 = r5.zzq(r6)
            r5.zzp = r6
            com.google.android.gms.internal.ads.zzath r6 = r5.zzr
            r5.zzd(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaul.zze(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void zzk() {
        if (zzx()) {
            this.zzC = 0;
            this.zzD = 0;
            this.zzF = 0;
            this.zzG = 0;
            this.zzH = 0;
            zzath zzath = this.zzq;
            if (zzath != null) {
                this.zzr = zzath;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                this.zzr = ((zzauj) this.zzh.getLast()).zza;
            }
            this.zzh.clear();
            this.zzs = 0;
            this.zzt = 0;
            this.zzP = null;
            this.zzQ = null;
            int i = 0;
            while (true) {
                zzats[] zzatsArr = this.zzN;
                if (i >= zzatsArr.length) {
                    break;
                }
                zzats zzats = zzatsArr[i];
                zzats.zzd();
                this.zzO[i] = zzats.zzc();
                i++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0;
            zzu();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zzg((AudioTrack) null, false);
            this.zze.close();
            new zzaub(this, audioTrack).start();
        }
    }
}
