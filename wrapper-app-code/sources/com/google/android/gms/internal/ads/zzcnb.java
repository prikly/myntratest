package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcnb extends zzcjo implements zzfz, zzkp {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcmm zze;
    private final zzvr zzf;
    private final zzcjw zzg;
    private final WeakReference zzh;
    private final zztn zzi;
    private zzkd zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzcjn zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final Object zzs = new Object();
    private final ArrayList zzt;
    private volatile zzcmo zzu;
    private final Set zzv = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e4, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzbF)).booleanValue() == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ea, code lost:
        if (r4.zzg.zzj == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ec, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ed, code lost:
        r7 = r4.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f1, code lost:
        if (r7.zzo == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        r7 = new com.google.android.gms.internal.ads.zzcms(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fb, code lost:
        if (r7.zzi <= 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fd, code lost:
        r7 = new com.google.android.gms.internal.ads.zzcmt(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0103, code lost:
        r7 = new com.google.android.gms.internal.ads.zzcmu(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010c, code lost:
        if (r4.zzg.zzj == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010e, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcmv(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0115, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0116, code lost:
        r5 = r4.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        if (r5 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        if (r5.limit() <= 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0120, code lost:
        r5 = new byte[r4.zzk.limit()];
        r4.zzk.get(r5);
        r6 = new com.google.android.gms.internal.ads.zzcmw(r6, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcnb(android.content.Context r5, com.google.android.gms.internal.ads.zzcjw r6, com.google.android.gms.internal.ads.zzcjx r7) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.zzs = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.zzv = r0
            r4.zzd = r5
            r4.zzg = r6
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r7)
            r4.zzh = r6
            com.google.android.gms.internal.ads.zzcmm r6 = new com.google.android.gms.internal.ads.zzcmm
            r6.<init>()
            r4.zze = r6
            com.google.android.gms.internal.ads.zzvr r6 = new com.google.android.gms.internal.ads.zzvr
            android.content.Context r0 = r4.zzd
            r6.<init>(r0)
            r4.zzf = r6
            boolean r6 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r6 == 0) goto L_0x003f
            java.lang.String r6 = r4.toString()
            java.lang.String r0 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r6 = r0.concat(r6)
            com.google.android.gms.ads.internal.util.zze.zza(r6)
        L_0x003f:
            java.util.concurrent.atomic.AtomicInteger r6 = zza
            r6.incrementAndGet()
            com.google.android.gms.internal.ads.zzkc r6 = new com.google.android.gms.internal.ads.zzkc
            android.content.Context r0 = r4.zzd
            com.google.android.gms.internal.ads.zzcmx r1 = new com.google.android.gms.internal.ads.zzcmx
            r1.<init>(r4)
            r2 = 0
            r6.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzvr r0 = r4.zzf
            r6.zzb(r0)
            com.google.android.gms.internal.ads.zzcmm r0 = r4.zze
            r6.zza(r0)
            com.google.android.gms.internal.ads.zzkd r6 = r6.zzc()
            r4.zzj = r6
            r6.zzx(r4)
            r6 = 0
            r4.zzn = r6
            r0 = 0
            r4.zzp = r0
            r4.zzo = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.zzt = r0
            r4.zzu = r2
            if (r7 == 0) goto L_0x0083
            java.lang.String r0 = r7.zzt()
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r7.zzt()
            goto L_0x0085
        L_0x0083:
            java.lang.String r0 = ""
        L_0x0085:
            r4.zzq = r0
            if (r7 == 0) goto L_0x008e
            int r0 = r7.zzh()
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            r4.zzr = r0
            com.google.android.gms.internal.ads.zztn r0 = new com.google.android.gms.internal.ads.zztn
            com.google.android.gms.ads.internal.util.zzs r1 = com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.zzchu r7 = r7.zzp()
            java.lang.String r7 = r7.zza
            java.lang.String r5 = r1.zzc(r5, r7)
            boolean r7 = r4.zzl
            if (r7 == 0) goto L_0x00c1
            java.nio.ByteBuffer r7 = r4.zzk
            int r7 = r7.limit()
            if (r7 <= 0) goto L_0x00c1
            java.nio.ByteBuffer r5 = r4.zzk
            int r5 = r5.limit()
            byte[] r5 = new byte[r5]
            java.nio.ByteBuffer r6 = r4.zzk
            r6.get(r5)
            com.google.android.gms.internal.ads.zzcmq r6 = new com.google.android.gms.internal.ads.zzcmq
            r6.<init>(r5)
            goto L_0x0133
        L_0x00c1:
            com.google.android.gms.internal.ads.zzbjb r7 = com.google.android.gms.internal.ads.zzbjj.zzbO
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r7 = r1.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1 = 1
            if (r7 == 0) goto L_0x00e6
            com.google.android.gms.internal.ads.zzbjb r7 = com.google.android.gms.internal.ads.zzbjj.zzbF
            com.google.android.gms.internal.ads.zzbjh r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r7 = r3.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x00ec
        L_0x00e6:
            com.google.android.gms.internal.ads.zzcjw r7 = r4.zzg
            boolean r7 = r7.zzj
            if (r7 != 0) goto L_0x00ed
        L_0x00ec:
            r6 = 1
        L_0x00ed:
            com.google.android.gms.internal.ads.zzcjw r7 = r4.zzg
            boolean r1 = r7.zzo
            if (r1 == 0) goto L_0x00f9
            com.google.android.gms.internal.ads.zzcms r7 = new com.google.android.gms.internal.ads.zzcms
            r7.<init>(r4, r5, r6)
            goto L_0x0108
        L_0x00f9:
            int r7 = r7.zzi
            if (r7 <= 0) goto L_0x0103
            com.google.android.gms.internal.ads.zzcmt r7 = new com.google.android.gms.internal.ads.zzcmt
            r7.<init>(r4, r5, r6)
            goto L_0x0108
        L_0x0103:
            com.google.android.gms.internal.ads.zzcmu r7 = new com.google.android.gms.internal.ads.zzcmu
            r7.<init>(r4, r5, r6)
        L_0x0108:
            com.google.android.gms.internal.ads.zzcjw r5 = r4.zzg
            boolean r5 = r5.zzj
            if (r5 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.zzcmv r5 = new com.google.android.gms.internal.ads.zzcmv
            r5.<init>(r4, r7)
            r6 = r5
            goto L_0x0116
        L_0x0115:
            r6 = r7
        L_0x0116:
            java.nio.ByteBuffer r5 = r4.zzk
            if (r5 == 0) goto L_0x0133
            int r5 = r5.limit()
            if (r5 <= 0) goto L_0x0133
            java.nio.ByteBuffer r5 = r4.zzk
            int r5 = r5.limit()
            byte[] r5 = new byte[r5]
            java.nio.ByteBuffer r7 = r4.zzk
            r7.get(r5)
            com.google.android.gms.internal.ads.zzcmw r7 = new com.google.android.gms.internal.ads.zzcmw
            r7.<init>(r6, r5)
            r6 = r7
        L_0x0133:
            com.google.android.gms.internal.ads.zzbjb r5 = com.google.android.gms.internal.ads.zzbjj.zzm
            com.google.android.gms.internal.ads.zzbjh r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r5 = r7.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.zzcmz r5 = com.google.android.gms.internal.ads.zzcmz.zza
            goto L_0x014a
        L_0x0148:
            com.google.android.gms.internal.ads.zzcna r5 = com.google.android.gms.internal.ads.zzcna.zza
        L_0x014a:
            com.google.android.gms.internal.ads.zztm r7 = new com.google.android.gms.internal.ads.zztm
            r7.<init>(r5)
            r0.<init>(r6, r7, r2)
            r4.zzi = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcnb.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcjw, com.google.android.gms.internal.ads.zzcjx):void");
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zza.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzZ()) {
            return (long) this.zzn;
        }
        return 0;
    }

    public final long zzB() {
        if (zzZ()) {
            return this.zzu.zzl();
        }
        synchronized (this.zzs) {
            while (!this.zzt.isEmpty()) {
                long j = this.zzp;
                Map zze2 = ((zzfu) this.zzt.remove(0)).zze();
                long j2 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfxl.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzp = j + j2;
            }
        }
        return this.zzp;
    }

    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzE() {
        zzkd zzkd = this.zzj;
        if (zzkd != null) {
            zzkd.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    public final void zzF(long j) {
        zzkd zzkd = this.zzj;
        zzkd.zzp(zzkd.zzf(), j);
    }

    public final void zzG(int i) {
        this.zze.zzk(i);
    }

    public final void zzH(int i) {
        this.zze.zzl(i);
    }

    public final void zzI(zzcjn zzcjn) {
        this.zzm = zzcjn;
    }

    public final void zzJ(int i) {
        this.zze.zzm(i);
    }

    public final void zzK(int i) {
        this.zze.zzn(i);
    }

    public final void zzL(boolean z) {
        this.zzj.zzC(z);
    }

    public final void zzM(boolean z) {
        if (this.zzj != null) {
            int i = 0;
            while (true) {
                this.zzj.zzt();
                if (i < 2) {
                    zzvr zzvr = this.zzf;
                    zzvd zzc2 = zzvr.zzc().zzc();
                    zzc2.zzo(i, !z);
                    zzvr.zzj(zzc2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzv) {
            zzcml zzcml = (zzcml) weakReference.get();
            if (zzcml != null) {
                zzcml.zzm(i);
            }
        }
    }

    public final void zzO(Surface surface, boolean z) {
        zzkd zzkd = this.zzj;
        if (zzkd != null) {
            zzkd.zzD(surface);
        }
    }

    public final void zzP(float f2, boolean z) {
        zzkd zzkd = this.zzj;
        if (zzkd != null) {
            zzkd.zzE(f2);
        }
    }

    public final void zzQ() {
        this.zzj.zzF();
    }

    public final boolean zzR() {
        return this.zzj != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzex zzS(String str, boolean z) {
        zzcnb zzcnb = true != z ? null : this;
        zzcjw zzcjw = this.zzg;
        return new zzcne(str, zzcnb, zzcjw.zzd, zzcjw.zzf, zzcjw.zzp, zzcjw.zzq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzex zzT(String str, boolean z) {
        zzcnb zzcnb = true != z ? null : this;
        zzcjw zzcjw = this.zzg;
        zzcml zzcml = new zzcml(str, zzcnb, zzcjw.zzd, zzcjw.zzf, zzcjw.zzi);
        this.zzv.add(new WeakReference(zzcml));
        return zzcml;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzex zzU(String str, boolean z) {
        zzff zzff = new zzff();
        zzff.zzf(str);
        zzff.zze(true != z ? null : this);
        zzff.zzc(this.zzg.zzd);
        zzff.zzd(this.zzg.zzf);
        zzff.zzb(true);
        return zzff.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzex zzV(zzew zzew) {
        return new zzcmo(this.zzd, zzew.zza(), this.zzq, this.zzr, this, new zzcmr(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final zzsj zzW(Uri uri) {
        zzaj zzaj = new zzaj();
        zzaj.zzb(uri);
        zzbg zzc2 = zzaj.zzc();
        zztn zztn = this.zzi;
        zztn.zza(this.zzg.zzg);
        return zztn.zzb(zzc2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(boolean z, long j) {
        zzcjn zzcjn = this.zzm;
        if (zzcjn != null) {
            zzcjn.zzi(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzjy[] zzY(Handler handler, zzye zzye, zznq zznq, zzuj zzuj, zzrh zzrh) {
        Context context = this.zzd;
        zzqr zzqr = zzqr.zzb;
        zznb zznb = zznb.zza;
        zzne[] zzneArr = new zzne[0];
        zzog zzog = new zzog();
        zznb zznb2 = zznb.zza;
        if (zznb == null) {
            if (zznb2 != null) {
                zznb = zznb2;
            } else {
                throw new NullPointerException("Both parameters are null");
            }
        }
        zzog.zzb(zznb);
        zzog.zzc(zzneArr);
        return new zzjy[]{new zzoy(context, zzqi.zza, zzqr, false, handler, zznq, zzog.zzd()), new zzxh(this.zzd, zzqi.zza, zzqr.zzb, 0, false, handler, zzye, -1, 30.0f)};
    }

    public final void zza(zzex zzex, zzfc zzfc, boolean z, int i) {
        this.zzn += i;
    }

    public final void zzb(zzex zzex, zzfc zzfc, boolean z) {
    }

    public final void zzc(zzex zzex, zzfc zzfc, boolean z) {
    }

    public final void zzd(zzex zzex, zzfc zzfc, boolean z) {
        if (zzex instanceof zzfu) {
            synchronized (this.zzs) {
                this.zzt.add((zzfu) zzex);
            }
        } else if (zzex instanceof zzcmo) {
            this.zzu = (zzcmo) zzex;
            zzcjx zzcjx = (zzcjx) this.zzh.get();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && zzcjx != null && this.zzu.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                zzs.zza.post(new zzcmy(zzcjx, hashMap));
            }
        }
    }

    public final void zze(zzkn zzkn, zzaf zzaf, zzgt zzgt) {
        zzcjx zzcjx = (zzcjx) this.zzh.get();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && zzcjx != null && zzaf != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzaf.zzl);
            hashMap.put("audioSampleMime", zzaf.zzm);
            hashMap.put("audioCodec", zzaf.zzj);
            zzcjx.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzkn zzkn, int i, long j, long j2) {
    }

    public final /* synthetic */ void zzg(zzkn zzkn, zzsd zzsd) {
    }

    public final void zzh(zzkn zzkn, int i, long j) {
        this.zzo += i;
    }

    public final /* synthetic */ void zzi(zzcg zzcg, zzko zzko) {
    }

    public final void zzj(zzkn zzkn, zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
        zzcjn zzcjn = this.zzm;
        if (zzcjn == null) {
            return;
        }
        if (this.zzg.zzl) {
            zzcjn.zzl("onLoadException", iOException);
        } else {
            zzcjn.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzkn zzkn, int i) {
        zzcjn zzcjn = this.zzm;
        if (zzcjn != null) {
            zzcjn.zzm(i);
        }
    }

    public final void zzl(zzkn zzkn, zzbw zzbw) {
        zzcjn zzcjn = this.zzm;
        if (zzcjn != null) {
            zzcjn.zzk("onPlayerError", zzbw);
        }
    }

    public final /* synthetic */ void zzm(zzkn zzkn, zzcf zzcf, zzcf zzcf2, int i) {
    }

    public final void zzn(zzkn zzkn, Object obj, long j) {
        zzcjn zzcjn = this.zzm;
        if (zzcjn != null) {
            zzcjn.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzkn zzkn, zzgs zzgs) {
    }

    public final void zzp(zzkn zzkn, zzaf zzaf, zzgt zzgt) {
        zzcjx zzcjx = (zzcjx) this.zzh.get();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && zzcjx != null && zzaf != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzaf.zzt));
            hashMap.put("bitRate", String.valueOf(zzaf.zzi));
            int i = zzaf.zzr;
            int i2 = zzaf.zzs;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzaf.zzl);
            hashMap.put("videoSampleMime", zzaf.zzm);
            hashMap.put("videoCodec", zzaf.zzj);
            zzcjx.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzkn zzkn, zzda zzda) {
        zzcjn zzcjn = this.zzm;
        if (zzcjn != null) {
            zzcjn.zzC(zzda.zzc, zzda.zzd);
        }
    }

    public final int zzr() {
        return this.zzo;
    }

    public final int zzt() {
        return this.zzj.zzh();
    }

    public final long zzv() {
        return this.zzj.zzu();
    }

    public final long zzw() {
        return (long) this.zzn;
    }

    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min((long) this.zzn, this.zzu.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzj.zzl();
    }

    public final long zzz() {
        return this.zzj.zzv();
    }

    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsj zzsj;
        if (this.zzj != null) {
            this.zzk = byteBuffer;
            this.zzl = z;
            int length = uriArr.length;
            if (length == 1) {
                zzsj = zzW(uriArr[0]);
            } else {
                zzsj[] zzsjArr = new zzsj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzsjArr[i] = zzW(uriArr[i]);
                }
                zzsj = new zzsz(false, false, zzsjArr);
            }
            this.zzj.zzB(zzsj);
            this.zzj.zzy();
            zzb.incrementAndGet();
        }
    }
}
