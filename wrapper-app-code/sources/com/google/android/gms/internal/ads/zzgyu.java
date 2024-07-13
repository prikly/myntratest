package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgyu extends zzgwf implements zzgyv, RandomAccess {
    public static final zzgyv zza = zzb;
    private static final zzgyu zzb;
    private final List zzc;

    static {
        zzgyu zzgyu = new zzgyu(10);
        zzb = zzgyu;
        zzgyu.zzb();
    }

    public zzgyu() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgwv) {
            return ((zzgwv) obj).zzA(zzgyn.zzb);
        }
        return zzgyn.zzg((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbO();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        zzbO();
        if (collection instanceof zzgyv) {
            collection = ((zzgyv) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbO();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbO();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbO();
        return zzj(this.zzc.set(i, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzgym zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzgyu(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzgyv zze() {
        return zzc() ? new zzhbc(this) : this;
    }

    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgwv) {
            zzgwv zzgwv = (zzgwv) obj;
            String zzA = zzgwv.zzA(zzgyn.zzb);
            if (zzgwv.zzp()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzg = zzgyn.zzg(bArr);
        if (zzgyn.zzh(bArr)) {
            this.zzc.set(i, zzg);
        }
        return zzg;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzgwv zzgwv) {
        zzbO();
        this.zzc.add(zzgwv);
        this.modCount++;
    }

    public zzgyu(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzgyu(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
