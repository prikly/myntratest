package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdro implements zzbqd {
    public final /* synthetic */ zzdrs zza;

    public /* synthetic */ zzdro(zzdrs zzdrs) {
        this.zza = zzdrs;
    }

    public final void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        zzcno.zzP().zzA(new zzdrr(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcno.loadData(str, "text/html", "UTF-8");
        } else {
            zzcno.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
