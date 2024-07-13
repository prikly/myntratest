package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfzb implements Iterator {
    final Iterator zza = this.zzc.zza.entrySet().iterator();
    Collection zzb;
    final /* synthetic */ zzfzc zzc;

    zzfzb(zzfzc zzfzc) {
        this.zzc = zzfzc;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    public final void remove() {
        zzfye.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfzp.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
