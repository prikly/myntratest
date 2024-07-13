package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbpi implements zzbqd {
    public static final /* synthetic */ zzbpi zza = new zzbpi();

    private /* synthetic */ zzbpi() {
    }

    public final void zza(Object obj, Map map) {
        zzcop zzcop = (zzcop) obj;
        zzbqd zzbqd = zzbqc.zza;
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzhu)).booleanValue()) {
            zze.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zze.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcop.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        zze.zza("/canOpenApp;" + str + ";" + valueOf);
        ((zzbsw) zzcop).zzd("openableApp", hashMap);
    }
}
