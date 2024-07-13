package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhab {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhab() {
    }

    static /* bridge */ /* synthetic */ zzgwv zza(zzhab zzhab, zzgwv zzgwv, zzgwv zzgwv2) {
        zzhab.zzb(zzgwv);
        zzhab.zzb(zzgwv2);
        zzgwv zzgwv3 = (zzgwv) zzhab.zza.pop();
        while (!zzhab.zza.isEmpty()) {
            zzgwv3 = new zzhaf((zzgwv) zzhab.zza.pop(), zzgwv3);
        }
        return zzgwv3;
    }

    private final void zzb(zzgwv zzgwv) {
        if (zzgwv.zzh()) {
            int zzc = zzc(zzgwv.zzd());
            int zzc2 = zzhaf.zzc(zzc + 1);
            if (this.zza.isEmpty() || ((zzgwv) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgwv);
                return;
            }
            int zzc3 = zzhaf.zzc(zzc);
            zzgwv zzgwv2 = (zzgwv) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgwv) this.zza.peek()).zzd() < zzc3) {
                zzgwv2 = new zzhaf((zzgwv) this.zza.pop(), zzgwv2);
            }
            zzhaf zzhaf = new zzhaf(zzgwv2, zzgwv);
            while (!this.zza.isEmpty() && ((zzgwv) this.zza.peek()).zzd() < zzhaf.zzc(zzc(zzhaf.zzd()) + 1)) {
                zzhaf = new zzhaf((zzgwv) this.zza.pop(), zzhaf);
            }
            this.zza.push(zzhaf);
        } else if (zzgwv instanceof zzhaf) {
            zzhaf zzhaf2 = (zzhaf) zzgwv;
            zzb(zzhaf2.zzd);
            zzb(zzhaf2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgwv.getClass()))));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzhaf.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzhab(zzhaa zzhaa) {
    }
}
