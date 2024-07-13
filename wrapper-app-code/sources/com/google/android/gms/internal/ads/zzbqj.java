package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbqj implements zzbqd {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzb zzb;
    private final zzbyn zzc;
    private final zzbyu zzd;

    public zzbqj(zzb zzb2, zzbyn zzbyn, zzbyu zzbyu) {
        this.zzb = zzb2;
        this.zzc = zzbyn;
        this.zzd = zzbyu;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        int intValue = ((Integer) zza.get((String) map.get(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.zzc()) {
                    this.zzb.zzb((String) null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                } else if (intValue == 3) {
                    new zzbyq(zzcno, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbyl(zzcno, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zze.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcno == null) {
            zze.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcno.zzas(i);
    }
}
