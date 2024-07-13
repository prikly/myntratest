package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzz extends zzgwn {
    final zzhad zza = new zzhad(this.zzc, (zzhac) null);
    zzgwp zzb = zzb();
    final /* synthetic */ zzhaf zzc;

    zzgzz(zzhaf zzhaf) {
        this.zzc = zzhaf;
    }

    private final zzgwp zzb() {
        zzhad zzhad = this.zza;
        if (zzhad.hasNext()) {
            return zzhad.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgwp zzgwp = this.zzb;
        if (zzgwp != null) {
            byte zza2 = zzgwp.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
