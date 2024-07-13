package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appnext.core.AppnextError;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzebj {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzcig zze = new zzcig();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdxc zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdzq zzl;
    private final zzchu zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzdlf zzo;
    /* access modifiers changed from: private */
    public final zzfoy zzp;
    private boolean zzq = true;

    public zzebj(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdxc zzdxc, ScheduledExecutorService scheduledExecutorService, zzdzq zzdzq, zzchu zzchu, zzdlf zzdlf, zzfoy zzfoy) {
        this.zzh = zzdxc;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdzq;
        this.zzm = zzchu;
        this.zzo = zzdlf;
        this.zzp = zzfoy;
        this.zzd = zzt.zzB().elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(zzebj zzebj, String str) {
        zzebj zzebj2 = zzebj;
        int i = 5;
        zzfol zza2 = zzfok.zza(zzebj2.zzf, 5);
        zza2.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(Constants.CONFIG);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfol zza3 = zzfok.zza(zzebj2.zzf, i);
                zza3.zzh();
                zza3.zzd(next);
                Object obj = new Object();
                zzcig zzcig = new zzcig();
                zzgfb zzo2 = zzger.zzo(zzcig, ((Long) zzba.zzc().zzb(zzbjj.zzbD)).longValue(), TimeUnit.SECONDS, zzebj2.zzk);
                zzebj2.zzl.zzc(next);
                zzebj2.zzo.zzc(next);
                long elapsedRealtime = zzt.zzB().elapsedRealtime();
                zzeba zzeba = r1;
                zzgfb zzgfb = zzo2;
                zzeba zzeba2 = new zzeba(zzebj, obj, zzcig, next, elapsedRealtime, zza3);
                zzgfb.zzc(zzeba, zzebj2.zzi);
                arrayList.add(zzgfb);
                zzebi zzebi = new zzebi(zzebj, obj, next, elapsedRealtime, zza3, zzcig);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbsj(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzebj2.zzv(next, false, "", 0);
                try {
                    zzebj2.zzj.execute(new zzebe(zzebj, zzebj2.zzh.zzc(next, new JSONObject()), zzebi, arrayList2, next));
                } catch (zzfjl unused2) {
                    try {
                        zzebi.zze("Failed to create Adapter.");
                    } catch (RemoteException e2) {
                        zzcho.zzh("", e2);
                    }
                }
                i = 5;
            }
            zzger.zza(arrayList).zza(new zzebb(zzebj2, zza2), zzebj2.zzi);
        } catch (JSONException e3) {
            zze.zzb("Malformed CLD response", e3);
            zzebj2.zzo.zza("MalformedJson");
            zzebj2.zzl.zza("MalformedJson");
            zzebj2.zze.zze(e3);
            zzt.zzo().zzu(e3, "AdapterInitializer.updateAdapterStatus");
            zzfoy zzfoy = zzebj2.zzp;
            zza2.zzg(e3);
            zza2.zzf(false);
            zzfoy.zzb(zza2.zzl());
        }
    }

    private final synchronized zzgfb zzu() {
        String zzc2 = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzger.zzi(zzc2);
        }
        zzcig zzcig = new zzcig();
        zzt.zzo().zzh().zzq(new zzebf(this, zzcig));
        return zzcig;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbrz(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfol zzfol) throws Exception {
        this.zze.zzd(true);
        zzfoy zzfoy = this.zzp;
        zzfol.zzf(true);
        zzfoy.zzb(zzfol.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbrz zzbrz = (zzbrz) this.zzn.get(str);
            arrayList.add(new zzbrz(str, zzbrz.zzb, zzbrz.zzc, zzbrz.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (!this.zzc) {
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzB().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zze(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        com.google.android.gms.internal.ads.zzcho.zzh("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.zze("Failed to initialize adapter. " + r5 + " does not implement the initialize() method.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzfkb r2, com.google.android.gms.internal.ads.zzbsd r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzg     // Catch:{ zzfjl -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzfjl -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzfjl -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.zzf     // Catch:{ zzfjl -> 0x0011 }
        L_0x000d:
            r2.zzi(r0, r3, r4)     // Catch:{ zzfjl -> 0x0011 }
            return
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x002b }
            r2.<init>()     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = "Failed to initialize adapter. "
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            r2.append(r5)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = " does not implement the initialize() method."
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x002b }
            r3.zze(r2)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzcho.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebj.zzn(com.google.android.gms.internal.ads.zzfkb, com.google.android.gms.internal.ads.zzbsd, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzcig zzcig) {
        this.zzi.execute(new zzeay(this, zzcig));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcig zzcig, String str, long j, zzfol zzfol) {
        synchronized (obj) {
            if (!zzcig.isDone()) {
                zzv(str, false, "Timeout.", (int) (zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfoy zzfoy = this.zzp;
                zzfol.zzc(AppnextError.TIMEOUT);
                zzfol.zzf(false);
                zzfoy.zzb(zzfol.zzl());
                zzcig.zzd(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzble.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) zzba.zzc().zzb(zzbjj.zzbC)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.zzc(new zzeaz(this), this.zzi);
                            this.zza = true;
                            zzgfb zzu = zzu();
                            this.zzk.schedule(new zzebc(this), ((Long) zzba.zzc().zzb(zzbjj.zzbE)).longValue(), TimeUnit.SECONDS);
                            zzger.zzr(zzu, new zzebh(this), this.zzi);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzd(false);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbsg zzbsg) {
        this.zze.zzc(new zzebd(this, zzbsg), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
