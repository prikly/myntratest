package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcly implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcma zzd;

    zzcly(zzcma zzcma, String str, String str2, long j) {
        this.zzd = zzcma;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzcma.zza(this.zzd, "onPrecacheEvent", hashMap);
    }
}
