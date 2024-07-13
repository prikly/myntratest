package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgxd {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgxe zzc;

    /* synthetic */ zzgxd(zzgxc zzgxc) {
    }

    public static int zzF(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzG(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzgxd zzH(InputStream inputStream, int i) {
        return new zzgxb(inputStream, 4096, (zzgxa) null);
    }

    static zzgxd zzI(byte[] bArr, int i, int i2, boolean z) {
        zzgwx zzgwx = new zzgwx(bArr, i, i2, z, (zzgww) null);
        try {
            zzgwx.zze(i2);
            return zzgwx;
        } catch (zzgyp e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void zzA(int i);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i) throws zzgyp;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzgwv zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i) throws zzgyp;
}
