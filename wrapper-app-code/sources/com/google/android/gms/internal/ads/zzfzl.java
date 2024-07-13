package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzfzl implements Iterator {
    final Iterator zza;
    final Collection zzb = this.zzc.zzb;
    final /* synthetic */ zzfzm zzc;

    zzfzl(zzfzm zzfzm) {
        Iterator it;
        this.zzc = zzfzm;
        Collection collection = zzfzm.zzb;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    zzfzl(zzfzm zzfzm, Iterator it) {
        this.zzc = zzfzm;
        this.zza = it;
    }

    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzfzp.zze(this.zzc.zze);
        this.zzc.zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
