package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
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
public final class zzclf extends zzcjo implements zzasq, zzaua, zzayg, zzbai, zzbbs {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcku zze;
    private final zzati zzf;
    private final zzati zzg;
    private final zzazk zzh;
    private final zzcjw zzi;
    private zzast zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzcjn zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final Object zzt = new Object();
    private final ArrayList zzu;
    private volatile zzckt zzv;
    private final Set zzw = new HashSet();

    public zzclf(Context context, zzcjw zzcjw, zzcjx zzcjx) {
        this.zzd = context;
        this.zzi = zzcjw;
        this.zzm = new WeakReference(zzcjx);
        this.zze = new zzcku();
        this.zzf = new zzbbh(this.zzd, zzaxd.zza, 0, zzs.zza, this, -1);
        this.zzg = new zzaup(zzaxd.zza, (zzavd) null, true, zzs.zza, this);
        this.zzh = new zzazg((zzazl) null);
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        int i = 0;
        zzast zza = zzasu.zza(new zzati[]{this.zzg, this.zzf}, this.zzh, this.zze);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzcjx == null || zzcjx.zzt() == null) ? "" : zzcjx.zzt();
        this.zzs = zzcjx != null ? zzcjx.zzh() : i;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzcjx != null && zzcjx.zzg() > 0) {
            this.zzj.zzp(zzcjx.zzg());
        }
        if (zzcjx != null && zzcjx.zzf() > 0) {
            this.zzj.zzo(zzcjx.zzf());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) zzba.zzc().zzb(zzbjj.zzq)).intValue());
        }
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzk();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzY()) {
            return (long) this.zzo;
        }
        return 0;
    }

    public final long zzB() {
        if (zzY()) {
            return this.zzv.zzf();
        }
        synchronized (this.zzt) {
            while (!this.zzu.isEmpty()) {
                long j = this.zzq;
                Map zze2 = ((zzbac) this.zzu.remove(0)).zze();
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
                this.zzq = j + j2;
            }
        }
        return this.zzq;
    }

    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzE() {
        zzast zzast = this.zzj;
        if (zzast != null) {
            zzast.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    public final void zzF(long j) {
        this.zzj.zzm(j);
    }

    public final void zzG(int i) {
        this.zze.zzf(i);
    }

    public final void zzH(int i) {
        this.zze.zzg(i);
    }

    public final void zzI(zzcjn zzcjn) {
        this.zzn = zzcjn;
    }

    public final void zzJ(int i) {
        this.zze.zzh(i);
    }

    public final void zzK(int i) {
        this.zze.zzi(i);
    }

    public final void zzL(boolean z) {
        this.zzj.zzq(z);
    }

    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zze(i, !z);
            }
        }
    }

    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzw) {
            zzckr zzckr = (zzckr) weakReference.get();
            if (zzckr != null) {
                zzckr.zzh(i);
            }
        }
    }

    public final void zzO(Surface surface, boolean z) {
        zzast zzast = this.zzj;
        if (zzast != null) {
            zzass zzass = new zzass(this.zzf, 1, surface);
            if (z) {
                zzast.zzf(zzass);
                return;
            }
            zzast.zzn(zzass);
        }
    }

    public final void zzP(float f2, boolean z) {
        if (this.zzj != null) {
            zzass zzass = new zzass(this.zzg, 2, Float.valueOf(f2));
            this.zzj.zzn(zzass);
        }
    }

    public final void zzQ() {
        this.zzj.zzr();
    }

    public final boolean zzR() {
        return this.zzj != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzazt zzS(String str, boolean z) {
        zzclf zzclf = true != z ? null : this;
        zzcjw zzcjw = this.zzi;
        zzckr zzckr = new zzckr(str, zzclf, zzcjw.zzd, zzcjw.zzf, zzcjw.zzi);
        this.zzw.add(new WeakReference(zzckr));
        return zzckr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzazt zzT(String str, boolean z) {
        zzclf zzclf = true != z ? null : this;
        zzcjw zzcjw = this.zzi;
        return new zzazx(str, (zzbat) null, zzclf, zzcjw.zzd, zzcjw.zzf, true, (zzbab) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzazt zzU(zzazs zzazs) {
        return new zzckt(this.zzd, zzazs.zza(), this.zzr, this.zzs, this, new zzclb(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(boolean z, long j) {
        zzcjn zzcjn = this.zzn;
        if (zzcjn != null) {
            zzcjn.zzi(z, j);
        }
    }

    public final void zzW(zzazt zzazt, int i) {
        this.zzo += i;
    }

    /* renamed from: zzX */
    public final void zzk(zzazt zzazt, zzazv zzazv) {
        if (zzazt instanceof zzbac) {
            synchronized (this.zzt) {
                this.zzu.add((zzbac) zzazt);
            }
        } else if (zzazt instanceof zzckt) {
            this.zzv = (zzckt) zzazt;
            zzcjx zzcjx = (zzcjx) this.zzm.get();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && zzcjx != null && this.zzv.zzh()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                zzs.zza.post(new zzclc(zzcjx, hashMap));
            }
        }
    }

    public final void zza(boolean z) {
    }

    public final void zzb(zzath zzath) {
    }

    public final void zzc(zzasp zzasp) {
        zzcjn zzcjn = this.zzn;
        if (zzcjn != null) {
            zzcjn.zzk("onPlayerError", zzasp);
        }
    }

    public final void zzd(boolean z, int i) {
        zzcjn zzcjn = this.zzn;
        if (zzcjn != null) {
            zzcjn.zzm(i);
        }
    }

    public final void zze() {
    }

    public final void zzf(zzato zzato, Object obj) {
    }

    public final void zzg(zzaza zzaza, zzazm zzazm) {
    }

    public final void zzh(zzatd zzatd) {
        zzcjx zzcjx = (zzcjx) this.zzm.get();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && zzcjx != null && zzatd != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzatd.zze);
            hashMap.put("audioSampleMime", zzatd.zzf);
            hashMap.put("audioCodec", zzatd.zzc);
            zzcjx.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzi(IOException iOException) {
        zzcjn zzcjn = this.zzn;
        if (zzcjn == null) {
            return;
        }
        if (this.zzi.zzl) {
            zzcjn.zzl("onLoadException", iOException);
        } else {
            zzcjn.zzk("onLoadError", iOException);
        }
    }

    public final /* synthetic */ void zzj(Object obj, int i) {
        this.zzo += i;
    }

    public final void zzl(int i, long j) {
        this.zzp += i;
    }

    public final void zzm(Surface surface) {
        zzcjn zzcjn = this.zzn;
        if (zzcjn != null) {
            zzcjn.zzv();
        }
    }

    public final void zzn(zzatd zzatd) {
        zzcjx zzcjx = (zzcjx) this.zzm.get();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && zzcjx != null && zzatd != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzatd.zzl));
            hashMap.put("bitRate", String.valueOf(zzatd.zzb));
            int i = zzatd.zzj;
            int i2 = zzatd.zzk;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzatd.zze);
            hashMap.put("videoSampleMime", zzatd.zzf);
            hashMap.put("videoCodec", zzatd.zzc);
            zzcjx.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzo(int i, int i2, int i3, float f2) {
        zzcjn zzcjn = this.zzn;
        if (zzcjn != null) {
            zzcjn.zzC(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzbF)).booleanValue() == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzayl zzp(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzayh r9 = new com.google.android.gms.internal.ads.zzayh
            boolean r0 = r10.zzl
            if (r0 == 0) goto L_0x0023
            java.nio.ByteBuffer r0 = r10.zzk
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0023
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.zzk
            r0.get(r12)
            com.google.android.gms.internal.ads.zzckv r0 = new com.google.android.gms.internal.ads.zzckv
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0094
        L_0x0023:
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzbO
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzbF
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0050
        L_0x0048:
            com.google.android.gms.internal.ads.zzcjw r0 = r10.zzi
            boolean r0 = r0.zzj
            if (r0 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            com.google.android.gms.internal.ads.zzcjw r0 = r10.zzi
            boolean r2 = r0.zzo
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzckw r0 = new com.google.android.gms.internal.ads.zzckw
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x005c:
            int r0 = r0.zzi
            if (r0 <= 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzckx r0 = new com.google.android.gms.internal.ads.zzckx
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x0066:
            com.google.android.gms.internal.ads.zzcky r0 = new com.google.android.gms.internal.ads.zzcky
            r0.<init>(r10, r12, r1)
        L_0x006b:
            com.google.android.gms.internal.ads.zzcjw r12 = r10.zzi
            boolean r12 = r12.zzj
            if (r12 == 0) goto L_0x0077
            com.google.android.gms.internal.ads.zzckz r12 = new com.google.android.gms.internal.ads.zzckz
            r12.<init>(r10, r0)
            r0 = r12
        L_0x0077:
            java.nio.ByteBuffer r12 = r10.zzk
            if (r12 == 0) goto L_0x0020
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0020
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.zzk
            r1.get(r12)
            com.google.android.gms.internal.ads.zzcla r1 = new com.google.android.gms.internal.ads.zzcla
            r1.<init>(r0, r12)
            r2 = r1
        L_0x0094:
            com.google.android.gms.internal.ads.zzbjb r12 = com.google.android.gms.internal.ads.zzbjj.zzm
            com.google.android.gms.internal.ads.zzbjh r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzcld r12 = com.google.android.gms.internal.ads.zzcld.zza
            goto L_0x00ab
        L_0x00a9:
            com.google.android.gms.internal.ads.zzcle r12 = com.google.android.gms.internal.ads.zzcle.zza
        L_0x00ab:
            r3 = r12
            com.google.android.gms.internal.ads.zzcjw r12 = r10.zzi
            int r4 = r12.zzk
            com.google.android.gms.internal.ads.zzfvb r5 = com.google.android.gms.ads.internal.util.zzs.zza
            r7 = 0
            com.google.android.gms.internal.ads.zzcjw r12 = r10.zzi
            int r8 = r12.zzg
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclf.zzp(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzayl");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzazt zzq(String str, boolean z) {
        zzclf zzclf = true != z ? null : this;
        zzcjw zzcjw = this.zzi;
        return new zzclj(str, zzclf, zzcjw.zzd, zzcjw.zzf, zzcjw.zzp, zzcjw.zzq);
    }

    public final int zzr() {
        return this.zzp;
    }

    public final int zzt() {
        return this.zzj.zza();
    }

    public final long zzv() {
        return this.zzj.zzb();
    }

    public final long zzw() {
        return (long) this.zzo;
    }

    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min((long) this.zzo, this.zzv.zze());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzj.zzc();
    }

    public final long zzz() {
        return this.zzj.zzd();
    }

    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzayl zzayl;
        if (this.zzj != null) {
            this.zzk = byteBuffer;
            this.zzl = z;
            int length = uriArr.length;
            if (length == 1) {
                zzayl = zzp(uriArr[0], str);
            } else {
                zzayl[] zzaylArr = new zzayl[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzaylArr[i] = zzp(uriArr[i], str);
                }
                zzayl = new zzayp(zzaylArr);
            }
            this.zzj.zzj(zzayl);
            zzb.incrementAndGet();
        }
    }
}
