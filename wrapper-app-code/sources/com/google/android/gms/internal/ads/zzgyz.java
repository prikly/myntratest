package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgyz extends zzgzb {
    private zzgyz() {
        super((zzgza) null);
    }

    /* synthetic */ zzgyz(zzgyy zzgyy) {
        super((zzgza) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j) {
        zzgym zzgym = (zzgym) zzhbh.zzh(obj, j);
        if (zzgym.zzc()) {
            return zzgym;
        }
        int size = zzgym.size();
        zzgym zzd = zzgym.zzd(size == 0 ? 10 : size + size);
        zzhbh.zzv(obj, j, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        ((zzgym) zzhbh.zzh(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j) {
        zzgym zzgym = (zzgym) zzhbh.zzh(obj, j);
        zzgym zzgym2 = (zzgym) zzhbh.zzh(obj2, j);
        int size = zzgym.size();
        int size2 = zzgym2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgym.zzc()) {
                zzgym = zzgym.zzd(size2 + size);
            }
            zzgym.addAll(zzgym2);
        }
        if (size > 0) {
            zzgym2 = zzgym;
        }
        zzhbh.zzv(obj, j, zzgym2);
    }
}
