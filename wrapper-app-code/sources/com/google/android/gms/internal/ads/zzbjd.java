package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbjd {
    public static final SharedPreferences zza(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}
