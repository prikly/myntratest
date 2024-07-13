package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzfzd implements Iterator {
    final Iterator zza;
    Object zzb = null;
    Collection zzc = null;
    Iterator zzd = zzgbd.INSTANCE;
    final /* synthetic */ zzfzp zze;

    zzfzd(zzfzp zzfzp) {
        this.zze = zzfzp;
        this.zza = zzfzp.zza.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    public final void remove() {
        this.zzd.remove();
        Collection collection = this.zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfzp.zze(this.zze);
    }
}
