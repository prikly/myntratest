package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbux implements zzbuj {
    /* access modifiers changed from: private */
    public final zzbul zza;
    private final zzbum zzb;
    private final zzbuf zzc;
    private final String zzd;

    zzbux(zzbuf zzbuf, String str, zzbum zzbum, zzbul zzbul) {
        this.zzc = zzbuf;
        this.zzd = str;
        this.zzb = zzbum;
        this.zza = zzbul;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbux zzbux, zzbtz zzbtz, zzbug zzbug, Object obj, zzcig zzcig) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbqc.zzo.zzc(uuid, new zzbuw(zzbux, zzbtz, zzcig));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(OSOutcomeConstants.OUTCOME_ID, uuid);
            jSONObject.put("args", zzbux.zzb.zzb(obj));
            zzbug.zzl(zzbux.zzd, jSONObject);
        } catch (Exception e2) {
            zzcig.zze(e2);
            zze.zzh("Unable to invokeJavascript", e2);
            zzbtz.zzb();
        } catch (Throwable th) {
            zzbtz.zzb();
            throw th;
        }
    }

    public final zzgfb zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzgfb zzb(Object obj) {
        zzcig zzcig = new zzcig();
        zzbtz zzb2 = this.zzc.zzb((zzapj) null);
        zzb2.zzi(new zzbuu(this, zzb2, obj, zzcig), new zzbuv(this, zzcig, zzb2));
        return zzcig;
    }
}
