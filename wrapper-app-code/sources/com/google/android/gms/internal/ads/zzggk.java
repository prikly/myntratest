package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzggk implements zzggm {
    final /* synthetic */ zzgli zza;

    zzggk(zzgli zzgli) {
        this.zza = zzgli;
    }

    public final zzggg zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzggi(this.zza, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final zzggg zzb() {
        zzgli zzgli = this.zza;
        return new zzggi(zzgli, zzgli.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
