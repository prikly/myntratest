package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvw implements zzcve {
    private final zzece zza;

    zzcvw(zzece zzece) {
        this.zza = zzece;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzm(str.equals("true"));
        }
    }
}
