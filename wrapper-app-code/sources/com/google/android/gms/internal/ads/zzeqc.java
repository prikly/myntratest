package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeqc implements zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdel zzb;
    private final zzdff zzc;
    private final zzdme zzd;
    private final zzdlw zze;
    private final zzcws zzf;

    zzeqc(zzdel zzdel, zzdff zzdff, zzdme zzdme, zzdlw zzdlw, zzcws zzcws) {
        this.zzb = zzdel;
        this.zzc = zzdff;
        this.zzd = zzdme;
        this.zze = zzdlw;
        this.zzf = zzcws;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
