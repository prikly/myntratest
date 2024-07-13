package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.plus.PlusShare;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzboz implements zzbqd {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get(PlusShare.KEY_CALL_TO_ACTION_LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zze.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zze.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzt.zzB().elapsedRealtime() + (Long.parseLong(str4) - zzt.zzB().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcno.zzo().zzc(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e2) {
                    zze.zzk("Malformed timestamp for CSI tick.", e2);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                zze.zzj("No value given for CSI experiment.");
            } else {
                zzcno.zzo().zza().zzd("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                zze.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zze.zzj("No name given for CSI extra.");
            } else {
                zzcno.zzo().zza().zzd(str6, str7);
            }
        }
    }
}
