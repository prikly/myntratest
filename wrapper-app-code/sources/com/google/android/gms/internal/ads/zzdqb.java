package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdqb extends zzdan {
    public static final zzgau zzc = zzgau.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbbz zzA;
    private final Executor zzd;
    private final zzdqg zze;
    private final zzdqo zzf;
    private final zzdrg zzg;
    private final zzdql zzh;
    private final zzdqr zzi;
    private final zzhej zzj;
    private final zzhej zzk;
    private final zzhej zzl;
    private final zzhej zzm;
    private final zzhej zzn;
    /* access modifiers changed from: private */
    public zzdsc zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzcfb zzs;
    private final zzapj zzt;
    private final zzchu zzu;
    private final Context zzv;
    private final zzdqd zzw;
    private final zzese zzx;
    /* access modifiers changed from: private */
    public final Map zzy = new HashMap();
    private final List zzz = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdqb(zzdam zzdam, Executor executor, zzdqg zzdqg, zzdqo zzdqo, zzdrg zzdrg, zzdql zzdql, zzdqr zzdqr, zzhej zzhej, zzhej zzhej2, zzhej zzhej3, zzhej zzhej4, zzhej zzhej5, zzcfb zzcfb, zzapj zzapj, zzchu zzchu, Context context, zzdqd zzdqd, zzese zzese, zzbbz zzbbz) {
        super(zzdam);
        this.zzd = executor;
        this.zze = zzdqg;
        this.zzf = zzdqo;
        this.zzg = zzdrg;
        this.zzh = zzdql;
        this.zzi = zzdqr;
        this.zzj = zzhej;
        this.zzk = zzhej2;
        this.zzl = zzhej3;
        this.zzm = zzhej4;
        this.zzn = zzhej5;
        this.zzs = zzcfb;
        this.zzt = zzapj;
        this.zzu = zzchu;
        this.zzv = context;
        this.zzw = zzdqd;
        this.zzx = zzese;
        this.zzA = zzbbz;
    }

    public static boolean zzT(View view) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziO)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        zzt.zzp();
        long zzt2 = zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (zzt2 >= ((long) ((Integer) zzba.zzc().zzb(zzbjj.zziP)).intValue())) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzV(Map map) {
        if (map == null) {
            return null;
        }
        zzgau zzgau = zzc;
        int size = zzgau.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzgau.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzW() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzhh)).booleanValue()) {
            return null;
        }
        zzdsc zzdsc = this.zzo;
        if (zzdsc == null) {
            zze.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj2 = zzdsc.zzj();
        if (zzj2 != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj2);
        }
        return zzdrg.zza;
    }

    private final synchronized void zzX(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzW());
        this.zzq = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzY */
    public final synchronized void zzv(zzdsc zzdsc) {
        View view;
        zzapf zzc2;
        if (!this.zzp) {
            this.zzo = zzdsc;
            this.zzg.zze(zzdsc);
            this.zzf.zzy(zzdsc.zzf(), zzdsc.zzm(), zzdsc.zzn(), zzdsc, zzdsc);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcj)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                zzc2.zzn(zzdsc.zzf());
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbA)).booleanValue()) {
                zzfil zzfil = this.zzb;
                if (zzfil.zzam) {
                    Iterator<String> keys = zzfil.zzal.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                            this.zzy.put(next, false);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                zzbby zzbby = new zzbby(this.zzv, view);
                                this.zzz.add(zzbby);
                                zzbby.zzc(new zzdqa(this, next));
                            }
                        }
                    }
                }
            }
            if (zzdsc.zzi() != null) {
                zzdsc.zzi().zzc(this.zzs);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzZ */
    public final void zzw(zzdsc zzdsc) {
        this.zzf.zzz(zzdsc.zzf(), zzdsc.zzl());
        if (zzdsc.zzh() != null) {
            zzdsc.zzh().setClickable(false);
            zzdsc.zzh().removeAllViews();
        }
        if (zzdsc.zzi() != null) {
            zzdsc.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public final synchronized void zzA(View view, int i) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjw)).booleanValue()) {
            zzdsc zzdsc = this.zzo;
            if (zzdsc == null) {
                zze.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.zzd.execute(new zzdpt(this, view, zzdsc instanceof zzdra, i));
            }
        }
    }

    public final synchronized void zzB(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzC(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzD() {
        zzdsc zzdsc = this.zzo;
        if (zzdsc == null) {
            zze.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzd.execute(new zzdpx(this, zzdsc instanceof zzdra));
        }
    }

    public final synchronized void zzE() {
        if (!this.zzq) {
            this.zzf.zzr();
        }
    }

    public final void zzF(View view) {
        zzdqg zzdqg = this.zze;
        IObjectWrapper zzu2 = zzdqg.zzu();
        zzcno zzq2 = zzdqg.zzq();
        if (this.zzh.zzd() && zzu2 != null && zzq2 != null && view != null) {
            zzt.zzA().zzc(zzu2, view);
        }
    }

    public final synchronized void zzG(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzH(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzI(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzJ() {
        this.zzf.zzv();
    }

    public final synchronized void zzK(zzcs zzcs) {
        this.zzf.zzw(zzcs);
    }

    public final synchronized void zzL(zzdg zzdg) {
        this.zzx.zza(zzdg);
    }

    public final synchronized void zzM(zzbof zzbof) {
        this.zzf.zzx(zzbof);
    }

    public final synchronized void zzN(zzdsc zzdsc) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzby)).booleanValue()) {
            zzs.zza.post(new zzdpy(this, zzdsc));
        } else {
            zzv(zzdsc);
        }
    }

    public final synchronized void zzO(zzdsc zzdsc) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzby)).booleanValue()) {
            zzs.zza.post(new zzdpu(this, zzdsc));
        } else {
            zzw(zzdsc);
        }
    }

    public final boolean zzP() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzQ() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzR() {
        return this.zzf.zzB();
    }

    public final boolean zzS() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzU(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    public final synchronized void zzaa() {
        this.zzp = true;
        this.zzd.execute(new zzdpz(this));
        super.zzaa();
    }

    public final void zzab() {
        this.zzd.execute(new zzdpv(this));
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            zzdqo zzdqo = this.zzf;
            zzdqo.getClass();
            executor.execute(new zzdpw(zzdqo));
        }
        super.zzab();
    }

    public final zzdqd zzc() {
        return this.zzw;
    }

    public final String zze() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzg(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzW());
    }

    public final synchronized JSONObject zzh(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzW());
    }

    public final void zzk(View view) {
        IObjectWrapper zzu2 = this.zze.zzu();
        if (this.zzh.zzd() && zzu2 != null && view != null) {
            zzt.zzA();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzey)).booleanValue() && zzfpr.zzb()) {
                Object unwrap = ObjectWrapper.unwrap(zzu2);
                if (unwrap instanceof zzfpt) {
                    ((zzfpt) unwrap).zzb(view, zzfpz.NOT_VISIBLE, "Ad overlay");
                }
            }
        }
    }

    public final synchronized void zzq() {
        this.zzf.zzh();
    }

    public final void zzr(String str, boolean z) {
        String str2;
        zzeko zzeko;
        zzekp zzekp;
        if (this.zzh.zzd() && !TextUtils.isEmpty(str)) {
            zzdqg zzdqg = this.zze;
            zzcno zzq2 = zzdqg.zzq();
            zzcno zzr2 = zzdqg.zzr();
            if (zzq2 == null && zzr2 == null) {
                zze.zzj("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z2 = false;
            boolean z3 = zzq2 != null;
            boolean z4 = zzr2 != null;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzeC)).booleanValue()) {
                this.zzh.zza();
                int zzb = this.zzh.zza().zzb();
                int i = zzb - 1;
                if (i != 0) {
                    if (i != 1) {
                        zze.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return;
                    } else if (zzq2 != null) {
                        z2 = true;
                        z4 = false;
                    } else {
                        zze.zzj("Omid media type was display but there was no display webview.");
                        return;
                    }
                } else if (zzr2 != null) {
                    z4 = true;
                } else {
                    zze.zzj("Omid media type was video but there was no video webview.");
                    return;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzq2 = zzr2;
            }
            String str3 = str2;
            zzq2.zzI();
            if (!zzt.zzA().zze(this.zzv)) {
                zze.zzj("Failed to initialize omid in InternalNativeAd");
                return;
            }
            zzchu zzchu = this.zzu;
            String str4 = zzchu.zzb + "." + zzchu.zzc;
            if (z4) {
                zzeko = zzeko.VIDEO;
                zzekp = zzekp.DEFINED_BY_JAVASCRIPT;
            } else {
                zzeko = zzeko.NATIVE_DISPLAY;
                if (this.zze.zzc() == 3) {
                    zzekp = zzekp.UNSPECIFIED;
                } else {
                    zzekp = zzekp.ONE_PIXEL;
                }
            }
            IObjectWrapper zzb2 = zzt.zzA().zzb(str4, zzq2.zzI(), "", "javascript", str3, str, zzekp, zzeko, this.zzb.zzan);
            if (zzb2 == null) {
                zze.zzj("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.zze.zzaa(zzb2);
            zzq2.zzar(zzb2);
            if (z4) {
                zzt.zzA().zzc(zzb2, zzr2.zzH());
                this.zzr = true;
            }
            if (z) {
                zzt.zzA().zzd(zzb2);
                zzq2.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzs() {
        this.zzf.zzi();
        this.zze.zzG();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzW(), i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzu(boolean z) {
        this.zzf.zzo((View) null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzW(), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzx(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzbA     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzfil r0 = r3.zzb     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.zzam     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r3.zzy     // Catch:{ all -> 0x00f2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f2 }
            java.util.Map r2 = r3.zzy     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f2 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            if (r7 != 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzbjb r7 = com.google.android.gms.internal.ads.zzbjj.zzdq     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbjh r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r0.zzb(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00f2 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0063:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00f2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f2 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f2 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = zzT(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            r3.zzX(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0088:
            monitor-exit(r3)
            return
        L_0x008a:
            android.view.View r7 = r3.zzV(r5)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x0095
            r3.zzX(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzdr     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00b4
            boolean r7 = zzT(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00b2
            r3.zzX(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00b2:
            monitor-exit(r3)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzds     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ed
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            r1 = 0
            boolean r1 = r7.getGlobalVisibleRect(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00eb
            int r1 = r7.getHeight()     // Catch:{ all -> 0x00f2 }
            int r2 = r0.height()     // Catch:{ all -> 0x00f2 }
            if (r1 != r2) goto L_0x00eb
            int r7 = r7.getWidth()     // Catch:{ all -> 0x00f2 }
            int r0 = r0.width()     // Catch:{ all -> 0x00f2 }
            if (r7 != r0) goto L_0x00eb
            r3.zzX(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00eb:
            monitor-exit(r3)
            return
        L_0x00ed:
            r3.zzX(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00f2:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqb.zzx(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzy(zzcw zzcw) {
        this.zzf.zzj(zzcw);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzz(android.view.View r10, android.view.View r11, java.util.Map r12, java.util.Map r13, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzdrg r0 = r9.zzg     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzdsc r1 = r9.zzo     // Catch:{ all -> 0x0035 }
            r0.zzc(r1)     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzdqo r2 = r9.zzf     // Catch:{ all -> 0x0035 }
            android.widget.ImageView$ScaleType r8 = r9.zzW()     // Catch:{ all -> 0x0035 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.zzk(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0035 }
            boolean r10 = r9.zzr     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzdqg r10 = r9.zze     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzcno r11 = r10.zzr()     // Catch:{ all -> 0x0035 }
            if (r11 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            com.google.android.gms.internal.ads.zzcno r10 = r10.zzr()     // Catch:{ all -> 0x0035 }
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0035 }
            r11.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r12 = "onSdkAdUserInteractionClick"
            r10.zzd(r12, r11)     // Catch:{ all -> 0x0035 }
            monitor-exit(r9)
            return
        L_0x0033:
            monitor-exit(r9)
            return
        L_0x0035:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqb.zzz(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public static /* synthetic */ void zzi(zzdqb zzdqb) {
        try {
            zzdqg zzdqg = zzdqb.zze;
            int zzc2 = zzdqg.zzc();
            if (zzc2 != 1) {
                if (zzc2 != 2) {
                    if (zzc2 != 3) {
                        if (zzc2 != 6) {
                            if (zzc2 != 7) {
                                zze.zzg("Wrong native template id!");
                                return;
                            }
                            zzdqr zzdqr = zzdqb.zzi;
                            if (zzdqr.zzg() != null) {
                                zzdqr.zzg().zzg((zzbso) zzdqb.zzm.zzb());
                            }
                        } else if (zzdqb.zzi.zzf() != null) {
                            zzdqb.zzr("Google", true);
                            zzdqb.zzi.zzf().zze((zzboi) zzdqb.zzl.zzb());
                        }
                    } else if (zzdqb.zzi.zzd(zzdqg.zzy()) != null) {
                        if (zzdqb.zze.zzr() != null) {
                            zzdqb.zzr("Google", true);
                        }
                        zzdqb.zzi.zzd(zzdqb.zze.zzy()).zze((zzbnf) zzdqb.zzn.zzb());
                    }
                } else if (zzdqb.zzi.zza() != null) {
                    zzdqb.zzr("Google", true);
                    zzdqb.zzi.zza().zze((zzbna) zzdqb.zzk.zzb());
                }
            } else if (zzdqb.zzi.zzb() != null) {
                zzdqb.zzr("Google", true);
                zzdqb.zzi.zzb().zze((zzbnc) zzdqb.zzj.zzb());
            }
        } catch (RemoteException e2) {
            zze.zzh("RemoteException when notifyAdLoad is called", e2);
        }
    }
}
