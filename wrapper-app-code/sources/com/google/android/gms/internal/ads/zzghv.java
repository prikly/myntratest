package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzghv extends zzgli {
    zzghv() {
        super(zzgpd.class, new zzght(zzgfw.class));
    }

    static /* bridge */ /* synthetic */ zzglg zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgpl zzc = zzgpm.zzc();
        zzgpo zzc2 = zzgpp.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgpp) zzc2.zzak());
        zzc.zza(i);
        zzgrz zzc3 = zzgsa.zzc();
        zzgsc zzc4 = zzgsd.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzgsd) zzc4.zzak());
        zzc3.zza(32);
        zzgpf zza = zzgpg.zza();
        zza.zza((zzgpm) zzc.zzak());
        zza.zzb((zzgsa) zzc3.zzak());
        return new zzglg((zzgpg) zza.zzak(), i6);
    }

    public final zzglh zza() {
        return new zzghu(this, zzgpg.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgpd.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgpd zzgpd = (zzgpd) zzgzn;
        zzgvx.zzb(zzgpd.zza(), 0);
        new zzghy();
        zzghy.zzh(zzgpd.zzf());
        new zzgno();
        zzgno.zzh(zzgpd.zzg());
    }

    public final int zzf() {
        return 2;
    }
}
