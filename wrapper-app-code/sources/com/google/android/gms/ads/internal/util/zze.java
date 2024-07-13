package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zze extends zzcho {
    public static void zza(String str) {
        if (!zzc()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        boolean z = true;
        for (String str2 : zza.zzd(str)) {
            if (z) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzm(2) && ((Boolean) zzblc.zza.zze()).booleanValue();
    }
}
