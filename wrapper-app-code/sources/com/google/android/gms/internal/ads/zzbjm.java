package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbjm {
    private final String zza = ((String) zzbkt.zzb.zze());
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbjm(Context context, String str) {
        String str2;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzb.put("v", "3");
        this.zzb.put("os", Build.VERSION.RELEASE);
        this.zzb.put("api_v", Build.VERSION.SDK);
        Map map = this.zzb;
        zzt.zzp();
        map.put("device", zzs.zzq());
        Map map2 = this.zzb;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map map3 = this.zzb;
        zzt.zzp();
        boolean zzA = zzs.zzA(context);
        String str3 = BuildConfig.ADAPTER_VERSION;
        map3.put("is_lite_sdk", true != zzA ? str3 : "1");
        Future zzb2 = zzt.zzm().zzb(this.zzc);
        try {
            this.zzb.put("network_coarse", Integer.toString(((zzccg) zzb2.get()).zzk));
            this.zzb.put("network_fine", Integer.toString(((zzccg) zzb2.get()).zzl));
        } catch (Exception e2) {
            zzt.zzo().zzu(e2, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjr)).booleanValue()) {
            this.zzb.put("is_bstar", true == DeviceProperties.isBstar(context) ? "1" : str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
