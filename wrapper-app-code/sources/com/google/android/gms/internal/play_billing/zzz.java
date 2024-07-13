package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class zzz {
    public static Object zza(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
