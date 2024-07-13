package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzms implements Iterator {
    final Iterator zza = this.zzb.zza.iterator();
    final /* synthetic */ zzmt zzb;

    zzms(zzmt zzmt) {
        this.zzb = zzmt;
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
