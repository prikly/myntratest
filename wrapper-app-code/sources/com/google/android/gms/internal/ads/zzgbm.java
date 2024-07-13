package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzgbm extends zzgco {
    final Map zzd;

    zzgbm(Map map) {
        if (map != null) {
            this.zzd = map;
            return;
        }
        throw null;
    }

    public void clear() {
        this.zzd.clear();
    }

    public final boolean contains(Object obj) {
        return this.zzd.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.zzd.isEmpty();
    }

    public Iterator iterator() {
        return new zzgbj(this.zzd.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.zzd.remove(obj);
        return true;
    }

    public final int size() {
        return this.zzd.size();
    }
}
