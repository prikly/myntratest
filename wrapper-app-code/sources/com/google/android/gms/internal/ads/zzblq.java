package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzblq {
    static final AtomicBoolean zza = new AtomicBoolean();
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();

    static zzblo zza() {
        return (zzblo) zzb.get();
    }

    static zzblp zzb() {
        return (zzblp) zzc.get();
    }

    public static void zzc(zzblo zzblo) {
        zzb.set(zzblo);
    }
}
