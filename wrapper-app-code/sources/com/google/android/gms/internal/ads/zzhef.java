package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhef implements Iterator {
    int zza = 0;
    final /* synthetic */ zzheg zzb;

    zzhef(zzheg zzheg) {
        this.zzb = zzheg;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i = this.zza;
            this.zza = i + 1;
            return list.get(i);
        }
        zzheg zzheg = this.zzb;
        zzheg.zza.add(zzheg.zzb.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
