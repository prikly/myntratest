package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmf implements zzgmh {
    private final String zza;
    private final zzgwa zzb;
    private final zzgwv zzc;
    private final zzgsv zzd;
    private final zzguc zze;
    private final Integer zzf;

    private zzgmf(String str, zzgwv zzgwv, zzgsv zzgsv, zzguc zzguc, Integer num) {
        this.zza = str;
        this.zzb = zzgmq.zza(str);
        this.zzc = zzgwv;
        this.zzd = zzgsv;
        this.zze = zzguc;
        this.zzf = num;
    }

    public static zzgmf zza(String str, zzgwv zzgwv, zzgsv zzgsv, zzguc zzguc, Integer num) throws GeneralSecurityException {
        if (zzguc == zzguc.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgmf(str, zzgwv, zzgsv, zzguc, num);
    }

    public final zzgsv zzb() {
        return this.zzd;
    }

    public final zzguc zzc() {
        return this.zze;
    }

    public final zzgwa zzd() {
        return this.zzb;
    }

    public final zzgwv zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
