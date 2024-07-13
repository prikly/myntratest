package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgco extends AbstractSet {
    zzgco() {
    }

    public boolean removeAll(Collection collection) {
        return zzgcp.zzd(this, collection);
    }

    public boolean retainAll(Collection collection) {
        if (collection != null) {
            return super.retainAll(collection);
        }
        throw null;
    }
}
