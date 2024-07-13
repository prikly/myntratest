package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgof implements zzghj {
    /* access modifiers changed from: private */
    public static final Logger zza = Logger.getLogger(zzgof.class.getName());
    /* access modifiers changed from: private */
    public static final byte[] zzb = {0};

    zzgof() {
    }

    public final Class zza() {
        return zzggz.class;
    }

    public final Class zzb() {
        return zzggz.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzghi zzghi) throws GeneralSecurityException {
        for (List it : zzghi.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzghe zzghe = (zzghe) it2.next();
                    if (zzghe.zzb() instanceof zzgob) {
                        zzgob zzgob = (zzgob) zzghe.zzb();
                        zzgwa zzb2 = zzgwa.zzb(zzghe.zzf());
                        if (!zzb2.equals(zzgob.zzc())) {
                            String valueOf = String.valueOf(zzgob.zzb());
                            String obj = zzgob.zzc().toString();
                            String obj2 = zzb2.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                        }
                    }
                }
            }
        }
        return new zzgoe(zzghi, (zzgod) null);
    }
}
