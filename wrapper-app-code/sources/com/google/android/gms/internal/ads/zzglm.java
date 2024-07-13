package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzglm extends zzggf {
    private final zzgmf zza;

    public zzglm(zzgmf zzgmf, zzghn zzghn) throws GeneralSecurityException {
        int i = zzglj.zzb[zzgmf.zzb().ordinal()];
        this.zza = zzgmf;
    }

    public final zzghb zza() {
        zzgmf zzgmf = this.zza;
        return new zzgll(zzgmf.zzg(), zzgmf.zzc(), (zzglk) null);
    }
}
