package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgcn extends zzgcm implements SortedSet {
    zzgcn(SortedSet sortedSet, zzfyf zzfyf) {
        super(sortedSet, zzfyf);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        zzfyf zzfyf = this.zzb;
        if (it == null) {
            throw null;
        } else if (zzfyf != null) {
            while (it.hasNext()) {
                Object next = it.next();
                if (zzfyf.zza(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        } else {
            throw null;
        }
    }

    public final SortedSet headSet(Object obj) {
        return new zzgcn(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            Object last = sortedSet.last();
            if (this.zzb.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzgcn(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzgcn(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
