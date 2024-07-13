package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzgny implements zzgkz {
    public static final /* synthetic */ zzgny zza = new zzgny();

    private /* synthetic */ zzgny() {
    }

    public final zzggf zza(zzgmh zzgmh, zzghn zzghn) {
        zzgnr zzgnr;
        zzgns zzgns;
        int i = zzgnz.zza;
        if (((zzgmf) zzgmh).zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgrx zzf = zzgrx.zzf(((zzgmf) zzgmh).zze(), zzgxp.zza());
                if (zzf.zza() == 0) {
                    zzgnq zzgnq = new zzgnq((zzgnp) null);
                    zzgnq.zzb(zzf.zzh().zzd());
                    zzgnq.zzc(zzf.zzg().zza());
                    int zzg = zzf.zzg().zzg();
                    zzguc zzguc = zzguc.UNKNOWN_PREFIX;
                    int i2 = zzg - 2;
                    if (i2 == 1) {
                        zzgnr = zzgnr.zza;
                    } else if (i2 == 2) {
                        zzgnr = zzgnr.zzd;
                    } else if (i2 == 3) {
                        zzgnr = zzgnr.zzc;
                    } else if (i2 == 4) {
                        zzgnr = zzgnr.zze;
                    } else if (i2 == 5) {
                        zzgnr = zzgnr.zzb;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + zzgru.zza(zzg));
                    }
                    zzgnq.zza(zzgnr);
                    zzguc zzc = ((zzgmf) zzgmh).zzc();
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzgns = zzgns.zza;
                    } else if (ordinal == 2) {
                        zzgns = zzgns.zzc;
                    } else if (ordinal == 3) {
                        zzgns = zzgns.zzd;
                    } else if (ordinal == 4) {
                        zzgns = zzgns.zzb;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc.zza());
                    }
                    zzgnq.zzd(zzgns);
                    zzgnu zze = zzgnq.zze();
                    zzgnj zzgnj = new zzgnj((zzgni) null);
                    zzgnj.zzc(zze);
                    zzgnj.zzb(zzgwb.zzb(zzf.zzh().zzE(), zzghn));
                    zzgnj.zza(((zzgmf) zzgmh).zzf());
                    return zzgnj.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyp | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
        }
    }
}
