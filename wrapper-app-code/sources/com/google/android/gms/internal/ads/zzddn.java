package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzddn implements zzbbx, zzden, zzdfd, zzdjf, zzdll {
    /* access modifiers changed from: private */
    public final zzdff zza;
    private final zzfil zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzgfk zze = zzgfk.zzf();
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzddn(zzdff zzdff, zzfil zzfil, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzdff;
        this.zzb = zzfil;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (!this.zze.isDone()) {
                this.zze.zzd(true);
            }
        }
    }

    public final void zzbw() {
    }

    public final void zzbx() {
    }

    public final void zzc(zzbbw zzbbw) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjt)).booleanValue() && this.zzb.zzZ != 2 && zzbbw.zzj && this.zzg.compareAndSet(false, true)) {
            zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final void zzd() {
    }

    public final synchronized void zze() {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(true);
        }
    }

    public final void zzf() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbp)).booleanValue()) {
            zzfil zzfil = this.zzb;
            if (zzfil.zzZ != 2) {
                return;
            }
            if (zzfil.zzr == 0) {
                this.zza.zza();
                return;
            }
            zzger.zzr(this.zze, new zzddm(this), this.zzd);
            this.zzf = this.zzc.schedule(new zzddl(this), (long) this.zzb.zzr, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzg() {
    }

    public final void zzj() {
    }

    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zze2) {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zze(new Exception());
        }
    }

    public final void zzm() {
    }

    public final void zzo() {
        int i = this.zzb.zzZ;
        if (i == 0 || i == 1) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzjt)).booleanValue()) {
                this.zza.zza();
            }
        }
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
    }
}
