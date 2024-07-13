package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzggw {
    private final zzgtj zza;
    private final zzgoj zzb;

    private zzggw(zzgtj zzgtj) {
        this.zza = zzgtj;
        this.zzb = zzgoj.zza;
    }

    static final zzggw zza(zzgtj zzgtj) throws GeneralSecurityException {
        if (zzgtj != null && zzgtj.zza() > 0) {
            return new zzggw(zzgtj);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final zzggw zzb(zzggp zzggp) throws GeneralSecurityException {
        zzgln zzgln = new zzgln(zzgmg.zza(zzggp.zza()));
        zzggu zzggu = new zzggu();
        zzggs zzggs = new zzggs(zzgln, (zzggr) null);
        zzggs.zzd();
        zzggs.zze();
        zzggu.zza(zzggs);
        return zzggu.zzb();
    }

    public final String toString() {
        return zzgho.zza(this.zza).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzgtj zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzghm.zze(cls);
        if (zze != null) {
            zzgho.zzb(this.zza);
            zzghd zzghd = new zzghd(zze, (zzghc) null);
            zzghd.zzc(this.zzb);
            for (zzgti zzgti : this.zza.zzh()) {
                if (zzgti.zzk() == 3) {
                    Object zzf = zzghm.zzf(zzgti.zzc(), zze);
                    if (zzgti.zza() == this.zza.zzc()) {
                        zzghd.zza(zzf, zzgti);
                    } else {
                        zzghd.zzb(zzf, zzgti);
                    }
                }
            }
            return zzghm.zzj(zzghd.zzd(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
