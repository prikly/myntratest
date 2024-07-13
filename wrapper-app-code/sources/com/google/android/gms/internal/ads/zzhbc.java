package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhbc extends AbstractList implements zzgyv, RandomAccess {
    /* access modifiers changed from: private */
    public final zzgyv zza;

    public zzhbc(zzgyv zzgyv) {
        this.zza = zzgyv;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzgyu) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzhbb(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzhba(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzgyv zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzgwv zzgwv) {
        throw new UnsupportedOperationException();
    }
}
