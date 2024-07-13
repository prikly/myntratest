package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzezp {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfow zzd;
    private final zzdzh zze;

    public zzezp(Context context, Executor executor, Set set, zzfow zzfow, zzdzh zzdzh) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfow;
        this.zze = zzdzh;
    }

    public final zzgfb zza(Object obj) {
        zzfol zza2 = zzfok.zza(this.zza, 8);
        zza2.zzh();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        for (zzezm zzezm : this.zzb) {
            zzgfb zzb2 = zzezm.zzb();
            zzb2.zzc(new zzezn(this, zzt.zzB().elapsedRealtime(), zzezm), zzcib.zzf);
            arrayList.add(zzb2);
        }
        zzgfb zza3 = zzger.zzc(arrayList).zza(new zzezo(arrayList, obj), this.zzc);
        if (zzfoy.zza()) {
            zzfov.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }

    public final void zzb(long j, zzezm zzezm) {
        long elapsedRealtime = zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzblc.zza.zze()).booleanValue()) {
            String zzc2 = zzfyt.zzc(zzezm.getClass().getCanonicalName());
            zze.zza("Signal runtime (ms) : " + zzc2 + " = " + elapsedRealtime);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbQ)).booleanValue()) {
            zzdzg zza2 = this.zze.zza();
            zza2.zzb("action", "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzezm.zza()));
            zza2.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza2.zzh();
        }
    }
}
