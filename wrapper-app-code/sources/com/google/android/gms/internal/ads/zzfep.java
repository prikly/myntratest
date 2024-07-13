package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfep extends zzbt implements zzo, zzbdk {
    protected zzcye zza;
    private final zzcpj zzb;
    private final Context zzc;
    private AtomicBoolean zzd = new AtomicBoolean();
    private final String zze;
    private final zzfej zzf;
    /* access modifiers changed from: private */
    public final zzfeh zzg;
    private final zzchu zzh;
    private long zzi = -1;
    private zzcxe zzj;

    public zzfep(zzcpj zzcpj, Context context, String str, zzfej zzfej, zzfeh zzfeh, zzchu zzchu) {
        this.zzb = zzcpj;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfej;
        this.zzg = zzfeh;
        this.zzh = zzchu;
        zzfeh.zzo(this);
    }

    private final synchronized void zzp(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcxe zzcxe = this.zzj;
            if (zzcxe != null) {
                zzt.zzb().zze(zzcxe);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzi != -1) {
                    j = zzt.zzB().elapsedRealtime() - this.zzi;
                }
                this.zza.zze(j, i);
            }
            zzx();
        }
    }

    public final synchronized void zzA() {
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzC(zzbe zzbe) {
    }

    public final void zzD(zzbh zzbh) {
    }

    public final void zzE(zzby zzby) {
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    public final void zzG(zzcb zzcb) {
    }

    public final void zzH(zzbdt zzbdt) {
        this.zzg.zzs(zzbdt);
    }

    public final void zzI(zzw zzw) {
        this.zzf.zzl(zzw);
    }

    public final void zzJ(zzci zzci) {
    }

    public final void zzK(zzdu zzdu) {
    }

    public final void zzL(boolean z) {
    }

    public final void zzM(zzbzz zzbzz) {
    }

    public final synchronized void zzN(boolean z) {
    }

    public final synchronized void zzO(zzbke zzbke) {
    }

    public final void zzP(zzdg zzdg) {
    }

    public final void zzQ(zzcac zzcac, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzccx zzccx) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzfl zzfl) {
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final synchronized void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final void zza() {
        zzp(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbkl r0 = com.google.android.gms.internal.ads.zzbkx.zzd     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzjn     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzchu r2 = r5.zzh     // Catch:{ all -> 0x0087 }
            int r2 = r2.zzc     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbjb r3 = com.google.android.gms.internal.ads.zzbjj.zzjo     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbjh r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0087 }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0087 }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r5.zzc     // Catch:{ all -> 0x0087 }
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.zze.zzg(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzfeh r6 = r5.zzg     // Catch:{ all -> 0x0087 }
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfkg.zzd(r0, r2, r2)     // Catch:{ all -> 0x0087 }
            r6.zza(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            boolean r0 = r5.zzY()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            monitor-exit(r5)
            return r1
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            r5.zzd = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzfen r0 = new com.google.android.gms.internal.ads.zzfen     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzfej r1 = r5.zzf     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.zze     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzfeo r3 = new com.google.android.gms.internal.ads.zzfeo     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfep.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    public final synchronized void zzab(zzcf zzcf) {
    }

    public final synchronized void zzb() {
        if (this.zza != null) {
            this.zzi = zzt.zzB().elapsedRealtime();
            int zza2 = this.zza.zza();
            if (zza2 > 0) {
                zzcxe zzcxe = new zzcxe(this.zzb.zzC(), zzt.zzB());
                this.zzj = zzcxe;
                zzcxe.zzd(zza2, new zzfem(this));
            }
        }
    }

    public final void zzbE() {
    }

    public final void zzbM() {
    }

    public final void zzbs() {
    }

    public final Bundle zzd() {
        return new Bundle();
    }

    public final synchronized void zze() {
        zzcye zzcye = this.zza;
        if (zzcye != null) {
            zzcye.zze(zzt.zzB().elapsedRealtime() - this.zzi, 1);
        }
    }

    public final synchronized zzq zzg() {
        return null;
    }

    public final zzbh zzi() {
        return null;
    }

    public final zzcb zzj() {
        return null;
    }

    public final synchronized zzdn zzk() {
        return null;
    }

    public final synchronized zzdq zzl() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        zzp(5);
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    public final void zzo() {
        this.zzb.zzB().execute(new zzfel(this));
    }

    public final synchronized String zzr() {
        return this.zze;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcye zzcye = this.zza;
        if (zzcye != null) {
            zzcye.zzaa();
        }
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final void zzf(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            zzp(2);
        } else if (i2 == 1) {
            zzp(4);
        } else if (i2 == 2) {
            zzp(3);
        } else if (i2 == 3) {
            zzp(6);
        }
    }
}
