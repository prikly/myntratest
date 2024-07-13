package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzghy extends zzgli {
    zzghy() {
        super(zzgpj.class, new zzghw(zzgvp.class));
    }

    public static final void zzh(zzgpj zzgpj) throws GeneralSecurityException {
        zzgvx.zzb(zzgpj.zza(), 0);
        zzgvx.zza(zzgpj.zzh().zzd());
        zzm(zzgpj.zzg());
    }

    /* access modifiers changed from: private */
    public static final void zzm(zzgpp zzgpp) throws GeneralSecurityException {
        if (zzgpp.zza() < 12 || zzgpp.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzglh zza() {
        return new zzghx(this, zzgpm.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgpj.zzf(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzh((zzgpj) zzgzn);
    }
}
