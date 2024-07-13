package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzdjx {
    protected final Map zza = new HashMap();

    protected zzdjx(Set set) {
        zzm(set);
    }

    public final synchronized void zzg(zzdlu zzdlu) {
        zzj(zzdlu.zza, zzdlu.zzb);
    }

    public final synchronized void zzj(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzm(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzg((zzdlu) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzo(zzdjw zzdjw) {
        for (Map.Entry entry : this.zza.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzdjv(zzdjw, entry.getKey()));
        }
    }
}
