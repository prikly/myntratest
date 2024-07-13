package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdzc {
    private final ConcurrentHashMap zza;
    private final zzchb zzb;
    private final zzfjg zzc;
    private final String zzd;
    private final String zze;

    public zzdzc(zzdzm zzdzm, zzchb zzchb, zzfjg zzfjg, String str, String str2) {
        this.zza = zzdzm.zzc();
        this.zzb = zzchb;
        this.zzc = zzfjg;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgv)).booleanValue()) {
            int zze2 = zzf.zze(this.zzc);
            int i = zze2 - 1;
            if (i != 0) {
                if (i == 1) {
                    this.zza.put("se", "query_g");
                } else if (i == 2) {
                    this.zza.put("se", "r_adinfo");
                } else if (i != 3) {
                    this.zza.put("se", "r_both");
                } else {
                    this.zza.put("se", "r_adstring");
                }
                this.zza.put("scar", "true");
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzgU)).booleanValue()) {
                    this.zza.put("ad_format", this.zze);
                }
                if (zze2 == 2) {
                    this.zza.put("rid", this.zzd);
                }
                zzd("ragent", this.zzc.zzd.zzp);
                zzd("rtype", zzf.zza(zzf.zzb(this.zzc.zzd)));
                return;
            }
            this.zza.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfix zzfix) {
        if (zzfix.zzb.zza.size() > 0) {
            switch (((zzfil) zzfix.zzb.zza.get(0)).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzj() ? BuildConfig.ADAPTER_VERSION : "1");
                    break;
                default:
                    this.zza.put("ad_format", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
                    break;
            }
        }
        zzd("gqi", zzfix.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
