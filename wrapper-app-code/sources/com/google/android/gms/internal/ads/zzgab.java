package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgab extends AbstractSet {
    final /* synthetic */ zzgae zza;

    zzgab(zzgae zzgae) {
        this.zza = zzgae;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzgae zzgae = this.zza;
        Map zzl = zzgae.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfzw(zzgae);
    }

    public final boolean remove(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        return this.zza.zzx(obj) != zzgae.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
