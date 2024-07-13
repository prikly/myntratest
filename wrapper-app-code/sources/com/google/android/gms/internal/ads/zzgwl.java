package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgwl extends zzgwn {
    final /* synthetic */ zzgwv zza;
    private int zzb = 0;
    private final int zzc = this.zza.zzd();

    zzgwl(zzgwv zzgwv) {
        this.zza = zzgwv;
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
