package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfjm implements zzbqd {
    public final /* synthetic */ zzfpo zza;
    public final /* synthetic */ zzekc zzb;

    public /* synthetic */ zzfjm(zzfpo zzfpo, zzekc zzekc) {
        this.zza = zzfpo;
        this.zzb = zzekc;
    }

    public final void zza(Object obj, Map map) {
        zzfpo zzfpo = this.zza;
        zzekc zzekc = this.zzb;
        zzcnf zzcnf = (zzcnf) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from httpTrack GMSG.");
        } else if (!zzcnf.zzF().zzak) {
            zzfpo.zzc(str, (zzfow) null);
        } else {
            zzekc.zzd(new zzeke(zzt.zzB().currentTimeMillis(), ((zzcol) zzcnf).zzR().zzb, str, 2));
        }
    }
}
