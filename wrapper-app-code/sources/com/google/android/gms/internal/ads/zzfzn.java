package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfzn extends zzfzl implements ListIterator {
    final /* synthetic */ zzfzo zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzn(zzfzo zzfzo) {
        super(zzfzo);
        this.zzd = zzfzo;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfzp.zzd(this.zzd.zzf);
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfzn(zzfzo zzfzo, int i) {
        super(zzfzo, ((List) zzfzo.zzb).listIterator(i));
        this.zzd = zzfzo;
    }
}
