package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzko {
    private final zzaa zza;
    private final SparseArray zzb;

    public zzko(zzaa zzaa, SparseArray sparseArray) {
        this.zza = zzaa;
        SparseArray sparseArray2 = new SparseArray(zzaa.zzb());
        int i = 0;
        while (i < zzaa.zzb()) {
            int zza2 = zzaa.zza(i);
            zzkn zzkn = (zzkn) sparseArray.get(zza2);
            if (zzkn != null) {
                sparseArray2.append(zza2, zzkn);
                i++;
            } else {
                throw null;
            }
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzkn zzc(int i) {
        zzkn zzkn = (zzkn) this.zzb.get(i);
        if (zzkn != null) {
            return zzkn;
        }
        throw null;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
