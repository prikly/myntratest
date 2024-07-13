package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdsy implements zzfxt {
    public final /* synthetic */ zzdth zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdsy(zzdth zzdth, JSONObject jSONObject) {
        this.zza = zzdth;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zza.zza(this.zzb, (List) obj);
    }
}
