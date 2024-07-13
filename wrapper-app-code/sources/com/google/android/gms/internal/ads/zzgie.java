package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgie extends zzgli {
    zzgie() {
        super(zzgqb.class, new zzgic(zzgfw.class));
    }

    static /* bridge */ /* synthetic */ zzglg zzg(int i, int i2) {
        zzgqd zzc = zzgqe.zzc();
        zzc.zza(i);
        return new zzglg((zzgqe) zzc.zzak(), i2);
    }

    public final zzglh zza() {
        return new zzgid(this, zzgqe.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgqb.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqb zzgqb = (zzgqb) zzgzn;
        zzgvx.zzb(zzgqb.zza(), 0);
        zzgvx.zza(zzgqb.zzf().zzd());
    }

    public final int zzf() {
        return 2;
    }
}
