package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbiv extends zzbjb {
    zzbiv(int i, String str, Boolean bool) {
        super(i, str, bool, (zzbja) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Boolean) zzm();
    }

    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(zzn(), ((Boolean) obj).booleanValue());
    }
}
