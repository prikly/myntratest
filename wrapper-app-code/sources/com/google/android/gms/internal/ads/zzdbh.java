package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdbh implements zzo {
    private final zzdfu zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzdbh(zzdfu zzdfu) {
        this.zza = zzdfu;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    public final void zzb() {
        this.zza.zzc();
    }

    public final void zzbE() {
        zzh();
    }

    public final void zzbM() {
    }

    public final void zzbs() {
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
