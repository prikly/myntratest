package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfjs {
    public zzfjs() {
        try {
            zzghp.zza();
        } catch (GeneralSecurityException e2) {
            zze.zza("Failed to Configure Aead. ".concat(e2.toString()));
            zzt.zzo().zzu(e2, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgws zzt = zzgwv.zzt();
        try {
            zzgga.zzb(zzggw.zzb(zzggq.zza("AES128_GCM")), zzgfy.zzb(zzt));
        } catch (IOException | GeneralSecurityException e2) {
            zze.zza("Failed to generate key".concat(e2.toString()));
            zzt.zzo().zzu(e2, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzE(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdzc zzdzc) {
        zzggw zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgfw) zzc.zzd(zzgfw.class)).zza(bArr, bArr2);
            zzdzc.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            zze.zza("Failed to decrypt ".concat(e2.toString()));
            zzt.zzo().zzu(e2, "CryptoUtils.decrypt");
            zzdzc.zza().put("dsf", e2.toString());
            return null;
        }
    }

    private static final zzggw zzc(String str) {
        try {
            return zzgga.zza(zzgfx.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e2) {
            zze.zza("Failed to get keysethandle".concat(e2.toString()));
            zzt.zzo().zzu(e2, "CryptoUtils.getHandle");
            return null;
        }
    }
}
