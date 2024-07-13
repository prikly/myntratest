package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public abstract class zzu extends zzr implements List, RandomAccess {
    private static final zzai zza = new zzs(zzaa.zza, 0);

    zzu() {
    }

    static zzu zzi(Object[] objArr) {
        return zzj(objArr, objArr.length);
    }

    static zzu zzj(Object[] objArr, int i) {
        if (i == 0) {
            return zzaa.zza;
        }
        return new zzaa(objArr, i);
    }

    public static zzu zzk(Collection collection) {
        if (collection instanceof zzr) {
            zzu zzd = ((zzr) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzj(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i = 0;
        while (i < length) {
            if (array2[i] != null) {
                i++;
            } else {
                throw new NullPointerException("at index " + i);
            }
        }
        return zzj(array2, length);
    }

    public static zzu zzl() {
        return zzaa.zza;
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzl.zza(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzl.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Deprecated
    public final zzu zzd() {
        return this;
    }

    public final zzah zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzu subList(int i, int i2) {
        zzm.zzd(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzaa.zza;
        }
        return new zzt(this, i, i3);
    }

    /* renamed from: zzm */
    public final zzai listIterator(int i) {
        zzm.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzs(this, i);
    }
}
