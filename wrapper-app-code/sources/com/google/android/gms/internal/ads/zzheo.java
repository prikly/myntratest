package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzheo implements zzhej, zzhfc {
    private static final Object zza = new Object();
    private volatile zzhfc zzb;
    private volatile Object zzc = zza;

    private zzheo(zzhfc zzhfc) {
        this.zzb = zzhfc;
    }

    public static zzhej zza(zzhfc zzhfc) {
        if (zzhfc instanceof zzhej) {
            return (zzhej) zzhfc;
        }
        if (zzhfc != null) {
            return new zzheo(zzhfc);
        }
        throw null;
    }

    public static zzhfc zzc(zzhfc zzhfc) {
        if (zzhfc == null) {
            throw null;
        } else if (zzhfc instanceof zzheo) {
            return zzhfc;
        } else {
            return new zzheo(zzhfc);
        }
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == zza) {
                    obj = this.zzb.zzb();
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
