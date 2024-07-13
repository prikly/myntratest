package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbpf implements zzbqd {
    public static final /* synthetic */ zzbpf zza = new zzbpf();

    private /* synthetic */ zzbpf() {
    }

    public final void zza(Object obj, Map map) {
        zzcow zzcow = (zzcow) obj;
        zzbqd zzbqd = zzbqc.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzapj zzK = zzcow.zzK();
            if (zzK != null) {
                zzK.zzc().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zze.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}
