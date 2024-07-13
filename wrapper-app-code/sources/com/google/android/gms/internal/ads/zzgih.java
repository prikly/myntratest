package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgih extends zzgli {
    zzgih() {
        super(zzgqh.class, new zzgif(zzgfw.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzghm.zzn(new zzgih(), true);
        }
    }

    static /* bridge */ /* synthetic */ zzglg zzh(int i, int i2) {
        zzgqj zzc = zzgqk.zzc();
        zzc.zza(i);
        return new zzglg((zzgqk) zzc.zzak(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzglh zza() {
        return new zzgig(this, zzgqk.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgqh.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqh zzgqh = (zzgqh) zzgzn;
        zzgvx.zzb(zzgqh.zza(), 0);
        zzgvx.zza(zzgqh.zzf().zzd());
    }
}
