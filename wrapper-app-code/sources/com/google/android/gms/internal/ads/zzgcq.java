package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgcq extends zzgaz {
    final transient Object zza;

    zzgcq(Object obj) {
        if (obj != null) {
            this.zza = obj;
            return;
        }
        throw null;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgbc(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    public final zzgau zzd() {
        return zzgau.zzp(this.zza);
    }

    public final zzgct zze() {
        return new zzgbc(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
