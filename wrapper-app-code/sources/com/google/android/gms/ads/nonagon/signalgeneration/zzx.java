package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzm;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfow;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgfb;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzx implements zzgen {
    final /* synthetic */ zzgfb zza;
    final /* synthetic */ zzcgj zzb;
    final /* synthetic */ zzcgc zzc;
    final /* synthetic */ zzfol zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzac zzf;

    zzx(zzac zzac, zzgfb zzgfb, zzcgj zzcgj, zzcgc zzcgc, zzfol zzfol, long j) {
        this.zzf = zzac;
        this.zza = zzgfb;
        this.zzb = zzcgj;
        this.zzc = zzcgc;
        this.zzd = zzfol;
        this.zze = j;
    }

    public final void zza(Throwable th) {
        long currentTimeMillis = zzt.zzB().currentTimeMillis();
        long j = this.zze;
        String message = th.getMessage();
        zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzac zzac = this.zzf;
        zzf.zzc(zzac.zzr, zzac.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis - j)));
        zzfow zzr = zzac.zzr(this.zza, this.zzb);
        if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
            zzfol zzfol = this.zzd;
            zzfol.zzg(th);
            zzfol.zzf(false);
            zzr.zza(zzfol);
            zzr.zzg();
        }
        try {
            zzcgc zzcgc = this.zzc;
            zzcgc.zzb("Internal error. " + message);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzao zzao = (zzao) obj;
        zzfow zzr = zzac.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgV)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e2) {
                zze.zzg("QueryInfo generation has been disabled.".concat(e2.toString()));
            }
            if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                zzfol zzfol = this.zzd;
                zzfol.zzc("QueryInfo generation has been disabled.");
                zzfol.zzf(false);
                zzr.zza(zzfol);
                zzr.zzg();
                return;
            }
            return;
        }
        long currentTimeMillis = zzt.zzB().currentTimeMillis() - this.zze;
        if (zzao == null) {
            try {
                this.zzc.zzc((String) null, (String) null, (Bundle) null);
                zzac zzac = this.zzf;
                zzf.zzc(zzac.zzr, zzac.zzj, "sgs", new Pair("rid", "-1"));
                this.zzd.zzf(true);
                if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (RemoteException e3) {
                zzfol zzfol2 = this.zzd;
                zzfol2.zzg(e3);
                zzfol2.zzf(false);
                zzcho.zzh("", e3);
                zzt.zzo().zzu(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } else {
            try {
                JSONObject jSONObject = new JSONObject(zzao.zzb);
                String optString = jSONObject.optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    zze.zzj("The request ID is empty in request JSON.");
                    this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                    zzac zzac2 = this.zzf;
                    zzf.zzc(zzac2.zzr, zzac2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                    zzfol zzfol3 = this.zzd;
                    zzfol3.zzc("Request ID empty");
                    zzfol3.zzf(false);
                    if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    return;
                }
                zzac zzac3 = this.zzf;
                zzac.zzG(zzac3, optString, zzao.zzb, zzac3.zzj);
                Bundle bundle = zzao.zzc;
                zzac zzac4 = this.zzf;
                if (zzac4.zzw && bundle != null && bundle.getInt(zzac4.zzy, -1) == -1) {
                    zzac zzac5 = this.zzf;
                    bundle.putInt(zzac5.zzy, zzac5.zzz.get());
                }
                zzac zzac6 = this.zzf;
                if (zzac6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzac6.zzx))) {
                    if (TextUtils.isEmpty(this.zzf.zzB)) {
                        zzac zzac7 = this.zzf;
                        zzs zzp = zzt.zzp();
                        zzac zzac8 = this.zzf;
                        zzac7.zzB = zzp.zzc(zzac8.zzg, zzac8.zzA.zza);
                    }
                    zzac zzac9 = this.zzf;
                    bundle.putString(zzac9.zzx, zzac9.zzB);
                }
                this.zzc.zzc(zzao.zza, zzao.zzb, bundle);
                zzac zzac10 = this.zzf;
                zzdzm zzp2 = zzac10.zzr;
                zzdzc zzo = zzac10.zzj;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                String str = "na";
                if (((Boolean) zzba.zzc().zzb(zzbjj.zziC)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : BuildConfig.ADAPTER_VERSION;
                    } catch (JSONException e4) {
                        zze.zzh("Error retrieving JSONObject from the requestJson, ", e4);
                    }
                }
                pairArr[1] = new Pair("tpc", str);
                zzf.zzc(zzp2, zzo, "sgs", pairArr);
                this.zzd.zzf(true);
                if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (JSONException e5) {
                zze.zzj("Failed to create JSON object from the request string.");
                zzcgc zzcgc = this.zzc;
                String obj2 = e5.toString();
                zzcgc.zzb("Internal error for request JSON: " + obj2);
                zzac zzac11 = this.zzf;
                zzf.zzc(zzac11.zzr, zzac11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                zzfol zzfol4 = this.zzd;
                zzfol4.zzg(e5);
                zzfol4.zzf(false);
                zzt.zzo().zzu(e5, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbks.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            }
        }
    }
}
