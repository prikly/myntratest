package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfii extends zzcct {
    private final zzfhy zza;
    private final zzfho zzb;
    /* access modifiers changed from: private */
    public final zzfiy zzc;
    /* access modifiers changed from: private */
    public zzdvt zzd;
    private boolean zze = false;

    public zzfii(zzfhy zzfhy, zzfho zzfho, zzfiy zzfiy) {
        this.zza = zzfhy;
        this.zzb = zzfho;
        this.zzc = zzfiy;
    }

    private final synchronized boolean zzy() {
        zzdvt zzdvt;
        zzdvt = this.zzd;
        return zzdvt != null && !zzdvt.zze();
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdvt zzdvt = this.zzd;
        return zzdvt != null ? zzdvt.zza() : new Bundle();
    }

    public final synchronized zzdn zzc() throws RemoteException {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgi)).booleanValue()) {
            return null;
        }
        zzdvt zzdvt = this.zzd;
        if (zzdvt == null) {
            return null;
        }
        return zzdvt.zzl();
    }

    public final synchronized String zzd() throws RemoteException {
        zzdvt zzdvt = this.zzd;
        if (zzdvt == null || zzdvt.zzl() == null) {
            return null;
        }
        return zzdvt.zzl().zzg();
    }

    public final void zze() throws RemoteException {
        zzf((IObjectWrapper) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzfho r0 = r2.zzb     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.zzb(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzdvt r0 = r2.zzd     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.zzdvt r3 = r2.zzd     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzdfm r3 = r3.zzm()     // Catch:{ all -> 0x0027 }
            r3.zza(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfii.zzf(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final synchronized void zzg(zzccy zzccy) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzccy.zzb;
        String str2 = (String) zzba.zzc().zzb(zzbjj.zzeQ);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e2) {
                zzt.zzo().zzu(e2, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeS)).booleanValue()) {
                return;
            }
        }
        zzfhq zzfhq = new zzfhq((String) null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzccy.zza, zzccy.zzb, zzfhq, new zzfig(this));
    }

    public final void zzh() {
        zzi((IObjectWrapper) null);
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zzb(context);
        }
    }

    public final void zzj() {
        zzk((IObjectWrapper) null);
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zzc(context);
        }
    }

    public final void zzl(zzby zzby) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzby == null) {
            this.zzb.zzb((zzfrt) null);
        } else {
            this.zzb.zzb(new zzfih(this, zzby));
        }
    }

    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    public final void zzo(zzccx zzccx) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzccx);
    }

    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    public final synchronized void zzq() throws RemoteException {
        zzr((IObjectWrapper) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.zzdvt r0 = r2.zzd     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.zzdvt r3 = r2.zzd     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.zze     // Catch:{ all -> 0x0024 }
            r3.zzh(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfii.zzr(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    public final boolean zzt() {
        zzdvt zzdvt = this.zzd;
        return zzdvt != null && zzdvt.zzg();
    }

    public final void zzu(zzccs zzccs) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzh(zzccs);
    }
}
