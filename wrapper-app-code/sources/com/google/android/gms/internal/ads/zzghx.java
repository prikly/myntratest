package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzghx extends zzglh {
    final /* synthetic */ zzghy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzghx(zzghy zzghy, Class cls) {
        super(cls);
        this.zza = zzghy;
    }

    public static final zzgpj zzf(zzgpm zzgpm) throws GeneralSecurityException {
        zzgpi zzc = zzgpj.zzc();
        zzc.zzb(zzgpm.zzg());
        zzc.zza(zzgwv.zzv(zzgvv.zza(zzgpm.zza())));
        zzc.zzc(0);
        return (zzgpj) zzc.zzak();
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        return zzf((zzgpm) zzgzn);
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgpm.zzf(zzgwv, zzgxp.zza());
    }

    /* renamed from: zze */
    public final void zzd(zzgpm zzgpm) throws GeneralSecurityException {
        zzgvx.zza(zzgpm.zza());
        zzghy.zzm(zzgpm.zzg());
    }
}
