package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzcin {
    private final zzcig zza = new zzcig();
    /* access modifiers changed from: private */
    public final AtomicInteger zzb = new AtomicInteger(0);

    public zzcin() {
        zzger.zzr(this.zza, new zzcil(this), zzcib.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzcik zzcik, zzcii zzcii) {
        zzger.zzr(this.zza, new zzcim(this, zzcik, zzcii), zzcib.zzf);
    }
}
