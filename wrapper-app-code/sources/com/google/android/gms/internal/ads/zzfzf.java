package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzfzf extends zzgbm {
    final /* synthetic */ zzfzp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzf(zzfzp zzfzp, Map map) {
        super(map);
        this.zza = zzfzp;
    }

    public final void clear() {
        zzgbe.zzb(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzfze(this, this.zzd.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfzp.zzg(this.zza, size);
        return size > 0;
    }
}
