package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzfzo extends zzfzm implements List {
    final /* synthetic */ zzfzp zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzo(zzfzp zzfzp, Object obj, List list, zzfzm zzfzm) {
        super(zzfzp, obj, list, zzfzm);
        this.zzf = zzfzp;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfzp.zzd(this.zzf);
        if (isEmpty) {
            zza();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        zzfzp.zzf(this.zzf, this.zzb.size() - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new zzfzn(this);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfzp.zze(this.zzf);
        zzc();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        zzfzp zzfzp = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i, i2);
        zzfzm zzfzm = this.zzc;
        if (zzfzm == null) {
            zzfzm = this;
        }
        return zzfzp.zzk(obj, subList, zzfzm);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfzn(this, i);
    }
}
