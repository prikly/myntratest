package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzik implements zzii {
    volatile zzii zza;
    volatile boolean zzb;
    Object zzc;

    zzik(zzii zzii) {
        if (zzii != null) {
            this.zza = zzii;
            return;
        }
        throw null;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.zzc + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzii zzii = this.zza;
                    zzii.getClass();
                    Object zza2 = zzii.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    this.zza = null;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
