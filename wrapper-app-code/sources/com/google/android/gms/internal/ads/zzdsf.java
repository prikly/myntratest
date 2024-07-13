package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdsf implements zzdqo {
    private final zzbwi zza;
    private final zzdff zzb;
    private final zzdel zzc;
    private final zzdma zzd;
    private final Context zze;
    private final zzfil zzf;
    private final zzchu zzg;
    private final zzfjg zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbwe zzl;
    private final zzbwf zzm;

    public zzdsf(zzbwe zzbwe, zzbwf zzbwf, zzbwi zzbwi, zzdff zzdff, zzdel zzdel, zzdma zzdma, Context context, zzfil zzfil, zzchu zzchu, zzfjg zzfjg, byte[] bArr) {
        this.zzl = zzbwe;
        this.zzm = zzbwf;
        this.zza = zzbwi;
        this.zzb = zzdff;
        this.zzc = zzdel;
        this.zzd = zzdma;
        this.zze = context;
        this.zzf = zzfil;
        this.zzg = zzchu;
        this.zzh = zzfjg;
    }

    private final void zzb(View view) {
        try {
            zzbwi zzbwi = this.zza;
            if (zzbwi == null || zzbwi.zzA()) {
                zzbwe zzbwe = this.zzl;
                if (zzbwe == null || zzbwe.zzx()) {
                    zzbwf zzbwf = this.zzm;
                    if (zzbwf != null && !zzbwf.zzv()) {
                        this.zzm.zzq(ObjectWrapper.wrap(view));
                        this.zzc.onAdClicked();
                        if (((Boolean) zzba.zzc().zzb(zzbjj.zziW)).booleanValue()) {
                            this.zzd.zzq();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) zzba.zzc().zzb(zzbjj.zziW)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            this.zza.zzw(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zziW)).booleanValue()) {
                this.zzd.zzq();
            }
        } catch (RemoteException e2) {
            zze.zzk("Failed to call handleClick", e2);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final boolean zzA() {
        return true;
    }

    public final boolean zzB() {
        return this.zzf.zzM;
    }

    public final boolean zzC(Bundle bundle) {
        return false;
    }

    public final int zza() {
        return 0;
    }

    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void zzg() {
        throw null;
    }

    public final void zzh() {
    }

    public final void zzi() {
    }

    public final void zzj(zzcw zzcw) {
        zze.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (!this.zzj || !this.zzf.zzM) {
            zzb(view);
        }
    }

    public final void zzl(String str) {
    }

    public final void zzm(Bundle bundle) {
    }

    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            zze.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            zze.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    public final void zzp() {
    }

    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbwi zzbwi = this.zza;
                if (zzbwi != null) {
                    if (!zzbwi.zzB()) {
                        this.zza.zzx();
                        this.zzb.zza();
                        return;
                    }
                }
                zzbwe zzbwe = this.zzl;
                if (zzbwe != null) {
                    if (!zzbwe.zzy()) {
                        this.zzl.zzt();
                        this.zzb.zza();
                        return;
                    }
                }
                zzbwf zzbwf = this.zzm;
                if (zzbwf != null && !zzbwf.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e2) {
            zze.zzk("Failed to call recordImpression", e2);
        }
    }

    public final void zzr() {
    }

    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzt(Bundle bundle) {
    }

    public final void zzu(View view) {
    }

    public final void zzv() {
        this.zzj = true;
    }

    public final void zzw(zzcs zzcs) {
        zze.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzx(zzbof zzbof) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzy(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzfil r12 = r8.zzf     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONObject r12 = r12.zzal     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbjb r13 = com.google.android.gms.internal.ads.zzbjj.zzbq     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbjh r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r13 = r0.zzb(r13)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0124 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00e0
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0124 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00e0
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0124 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0124 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = 0
            goto L_0x00e0
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbjb r6 = com.google.android.gms.internal.ads.zzbjj.zzbr     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbjh r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0124 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.zzbwi r2 = r8.zza     // Catch:{ RemoteException -> 0x0124 }
            r5 = 0
            if (r2 == 0) goto L_0x0093
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzn()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x0091:
            goto L_0x00ac
        L_0x0093:
            com.google.android.gms.internal.ads.zzbwe r2 = r8.zzl     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x009c
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzk()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x009c:
            com.google.android.gms.internal.ads.zzbwf r2 = r8.zzm     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00a5
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r5
        L_0x00a6:
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{  }
        L_0x00ac:
            if (r5 != 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
        L_0x00b3:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzbu.zzc(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.zze     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c8:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c8
            goto L_0x0045
        L_0x00e0:
            r8.zzk = r0     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r10 = zzc(r10)     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r11 = zzc(r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbwi r12 = r8.zza     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x00fa
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.zzy(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x00fa:
            com.google.android.gms.internal.ads.zzbwe r12 = r8.zzl     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x010f
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.zzv(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbwe r10 = r8.zzl     // Catch:{ RemoteException -> 0x0124 }
            r10.zzu(r9)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x010f:
            com.google.android.gms.internal.ads.zzbwf r12 = r8.zzm     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x0123
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.zzt(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbwf r10 = r8.zzm     // Catch:{ RemoteException -> 0x0124 }
            r10.zzs(r9)     // Catch:{ RemoteException -> 0x0124 }
        L_0x0123:
            return
        L_0x0124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.ads.internal.util.zze.zzk(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzy(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbwi zzbwi = this.zza;
            if (zzbwi != null) {
                zzbwi.zzz(wrap);
                return;
            }
            zzbwe zzbwe = this.zzl;
            if (zzbwe != null) {
                zzbwe.zzw(wrap);
                return;
            }
            zzbwf zzbwf = this.zzm;
            if (zzbwf != null) {
                zzbwf.zzu(wrap);
            }
        } catch (RemoteException e2) {
            zze.zzk("Failed to call untrackView", e2);
        }
    }
}
