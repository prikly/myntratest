package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzak implements Iterator {
    final /* synthetic */ Iterator zza;

    zzak(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.zza.next());
    }
}
