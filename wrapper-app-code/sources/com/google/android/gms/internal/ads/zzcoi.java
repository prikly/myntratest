package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcoi implements Runnable {
    public final /* synthetic */ zzcok zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcoi(zzcok zzcok, Map map) {
        this.zza = zzcok;
        this.zzb = map;
    }

    public final void run() {
        this.zza.zzr(this.zzb);
    }
}
