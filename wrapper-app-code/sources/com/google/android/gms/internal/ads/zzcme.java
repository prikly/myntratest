package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcme extends zzcma {
    public zzcme(zzcjx zzcjx) {
        super(zzcjx);
    }

    public final void zzb() {
    }

    public final boolean zzq(String str) {
        String zze = zzchh.zze(str);
        zzcjx zzcjx = (zzcjx) this.zzc.get();
        if (!(zzcjx == null || zze == null)) {
            zzcjx.zzv(zze, this);
        }
        zze.zzj("VideoStreamNoopCache is doing nothing.");
        zzc(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
