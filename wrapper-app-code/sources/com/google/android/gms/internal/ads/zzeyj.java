package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeyj implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzeyj(List list, Bundle bundle) {
        this.zza = list;
        this.zzb = bundle;
    }

    public final Object call() {
        List<zzgfb> list = this.zza;
        Bundle bundle = this.zzb;
        JSONArray jSONArray = new JSONArray();
        for (zzgfb zzgfb : list) {
            if (((JSONObject) zzgfb.get()) != null) {
                jSONArray.put(zzgfb.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzeyn(jSONArray.toString(), bundle);
    }
}
