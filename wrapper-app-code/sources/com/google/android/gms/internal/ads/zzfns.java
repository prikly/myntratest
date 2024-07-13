package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfns {
    private final HashMap zza = new HashMap();
    private final zzfny zzb = new zzfny(zzt.zzB());

    private zzfns() {
        this.zza.put("new_csi", "1");
    }

    public static zzfns zzb(String str) {
        zzfns zzfns = new zzfns();
        zzfns.zza.put("action", str);
        return zzfns;
    }

    public static zzfns zzc(String str) {
        zzfns zzfns = new zzfns();
        zzfns.zza.put("request_id", str);
        return zzfns;
    }

    public final zzfns zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfns zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfns zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfns zzf(zzfil zzfil) {
        this.zza.put("aai", zzfil.zzx);
        return this;
    }

    public final zzfns zzg(zzfio zzfio) {
        if (!TextUtils.isEmpty(zzfio.zzb)) {
            this.zza.put("gqi", zzfio.zzb);
        }
        return this;
    }

    public final zzfns zzh(zzfix zzfix, zzchb zzchb) {
        zzfiw zzfiw = zzfix.zzb;
        zzg(zzfiw.zzb);
        if (!zzfiw.zza.isEmpty()) {
            switch (((zzfil) zzfiw.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzchb != null) {
                        this.zza.put("as", true != zzchb.zzj() ? BuildConfig.ADAPTER_VERSION : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    public final zzfns zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfnx zzfnx : this.zzb.zza()) {
            hashMap.put(zzfnx.zza, zzfnx.zzb);
        }
        return hashMap;
    }
}
