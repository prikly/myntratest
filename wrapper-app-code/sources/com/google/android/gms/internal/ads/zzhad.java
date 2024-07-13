package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhad implements Iterator {
    private final ArrayDeque zza;
    private zzgwq zzb;

    /* synthetic */ zzhad(zzgwv zzgwv, zzhac zzhac) {
        if (zzgwv instanceof zzhaf) {
            zzhaf zzhaf = (zzhaf) zzgwv;
            ArrayDeque arrayDeque = new ArrayDeque(zzhaf.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhaf);
            this.zzb = zzb(zzhaf.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgwq) zzgwv;
    }

    private final zzgwq zzb(zzgwv zzgwv) {
        while (zzgwv instanceof zzhaf) {
            zzhaf zzhaf = (zzhaf) zzgwv;
            this.zza.push(zzhaf);
            zzgwv = zzhaf.zzd;
        }
        return (zzgwq) zzgwv;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgwq next() {
        zzgwq zzgwq;
        zzgwq zzgwq2 = this.zzb;
        if (zzgwq2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgwq = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgwq;
                } else {
                    zzgwq = zzb(((zzhaf) this.zza.pop()).zze);
                }
            } while (zzgwq.zzD());
            this.zzb = zzgwq;
            return zzgwq2;
        }
        throw new NoSuchElementException();
    }
}
