package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzggj implements zzggm {
    final /* synthetic */ zzggg zza;

    zzggj(zzggg zzggg) {
        this.zza = zzggg;
    }

    public final zzggg zza(Class cls) throws GeneralSecurityException {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final zzggg zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return Collections.singleton(this.zza.zzc());
    }
}
