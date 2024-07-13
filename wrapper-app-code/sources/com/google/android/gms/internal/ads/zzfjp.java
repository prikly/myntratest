package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfjp {
    private final zzfil zza;
    private final zzfio zzb;
    private final zzekc zzc;
    private final zzfpo zzd;
    private final zzfow zze;

    public zzfjp(zzekc zzekc, zzfpo zzfpo, zzfil zzfil, zzfio zzfio, zzfow zzfow) {
        this.zza = zzfil;
        this.zzb = zzfio;
        this.zzc = zzekc;
        this.zzd = zzfpo;
        this.zze = zzfow;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeke(zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
