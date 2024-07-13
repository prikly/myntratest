package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfka {
    public static void zza(Context context, boolean z) {
        if (z) {
            zze.zzi("This request is sent from a test device.");
            return;
        }
        zzay.zzb();
        String zzz = zzchh.zzz(context);
        zze.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzz + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zze.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i != 3) {
            zzt.zzo().zzt(th, str);
        }
    }
}
