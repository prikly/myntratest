package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzggq {
    public static zzggp zza(String str) throws GeneralSecurityException {
        zzggp zzggp = (zzggp) zzghm.zzk().get(str);
        if (zzggp != null) {
            return zzggp;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
