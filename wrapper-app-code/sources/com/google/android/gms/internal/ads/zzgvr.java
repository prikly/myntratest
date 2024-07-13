package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgvr extends ThreadLocal {
    final /* synthetic */ zzgvs zza;

    zzgvr(zzgvs zzgvs) {
        this.zza = zzgvs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzgve.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
