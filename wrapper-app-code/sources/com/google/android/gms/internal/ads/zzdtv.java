package com.google.android.gms.internal.ads;

import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdtv implements zzbbx {
    public final /* synthetic */ zzcno zza;

    public /* synthetic */ zzdtv(zzcno zzcno) {
        this.zza = zzcno;
    }

    public final void zzc(zzbbw zzbbw) {
        zzcno zzcno = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != zzbbw.zzj ? BuildConfig.ADAPTER_VERSION : "1");
        zzcno.zzd("onAdVisibilityChanged", hashMap);
    }
}
