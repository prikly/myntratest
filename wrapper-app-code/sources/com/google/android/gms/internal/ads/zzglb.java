package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzglb {
    private final zzgwa zza;
    private final Class zzb;

    /* synthetic */ zzglb(zzgwa zzgwa, Class cls, zzgla zzgla) {
        this.zza = zzgwa;
        this.zzb = cls;
    }

    public static zzglb zzb(zzgkz zzgkz, zzgwa zzgwa, Class cls) {
        return new zzgky(zzgwa, cls, zzgkz);
    }

    public abstract zzggf zza(zzgmh zzgmh, zzghn zzghn) throws GeneralSecurityException;

    public final zzgwa zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
