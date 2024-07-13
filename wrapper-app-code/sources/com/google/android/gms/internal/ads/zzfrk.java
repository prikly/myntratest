package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfrk implements zzfqp {
    private static final zzfrk zza = new zzfrk();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfrg();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzfrh();
    private final List zzf = new ArrayList();
    private int zzg;
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfqr zzj = new zzfqr();
    private final zzfrd zzk = new zzfrd();
    /* access modifiers changed from: private */
    public final zzfre zzl = new zzfre(new zzfrn());
    private long zzm;

    zzfrk() {
    }

    public static zzfrk zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfrk zzfrk) {
        zzfrk.zzg = 0;
        zzfrk.zzi.clear();
        zzfrk.zzh = false;
        for (zzfpx zzfpx : zzfqi.zza().zzb()) {
        }
        zzfrk.zzm = System.nanoTime();
        zzfrk.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfqq zza2 = zzfrk.zzj.zza();
        if (zzfrk.zzk.zze().size() > 0) {
            Iterator it = zzfrk.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfqy.zza(0, 0, 0, 0);
                View zza4 = zzfrk.zzk.zza(str);
                zzfqq zzb2 = zzfrk.zzj.zzb();
                String zzc2 = zzfrk.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfqy.zzb(zza5, str);
                    zzfqy.zzf(zza5, zzc2);
                    zzfqy.zzc(zza3, zza5);
                }
                zzfqy.zzi(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfrk.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfrk.zzk.zzf().size() > 0) {
            JSONObject zza6 = zzfqy.zza(0, 0, 0, 0);
            zzfrk.zzk((View) null, zza2, zza6, 1, false);
            zzfqy.zzi(zza6);
            zzfrk.zzl.zzd(zza6, zzfrk.zzk.zzf(), nanoTime);
            boolean z = zzfrk.zzh;
        } else {
            zzfrk.zzl.zzb();
        }
        zzfrk.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfrk.zzm;
        if (zzfrk.zzf.size() > 0) {
            for (zzfrj zzfrj : zzfrk.zzf) {
                int i = zzfrk.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfrj.zzb();
                if (zzfrj instanceof zzfri) {
                    int i2 = zzfrk.zzg;
                    ((zzfri) zzfrj).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfqq zzfqq, JSONObject jSONObject, int i, boolean z) {
        zzfqq.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzfqq zzfqq, JSONObject jSONObject, boolean z) {
        int zzk2;
        boolean z2;
        if (zzfrb.zzb(view) == null && (zzk2 = this.zzk.zzk(view)) != 3) {
            JSONObject zza2 = zzfqq.zza(view);
            zzfqy.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfqy.zzb(zza2, zzd2);
                zzfqy.zze(zza2, Boolean.valueOf(this.zzk.zzj(view)));
                this.zzk.zzh();
            } else {
                zzfrc zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfqy.zzd(zza2, zzb2);
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzk(view, zzfqq, zza2, zzk2, z || z2);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfrf(this));
    }
}
