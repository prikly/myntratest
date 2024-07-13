package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgkp extends zzgme {
    public zzgkp() {
        super(zzgso.class, zzgsr.class, new zzgkn(zzggd.class));
    }

    static /* bridge */ /* synthetic */ zzglg zzg(int i, int i2, int i3, int i4) {
        zzgsk zza = zzgsl.zza();
        zza.zzc(i);
        zza.zzb(i2);
        zza.zza(i3);
        zzgsh zza2 = zzgsi.zza();
        zza2.zza((zzgsl) zza.zzak());
        return new zzglg((zzgsi) zza2.zzak(), i4);
    }

    public final zzglh zza() {
        return new zzgko(this, zzgsi.class);
    }

    public final zzgsv zzb() {
        return zzgsv.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgso.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgso zzgso = (zzgso) zzgzn;
        if (zzgso.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzgso.zzk()) {
            zzgvx.zzb(zzgso.zza(), 0);
            zzgks.zza(zzgso.zzf().zzc());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }
}
