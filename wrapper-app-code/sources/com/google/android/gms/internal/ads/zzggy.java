package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzggy {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzggx zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzggx zzggx = (zzggx) it.next();
            if (zzggx.zza()) {
                return zzggx;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
