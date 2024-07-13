package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzim {
    public static zzii zza(zzii zzii) {
        if ((zzii instanceof zzik) || (zzii instanceof zzij)) {
            return zzii;
        }
        if (zzii instanceof Serializable) {
            return new zzij(zzii);
        }
        return new zzik(zzii);
    }

    public static zzii zzb(Object obj) {
        return new zzil(obj);
    }
}
