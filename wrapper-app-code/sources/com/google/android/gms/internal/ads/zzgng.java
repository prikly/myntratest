package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzgng implements zzgkz {
    public static final /* synthetic */ zzgng zza = new zzgng();

    private /* synthetic */ zzgng() {
    }

    public final zzggf zza(zzgmh zzgmh, zzghn zzghn) {
        zzgna zzgna;
        int i = zzgnh.zza;
        if (((zzgmf) zzgmh).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgou zze = zzgou.zze(((zzgmf) zzgmh).zze(), zzgxp.zza());
                if (zze.zza() == 0) {
                    zzgmz zzgmz = new zzgmz((zzgmy) null);
                    zzgmz.zza(zze.zzg().zzd());
                    zzgmz.zzb(zze.zzf().zza());
                    zzguc zzc = ((zzgmf) zzgmh).zzc();
                    zzguc zzguc = zzguc.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzgna = zzgna.zza;
                    } else if (ordinal == 2) {
                        zzgna = zzgna.zzc;
                    } else if (ordinal == 3) {
                        zzgna = zzgna.zzd;
                    } else if (ordinal == 4) {
                        zzgna = zzgna.zzb;
                    } else {
                        int zza2 = zzc.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                    }
                    zzgmz.zzc(zzgna);
                    zzgnc zzd = zzgmz.zzd();
                    zzgms zzgms = new zzgms((zzgmr) null);
                    zzgms.zzc(zzd);
                    zzgms.zza(zzgwb.zzb(zze.zzg().zzE(), zzghn));
                    zzgms.zzb(((zzgmf) zzgmh).zzf());
                    return zzgms.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyp | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
