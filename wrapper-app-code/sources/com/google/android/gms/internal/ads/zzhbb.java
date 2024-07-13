package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhbb implements Iterator {
    final Iterator zza = this.zzb.zza.iterator();
    final /* synthetic */ zzhbc zzb;

    zzhbb(zzhbc zzhbc) {
        this.zzb = zzhbc;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
