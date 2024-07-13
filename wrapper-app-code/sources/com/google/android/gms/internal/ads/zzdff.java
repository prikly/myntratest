package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdff extends zzdjx {
    private boolean zzb = false;

    public zzdff(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzo(zzdfe.zza);
            this.zzb = true;
        }
    }
}
