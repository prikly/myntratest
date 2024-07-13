package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdms extends zzdjx {
    private boolean zzb;

    protected zzdms(Set set) {
        super(set);
    }

    public final void zza() {
        zzo(zzdmo.zza);
    }

    public final void zzb() {
        zzo(zzdmq.zza);
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzo(zzdmp.zza);
            this.zzb = true;
        }
        zzo(zzdmr.zza);
    }

    public final synchronized void zzd() {
        zzo(zzdmp.zza);
        this.zzb = true;
    }
}
