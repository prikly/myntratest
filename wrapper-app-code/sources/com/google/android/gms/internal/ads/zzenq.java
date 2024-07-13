package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzenq implements zzenk {
    private final zzdos zza;
    private final zzgfc zzb;
    private final zzdsu zzc;
    private final zzfkc zzd;
    private final zzdvk zze;

    public zzenq(zzdos zzdos, zzgfc zzgfc, zzdsu zzdsu, zzfkc zzfkc, zzdvk zzdvk) {
        this.zza = zzdos;
        this.zzb = zzgfc;
        this.zzc = zzdsu;
        this.zzd = zzfkc;
        this.zze = zzdvk;
    }

    private final zzgfb zzg(zzfix zzfix, zzfil zzfil, JSONObject jSONObject) {
        zzgfb zza2 = this.zzd.zza();
        zzgfb zza3 = this.zzc.zza(zzfix, zzfil, jSONObject);
        return zzger.zzd(zza2, zza3).zza(new zzenl(this, zza3, zza2, zzfix, zzfil, jSONObject), this.zzb);
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        return zzger.zzn(zzger.zzn(this.zzd.zza(), new zzenn(this, zzfil), this.zzb), new zzeno(this, zzfix, zzfil), this.zzb);
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        zzfiq zzfiq = zzfil.zzt;
        return (zzfiq == null || zzfiq.zzc == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdqb zzc(zzgfb zzgfb, zzgfb zzgfb2, zzfix zzfix, zzfil zzfil, JSONObject jSONObject) throws Exception {
        zzdqg zzdqg = (zzdqg) zzgfb.get();
        zzdve zzdve = (zzdve) zzgfb2.get();
        zzdqh zzd2 = this.zza.zzd(new zzdbc(zzfix, zzfil, (String) null), new zzdqs(zzdqg), new zzdph(jSONObject, zzdve));
        zzd2.zzj().zzb();
        zzd2.zzk().zza(zzdve);
        zzd2.zzg().zza(zzdqg.zzr());
        zzd2.zzl().zza(this.zze);
        return zzd2.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzd(zzdve zzdve, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzger.zzi(zzdve));
        if (jSONObject.optBoolean("success")) {
            return zzger.zzi(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbui("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zze(zzfil zzfil, zzdve zzdve) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhH)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfil.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzger.zzn(zzdve.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzenm(this, zzdve), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzf(zzfix zzfix, zzfil zzfil, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzger.zzh(new zzede(3));
        }
        if (zzfix.zza.zza.zzk <= 1) {
            return zzger.zzm(zzg(zzfix, zzfil, jSONArray.getJSONObject(0)), zzenp.zza, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfix.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfix.zza.zza.zzk);
        for (int i = 0; i < zzfix.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfix, zzfil, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzger.zzh(new zzede(3)));
            }
        }
        return zzger.zzi(arrayList);
    }
}
