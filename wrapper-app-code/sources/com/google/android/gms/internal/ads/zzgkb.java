package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkb implements zzguw {
    private final String zza;
    private final int zzb;
    private zzgqb zzc;
    private zzgpd zzd;
    private int zze;
    private zzgqn zzf;

    zzgkb(zzgtb zzgtb) throws GeneralSecurityException {
        String zzg = zzgtb.zzg();
        this.zza = zzg;
        if (zzg.equals(zzghp.zzb)) {
            try {
                zzgqe zze2 = zzgqe.zze(zzgtb.zzf(), zzgxp.zza());
                this.zzc = (zzgqb) zzghm.zzd(zzgtb);
                this.zzb = zze2.zza();
            } catch (zzgyp e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.zza.equals(zzghp.zza)) {
            try {
                zzgpg zzd2 = zzgpg.zzd(zzgtb.zzf(), zzgxp.zza());
                this.zzd = (zzgpd) zzghm.zzd(zzgtb);
                this.zze = zzd2.zze().zza();
                this.zzb = this.zze + zzd2.zzf().zza();
            } catch (zzgyp e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else if (this.zza.equals(zzgjm.zza)) {
            try {
                zzgqq zze3 = zzgqq.zze(zzgtb.zzf(), zzgxp.zza());
                this.zzf = (zzgqn) zzghm.zzd(zzgtb);
                this.zzb = zze3.zza();
            } catch (zzgyp e4) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(this.zza)));
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzgkx zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzghp.zzb)) {
            zzgqa zzc2 = zzgqb.zzc();
            zzc2.zzai(this.zzc);
            zzc2.zza(zzgwv.zzw(bArr, 0, this.zzb));
            return new zzgkx((zzgfw) zzghm.zzh(this.zza, (zzgqb) zzc2.zzak(), zzgfw.class));
        } else if (this.zza.equals(zzghp.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzgpi zzc3 = zzgpj.zzc();
            zzc3.zzai(this.zzd.zzf());
            zzc3.zza(zzgwv.zzv(copyOfRange));
            zzgrw zzc4 = zzgrx.zzc();
            zzc4.zzai(this.zzd.zzg());
            zzc4.zza(zzgwv.zzv(copyOfRange2));
            zzgpc zzc5 = zzgpd.zzc();
            zzc5.zzc(this.zzd.zza());
            zzc5.zza((zzgpj) zzc3.zzak());
            zzc5.zzb((zzgrx) zzc4.zzak());
            return new zzgkx((zzgfw) zzghm.zzh(this.zza, (zzgpd) zzc5.zzak(), zzgfw.class));
        } else if (this.zza.equals(zzgjm.zza)) {
            zzgqm zzc6 = zzgqn.zzc();
            zzc6.zzai(this.zzf);
            zzc6.zza(zzgwv.zzw(bArr, 0, this.zzb));
            return new zzgkx((zzggc) zzghm.zzh(this.zza, (zzgqn) zzc6.zzak(), zzggc.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
