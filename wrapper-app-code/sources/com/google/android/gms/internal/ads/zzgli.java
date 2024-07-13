package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgli {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgli(Class cls, zzgmd... zzgmdArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzgmd zzgmd = zzgmdArr[i];
            if (!hashMap.containsKey(zzgmd.zzb())) {
                hashMap.put(zzgmd.zzb(), zzgmd);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgmd.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgmdArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzglh zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgsv zzb();

    public abstract zzgzn zzc(zzgwv zzgwv) throws zzgyp;

    public abstract String zzd();

    public abstract void zze(zzgzn zzgzn) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgzn zzgzn, Class cls) throws GeneralSecurityException {
        zzgmd zzgmd = (zzgmd) this.zzb.get(cls);
        if (zzgmd != null) {
            return zzgmd.zza(zzgzn);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
