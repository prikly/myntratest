package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvc {
    private final Map zza;
    private final Map zzb;

    zzcvc(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfix zzfix) throws Exception {
        for (zzfiv zzfiv : zzfix.zzb.zzc) {
            if (this.zza.containsKey(zzfiv.zza)) {
                ((zzcvf) this.zza.get(zzfiv.zza)).zza(zzfiv.zzb);
            } else if (this.zzb.containsKey(zzfiv.zza)) {
                zzcve zzcve = (zzcve) this.zzb.get(zzfiv.zza);
                JSONObject jSONObject = zzfiv.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcve.zza(hashMap);
            }
        }
    }
}
