package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.OSInAppMessageContentKt;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdth {
    private final Context zza;
    private final zzdsq zzb;
    private final zzapj zzc;
    private final zzchu zzd;
    private final zza zze;
    private final zzbew zzf;
    private final Executor zzg;
    private final zzblz zzh;
    private final zzdtz zzi;
    private final zzdwp zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvk zzl;
    private final zzdzh zzm;
    private final zzfnt zzn;
    private final zzfpo zzo;
    private final zzekc zzp;

    public zzdth(Context context, zzdsq zzdsq, zzapj zzapj, zzchu zzchu, zza zza2, zzbew zzbew, Executor executor, zzfjg zzfjg, zzdtz zzdtz, zzdwp zzdwp, ScheduledExecutorService scheduledExecutorService, zzdzh zzdzh, zzfnt zzfnt, zzfpo zzfpo, zzekc zzekc, zzdvk zzdvk) {
        this.zza = context;
        this.zzb = zzdsq;
        this.zzc = zzapj;
        this.zzd = zzchu;
        this.zze = zza2;
        this.zzf = zzbew;
        this.zzg = executor;
        this.zzh = zzfjg.zzi;
        this.zzi = zzdtz;
        this.zzj = zzdwp;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdzh;
        this.zzn = zzfnt;
        this.zzo = zzfpo;
        this.zzp = zzekc;
        this.zzl = zzdvk;
    }

    public static final zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzgau.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgau.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzel zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzgau.zzm(arrayList);
    }

    private static zzgfb zzl(zzgfb zzgfb, Object obj) {
        return zzger.zzg(zzgfb, Exception.class, new zzdte((Object) null), zzcib.zzf);
    }

    private static zzgfb zzm(boolean z, zzgfb zzgfb, Object obj) {
        if (z) {
            return zzger.zzn(zzgfb, new zzdtc(zzgfb), zzcib.zzf);
        }
        return zzl(zzgfb, (Object) null);
    }

    private final zzgfb zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzger.zzi((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzger.zzi((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt(IabUtils.KEY_WIDTH, -1);
        int optInt2 = jSONObject.optInt(IabUtils.KEY_HEIGHT, -1);
        if (z) {
            return zzger.zzi(new zzblx((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzger.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzdtf(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
    }

    private final zzgfb zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzger.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzger.zzm(zzger.zze(arrayList), zzdtd.zza, this.zzg);
    }

    private final zzgfb zzp(JSONObject jSONObject, zzfil zzfil, zzfio zzfio) {
        zzgfb zzb2 = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(OSInAppMessageContentKt.HTML), zzfil, zzfio, zzk(jSONObject.optInt(IabUtils.KEY_WIDTH, 0), jSONObject.optInt(IabUtils.KEY_HEIGHT, 0)));
        return zzger.zzn(zzb2, new zzdtg(zzb2), zzcib.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzel(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzblu zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", TTAdSdk.INIT_LOCAL_FAIL_CODE);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzblu(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzb(zzq zzq, zzfil zzfil, zzfio zzfio, String str, String str2, Object obj) throws Exception {
        zzcno zza2 = this.zzj.zza(zzq, zzfil, zzfio);
        zzcif zza3 = zzcif.zza(zza2);
        zzdvh zzb2 = this.zzl.zzb();
        zzdvh zzdvh = zzb2;
        zzcpb zzP = zza2.zzP();
        zzb zzb3 = r3;
        zzb zzb4 = new zzb(this.zza, (zzcep) null, (zzcbh) null);
        zzP.zzM(zzb2, zzdvh, zzb2, zzb2, zzb2, false, (zzbqf) null, zzb3, (zzbyu) null, (zzcep) null, this.zzp, this.zzo, this.zzm, this.zzn, (zzbqv) null, zzb2, (zzbqu) null, (zzbqo) null);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdk)).booleanValue()) {
            zza2.zzaf("/getNativeAdViewSignals", zzbqc.zzs);
        }
        zza2.zzaf("/getNativeClickMeta", zzbqc.zzt);
        zza2.zzP().zzA(new zzdtb(zza3));
        zza2.zzad(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(String str, Object obj) throws Exception {
        zzt.zzz();
        zzcno zza2 = zzcoa.zza(this.zza, zzcpd.zza(), "native-omid", false, false, this.zzc, (zzbki) null, this.zzd, (zzbjy) null, (zzl) null, this.zze, this.zzf, (zzfil) null, (zzfio) null);
        zzcif zza3 = zzcif.zza(zza2);
        zza2.zzP().zzA(new zzdsx(zza3));
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzeB)).booleanValue()) {
            zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza2.loadData(str, "text/html", "UTF-8");
        }
        return zza3;
    }

    public final zzgfb zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzger.zzi((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzger.zzm(zzo(optJSONArray, false, true), new zzdsy(this, optJSONObject), this.zzg), (Object) null);
    }

    public final zzgfb zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzgfb zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzblz zzblz = this.zzh;
        return zzo(optJSONArray, zzblz.zzb, zzblz.zzd);
    }

    public final zzgfb zzg(JSONObject jSONObject, String str, zzfil zzfil, zzfio zzfio) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziK)).booleanValue()) {
            return zzger.zzi((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzger.zzi((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzger.zzi((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString(OSInAppMessageContentKt.HTML);
        zzq zzk2 = zzk(optJSONObject.optInt(IabUtils.KEY_WIDTH, 0), optJSONObject.optInt(IabUtils.KEY_HEIGHT, 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzger.zzi((Object) null);
        }
        zzgfb zzn2 = zzger.zzn(zzger.zzi((Object) null), new zzdsz(this, zzk2, zzfil, zzfio, optString, optString2), zzcib.zze);
        return zzger.zzn(zzn2, new zzdta(zzn2), zzcib.zzf);
    }

    public final zzgfb zzh(JSONObject jSONObject, zzfil zzfil, zzfio zzfio) {
        zzgfb zzgfb;
        JSONObject zzg2 = zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg2 != null) {
            return zzp(zzg2, zzfil, zzfio);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzger.zzi((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziJ)).booleanValue() && optJSONObject.has(OSInAppMessageContentKt.HTML)) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                zze.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzger.zzi((Object) null);
            }
        } else if (!z) {
            zzgfb = this.zzi.zza(optJSONObject);
            return zzl(zzger.zzo(zzgfb, (long) ((Integer) zzba.zzc().zzb(zzbjj.zzdl)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        zzgfb = zzp(optJSONObject, zzfil, zzfio);
        return zzl(zzger.zzo(zzgfb, (long) ((Integer) zzba.zzc().zzb(zzbjj.zzdl)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }

    private final zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.zzc();
            }
            i = 0;
        }
        return new zzq(this.zza, new AdSize(i, i2));
    }
}
