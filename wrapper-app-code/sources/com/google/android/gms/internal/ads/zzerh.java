package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
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
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzerh extends zzbt implements zzdhd {
    private final Context zza;
    private final zzfev zzb;
    private final String zzc;
    private final zzesb zzd;
    private zzq zze;
    private final zzfje zzf;
    private final zzchu zzg;
    /* access modifiers changed from: private */
    public zzcyl zzh;

    public zzerh(Context context, zzq zzq, String str, zzfev zzfev, zzesb zzesb, zzchu zzchu) {
        this.zza = context;
        this.zzb = zzfev;
        this.zze = zzq;
        this.zzc = str;
        this.zzd = zzesb;
        this.zzf = zzfev.zzi();
        this.zzg = zzchu;
        zzfev.zzp(this);
    }

    private final synchronized void zze(zzq zzq) {
        this.zzf.zzr(zzq);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(zzl zzl) throws RemoteException {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        zzt.zzp();
        if (!zzs.zzD(this.zza) || zzl.zzs != null) {
            zzfka.zza(this.zza, zzl.zzf);
            return this.zzb.zzb(zzl, this.zzc, (zzesp) null, new zzerg(this));
        }
        zze.zzg("Failed to load the ad because app ID is missing.");
        zzesb zzesb = this.zzd;
        if (zzesb != null) {
            zzesb.zza(zzfkg.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z;
        if (((Boolean) zzbkx.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                z = true;
                return this.zzg.zzc >= ((Integer) zzba.zzc().zzb(zzbjj.zzjo)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.zzc >= ((Integer) zzba.zzc().zzb(zzbjj.zzjo)).intValue()) {
        }
    }

    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcyl zzcyl = this.zzh;
        if (zzcyl != null) {
            zzcyl.zzg();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzjp)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbkl r0 = com.google.android.gms.internal.ads.zzbkx.zzh     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzjj     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzchu r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbjb r1 = com.google.android.gms.internal.ads.zzbjj.zzjp     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcyl r0 = r3.zzh     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzdfm r0 = r0.zzm()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzc(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerh.zzB():void");
    }

    public final void zzC(zzbe zzbe) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbe);
    }

    public final void zzD(zzbh zzbh) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(zzbh);
    }

    public final void zzE(zzby zzby) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzq);
        this.zze = zzq;
        zzcyl zzcyl = this.zzh;
        if (zzcyl != null) {
            zzcyl.zzh(this.zzb.zzd(), zzq);
        }
    }

    public final void zzG(zzcb zzcb) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(zzcb);
    }

    public final void zzH(zzbdt zzbdt) {
    }

    public final void zzI(zzw zzw) {
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
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z);
    }

    public final synchronized void zzO(zzbke zzbke) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbke);
    }

    public final void zzP(zzdg zzdg) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        this.zzd.zzh(zzdg);
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
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzfl);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            zzq zzg2 = this.zzf.zzg();
            zzcyl zzcyl = this.zzh;
            if (!(zzcyl == null || zzcyl.zzf() == null || !this.zzf.zzO())) {
                zzg2 = zzfjk.zza(this.zza, Collections.singletonList(this.zzh.zzf()));
            }
            zze(zzg2);
            try {
                zzf(this.zzf.zze());
            } catch (RemoteException unused) {
                zze.zzj("Failed to refresh the banner ad.");
            }
        } else {
            this.zzb.zzn();
        }
    }

    public final synchronized boolean zzaa(zzl zzl) throws RemoteException {
        zze(this.zze);
        return zzf(zzl);
    }

    public final synchronized void zzab(zzcf zzcf) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcf);
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcyl zzcyl = this.zzh;
        if (zzcyl != null) {
            return zzfjk.zza(this.zza, Collections.singletonList(zzcyl.zze()));
        }
        return this.zzf.zzg();
    }

    public final zzbh zzi() {
        return this.zzd.zzc();
    }

    public final zzcb zzj() {
        return this.zzd.zzd();
    }

    public final synchronized zzdn zzk() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgi)).booleanValue()) {
            return null;
        }
        zzcyl zzcyl = this.zzh;
        if (zzcyl == null) {
            return null;
        }
        return zzcyl.zzl();
    }

    public final synchronized zzdq zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcyl zzcyl = this.zzh;
        if (zzcyl == null) {
            return null;
        }
        return zzcyl.zzd();
    }

    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    public final synchronized String zzr() {
        return this.zzc;
    }

    public final synchronized String zzs() {
        zzcyl zzcyl = this.zzh;
        if (zzcyl == null || zzcyl.zzl() == null) {
            return null;
        }
        return zzcyl.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzcyl zzcyl = this.zzh;
        if (zzcyl == null || zzcyl.zzl() == null) {
            return null;
        }
        return zzcyl.zzl().zzg();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzjp)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbkl r0 = com.google.android.gms.internal.ads.zzbkx.zze     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzjk     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzchu r0 = r3.zzg     // Catch:{ all -> 0x0047 }
            int r0 = r0.zzc     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbjb r1 = com.google.android.gms.internal.ads.zzbjj.zzjp     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0047 }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcyl r0 = r3.zzh     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r0.zzaa()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerh.zzx():void");
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzjp)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbkl r0 = com.google.android.gms.internal.ads.zzbkx.zzg     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzjl     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzchu r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbjb r1 = com.google.android.gms.internal.ads.zzbjj.zzjp     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcyl r0 = r3.zzh     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzdfm r0 = r0.zzm()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzb(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerh.zzz():void");
    }
}
