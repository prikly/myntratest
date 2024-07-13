package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcwh implements zza, zzden, zzdfd, zzdfh, zzdgb {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzfix zze;
    /* access modifiers changed from: private */
    public final zzfil zzf;
    /* access modifiers changed from: private */
    public final zzfpk zzg;
    /* access modifiers changed from: private */
    public final zzfjp zzh;
    private final zzapj zzi;
    private final zzbki zzj;
    private final zzfow zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();
    private final zzbkk zzp;

    zzcwh(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfix zzfix, zzfil zzfil, zzfpk zzfpk, zzfjp zzfjp, View view, zzcno zzcno, zzapj zzapj, zzbki zzbki, zzbkk zzbkk, zzfow zzfow, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfix;
        this.zzf = zzfil;
        this.zzg = zzfpk;
        this.zzh = zzfjp;
        this.zzi = zzapj;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcno);
        this.zzj = zzbki;
        this.zzp = zzbkk;
        this.zzk = zzfow;
    }

    /* access modifiers changed from: private */
    public final void zzs() {
        int i;
        String zzh2 = ((Boolean) zzba.zzc().zzb(zzbjj.zzcZ)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), (Activity) null) : null;
        if ((!((Boolean) zzba.zzc().zzb(zzbjj.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbky.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbky.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
                zzcno zzcno = (zzcno) this.zzm.get();
            }
            zzger.zzr((zzgei) zzger.zzo(zzgei.zzv(zzger.zzi((Object) null)), ((Long) zzba.zzc().zzb(zzbjj.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcwg(this, zzh2), this.zzb);
            return;
        }
        zzfjp zzfjp = this.zzh;
        zzfpk zzfpk = this.zzg;
        zzfix zzfix = this.zze;
        zzfil zzfil = this.zzf;
        zzfjp.zza(zzfpk.zzd(zzfix, zzfil, false, zzh2, (String) null, zzfil.zzd));
    }

    private final void zzt(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new zzcwa(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzba.zzc().zzb(zzbjj.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbky.zzd.zze()).booleanValue()) {
            zzger.zzr(zzger.zzf(zzgei.zzv(this.zzj.zza()), Throwable.class, zzcwb.zza, zzcib.zzf), new zzcwf(this), this.zzb);
            return;
        }
        zzfjp zzfjp = this.zzh;
        zzfpk zzfpk = this.zzg;
        zzfix zzfix = this.zze;
        zzfil zzfil = this.zzf;
        List zzc2 = zzfpk.zzc(zzfix, zzfil, zzfil.zzc);
        int i = 1;
        if (true == zzt.zzo().zzx(this.zza)) {
            i = 2;
        }
        zzfjp.zzc(zzc2, i);
    }

    public final void zzbw() {
        zzfjp zzfjp = this.zzh;
        zzfpk zzfpk = this.zzg;
        zzfix zzfix = this.zze;
        zzfil zzfil = this.zzf;
        zzfjp.zza(zzfpk.zzc(zzfix, zzfil, zzfil.zzj));
    }

    public final void zzbx() {
        zzfjp zzfjp = this.zzh;
        zzfpk zzfpk = this.zzg;
        zzfix zzfix = this.zze;
        zzfil zzfil = this.zzf;
        zzfjp.zza(zzfpk.zzc(zzfix, zzfil, zzfil.zzh));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzb.execute(new zzcwe(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(int i, int i2) {
        zzt(i - 1, i2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(int i, int i2) {
        this.zzb.execute(new zzcwc(this, i, i2));
    }

    public final void zzj() {
    }

    public final void zzk(zze zze2) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfpk.zzf(2, zze2.zza, this.zzf.zzp)));
        }
    }

    public final void zzl() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) zzba.zzc().zzb(zzbjj.zzdd)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) zzba.zzc().zzb(zzbjj.zzde)).intValue());
                return;
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzdc)).booleanValue()) {
                this.zzc.execute(new zzcwd(this));
            } else {
                zzs();
            }
        }
    }

    public final void zzm() {
    }

    public final synchronized void zzn() {
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, (String) null, (String) null, arrayList));
        } else {
            zzfjp zzfjp = this.zzh;
            zzfpk zzfpk = this.zzg;
            zzfix zzfix = this.zze;
            zzfil zzfil = this.zzf;
            zzfjp.zza(zzfpk.zzc(zzfix, zzfil, zzfil.zzn));
            zzfjp zzfjp2 = this.zzh;
            zzfpk zzfpk2 = this.zzg;
            zzfix zzfix2 = this.zze;
            zzfil zzfil2 = this.zzf;
            zzfjp2.zza(zzfpk2.zzc(zzfix2, zzfil2, zzfil2.zzg));
        }
        this.zzn = true;
    }

    public final void zzo() {
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
        zzfjp zzfjp = this.zzh;
        zzfpk zzfpk = this.zzg;
        zzfil zzfil = this.zzf;
        zzfjp.zza(zzfpk.zze(zzfil, zzfil.zzi, zzccr));
    }
}
