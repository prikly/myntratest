package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.ironsource.mediationsdk.config.VersionInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzccl extends zzccm {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbuj zzd;

    public zzccl(Context context, zzbuj zzbuj) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbuj;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzchu.zza().zza);
            jSONObject.put("mf", zzbkz.zza.zze());
            jSONObject.put("cl", "496518605");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", VersionInfo.GIT_BRANCH);
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final zzgfb zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzt.zzB().currentTimeMillis() - this.zzc.getLong("js_last_update", 0) < ((Long) zzbkz.zzb.zze()).longValue()) {
            return zzger.zzi((Object) null);
        }
        return zzger.zzm(this.zzd.zzb(zzc(this.zzb)), new zzcck(this), zzcib.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbjj.zzd(this.zzb, 1, jSONObject);
        this.zzc.edit().putLong("js_last_update", zzt.zzB().currentTimeMillis()).apply();
        return null;
    }
}
