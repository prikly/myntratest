package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzghi {
    private final ConcurrentMap zza;
    private final zzghe zzb;
    private final Class zzc;
    private final zzgoj zzd;

    /* synthetic */ zzghi(ConcurrentMap concurrentMap, zzghe zzghe, zzgoj zzgoj, Class cls, zzghh zzghh) {
        this.zza = concurrentMap;
        this.zzb = zzghe;
        this.zzc = cls;
        this.zzd = zzgoj;
    }

    public final zzghe zza() {
        return this.zzb;
    }

    public final zzgoj zzb() {
        return this.zzd;
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzghg(bArr, (zzghf) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zzd.zza().isEmpty();
    }
}
