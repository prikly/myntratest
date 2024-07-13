package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfob {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfob(Context context, zzchu zzchu) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzchu.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", zzs.zzq());
        map.put("app", this.zzb);
        zzt.zzp();
        boolean zzA = zzs.zzA(this.zza);
        String str = BuildConfig.ADAPTER_VERSION;
        map.put("is_lite_sdk", true != zzA ? str : "1");
        List zzb2 = zzbjj.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgp)).booleanValue()) {
            zzb2.addAll(zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb2));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjr)).booleanValue()) {
            if (true == DeviceProperties.isBstar(this.zza)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
