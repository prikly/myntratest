package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbuw implements zzbqq {
    final /* synthetic */ zzbux zza;
    private final zzbtz zzb;
    private final zzcig zzc;

    public zzbuw(zzbux zzbux, zzbtz zzbtz, zzcig zzcig) {
        this.zza = zzbux;
        this.zzb = zzbtz;
        this.zzc = zzcig;
    }

    public final void zza(String str) {
        zzbtz zzbtz;
        if (str == null) {
            try {
                this.zzc.zze(new zzbui());
            } catch (IllegalStateException unused) {
                zzbtz = this.zzb;
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zze(new zzbui(str));
        }
        zzbtz = this.zzb;
        zzbtz.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        zzbtz zzbtz;
        try {
            this.zzc.zzd(this.zza.zza.zza(jSONObject));
            zzbtz = this.zzb;
        } catch (IllegalStateException unused) {
            zzbtz = this.zzb;
        } catch (JSONException e2) {
            this.zzc.zze(e2);
            zzbtz = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbtz.zzb();
    }
}
