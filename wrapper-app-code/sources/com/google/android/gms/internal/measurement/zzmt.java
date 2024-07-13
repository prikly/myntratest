package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzmt extends AbstractList implements zzku, RandomAccess {
    /* access modifiers changed from: private */
    public final zzku zza;

    public zzmt(zzku zzku) {
        this.zza = zzku;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzkt) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzms(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzmr(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzku zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzje zzje) {
        throw new UnsupportedOperationException();
    }
}
