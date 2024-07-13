package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgwf extends AbstractList implements zzgym {
    private boolean zza = true;

    zzgwf() {
    }

    public void add(int i, Object obj) {
        zzbO();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        zzbO();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzbO();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public Object remove(int i) {
        zzbO();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        zzbO();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zzbO();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        zzbO();
        return super.set(i, obj);
    }

    public final void zzb() {
        this.zza = false;
    }

    /* access modifiers changed from: protected */
    public final void zzbO() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public boolean add(Object obj) {
        zzbO();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zzbO();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zzbO();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
