package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgbe {
    static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void zzb(Iterator it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
            return;
        }
        throw null;
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
