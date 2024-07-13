package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfcr implements zzhep {
    public static zzezp zza(Context context, zzcgl zzcgl, zzcgm zzcgm, Object obj, zzfah zzfah, zzfbx zzfbx, zzhej zzhej, zzhej zzhej2, zzhej zzhej3, zzhej zzhej4, zzhej zzhej5, zzhej zzhej6, zzhej zzhej7, zzhej zzhej8, zzhej zzhej9, Executor executor, zzfow zzfow, zzdzh zzdzh) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfbq) obj);
        zzfah zzfah2 = zzfah;
        hashSet.add(zzfah);
        zzfbx zzfbx2 = zzfbx;
        hashSet.add(zzfbx);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfg)).booleanValue()) {
            hashSet.add((zzezm) zzhej.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfh)).booleanValue()) {
            hashSet.add((zzezm) zzhej2.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfi)).booleanValue()) {
            hashSet.add((zzezm) zzhej3.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfj)).booleanValue()) {
            hashSet.add((zzezm) zzhej4.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfn)).booleanValue()) {
            hashSet.add((zzezm) zzhej6.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfo)).booleanValue()) {
            hashSet.add((zzezm) zzhej7.zzb());
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcv)).booleanValue()) {
            hashSet.add((zzezm) zzhej9.zzb());
        }
        return new zzezp(context, executor, hashSet, zzfow, zzdzh);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
