package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzzd {
    private final zzzc zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzzd(zzzc zzzc) {
        this.zza = zzzc;
    }

    public final zzzj zza(Object... objArr) {
        Constructor constructor;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    constructor = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (zzzj) constructor.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }
}
