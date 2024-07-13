package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzanc extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzanc zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt;
    private long zzu;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzanc zzanc = new zzanc();
        zzb = zzanc;
        zzgyd.zzaS(zzanc.class, zzanc);
    }

    private zzanc() {
    }

    public static zzanb zza() {
        return (zzanb) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzanc zzanc, long j) {
        zzanc.zzd |= 1;
        zzanc.zze = j;
    }

    static /* synthetic */ void zze(zzanc zzanc, long j) {
        zzanc.zzd |= 2;
        zzanc.zzf = j;
    }

    static /* synthetic */ void zzf(zzanc zzanc, long j) {
        zzanc.zzd |= 4;
        zzanc.zzg = j;
    }

    static /* synthetic */ void zzg(zzanc zzanc, long j) {
        zzanc.zzd |= 8;
        zzanc.zzh = j;
    }

    static /* synthetic */ void zzh(zzanc zzanc) {
        zzanc.zzd &= -9;
        zzanc.zzh = -1;
    }

    static /* synthetic */ void zzi(zzanc zzanc, long j) {
        zzanc.zzd |= 16;
        zzanc.zzi = j;
    }

    static /* synthetic */ void zzj(zzanc zzanc, long j) {
        zzanc.zzd |= 32;
        zzanc.zzj = j;
    }

    static /* synthetic */ void zzk(zzanc zzanc, long j) {
        zzanc.zzd |= 128;
        zzanc.zzl = j;
    }

    static /* synthetic */ void zzl(zzanc zzanc, long j) {
        zzanc.zzd |= 256;
        zzanc.zzm = j;
    }

    static /* synthetic */ void zzm(zzanc zzanc, long j) {
        zzanc.zzd |= 512;
        zzanc.zzn = j;
    }

    static /* synthetic */ void zzn(zzanc zzanc, long j) {
        zzanc.zzd |= 2048;
        zzanc.zzp = j;
    }

    static /* synthetic */ void zzo(zzanc zzanc, long j) {
        zzanc.zzd |= 4096;
        zzanc.zzq = j;
    }

    static /* synthetic */ void zzp(zzanc zzanc, long j) {
        zzanc.zzd |= 8192;
        zzanc.zzr = j;
    }

    static /* synthetic */ void zzq(zzanc zzanc, long j) {
        zzanc.zzd |= 16384;
        zzanc.zzs = j;
    }

    static /* synthetic */ void zzr(zzanc zzanc, long j) {
        zzanc.zzd |= 32768;
        zzanc.zzt = j;
    }

    static /* synthetic */ void zzs(zzanc zzanc, long j) {
        zzanc.zzd |= 65536;
        zzanc.zzu = j;
    }

    static /* synthetic */ void zzt(zzanc zzanc, long j) {
        zzanc.zzd |= 131072;
        zzanc.zzv = j;
    }

    static /* synthetic */ void zzu(zzanc zzanc, long j) {
        zzanc.zzd |= 262144;
        zzanc.zzw = j;
    }

    static /* synthetic */ void zzv(zzanc zzanc, int i) {
        zzanc.zzk = i - 1;
        zzanc.zzd |= 64;
    }

    static /* synthetic */ void zzw(zzanc zzanc, int i) {
        zzanc.zzo = i - 1;
        zzanc.zzd |= 1024;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgyh zzgyh = zzanl.zza;
            return zzaP(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgyh, "zzl", "zzm", "zzn", "zzo", zzgyh, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        } else if (i2 == 3) {
            return new zzanc();
        } else {
            if (i2 == 4) {
                return new zzanb((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
