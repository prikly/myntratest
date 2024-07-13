package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzezo implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzezo(List list, Object obj) {
        this.zza = list;
        this.zzb = obj;
    }

    public final Object call() {
        List<zzgfb> list = this.zza;
        Object obj = this.zzb;
        for (zzgfb zzgfb : list) {
            zzezl zzezl = (zzezl) zzgfb.get();
            if (zzezl != null) {
                zzezl.zzf(obj);
            }
        }
        return obj;
    }
}
