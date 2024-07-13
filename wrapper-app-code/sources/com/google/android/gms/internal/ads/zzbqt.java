package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbqt implements zzbqd {
    private final zzbqs zza;

    public zzbqt(zzbqs zzbqs) {
        this.zza = zzbqs;
    }

    public static void zzb(zzcno zzcno, zzbqs zzbqs) {
        zzcno.zzaf("/reward", new zzbqt(zzbqs));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzcdd zzcdd = null;
            try {
                int parseInt = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzcdd = new zzcdd(str2, parseInt);
                }
            } catch (NumberFormatException e2) {
                zze.zzk("Unable to parse reward amount.", e2);
            }
            this.zza.zza(zzcdd);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
