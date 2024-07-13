package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgib extends zzgli {
    zzgib() {
        super(zzgps.class, new zzghz(zzgfw.class));
    }

    static /* bridge */ /* synthetic */ zzglg zzg(int i, int i2, int i3) {
        zzgpu zzc = zzgpv.zzc();
        zzc.zza(i);
        zzgpx zzc2 = zzgpy.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgpy) zzc2.zzak());
        return new zzglg((zzgpv) zzc.zzak(), i3);
    }

    public final zzglh zza() {
        return new zzgia(this, zzgpv.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgps.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgps zzgps = (zzgps) zzgzn;
        zzgvx.zzb(zzgps.zza(), 0);
        zzgvx.zza(zzgps.zzg().zzd());
        if (zzgps.zzf().zza() != 12 && zzgps.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
