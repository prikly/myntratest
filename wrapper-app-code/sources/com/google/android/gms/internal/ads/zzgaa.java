package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgaa implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzgae zze;

    /* synthetic */ zzgaa(zzgae zzgae, zzfzw zzfzw) {
        this.zze = zzgae;
        zzgae zzgae2 = this.zze;
        this.zzb = zzgae2.zzf;
        this.zzc = zzgae2.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        zzb();
        zzfye.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzgae zzgae = this.zze;
        zzgae.remove(zzgae.zzg(zzgae, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(int i);
}
