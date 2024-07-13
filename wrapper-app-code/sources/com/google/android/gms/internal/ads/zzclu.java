package com.google.android.gms.internal.ads;

import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzclu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcma zze;

    zzclu(zzcma zzcma, String str, String str2, int i, int i2, boolean z) {
        this.zze = zzcma;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", BuildConfig.ADAPTER_VERSION);
        zzcma.zza(this.zze, "onPrecacheEvent", hashMap);
    }
}
