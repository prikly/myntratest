package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbve implements zzbqq {
    final /* synthetic */ zzbvf zza;
    private final zzcig zzb;

    public zzbve(zzbvf zzbvf, zzcig zzcig) {
        this.zza = zzbvf;
        this.zzb = zzcig;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzb.zze(new zzbui());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zzb.zze(new zzbui(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.zzb.zze(e2);
        }
    }
}
