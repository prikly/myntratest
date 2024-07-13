package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgad extends AbstractCollection {
    final /* synthetic */ zzgae zza;

    zzgad(zzgae zzgae) {
        this.zza = zzgae;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzgae zzgae = this.zza;
        Map zzl = zzgae.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfzy(zzgae);
    }

    public final int size() {
        return this.zza.size();
    }
}
