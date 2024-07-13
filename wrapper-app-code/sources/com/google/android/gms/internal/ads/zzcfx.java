package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcfx implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcfy zza;
    private final String zzb;

    public zzcfx(zzcfy zzcfy, String str) {
        this.zza = zzcfy;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzcfw zzcfw : this.zza.zzb) {
                zzcfw.zza.zzb(zzcfw.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
