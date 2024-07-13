package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbvf implements zzgdy {
    private final zzbul zza;
    private final zzbum zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzgfb zzd;

    zzbvf(zzgfb zzgfb, String str, zzbum zzbum, zzbul zzbul) {
        this.zzd = zzgfb;
        this.zzb = zzbum;
        this.zza = zzbul;
    }

    public final zzgfb zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzgfb zzb(Object obj) {
        return zzger.zzn(this.zzd, new zzbvd(this, obj), zzcib.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(Object obj, zzbug zzbug) throws Exception {
        zzcig zzcig = new zzcig();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbqc.zzo.zzc(uuid, new zzbve(this, zzcig));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(OSOutcomeConstants.OUTCOME_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbug.zzl(this.zzc, jSONObject);
        return zzcig;
    }
}
