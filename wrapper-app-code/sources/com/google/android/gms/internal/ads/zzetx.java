package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzetx implements zzezm {
    private final Set zza;

    zzetx(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final zzgfb zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zza) {
            arrayList.add(add);
        }
        return zzger.zzi(new zzetw(arrayList));
    }
}
