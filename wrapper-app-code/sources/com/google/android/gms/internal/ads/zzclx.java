package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzclx implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcma zzd;

    zzclx(zzcma zzcma, String str, String str2, int i) {
        this.zzd = zzcma;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzcma.zza(this.zzd, "onPrecacheEvent", hashMap);
    }
}
