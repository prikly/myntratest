package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbiy extends zzbjb {
    zzbiy(int i, String str, Float f2) {
        super(1, str, f2, (zzbja) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zzn(), (double) ((Float) zzm()).floatValue()));
    }

    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Float) zzm();
    }

    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzn(), ((Float) zzm()).floatValue()));
    }

    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zzn(), ((Float) obj).floatValue());
    }
}
