package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzebs implements zzdeq, zzdgf, zzdhi {
    private final zzece zza;
    private final String zzb;
    private final String zzc;
    private int zzd = 0;
    private zzebr zze = zzebr.AD_REQUESTED;
    private zzdeg zzf;
    private zze zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private boolean zzk;

    zzebs(zzece zzece, zzfjg zzfjg, String str) {
        this.zza = zzece;
        this.zzc = str;
        this.zzb = zzfjg.zzf;
    }

    private static JSONObject zzh(zze zze2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zze2.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zze2.zza);
        jSONObject.put("errorDescription", zze2.zzb);
        zze zze3 = zze2.zzd;
        jSONObject.put("underlyingError", zze3 == null ? null : zzh(zze3));
        return jSONObject;
    }

    private final JSONObject zzi(zzdeg zzdeg) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzdeg.zzg());
        jSONObject2.put("responseSecsSinceEpoch", zzdeg.zzc());
        jSONObject2.put("responseId", zzdeg.zzi());
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzio)).booleanValue()) {
            String zzd2 = zzdeg.zzd();
            if (!TextUtils.isEmpty(zzd2)) {
                com.google.android.gms.ads.internal.util.zze.zze("Bidding data: ".concat(String.valueOf(zzd2)));
                jSONObject2.put("biddingData", new JSONObject(zzd2));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject2.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject2.put("postBody", this.zzi);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzu : zzdeg.zzj()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adapterClassName", zzu.zza);
            jSONObject3.put("latencyMillis", zzu.zzb);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzip)).booleanValue()) {
                jSONObject3.put("credentials", zzay.zzb().zzi(zzu.zzd));
            }
            zze zze2 = zzu.zzc;
            if (zze2 == null) {
                jSONObject = null;
            } else {
                jSONObject = zzh(zze2);
            }
            jSONObject3.put("error", jSONObject);
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    public final void zza(zze zze2) {
        this.zze = zzebr.AD_LOAD_FAILED;
        this.zzg = zze2;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzit)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final void zzb(zzfix zzfix) {
        if (!zzfix.zzb.zza.isEmpty()) {
            this.zzd = ((zzfil) zzfix.zzb.zza.get(0)).zzb;
        }
        if (!TextUtils.isEmpty(zzfix.zzb.zzb.zzk)) {
            this.zzh = zzfix.zzb.zzb.zzk;
        }
        if (!TextUtils.isEmpty(zzfix.zzb.zzb.zzl)) {
            this.zzi = zzfix.zzb.zzb.zzl;
        }
    }

    public final void zzbG(zzccb zzccb) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzit)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final void zzbJ(zzdan zzdan) {
        this.zzf = zzdan.zzl();
        this.zze = zzebr.AD_LOADED;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzit)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AdOperationMetric.INIT_STATE, this.zze);
        jSONObject.put("format", zzfil.zza(this.zzd));
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzit)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzj);
            if (this.zzj) {
                jSONObject.put("shown", this.zzk);
            }
        }
        zzdeg zzdeg = this.zzf;
        JSONObject jSONObject2 = null;
        if (zzdeg != null) {
            jSONObject2 = zzi(zzdeg);
        } else {
            zze zze2 = this.zzg;
            if (!(zze2 == null || (iBinder = zze2.zze) == null)) {
                zzdeg zzdeg2 = (zzdeg) iBinder;
                jSONObject2 = zzi(zzdeg2);
                if (zzdeg2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final void zze() {
        this.zzj = true;
    }

    public final void zzf() {
        this.zzk = true;
    }

    public final boolean zzg() {
        return this.zze != zzebr.AD_REQUESTED;
    }
}
