package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzefd implements zzeff {
    private final Map zza;
    private final zzgfc zzb;
    /* access modifiers changed from: private */
    public final zzdhg zzc;

    public zzefd(Map map, zzgfc zzgfc, zzdhg zzdhg) {
        this.zza = map;
        this.zzb = zzgfc;
        this.zzc = zzdhg;
    }

    public final zzgfb zzb(zzccb zzccb) {
        this.zzc.zzbG(zzccb);
        zzgfb zzh = zzger.zzh(new zzede(3));
        for (String trim : ((String) zzba.zzc().zzb(zzbjj.zzht)).split(",")) {
            zzhfc zzhfc = (zzhfc) this.zza.get(trim.trim());
            if (zzhfc != null) {
                zzh = zzger.zzg(zzh, zzede.class, new zzefb(zzhfc, zzccb), this.zzb);
            }
        }
        zzger.zzr(zzh, new zzefc(this), zzcib.zzf);
        return zzh;
    }
}
