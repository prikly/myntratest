package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzfzu extends AbstractCollection {
    final Collection zza;
    final zzfyf zzb;

    zzfzu(Collection collection, zzfyf zzfyf) {
        this.zza = collection;
        this.zzb = zzfyf;
    }

    public final boolean add(Object obj) {
        zzfye.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object zza2 : collection) {
            zzfye.zze(this.zzb.zza(zza2));
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        zzgba.zza(this.zza, this.zzb);
    }

    public final boolean contains(Object obj) {
        if (zzfzv.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        Collection<Object> collection = this.zza;
        zzfyf zzfyf = this.zzb;
        zzfye.zzc(zzfyf, "predicate");
        int i = 0;
        for (Object zza2 : collection) {
            if (!zzfyf.zza(zza2)) {
                i++;
            } else if (i != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        zzfyf zzfyf = this.zzb;
        if (it == null) {
            throw null;
        } else if (zzfyf != null) {
            return new zzgbb(it, zzfyf);
        } else {
            throw null;
        }
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object zza2 : this.zza) {
            if (this.zzb.zza(zza2)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzgbe.zzc(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzgbe.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
