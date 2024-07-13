package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgum extends ThreadLocal {
    zzgum() {
    }

    protected static final Cipher zza() {
        try {
            return (Cipher) zzgve.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
