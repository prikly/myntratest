package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpu {
    private final zzfqb zza;
    private final zzfqb zzb;
    private final zzfpy zzc;
    private final zzfqa zzd;

    private zzfpu(zzfpy zzfpy, zzfqa zzfqa, zzfqb zzfqb, zzfqb zzfqb2, boolean z) {
        this.zzc = zzfpy;
        this.zzd = zzfqa;
        this.zza = zzfqb;
        if (zzfqb2 == null) {
            this.zzb = zzfqb.NONE;
        } else {
            this.zzb = zzfqb2;
        }
    }

    public static zzfpu zza(zzfpy zzfpy, zzfqa zzfqa, zzfqb zzfqb, zzfqb zzfqb2, boolean z) {
        zzfra.zzb(zzfqa, "ImpressionType is null");
        zzfra.zzb(zzfqb, "Impression owner is null");
        if (zzfqb == zzfqb.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzfpy == zzfpy.DEFINED_BY_JAVASCRIPT && zzfqb == zzfqb.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzfqa != zzfqa.DEFINED_BY_JAVASCRIPT || zzfqb != zzfqb.NATIVE) {
            return new zzfpu(zzfpy, zzfqa, zzfqb, zzfqb2, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfqy.zzh(jSONObject, "impressionOwner", this.zza);
        zzfqy.zzh(jSONObject, "mediaEventsOwner", this.zzb);
        zzfqy.zzh(jSONObject, "creativeType", this.zzc);
        zzfqy.zzh(jSONObject, "impressionType", this.zzd);
        zzfqy.zzh(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
