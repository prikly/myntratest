package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgdz extends zzgeb {
    zzgdz(zzgap zzgap, boolean z) {
        super(zzgap, true);
        zzw();
    }

    public final /* bridge */ /* synthetic */ Object zzH(List list) {
        ArrayList zza = zzgbi.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgea zzgea = (zzgea) it.next();
            zza.add(zzgea != null ? zzgea.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
