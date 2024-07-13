package com.google.android.gms.internal.ads;

import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfzv {
    static boolean zza(Collection collection, Object obj) {
        if (collection != null) {
            try {
                return collection.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }
}
