package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzggu {
    private final List zza = new ArrayList();

    /* access modifiers changed from: private */
    public final void zzd() {
        for (zzggs zzj : this.zza) {
            zzj.zza = false;
        }
    }

    public final zzggu zza(zzggs zzggs) {
        if (zzggs.zzf == null) {
            if (zzggs.zza) {
                zzd();
            }
            zzggs.zzf = this;
            this.zza.add(zzggs);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzggw zzb() throws GeneralSecurityException {
        byte b2;
        zzgtg zzd = zzgtj.zzd();
        List list = this.zza;
        int i = 0;
        while (i < list.size() - 1) {
            if (((zzggs) list.get(i)).zze != zzggt.zza || ((zzggs) list.get(i + 1)).zze == zzggt.zza) {
                i++;
            } else {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzggs zzggs : this.zza) {
            zzggo unused = zzggs.zzb;
            if (zzggs.zze != null) {
                int i2 = 3;
                if (zzggs.zze == zzggt.zza) {
                    b2 = 0;
                    while (true) {
                        if (b2 != 0 && !hashSet.contains(Integer.valueOf(b2))) {
                            break;
                        }
                        SecureRandom secureRandom = new SecureRandom();
                        byte[] bArr = new byte[4];
                        byte b3 = 0;
                        while (b3 == 0) {
                            secureRandom.nextBytes(bArr);
                            b3 = ((bArr[0] & Ascii.DEL) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        }
                        b2 = b3;
                    }
                } else {
                    zzggt unused2 = zzggs.zze;
                    b2 = 0;
                }
                Integer valueOf = Integer.valueOf(b2);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    zzggf unused3 = zzggs.zzc;
                    zzghb zzh = zzggs.zzd;
                    zzggo zzc = zzggs.zzc();
                    if (!zzggo.zza.equals(zzc)) {
                        if (zzggo.zzb.equals(zzc)) {
                            i2 = 4;
                        } else if (zzggo.zzc.equals(zzc)) {
                            i2 = 5;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    }
                    zzgmg zza2 = ((zzgln) zzh).zza();
                    zzgsw zzc2 = zzghm.zzc(zza2.zzb());
                    zzgth zzd2 = zzgti.zzd();
                    zzd2.zzb(b2);
                    zzd2.zzd(i2);
                    zzd2.zza(zzc2);
                    zzd2.zzc(zza2.zzb().zze());
                    zzd.zza((zzgti) zzd2.zzak());
                    if (zzggs.zza) {
                        if (num == null) {
                            num = valueOf;
                        } else {
                            throw new GeneralSecurityException("Two primaries were set");
                        }
                    }
                } else {
                    throw new GeneralSecurityException("Id " + b2 + " is used twice in the keyset");
                }
            } else {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
        }
        if (num != null) {
            zzd.zzb(num.intValue());
            return new zzggw((zzgtj) zzd.zzak());
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
