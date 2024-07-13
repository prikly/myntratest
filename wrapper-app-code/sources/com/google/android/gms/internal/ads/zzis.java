package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzis extends zzm implements zzcg {
    public static final /* synthetic */ int zzd = 0;
    private final zzkk zzA;
    private final zzkl zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzkb zzH;
    private zzcc zzI;
    private zzbm zzJ;
    private zzbm zzK;
    /* access modifiers changed from: private */
    public zzaf zzL;
    /* access modifiers changed from: private */
    public zzaf zzM;
    private AudioTrack zzN;
    /* access modifiers changed from: private */
    public Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    /* access modifiers changed from: private */
    public zzgs zzT;
    /* access modifiers changed from: private */
    public zzgs zzU;
    private int zzV;
    private zzk zzW;
    private float zzX;
    /* access modifiers changed from: private */
    public boolean zzY;
    private zzdc zzZ;
    private boolean zzaa;
    private boolean zzab;
    /* access modifiers changed from: private */
    public zzt zzac;
    /* access modifiers changed from: private */
    public zzda zzad;
    private zzbm zzae;
    private zzjs zzaf;
    private int zzag;
    private long zzah;
    private final zzif zzai;
    private zzub zzaj;
    final zzwa zzb;
    final zzcc zzc;
    private final zzdg zze = new zzdg(zzde.zza);
    private final Context zzf;
    private final zzcg zzg;
    private final zzjy[] zzh;
    private final zzvz zzi;
    private final zzdn zzj;
    private final zzjc zzk;
    /* access modifiers changed from: private */
    public final zzdt zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzck zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsg zzq;
    /* access modifiers changed from: private */
    public final zzkm zzr;
    private final Looper zzs;
    private final zzwh zzt;
    private final zzde zzu;
    private final zzio zzv;
    private final zziq zzw;
    private final zzgm zzx;
    private final zzgq zzy;
    /* access modifiers changed from: private */
    public final zzkj zzz;

    static {
        zzbh.zzb("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, com.google.android.gms.internal.ads.zzkm] */
    public zzis(zzhk zzhk, zzcg zzcg) {
        zzmz zza;
        zzhk zzhk2 = zzhk;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzen.zze;
            zzdw.zzd("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "]");
            this.zzf = zzhk2.zza.getApplicationContext();
            this.zzr = zzhk2.zzh.apply(zzhk2.zzb);
            this.zzW = zzhk2.zzj;
            this.zzQ = zzhk2.zzk;
            this.zzY = false;
            this.zzC = zzhk2.zzo;
            this.zzv = new zzio(this, (zzin) null);
            this.zzw = new zziq((zzip) null);
            Handler handler = new Handler(zzhk2.zzi);
            zzcmx zzcmx = ((zzhe) zzhk2.zzc).zza;
            zzio zzio = this.zzv;
            zzjy[] zza2 = zzcmx.zza(handler, zzio, zzio, zzio, zzio);
            this.zzh = zza2;
            int length = zza2.length;
            this.zzi = (zzvz) zzhk2.zze.zza();
            this.zzq = zzhk.zza(((zzhf) zzhk2.zzd).zza);
            this.zzt = zzwl.zzg(((zzhi) zzhk2.zzg).zza);
            this.zzp = zzhk2.zzl;
            this.zzH = zzhk2.zzm;
            this.zzs = zzhk2.zzi;
            zzde zzde = zzhk2.zzb;
            this.zzu = zzde;
            this.zzg = zzcg;
            this.zzl = new zzdt(this.zzs, zzde, new zzie(this));
            this.zzm = new CopyOnWriteArraySet();
            this.zzo = new ArrayList();
            this.zzaj = new zzub(0);
            int length2 = this.zzh.length;
            this.zzb = new zzwa(new zzka[2], new zzvt[2], zzcy.zza, (Object) null);
            this.zzn = new zzck();
            zzca zzca = new zzca();
            zzca.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            this.zzi.zzl();
            zzca.zzd(29, true);
            this.zzc = zzca.zze();
            zzca zzca2 = new zzca();
            zzca2.zzb(this.zzc);
            zzca2.zza(4);
            zzca2.zza(10);
            this.zzI = zzca2.zze();
            this.zzj = this.zzu.zzb(this.zzs, (Handler.Callback) null);
            this.zzai = new zzif(this);
            this.zzaf = zzjs.zzg(this.zzb);
            this.zzr.zzS(this.zzg, this.zzs);
            if (zzen.zza < 31) {
                zza = new zzmz();
            } else {
                zza = zzih.zza(this.zzf, this, zzhk2.zzp);
            }
            zzmz zzmz = zza;
            zzjy[] zzjyArr = this.zzh;
            zzvz zzvz = this.zzi;
            zzwa zzwa = this.zzb;
            Handler handler2 = handler;
            zzjy[] zzjyArr2 = zzjyArr;
            zzvz zzvz2 = zzvz;
            zzwa zzwa2 = zzwa;
            this.zzk = new zzjc(zzjyArr2, zzvz2, zzwa2, (zzjf) zzhk2.zzf.zza(), this.zzt, 0, false, this.zzr, this.zzH, zzhk2.zzr, zzhk2.zzn, false, this.zzs, this.zzu, this.zzai, zzmz, (byte[]) null);
            this.zzX = 1.0f;
            zzbm zzbm = zzbm.zza;
            this.zzJ = zzbm;
            this.zzK = zzbm;
            this.zzae = zzbm;
            this.zzag = -1;
            if (zzen.zza < 21) {
                AudioTrack audioTrack = this.zzN;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.zzN.release();
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, TTAdSdk.INIT_LOCAL_FAIL_CODE, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                this.zzV = zzen.zzi(this.zzf);
            }
            this.zzZ = zzdc.zza;
            this.zzaa = true;
            zzkm zzkm = this.zzr;
            zzdt zzdt = this.zzl;
            if (zzkm != null) {
                zzdt.zzb(zzkm);
                this.zzt.zze(new Handler(this.zzs), this.zzr);
                this.zzm.add(this.zzv);
                Handler handler3 = handler2;
                this.zzx = new zzgm(zzhk2.zza, handler3, this.zzv);
                this.zzy = new zzgq(zzhk2.zza, handler3, this.zzv);
                zzen.zzT((Object) null, (Object) null);
                zzkj zzkj = new zzkj(zzhk2.zza, handler3, this.zzv);
                this.zzz = zzkj;
                int i = this.zzW.zzc;
                zzkj.zzf(3);
                this.zzA = new zzkk(zzhk2.zza);
                this.zzB = new zzkl(zzhk2.zza);
                this.zzac = zzal(this.zzz);
                this.zzad = zzda.zza;
                this.zzi.zzi(this.zzW);
                zzap(1, 10, Integer.valueOf(this.zzV));
                zzap(2, 10, Integer.valueOf(this.zzV));
                zzap(1, 3, this.zzW);
                zzap(2, 4, Integer.valueOf(this.zzQ));
                zzap(2, 5, 0);
                zzap(1, 9, Boolean.valueOf(this.zzY));
                zzap(2, 7, this.zzw);
                zzap(6, 8, this.zzw);
                return;
            }
            throw null;
        } finally {
            this.zze.zze();
        }
    }

    static /* bridge */ /* synthetic */ void zzN(zzis zzis, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzis.zzar(surface);
        zzis.zzP = surface;
    }

    private final int zzaf() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjs zzjs = this.zzaf;
        return zzjs.zza.zzn(zzjs.zzb.zza, this.zzn).zzd;
    }

    /* access modifiers changed from: private */
    public static int zzag(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzah(zzjs zzjs) {
        if (zzjs.zza.zzo()) {
            return zzen.zzv(this.zzah);
        }
        if (zzjs.zzb.zzb()) {
            return zzjs.zzr;
        }
        zzcn zzcn = zzjs.zza;
        zzsh zzsh = zzjs.zzb;
        long j = zzjs.zzr;
        zzaj(zzcn, zzsh, j);
        return j;
    }

    private static long zzai(zzjs zzjs) {
        zzcm zzcm = new zzcm();
        zzck zzck = new zzck();
        zzjs.zza.zzn(zzjs.zzb.zza, zzck);
        long j = zzjs.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzjs.zza.zze(zzck.zzd, zzcm, 0).zzm;
        return 0;
    }

    private final long zzaj(zzcn zzcn, zzsh zzsh, long j) {
        zzcn.zzn(zzsh.zza, this.zzn);
        return j;
    }

    private final Pair zzak(zzcn zzcn, int i, long j) {
        if (zzcn.zzo()) {
            this.zzag = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzah = j;
            return null;
        }
        if (i == -1 || i >= zzcn.zzc()) {
            i = zzcn.zzg(false);
            long j2 = zzcn.zze(i, this.zza, 0).zzm;
            j = zzen.zzz(0);
        }
        return zzcn.zzl(this.zza, this.zzn, i, zzen.zzv(j));
    }

    /* access modifiers changed from: private */
    public static zzt zzal(zzkj zzkj) {
        return new zzt(0, zzkj.zzb(), zzkj.zza());
    }

    private final zzjs zzam(zzjs zzjs, zzcn zzcn, Pair pair) {
        zzug zzug;
        zzwa zzwa;
        zzsh zzsh;
        List list;
        int i;
        zzjs zzjs2;
        long j;
        zzcn zzcn2 = zzcn;
        Pair pair2 = pair;
        zzdd.zzd(zzcn.zzo() || pair2 != null);
        zzcn zzcn3 = zzjs.zza;
        zzjs zzf2 = zzjs.zzf(zzcn);
        if (zzcn.zzo()) {
            zzsh zzh2 = zzjs.zzh();
            long zzv2 = zzen.zzv(this.zzah);
            zzjs zza = zzf2.zzb(zzh2, zzv2, zzv2, zzv2, 0, zzug.zza, this.zzb, zzgau.zzo()).zza(zzh2);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf2.zzb.zza;
        int i2 = zzen.zza;
        boolean z = !obj.equals(pair2.first);
        zzsh zzsh2 = z ? new zzsh(pair2.first) : zzf2.zzb;
        long longValue = ((Long) pair2.second).longValue();
        long zzv3 = zzen.zzv(zzk());
        if (!zzcn3.zzo()) {
            zzcn3.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv3) {
            zzsh zzsh3 = zzsh2;
            zzdd.zzf(!zzsh3.zzb());
            if (z) {
                zzug = zzug.zza;
            } else {
                zzug = zzf2.zzh;
            }
            zzug zzug2 = zzug;
            if (z) {
                zzsh = zzsh3;
                zzwa = this.zzb;
            } else {
                zzsh = zzsh3;
                zzwa = zzf2.zzi;
            }
            zzwa zzwa2 = zzwa;
            if (z) {
                list = zzgau.zzo();
            } else {
                list = zzf2.zzj;
            }
            zzjs zza2 = zzf2.zzb(zzsh, longValue, longValue, longValue, 0, zzug2, zzwa2, list).zza(zzsh);
            zza2.zzp = longValue;
            return zza2;
        }
        if (i == 0) {
            int zza3 = zzcn2.zza(zzf2.zzk.zza);
            if (zza3 != -1 && zzcn2.zzd(zza3, this.zzn, false).zzd == zzcn2.zzn(zzsh2.zza, this.zzn).zzd) {
                return zzf2;
            }
            zzcn2.zzn(zzsh2.zza, this.zzn);
            if (zzsh2.zzb()) {
                j = this.zzn.zzg(zzsh2.zzb, zzsh2.zzc);
            } else {
                j = this.zzn.zze;
            }
            zzjs2 = zzf2.zzb(zzsh2, zzf2.zzr, zzf2.zzr, zzf2.zzd, j - zzf2.zzr, zzf2.zzh, zzf2.zzi, zzf2.zzj).zza(zzsh2);
            zzjs2.zzp = j;
        } else {
            zzsh zzsh4 = zzsh2;
            zzdd.zzf(!zzsh4.zzb());
            long max = Math.max(0, zzf2.zzq - (longValue - zzv3));
            long j2 = zzf2.zzp;
            if (zzf2.zzk.equals(zzf2.zzb)) {
                j2 = longValue + max;
            }
            zzjs2 = zzf2.zzb(zzsh4, longValue, longValue, longValue, max, zzf2.zzh, zzf2.zzi, zzf2.zzj);
            zzjs2.zzp = j2;
        }
        return zzjs2;
    }

    private final zzjv zzan(zzju zzju) {
        int zzaf2 = zzaf();
        zzjc zzjc = this.zzk;
        return new zzjv(zzjc, zzju, this.zzaf.zza, zzaf2 == -1 ? 0 : zzaf2, this.zzu, zzjc.zzb());
    }

    /* access modifiers changed from: private */
    public final void zzao(int i, int i2) {
        if (i != this.zzR || i2 != this.zzS) {
            this.zzR = i;
            this.zzS = i2;
            zzdt zzdt = this.zzl;
            zzdt.zzd(24, new zzhm(i, i2));
            zzdt.zzc();
        }
    }

    private final void zzap(int i, int i2, Object obj) {
        zzjy[] zzjyArr = this.zzh;
        int length = zzjyArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzjy zzjy = zzjyArr[i3];
            if (zzjy.zzb() == i) {
                zzjv zzan = zzan(zzjy);
                zzan.zzf(i2);
                zzan.zze(obj);
                zzan.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzaq() {
        zzap(1, 2, Float.valueOf(this.zzX * this.zzy.zza()));
    }

    /* access modifiers changed from: private */
    public final void zzar(Object obj) {
        boolean z;
        ArrayList<zzjv> arrayList = new ArrayList<>();
        zzjy[] zzjyArr = this.zzh;
        int length = zzjyArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzjy zzjy = zzjyArr[i];
            if (zzjy.zzb() == 2) {
                zzjv zzan = zzan(zzjy);
                zzan.zzf(1);
                zzan.zze(obj);
                zzan.zzd();
                arrayList.add(zzan);
            }
            i++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (zzjv zzi2 : arrayList) {
                    zzi2.zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzas(false, zzha.zzd(new zzjd(3), 1003));
        }
    }

    private final void zzas(boolean z, zzha zzha) {
        zzjs zzjs = this.zzaf;
        zzjs zza = zzjs.zza(zzjs.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0;
        zzjs zze2 = zza.zze(1);
        if (zzha != null) {
            zze2 = zze2.zzd(zzha);
        }
        zzjs zzjs2 = zze2;
        this.zzD++;
        this.zzk.zzo();
        zzau(zzjs2, 0, 1, false, zzjs2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzah(zzjs2), -1, false);
    }

    /* access modifiers changed from: private */
    public final void zzat(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzjs zzjs = this.zzaf;
        if (zzjs.zzl != z2 || zzjs.zzm != i3) {
            this.zzD++;
            zzjs zzc2 = zzjs.zzc(z2, i3);
            this.zzk.zzn(z2, i3);
            zzau(zzc2, 0, i2, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzau(com.google.android.gms.internal.ads.zzjs r42, int r43, int r44, boolean r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r47
            com.google.android.gms.internal.ads.zzjs r3 = r0.zzaf
            r0.zzaf = r1
            com.google.android.gms.internal.ads.zzcn r4 = r3.zza
            com.google.android.gms.internal.ads.zzcn r5 = r1.zza
            boolean r4 = r4.equals(r5)
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzcn r7 = r3.zza
            com.google.android.gms.internal.ads.zzcn r8 = r1.zza
            boolean r9 = r8.zzo()
            r11 = 3
            r12 = 0
            r14 = -1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r10 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            if (r9 == 0) goto L_0x003c
            boolean r9 = r7.zzo()
            if (r9 == 0) goto L_0x003c
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r14, r15)
            goto L_0x00c0
        L_0x003c:
            boolean r9 = r8.zzo()
            boolean r10 = r7.zzo()
            if (r9 == r10) goto L_0x0052
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7.<init>(r6, r8)
        L_0x004f:
            r6 = r7
            goto L_0x00c0
        L_0x0052:
            com.google.android.gms.internal.ads.zzsh r9 = r3.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzck r10 = r0.zzn
            com.google.android.gms.internal.ads.zzck r9 = r7.zzn(r9, r10)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzcm r10 = r0.zza
            com.google.android.gms.internal.ads.zzcm r7 = r7.zze(r9, r10, r12)
            java.lang.Object r7 = r7.zzc
            com.google.android.gms.internal.ads.zzsh r9 = r1.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzck r10 = r0.zzn
            com.google.android.gms.internal.ads.zzck r9 = r8.zzn(r9, r10)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzcm r10 = r0.zza
            com.google.android.gms.internal.ads.zzcm r8 = r8.zze(r9, r10, r12)
            java.lang.Object r8 = r8.zzc
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00a0
            if (r46 == 0) goto L_0x0086
            if (r2 != 0) goto L_0x0086
            r7 = 1
            goto L_0x008f
        L_0x0086:
            if (r46 == 0) goto L_0x008c
            if (r2 != r5) goto L_0x008c
            r7 = 2
            goto L_0x008f
        L_0x008c:
            if (r4 == 0) goto L_0x009a
            r7 = 3
        L_0x008f:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.<init>(r6, r7)
            r6 = r8
            goto L_0x00c0
        L_0x009a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00a0:
            if (r46 == 0) goto L_0x00bb
            if (r2 != 0) goto L_0x00bb
            com.google.android.gms.internal.ads.zzsh r7 = r3.zzb
            long r7 = r7.zzd
            com.google.android.gms.internal.ads.zzsh r9 = r1.zzb
            long r9 = r9.zzd
            int r17 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r17 >= 0) goto L_0x00bb
            android.util.Pair r7 = new android.util.Pair
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.<init>(r6, r9)
            goto L_0x004f
        L_0x00bb:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r14, r15)
        L_0x00c0:
            java.lang.Object r7 = r6.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzJ
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzcn r10 = r1.zza
            boolean r10 = r10.zzo()
            if (r10 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzcn r10 = r1.zza
            com.google.android.gms.internal.ads.zzsh r14 = r1.zzb
            java.lang.Object r14 = r14.zza
            com.google.android.gms.internal.ads.zzck r15 = r0.zzn
            com.google.android.gms.internal.ads.zzck r10 = r10.zzn(r14, r15)
            int r10 = r10.zzd
            com.google.android.gms.internal.ads.zzcn r14 = r1.zza
            com.google.android.gms.internal.ads.zzcm r15 = r0.zza
            com.google.android.gms.internal.ads.zzcm r10 = r14.zze(r10, r15, r12)
            com.google.android.gms.internal.ads.zzbg r10 = r10.zzd
            goto L_0x00f6
        L_0x00f5:
            r10 = 0
        L_0x00f6:
            com.google.android.gms.internal.ads.zzbm r14 = com.google.android.gms.internal.ads.zzbm.zza
            r0.zzae = r14
            goto L_0x00fc
        L_0x00fb:
            r10 = 0
        L_0x00fc:
            if (r7 != 0) goto L_0x0108
            java.util.List r14 = r3.zzj
            java.util.List r15 = r1.zzj
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0161
        L_0x0108:
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzae
            com.google.android.gms.internal.ads.zzbk r8 = r8.zza()
            java.util.List r14 = r1.zzj
            r15 = 0
        L_0x0111:
            int r9 = r14.size()
            if (r15 >= r9) goto L_0x0133
            java.lang.Object r9 = r14.get(r15)
            com.google.android.gms.internal.ads.zzbq r9 = (com.google.android.gms.internal.ads.zzbq) r9
            r11 = 0
        L_0x011e:
            int r5 = r9.zza()
            if (r11 >= r5) goto L_0x012e
            com.google.android.gms.internal.ads.zzbp r5 = r9.zzb(r11)
            r5.zza(r8)
            int r11 = r11 + 1
            goto L_0x011e
        L_0x012e:
            int r15 = r15 + 1
            r5 = 1
            r11 = 3
            goto L_0x0111
        L_0x0133:
            com.google.android.gms.internal.ads.zzbm r5 = r8.zzv()
            r0.zzae = r5
            com.google.android.gms.internal.ads.zzcn r5 = r41.zzn()
            boolean r8 = r5.zzo()
            if (r8 == 0) goto L_0x0146
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzae
            goto L_0x0161
        L_0x0146:
            int r8 = r41.zzf()
            com.google.android.gms.internal.ads.zzcm r9 = r0.zza
            com.google.android.gms.internal.ads.zzcm r5 = r5.zze(r8, r9, r12)
            com.google.android.gms.internal.ads.zzbg r5 = r5.zzd
            com.google.android.gms.internal.ads.zzbm r8 = r0.zzae
            com.google.android.gms.internal.ads.zzbk r8 = r8.zza()
            com.google.android.gms.internal.ads.zzbm r5 = r5.zzg
            r8.zzb(r5)
            com.google.android.gms.internal.ads.zzbm r8 = r8.zzv()
        L_0x0161:
            com.google.android.gms.internal.ads.zzbm r5 = r0.zzJ
            boolean r5 = r8.equals(r5)
            r9 = 1
            r5 = r5 ^ r9
            r0.zzJ = r8
            boolean r8 = r3.zzl
            boolean r9 = r1.zzl
            if (r8 == r9) goto L_0x0173
            r8 = 1
            goto L_0x0174
        L_0x0173:
            r8 = 0
        L_0x0174:
            int r9 = r3.zze
            int r11 = r1.zze
            if (r9 == r11) goto L_0x017c
            r9 = 1
            goto L_0x017d
        L_0x017c:
            r9 = 0
        L_0x017d:
            if (r9 != 0) goto L_0x0181
            if (r8 == 0) goto L_0x0184
        L_0x0181:
            r41.zzav()
        L_0x0184:
            boolean r11 = r3.zzg
            boolean r14 = r1.zzg
            if (r11 == r14) goto L_0x018c
            r11 = 1
            goto L_0x018d
        L_0x018c:
            r11 = 0
        L_0x018d:
            if (r4 == 0) goto L_0x019c
            com.google.android.gms.internal.ads.zzdt r4 = r0.zzl
            com.google.android.gms.internal.ads.zzhn r14 = new com.google.android.gms.internal.ads.zzhn
            r15 = r43
            r14.<init>(r1, r15)
            r15 = 0
            r4.zzd(r15, r14)
        L_0x019c:
            if (r46 == 0) goto L_0x02c9
            com.google.android.gms.internal.ads.zzck r4 = new com.google.android.gms.internal.ads.zzck
            r4.<init>()
            com.google.android.gms.internal.ads.zzcn r14 = r3.zza
            boolean r14 = r14.zzo()
            if (r14 != 0) goto L_0x01dd
            com.google.android.gms.internal.ads.zzsh r14 = r3.zzb
            java.lang.Object r14 = r14.zza
            com.google.android.gms.internal.ads.zzcn r15 = r3.zza
            r15.zzn(r14, r4)
            int r15 = r4.zzd
            com.google.android.gms.internal.ads.zzcn r12 = r3.zza
            int r12 = r12.zza(r14)
            com.google.android.gms.internal.ads.zzcn r13 = r3.zza
            r43 = r12
            com.google.android.gms.internal.ads.zzcm r12 = r0.zza
            r16 = r8
            r18 = r9
            r8 = 0
            com.google.android.gms.internal.ads.zzcm r12 = r13.zze(r15, r12, r8)
            java.lang.Object r8 = r12.zzc
            com.google.android.gms.internal.ads.zzcm r9 = r0.zza
            com.google.android.gms.internal.ads.zzbg r9 = r9.zzd
            r24 = r43
            r20 = r8
            r22 = r9
            r23 = r14
            r21 = r15
            goto L_0x01eb
        L_0x01dd:
            r16 = r8
            r18 = r9
            r21 = r50
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = -1
        L_0x01eb:
            if (r2 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzsh r8 = r3.zzb
            boolean r8 = r8.zzb()
            if (r8 == 0) goto L_0x0204
            com.google.android.gms.internal.ads.zzsh r8 = r3.zzb
            int r9 = r8.zzb
            int r8 = r8.zzc
            long r8 = r4.zzg(r9, r8)
            long r12 = zzai(r3)
            goto L_0x0227
        L_0x0204:
            com.google.android.gms.internal.ads.zzsh r8 = r3.zzb
            int r8 = r8.zze
            r9 = -1
            if (r8 == r9) goto L_0x0212
            com.google.android.gms.internal.ads.zzjs r4 = r0.zzaf
            long r8 = zzai(r4)
            goto L_0x0226
        L_0x0212:
            long r8 = r4.zze
            goto L_0x0226
        L_0x0215:
            com.google.android.gms.internal.ads.zzsh r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L_0x0224
            long r8 = r3.zzr
            long r12 = zzai(r3)
            goto L_0x0227
        L_0x0224:
            long r8 = r3.zzr
        L_0x0226:
            r12 = r8
        L_0x0227:
            com.google.android.gms.internal.ads.zzcf r4 = new com.google.android.gms.internal.ads.zzcf
            long r25 = com.google.android.gms.internal.ads.zzen.zzz(r8)
            com.google.android.gms.internal.ads.zzsh r8 = r3.zzb
            long r27 = com.google.android.gms.internal.ads.zzen.zzz(r12)
            int r9 = r8.zzb
            int r8 = r8.zzc
            r19 = r4
            r29 = r9
            r30 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29, r30)
            int r8 = r41.zzf()
            com.google.android.gms.internal.ads.zzjs r9 = r0.zzaf
            com.google.android.gms.internal.ads.zzcn r9 = r9.zza
            boolean r9 = r9.zzo()
            if (r9 != 0) goto L_0x0281
            com.google.android.gms.internal.ads.zzjs r9 = r0.zzaf
            com.google.android.gms.internal.ads.zzsh r12 = r9.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzcn r9 = r9.zza
            com.google.android.gms.internal.ads.zzck r13 = r0.zzn
            r9.zzn(r12, r13)
            com.google.android.gms.internal.ads.zzjs r9 = r0.zzaf
            com.google.android.gms.internal.ads.zzcn r9 = r9.zza
            int r9 = r9.zza(r12)
            com.google.android.gms.internal.ads.zzjs r13 = r0.zzaf
            com.google.android.gms.internal.ads.zzcn r13 = r13.zza
            com.google.android.gms.internal.ads.zzcm r14 = r0.zza
            r15 = r11
            r17 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzcm r11 = r13.zze(r8, r14, r11)
            java.lang.Object r11 = r11.zzc
            com.google.android.gms.internal.ads.zzcm r12 = r0.zza
            com.google.android.gms.internal.ads.zzbg r12 = r12.zzd
            r34 = r9
            r30 = r11
            r32 = r12
            r33 = r17
            goto L_0x028a
        L_0x0281:
            r15 = r11
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = -1
        L_0x028a:
            long r35 = com.google.android.gms.internal.ads.zzen.zzz(r48)
            com.google.android.gms.internal.ads.zzcf r9 = new com.google.android.gms.internal.ads.zzcf
            com.google.android.gms.internal.ads.zzjs r11 = r0.zzaf
            com.google.android.gms.internal.ads.zzsh r11 = r11.zzb
            boolean r11 = r11.zzb()
            if (r11 == 0) goto L_0x02a7
            com.google.android.gms.internal.ads.zzjs r11 = r0.zzaf
            long r11 = zzai(r11)
            long r11 = com.google.android.gms.internal.ads.zzen.zzz(r11)
            r37 = r11
            goto L_0x02a9
        L_0x02a7:
            r37 = r35
        L_0x02a9:
            com.google.android.gms.internal.ads.zzjs r11 = r0.zzaf
            com.google.android.gms.internal.ads.zzsh r11 = r11.zzb
            int r12 = r11.zzb
            int r11 = r11.zzc
            r29 = r9
            r31 = r8
            r39 = r12
            r40 = r11
            r29.<init>(r30, r31, r32, r33, r34, r35, r37, r39, r40)
            com.google.android.gms.internal.ads.zzdt r8 = r0.zzl
            com.google.android.gms.internal.ads.zzht r11 = new com.google.android.gms.internal.ads.zzht
            r11.<init>(r2, r4, r9)
            r2 = 11
            r8.zzd(r2, r11)
            goto L_0x02ce
        L_0x02c9:
            r16 = r8
            r18 = r9
            r15 = r11
        L_0x02ce:
            if (r7 == 0) goto L_0x02db
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhu r4 = new com.google.android.gms.internal.ads.zzhu
            r4.<init>(r10, r6)
            r6 = 1
            r2.zzd(r6, r4)
        L_0x02db:
            com.google.android.gms.internal.ads.zzha r2 = r3.zzf
            com.google.android.gms.internal.ads.zzha r4 = r1.zzf
            if (r2 == r4) goto L_0x02fb
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhv r4 = new com.google.android.gms.internal.ads.zzhv
            r4.<init>(r1)
            r6 = 10
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzha r2 = r1.zzf
            if (r2 == 0) goto L_0x02fb
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhw r4 = new com.google.android.gms.internal.ads.zzhw
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L_0x02fb:
            com.google.android.gms.internal.ads.zzwa r2 = r3.zzi
            com.google.android.gms.internal.ads.zzwa r4 = r1.zzi
            if (r2 == r4) goto L_0x0313
            com.google.android.gms.internal.ads.zzvz r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzo(r4)
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhx r4 = new com.google.android.gms.internal.ads.zzhx
            r4.<init>(r1)
            r6 = 2
            r2.zzd(r6, r4)
        L_0x0313:
            if (r5 == 0) goto L_0x0323
            com.google.android.gms.internal.ads.zzbm r2 = r0.zzJ
            com.google.android.gms.internal.ads.zzdt r4 = r0.zzl
            com.google.android.gms.internal.ads.zzhy r5 = new com.google.android.gms.internal.ads.zzhy
            r5.<init>(r2)
            r2 = 14
            r4.zzd(r2, r5)
        L_0x0323:
            if (r15 == 0) goto L_0x0330
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhz r4 = new com.google.android.gms.internal.ads.zzhz
            r4.<init>(r1)
            r5 = 3
            r2.zzd(r5, r4)
        L_0x0330:
            if (r18 != 0) goto L_0x0334
            if (r16 == 0) goto L_0x033f
        L_0x0334:
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzia r4 = new com.google.android.gms.internal.ads.zzia
            r4.<init>(r1)
            r5 = -1
            r2.zzd(r5, r4)
        L_0x033f:
            if (r18 == 0) goto L_0x034c
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzib r4 = new com.google.android.gms.internal.ads.zzib
            r4.<init>(r1)
            r5 = 4
            r2.zzd(r5, r4)
        L_0x034c:
            if (r16 == 0) goto L_0x035b
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzho r4 = new com.google.android.gms.internal.ads.zzho
            r5 = r44
            r4.<init>(r1, r5)
            r5 = 5
            r2.zzd(r5, r4)
        L_0x035b:
            int r2 = r3.zzm
            int r4 = r1.zzm
            if (r2 == r4) goto L_0x036c
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhp r4 = new com.google.android.gms.internal.ads.zzhp
            r4.<init>(r1)
            r5 = 6
            r2.zzd(r5, r4)
        L_0x036c:
            boolean r2 = zzax(r3)
            boolean r4 = zzax(r42)
            if (r2 == r4) goto L_0x0381
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhq r4 = new com.google.android.gms.internal.ads.zzhq
            r4.<init>(r1)
            r5 = 7
            r2.zzd(r5, r4)
        L_0x0381:
            com.google.android.gms.internal.ads.zzby r2 = r3.zzn
            com.google.android.gms.internal.ads.zzby r4 = r1.zzn
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0397
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhr r4 = new com.google.android.gms.internal.ads.zzhr
            r4.<init>(r1)
            r5 = 12
            r2.zzd(r5, r4)
        L_0x0397:
            if (r45 == 0) goto L_0x03a1
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhs r4 = com.google.android.gms.internal.ads.zzhs.zza
            r5 = -1
            r2.zzd(r5, r4)
        L_0x03a1:
            com.google.android.gms.internal.ads.zzcc r2 = r0.zzI
            com.google.android.gms.internal.ads.zzcg r4 = r0.zzg
            com.google.android.gms.internal.ads.zzcc r5 = r0.zzc
            com.google.android.gms.internal.ads.zzcc r4 = com.google.android.gms.internal.ads.zzen.zzG(r4, r5)
            r0.zzI = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            com.google.android.gms.internal.ads.zzid r4 = new com.google.android.gms.internal.ads.zzid
            r4.<init>(r0)
            r5 = 13
            r2.zzd(r5, r4)
        L_0x03bf:
            com.google.android.gms.internal.ads.zzdt r2 = r0.zzl
            r2.zzc()
            boolean r2 = r3.zzo
            boolean r3 = r1.zzo
            if (r2 == r3) goto L_0x03e2
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x03d0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e2
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzhb r3 = (com.google.android.gms.internal.ads.zzhb) r3
            boolean r4 = r1.zzo
            r3.zza(r4)
            goto L_0x03d0
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzis.zzau(com.google.android.gms.internal.ads.zzjs, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void zzav() {
        int zzh2 = zzh();
        if (zzh2 == 2 || zzh2 == 3) {
            zzaw();
            boolean z = this.zzaf.zzo;
            zzq();
            zzq();
        }
    }

    private final void zzaw() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzI2 = zzen.zzI("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzaa) {
                if (this.zzab) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdw.zzf("ExoPlayerImpl", zzI2, illegalStateException);
                this.zzab = true;
                return;
            }
            throw new IllegalStateException(zzI2);
        }
    }

    private static boolean zzax(zzjs zzjs) {
        return zzjs.zze == 3 && zzjs.zzl && zzjs.zzm == 0;
    }

    public final zzha zzA() {
        zzaw();
        return this.zzaf.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzS(zzja zzja) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zzja.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzja.zzc) {
            this.zzE = zzja.zzd;
            this.zzF = true;
        }
        if (zzja.zze) {
            this.zzG = zzja.zzf;
        }
        if (i == 0) {
            zzcn zzcn = zzja.zza.zza;
            if (!this.zzaf.zza.zzo() && zzcn.zzo()) {
                this.zzag = -1;
                this.zzah = 0;
            }
            if (!zzcn.zzo()) {
                List zzw2 = ((zzjw) zzcn).zzw();
                zzdd.zzf(zzw2.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw2.size(); i2++) {
                    ((zzir) this.zzo.get(i2)).zzb = (zzcn) zzw2.get(i2);
                }
            }
            if (this.zzF) {
                if (zzja.zza.zzb.equals(this.zzaf.zzb) && zzja.zza.zzd == this.zzaf.zzr) {
                    z2 = false;
                }
                if (z2) {
                    if (zzcn.zzo() || zzja.zza.zzb.zzb()) {
                        j2 = zzja.zza.zzd;
                    } else {
                        zzjs zzjs = zzja.zza;
                        zzsh zzsh = zzjs.zzb;
                        j2 = zzjs.zzd;
                        zzaj(zzcn, zzsh, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzau(zzja.zza, 1, this.zzG, false, z, this.zzE, j, -1, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzT(zzja zzja) {
        this.zzj.zzg(new zzig(this, zzja));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzU(zzcd zzcd) {
        zzcd.zza(this.zzI);
    }

    public final void zzW() {
        zzaw();
        boolean zzq2 = zzq();
        int i = 2;
        int zzb2 = this.zzy.zzb(zzq2, 2);
        zzat(zzq2, zzb2, zzag(zzq2, zzb2));
        zzjs zzjs = this.zzaf;
        if (zzjs.zze == 1) {
            zzjs zzd2 = zzjs.zzd((zzha) null);
            if (true == zzd2.zza.zzo()) {
                i = 4;
            }
            zzjs zze2 = zzd2.zze(i);
            this.zzD++;
            this.zzk.zzk();
            zzau(zze2, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void zzX() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzen.zze;
        String zza = zzbh.zza();
        zzdw.zzd("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "] [" + zza + "]");
        zzaw();
        if (zzen.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdt zzdt = this.zzl;
            zzdt.zzd(10, zzhl.zza);
            zzdt.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd((Object) null);
        this.zzt.zzf(this.zzr);
        zzjs zze2 = this.zzaf.zze(1);
        this.zzaf = zze2;
        zzjs zza2 = zze2.zza(zze2.zzb);
        this.zzaf = zza2;
        zza2.zzp = zza2.zzr;
        this.zzaf.zzq = 0;
        this.zzr.zzQ();
        this.zzi.zzh();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzdc.zza;
    }

    public final void zzY(zzkp zzkp) {
        this.zzr.zzR(zzkp);
    }

    public final void zzZ(zzsj zzsj) {
        zzaw();
        List singletonList = Collections.singletonList(zzsj);
        zzaw();
        zzaw();
        zzaf();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzjp zzjp = new zzjp((zzsj) singletonList.get(i2), this.zzp);
            arrayList.add(zzjp);
            this.zzo.add(i2, new zzir(zzjp.zzb, zzjp.zza.zzB()));
        }
        zzub zzg2 = this.zzaj.zzg(0, arrayList.size());
        this.zzaj = zzg2;
        zzjw zzjw = new zzjw(this.zzo, zzg2, (byte[]) null);
        if (zzjw.zzo() || zzjw.zzc() >= 0) {
            int zzg3 = zzjw.zzg(false);
            zzjs zzam = zzam(this.zzaf, zzjw, zzak(zzjw, zzg3, -9223372036854775807L));
            int i3 = zzam.zze;
            if (!(zzg3 == -1 || i3 == 1)) {
                i3 = (zzjw.zzo() || zzg3 >= zzjw.zzc()) ? 4 : 2;
            }
            zzjs zze2 = zzam.zze(i3);
            this.zzk.zzq(arrayList, zzg3, zzen.zzv(-9223372036854775807L), this.zzaj);
            zzau(zze2, 0, 1, false, !this.zzaf.zzb.zza.equals(zze2.zzb.zza) && !this.zzaf.zza.zzo(), 4, zzah(zze2), -1, false);
            return;
        }
        throw new zzag(zzjw, -1, -9223372036854775807L);
    }

    public final void zzaa(boolean z) {
        zzaw();
        int zzb2 = this.zzy.zzb(z, zzh());
        zzat(z, zzb2, zzag(z, zzb2));
    }

    public final void zzab(Surface surface) {
        zzaw();
        zzar(surface);
        int i = surface == null ? 0 : -1;
        zzao(i, i);
    }

    public final void zzac(float f2) {
        zzaw();
        float zza = zzen.zza(f2, 0.0f, 1.0f);
        if (this.zzX != zza) {
            this.zzX = zza;
            zzaq();
            zzdt zzdt = this.zzl;
            zzdt.zzd(22, new zzic(zza));
            zzdt.zzc();
        }
    }

    public final void zzad() {
        zzaw();
        zzaw();
        this.zzy.zzb(zzq(), 1);
        zzas(false, (zzha) null);
        this.zzZ = new zzdc(zzgau.zzo(), this.zzaf.zzr);
    }

    public final int zzd() {
        zzaw();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    public final int zze() {
        zzaw();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    public final int zzf() {
        zzaw();
        int zzaf2 = zzaf();
        if (zzaf2 == -1) {
            return 0;
        }
        return zzaf2;
    }

    public final int zzg() {
        zzaw();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjs zzjs = this.zzaf;
        return zzjs.zza.zza(zzjs.zzb.zza);
    }

    public final int zzh() {
        zzaw();
        return this.zzaf.zze;
    }

    public final int zzi() {
        zzaw();
        return this.zzaf.zzm;
    }

    public final int zzj() {
        zzaw();
        return 0;
    }

    public final long zzk() {
        zzaw();
        if (!zzs()) {
            return zzl();
        }
        zzjs zzjs = this.zzaf;
        zzjs.zza.zzn(zzjs.zzb.zza, this.zzn);
        zzjs zzjs2 = this.zzaf;
        if (zzjs2.zzc != -9223372036854775807L) {
            return zzen.zzz(0) + zzen.zzz(this.zzaf.zzc);
        }
        long j = zzjs2.zza.zze(zzf(), this.zza, 0).zzm;
        return zzen.zzz(0);
    }

    public final long zzl() {
        zzaw();
        return zzen.zzz(zzah(this.zzaf));
    }

    public final long zzm() {
        zzaw();
        return zzen.zzz(this.zzaf.zzq);
    }

    public final zzcn zzn() {
        zzaw();
        return this.zzaf.zza;
    }

    public final zzcy zzo() {
        zzaw();
        return this.zzaf.zzi.zzd;
    }

    public final void zzp(int i, long j) {
        int i2 = i;
        long j2 = j;
        zzaw();
        this.zzr.zzx();
        zzcn zzcn = this.zzaf.zza;
        if (i2 < 0 || (!zzcn.zzo() && i2 >= zzcn.zzc())) {
            throw new zzag(zzcn, i, j2);
        }
        int i3 = 1;
        this.zzD++;
        if (zzs()) {
            zzdw.zze("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzja zzja = new zzja(this.zzaf);
            zzja.zza(1);
            this.zzai.zza.zzT(zzja);
            return;
        }
        if (zzh() != 1) {
            i3 = 2;
        }
        int zzf2 = zzf();
        zzjs zzam = zzam(this.zzaf.zze(i3), zzcn, zzak(zzcn, i, j2));
        this.zzk.zzl(zzcn, i, zzen.zzv(j));
        zzau(zzam, 0, 1, true, true, 1, zzah(zzam), zzf2, false);
    }

    public final boolean zzq() {
        zzaw();
        return this.zzaf.zzl;
    }

    public final boolean zzr() {
        zzaw();
        return false;
    }

    public final boolean zzs() {
        zzaw();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzaw();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzaw();
        if (zzs()) {
            zzjs zzjs = this.zzaf;
            if (zzjs.zzk.equals(zzjs.zzb)) {
                return zzen.zzz(this.zzaf.zzp);
            }
            return zzw();
        }
        zzaw();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjs zzjs2 = this.zzaf;
        long j = 0;
        if (zzjs2.zzk.zzd != zzjs2.zzb.zzd) {
            return zzen.zzz(zzjs2.zza.zze(zzf(), this.zza, 0).zzn);
        }
        long j2 = zzjs2.zzp;
        if (this.zzaf.zzk.zzb()) {
            zzjs zzjs3 = this.zzaf;
            zzjs3.zza.zzn(zzjs3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j = j2;
        }
        zzjs zzjs4 = this.zzaf;
        zzaj(zzjs4.zza, zzjs4.zzk, j);
        return zzen.zzz(j);
    }

    public final long zzw() {
        zzaw();
        if (!zzs()) {
            zzcn zzn2 = zzn();
            if (zzn2.zzo()) {
                return -9223372036854775807L;
            }
            return zzen.zzz(zzn2.zze(zzf(), this.zza, 0).zzn);
        }
        zzjs zzjs = this.zzaf;
        zzsh zzsh = zzjs.zzb;
        zzjs.zza.zzn(zzsh.zza, this.zzn);
        return zzen.zzz(this.zzn.zzg(zzsh.zzb, zzsh.zzc));
    }

    public final void zzR(zzkp zzkp) {
        zzkm zzkm = this.zzr;
        if (zzkp != null) {
            zzkm.zzw(zzkp);
            return;
        }
        throw null;
    }
}
