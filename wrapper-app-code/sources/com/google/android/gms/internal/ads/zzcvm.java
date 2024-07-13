package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvm implements zzcve {
    private final zzece zza;

    zzcvm(zzece zzece) {
        this.zza = zzece;
    }

    public final void zza(Map map) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzin)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.zza.zzl(str);
            }
        }
    }
}
