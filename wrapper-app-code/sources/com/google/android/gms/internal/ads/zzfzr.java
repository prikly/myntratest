package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfzr extends AbstractCollection {
    final /* synthetic */ zzfzs zza;

    zzfzr(zzfzs zzfzs) {
        this.zza = zzfzs;
    }

    public final void clear() {
        this.zza.zzr();
    }

    public final boolean contains(Object obj) {
        for (Collection contains : this.zza.zzu().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return this.zza.zzj();
    }

    public final int size() {
        return this.zza.zzh();
    }
}
