package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfza extends zzgbl {
    final /* synthetic */ zzfzc zza;

    zzfza(zzfzc zzfzc) {
        this.zza = zzfzc;
    }

    public final boolean contains(Object obj) {
        return zzfzv.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfzb(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfzp.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
