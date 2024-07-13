package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgno extends zzgli {
    public zzgno() {
        super(zzgrx.class, new zzgnm(zzggz.class));
    }

    public static final void zzh(zzgrx zzgrx) throws GeneralSecurityException {
        zzgvx.zzb(zzgrx.zza(), 0);
        if (zzgrx.zzh().zzd() >= 16) {
            zzn(zzgrx.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    static /* bridge */ /* synthetic */ zzglg zzm(int i, int i2, int i3, int i4) {
        zzgrz zzc = zzgsa.zzc();
        zzgsc zzc2 = zzgsd.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzgsd) zzc2.zzak());
        zzc.zza(i);
        return new zzglg((zzgsa) zzc.zzak(), i4);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzgsd zzgsd) throws GeneralSecurityException {
        if (zzgsd.zza() >= 10) {
            int zzg = zzgsd.zzg() - 2;
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            if (zzg != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzgsd.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzgsd.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzgsd.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzgsd.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzgsd.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzglh zza() {
        return new zzgnn(this, zzgsa.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgrx.zzf(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzh((zzgrx) zzgzn);
    }

    public final int zzf() {
        return 2;
    }
}
