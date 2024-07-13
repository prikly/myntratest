package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgbh extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfxt zzb;

    zzgbh(List list, zzfxt zzfxt) {
        this.zza = list;
        this.zzb = zzfxt;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator listIterator(int i) {
        return new zzgbg(this, this.zza.listIterator(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
