package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgvi implements zzgvm {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
