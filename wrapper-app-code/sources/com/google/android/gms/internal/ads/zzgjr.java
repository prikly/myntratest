package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgjr extends zzgme {
    /* access modifiers changed from: private */
    public static final byte[] zza = new byte[0];

    zzgjr() {
        super(zzgrk.class, zzgrn.class, new zzgjp(zzggd.class));
    }

    static /* bridge */ /* synthetic */ zzglg zzh(int i, int i2, int i3, zzggp zzggp, byte[] bArr, int i4) {
        zzguc zzguc;
        zzgrd zza2 = zzgre.zza();
        zzgrp zza3 = zzgrq.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgwv.zzv(bArr));
        zzgrq zzgrq = (zzgrq) zza3.zzak();
        zzgta zza4 = zzgtb.zza();
        zza4.zzb(zzggp.zzb());
        zza4.zzc(zzgwv.zzv(zzggp.zzc()));
        int zzd = zzggp.zzd() - 1;
        if (zzd == 0) {
            zzguc = zzguc.TINK;
        } else if (zzd == 1) {
            zzguc = zzguc.LEGACY;
        } else if (zzd != 2) {
            zzguc = zzguc.CRUNCHY;
        } else {
            zzguc = zzguc.RAW;
        }
        zza4.zza(zzguc);
        zzgra zza5 = zzgrb.zza();
        zza5.zza((zzgtb) zza4.zzak());
        zzgrg zzc = zzgrh.zzc();
        zzc.zzb(zzgrq);
        zzc.zza((zzgrb) zza5.zzak());
        zzc.zzc(i3);
        zza2.zza((zzgrh) zzc.zzak());
        return new zzglg((zzgre) zza2.zzak(), i4);
    }

    public final zzglh zza() {
        return new zzgjq(this, zzgre.class);
    }

    public final zzgsv zzb() {
        return zzgsv.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgrk.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgrk zzgrk = (zzgrk) zzgzn;
        if (!zzgrk.zzg().zzD()) {
            zzgvx.zzb(zzgrk.zza(), 0);
            zzgka.zza(zzgrk.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
