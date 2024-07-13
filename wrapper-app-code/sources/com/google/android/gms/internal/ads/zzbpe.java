package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbpe implements zzbqd {
    public final /* synthetic */ zzdmc zza;

    public /* synthetic */ zzbpe(zzdmc zzdmc) {
        this.zza = zzdmc;
    }

    public final void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        zzbqc.zzd(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from click GMSG.");
        } else {
            zzger.zzr(zzbqc.zzb(zzcno, str), new zzbpt(zzcno), zzcib.zza);
        }
    }
}
