package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzegl implements zzfmm {
    public final /* synthetic */ JSONObject zza;
    public final /* synthetic */ zzcce zzb;

    public /* synthetic */ zzegl(JSONObject jSONObject, zzcce zzcce) {
        this.zza = jSONObject;
        this.zzb = zzcce;
    }

    public final Object zza(Object obj) {
        return new zzehl(zzehz.zza(new InputStreamReader((InputStream) obj)), this.zza, this.zzb);
    }
}
