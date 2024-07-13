package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdfa extends zzdjx implements zzder {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzdfa(zzdez zzdez, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        zzj(zzdez, executor);
    }

    public final void zza(zze zze) {
        zzo(new zzdet(zze));
    }

    public final void zzb() {
        zzo(zzdev.zza);
    }

    public final void zzc(zzdod zzdod) {
        if (!this.zzd) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzo(new zzdes(zzdod));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.zze.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdod("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new zzdeu(this), (long) ((Integer) zzba.zzc().zzb(zzbjj.zziT)).intValue(), TimeUnit.MILLISECONDS);
    }
}
