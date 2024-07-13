package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzclc implements Runnable {
    public final /* synthetic */ zzcjx zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzclc(zzcjx zzcjx, Map map) {
        this.zza = zzcjx;
        this.zzb = map;
    }

    public final void run() {
        zzcjx zzcjx = this.zza;
        Map map = this.zzb;
        int i = zzclf.zzc;
        zzcjx.zzd("onGcacheInfoEvent", map);
    }
}
