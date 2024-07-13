package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmx extends zzgli {
    zzgmx() {
        super(zzgou.class, new zzgmv(zzggz.class));
    }

    /* access modifiers changed from: private */
    public static void zzm(zzgpa zzgpa) throws GeneralSecurityException {
        if (zzgpa.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzgpa.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzglh zza() {
        return new zzgmw(this, zzgox.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgou.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgou zzgou = (zzgou) zzgzn;
        zzgvx.zzb(zzgou.zza(), 0);
        zzn(zzgou.zzg().zzd());
        zzm(zzgou.zzf());
    }
}
