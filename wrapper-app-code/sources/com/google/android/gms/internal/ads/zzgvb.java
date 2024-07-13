package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgvb {
    private final ECPublicKey zza;

    public zzgvb(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzgva zza(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        KeyPair zzc = zzgvc.zzc(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zzc.getPublic();
        byte[] zzg = zzgvc.zzg((ECPrivateKey) zzc.getPrivate(), this.zza);
        byte[] zzm = zzgvc.zzm(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] zzb = zzgut.zzb(zzm, zzg);
        Mac mac = (Mac) zzgve.zzb.zza(str);
        if (i <= mac.getMacLength() * KotlinVersion.MAX_COMPONENT_VALUE) {
            if (bArr == null || bArr.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = mac.doFinal(zzb);
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr4 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i3);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i5 = i4 + length;
                if (i5 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i4, i - i4);
                    return new zzgva(zzm, bArr3);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
