package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzgan extends zzgao {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    zzgan(int i) {
        this.zza = new Object[i];
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzd(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public /* bridge */ /* synthetic */ zzgao zzb(Object obj) {
        throw null;
    }

    public final zzgao zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zze(this.zzb + collection.size());
            if (collection instanceof zzgap) {
                this.zzb = ((zzgap) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object zzb2 : iterable) {
            zzb(zzb2);
        }
        return this;
    }

    public final zzgan zza(Object obj) {
        if (obj != null) {
            zze(this.zzb + 1);
            Object[] objArr = this.zza;
            int i = this.zzb;
            this.zzb = i + 1;
            objArr[i] = obj;
            return this;
        }
        throw null;
    }
}
