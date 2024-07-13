package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcue extends zzcn {
    private final Context zza;
    private final zzchu zzb;
    private final zzdxc zzc;
    private final zzeks zzd;
    private final zzeqx zze;
    private final zzebj zzf;
    private final zzcft zzg;
    private final zzdxh zzh;
    private final zzece zzi;
    private final zzbls zzj;
    private final zzfoy zzk;
    private final zzfjz zzl;
    private boolean zzm = false;

    zzcue(Context context, zzchu zzchu, zzdxc zzdxc, zzeks zzeks, zzeqx zzeqx, zzebj zzebj, zzcft zzcft, zzdxh zzdxh, zzece zzece, zzbls zzbls, zzfoy zzfoy, zzfjz zzfjz) {
        this.zza = context;
        this.zzb = zzchu;
        this.zzc = zzdxc;
        this.zzd = zzeks;
        this.zze = zzeqx;
        this.zzf = zzebj;
        this.zzg = zzcft;
        this.zzh = zzdxh;
        this.zzi = zzece;
        this.zzj = zzbls;
        this.zzk = zzfoy;
        this.zzl = zzfjz;
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (zzt.zzo().zzh().zzO()) {
            if (!zzt.zzs().zzj(this.zza, zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                zzt.zzo().zzh().zzB(false);
                zzt.zzo().zzh().zzA("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze2 = zzt.zzo().zzh().zzh().zze();
        if (!zze2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zze.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzbvo zzbvo : zze2.values()) {
                    for (zzbvn zzbvn : zzbvo.zza) {
                        String str = zzbvn.zzk;
                        for (String str2 : zzbvn.zzc) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzekt zza2 = this.zzd.zza(str3, jSONObject);
                        if (zza2 != null) {
                            zzfkb zzfkb = (zzfkb) zza2.zzb;
                            if (!zzfkb.zzC() && zzfkb.zzB()) {
                                zzfkb.zzj(this.zza, (zzemt) zza2.zzc, (List) entry.getValue());
                                zze.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfjl e2) {
                        zze.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfkj.zzb(this.zza, true);
    }

    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    public final String zzf() {
        return this.zzb.zza;
    }

    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    public final void zzi() {
        this.zzf.zzl();
    }

    public final synchronized void zzk() {
        if (this.zzm) {
            zze.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbjj.zzc(this.zza);
        zzt.zzo().zzs(this.zza, this.zzb);
        zzt.zzc().zzi(this.zza);
        this.zzm = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdw)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzim)).booleanValue()) {
            zzcib.zza.execute(new zzcua(this));
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjb)).booleanValue()) {
            zzcib.zza.execute(new zzctz(this));
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzct)).booleanValue()) {
            zzcib.zza.execute(new zzcub(this));
        }
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzcuc zzcuc;
        zzbjj.zzc(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdA)).booleanValue()) {
            zzt.zzp();
            str2 = zzs.zzo(this.zza);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbjj.zzdv)).booleanValue() | ((Boolean) zzba.zzc().zzb(zzbjj.zzaK)).booleanValue();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzaK)).booleanValue()) {
                zzcuc = new zzcuc(this, (Runnable) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcuc = null;
                z = booleanValue;
            }
            zzcuc zzcuc2 = zzcuc;
            if (z) {
                zzt.zza().zza(this.zza, this.zzb, str3, zzcuc2, this.zzk);
            }
        }
    }

    public final void zzm(zzda zzda) throws RemoteException {
        this.zzi.zzh(zzda, zzecd.API);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zze.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zze.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzas = new zzas(context);
        zzas.zzn(str);
        zzas.zzo(this.zzb.zza);
        zzas.zzr();
    }

    public final void zzo(zzbvt zzbvt) throws RemoteException {
        this.zzl.zze(zzbvt);
    }

    public final synchronized void zzp(boolean z) {
        zzt.zzr().zzc(z);
    }

    public final synchronized void zzq(float f2) {
        zzt.zzr().zzd(f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbjj.zzc(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzdv     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.ads.internal.zze r1 = com.google.android.gms.ads.internal.zzt.zza()     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzchu r3 = r7.zzb     // Catch:{ all -> 0x0031 }
            r5 = 0
            com.google.android.gms.internal.ads.zzfoy r6 = r7.zzk     // Catch:{ all -> 0x0031 }
            r4 = r8
            r1.zza(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)
            return
        L_0x002f:
            monitor-exit(r7)
            return
        L_0x0031:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcue.zzr(java.lang.String):void");
    }

    public final void zzs(zzbsg zzbsg) throws RemoteException {
        this.zzf.zzs(zzbsg);
    }

    public final void zzt(String str) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziv)).booleanValue()) {
            zzt.zzo().zzw(str);
        }
    }

    public final void zzu(zzff zzff) throws RemoteException {
        this.zzg.zzq(this.zza, zzff);
    }

    public final synchronized boolean zzv() {
        return zzt.zzr().zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzcay());
    }

    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfvg.zzi(this.zza).zzn(z);
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }
}
