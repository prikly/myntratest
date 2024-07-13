package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzglh {
    private final Class zza;

    public zzglh(Class cls) {
        this.zza = cls;
    }

    public abstract zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException;

    public abstract zzgzn zzb(zzgwv zzgwv) throws zzgyp;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgzn zzgzn) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
