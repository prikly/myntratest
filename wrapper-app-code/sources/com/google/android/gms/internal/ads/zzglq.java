package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzglq {
    public static final zzgok zza = new zzglp((zzglo) null);

    public static zzgoq zza(zzghi zzghi) {
        zzggo zzggo;
        zzgom zzgom = new zzgom();
        zzgom.zzb(zzghi.zzb());
        for (List it : zzghi.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzghe zzghe = (zzghe) it2.next();
                    int zzg = zzghe.zzg() - 2;
                    if (zzg == 1) {
                        zzggo = zzggo.zza;
                    } else if (zzg == 2) {
                        zzggo = zzggo.zzb;
                    } else if (zzg == 3) {
                        zzggo = zzggo.zzc;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgom.zza(zzggo, zzghe.zza(), zzghe.zzc());
                }
            }
        }
        if (zzghi.zza() != null) {
            zzgom.zzc(zzghi.zza().zza());
        }
        try {
            return zzgom.zzd();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
