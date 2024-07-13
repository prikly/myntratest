package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzggl implements zzggm {
    final /* synthetic */ zzgme zza;
    final /* synthetic */ zzgli zzb;

    zzggl(zzgme zzgme, zzgli zzgli) {
        this.zza = zzgme;
        this.zzb = zzgli;
    }

    public final zzggg zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzghk(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final zzggg zzb() {
        zzgme zzgme = this.zza;
        return new zzghk(zzgme, this.zzb, zzgme.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
