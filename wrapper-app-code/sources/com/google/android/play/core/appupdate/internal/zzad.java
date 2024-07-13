package com.google.android.play.core.appupdate.internal;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public final class zzad implements zzaf {
    private static final Object zza = new Object();
    private volatile zzaf zzb;
    private volatile Object zzc = zza;

    private zzad(zzaf zzaf) {
        this.zzb = zzaf;
    }

    public static zzaf zzb(zzaf zzaf) {
        if (zzaf == null) {
            throw null;
        } else if (zzaf instanceof zzad) {
            return zzaf;
        } else {
            return new zzad(zzaf);
        }
    }

    public final Object zza() {
        Object obj = this.zzc;
        if (obj == zza) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == zza) {
                    obj = this.zzb.zza();
                    Object obj2 = this.zzc;
                    if (obj2 != zza) {
                        if (obj2 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
