package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdjj implements zzdhi {
    private int zza = ((Integer) zzba.zzc().zzb(zzbjj.zzba)).intValue();

    public final synchronized void zzb(zzfix zzfix) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbb)).booleanValue()) {
            try {
                this.zza = zzfix.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void zzbG(zzccb zzccb) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
