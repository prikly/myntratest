package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgcg extends zzgaz {
    private final transient zzgax zza;
    private final transient zzgau zzb;

    zzgcg(zzgax zzgax, zzgau zzgau) {
        this.zza = zzgax;
        this.zzb = zzgau;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    public final zzgau zzd() {
        return this.zzb;
    }

    public final zzgct zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
