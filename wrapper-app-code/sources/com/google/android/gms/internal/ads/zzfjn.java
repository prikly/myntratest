package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfjn implements zzbqd {
    public final /* synthetic */ zzdmc zza;
    public final /* synthetic */ zzfpo zzb;
    public final /* synthetic */ zzekc zzc;

    public /* synthetic */ zzfjn(zzdmc zzdmc, zzfpo zzfpo, zzekc zzekc) {
        this.zza = zzdmc;
        this.zzb = zzfpo;
        this.zzc = zzekc;
    }

    public final void zza(Object obj, Map map) {
        zzdmc zzdmc = this.zza;
        zzfpo zzfpo = this.zzb;
        zzekc zzekc = this.zzc;
        zzcno zzcno = (zzcno) obj;
        zzbqc.zzd(map, zzdmc);
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from click GMSG.");
        } else {
            zzger.zzr(zzbqc.zzb(zzcno, str), new zzfjo(zzcno, zzfpo, zzekc), zzcib.zza);
        }
    }
}
