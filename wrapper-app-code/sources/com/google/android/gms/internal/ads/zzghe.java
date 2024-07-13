package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzghe {
    private final Object zza;
    private final byte[] zzb;
    private final zzguc zzc;
    private final int zzd;
    private final zzggf zze;
    private final int zzf;

    zzghe(Object obj, byte[] bArr, int i, zzguc zzguc, int i2, zzggf zzggf) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzf = i;
        this.zzc = zzguc;
        this.zzd = i2;
        this.zze = zzggf;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzggf zzb() {
        return this.zze;
    }

    public final zzghb zzc() {
        return this.zze.zza();
    }

    public final zzguc zzd() {
        return this.zzc;
    }

    public final Object zze() {
        return this.zza;
    }

    public final byte[] zzf() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzg() {
        return this.zzf;
    }
}
