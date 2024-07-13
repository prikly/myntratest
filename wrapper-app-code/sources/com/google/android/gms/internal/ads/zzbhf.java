package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbhf extends zzgyd implements zzgzo {
    private static final zzgyj zzb = new zzbhd();
    /* access modifiers changed from: private */
    public static final zzbhf zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgyi zzj = zzaI();
    private zzbha zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzbhf zzbhf = new zzbhf();
        zzd = zzbhf;
        zzgyd.zzaS(zzbhf.class, zzbhf);
    }

    private zzbhf() {
    }

    static /* synthetic */ void zzA(zzbhf zzbhf, int i) {
        zzbhf.zzm = i - 1;
        zzbhf.zze |= 64;
    }

    static /* synthetic */ void zzB(zzbhf zzbhf, int i) {
        zzbhf.zzn = i - 1;
        zzbhf.zze |= 128;
    }

    static /* synthetic */ void zzC(zzbhf zzbhf, int i) {
        zzbhf.zzp = i - 1;
        zzbhf.zze |= 512;
    }

    public static zzbhe zzg() {
        return (zzbhe) zzd.zzaz();
    }

    public static zzbhf zzi(byte[] bArr) throws zzgyp {
        return (zzbhf) zzgyd.zzaE(zzd, bArr);
    }

    static /* synthetic */ void zzl(zzbhf zzbhf, long j) {
        zzbhf.zze |= 1;
        zzbhf.zzf = j;
    }

    static /* synthetic */ void zzm(zzbhf zzbhf, long j) {
        zzbhf.zze |= 4;
        zzbhf.zzh = j;
    }

    static /* synthetic */ void zzn(zzbhf zzbhf, long j) {
        zzbhf.zze |= 8;
        zzbhf.zzi = j;
    }

    static /* synthetic */ void zzo(zzbhf zzbhf, Iterable iterable) {
        zzgyi zzgyi = zzbhf.zzj;
        if (!zzgyi.zzc()) {
            zzbhf.zzj = zzgyd.zzaJ(zzgyi);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbhf.zzj.zzh(((zzbfu) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbhf zzbhf, zzbha zzbha) {
        zzbha.getClass();
        zzbhf.zzk = zzbha;
        zzbhf.zze |= 16;
    }

    static /* synthetic */ void zzq(zzbhf zzbhf, int i) {
        zzbhf.zze |= 256;
        zzbhf.zzo = i;
    }

    static /* synthetic */ void zzr(zzbhf zzbhf, zzbhj zzbhj) {
        zzbhf.zzq = zzbhj.zza();
        zzbhf.zze |= 1024;
    }

    static /* synthetic */ void zzs(zzbhf zzbhf, long j) {
        zzbhf.zze |= 2048;
        zzbhf.zzr = j;
    }

    static /* synthetic */ void zzy(zzbhf zzbhf, int i) {
        zzbhf.zzg = i - 1;
        zzbhf.zze |= 2;
    }

    static /* synthetic */ void zzz(zzbhf zzbhf, int i) {
        zzbhf.zzl = i - 1;
        zzbhf.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgyh zzgyh = zzbgj.zza;
            return zzaP(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzbgj.zza, "zzh", "zzi", "zzj", zzbfu.zzc(), "zzk", "zzl", zzgyh, "zzm", zzgyh, "zzn", zzgyh, "zzo", "zzp", zzgyh, "zzq", zzbhj.zzc(), "zzr"});
        } else if (i2 == 3) {
            return new zzbhf();
        } else {
            if (i2 == 4) {
                return new zzbhe((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzbha zzf() {
        zzbha zzbha = this.zzk;
        return zzbha == null ? zzbha.zzd() : zzbha;
    }

    public final zzbhj zzj() {
        zzbhj zzb2 = zzbhj.zzb(this.zzq);
        return zzb2 == null ? zzbhj.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgyk(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzbgk.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbgk.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbgk.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbgk.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzbgk.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
