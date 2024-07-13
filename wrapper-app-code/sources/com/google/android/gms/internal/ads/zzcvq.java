package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvq implements zzcve {
    private final zzfik zza;

    public zzcvq(zzfik zzfik) {
        this.zza = zzfik;
    }

    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
