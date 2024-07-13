package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfi extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfi zzb;
    private int zzd;
    private int zze;
    private int zzf = 1000;
    private zzbfy zzg;
    private zzbga zzh;
    private zzgym zzi = zzaL();
    private zzbgc zzj;
    private zzbhm zzk;
    private zzbhc zzl;
    private zzbgq zzm;
    private zzbgs zzn;
    private zzgym zzo = zzaL();

    static {
        zzbfi zzbfi = new zzbfi();
        zzb = zzbfi;
        zzgyd.zzaS(zzbfi.class, zzbfi);
    }

    private zzbfi() {
    }

    public static zzbfi zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbfi zzbfi, zzbfg zzbfg) {
        zzbfi.zze = zzbfg.zza();
        zzbfi.zzd |= 1;
    }

    static /* synthetic */ void zzf(zzbfi zzbfi, zzbga zzbga) {
        zzbga.getClass();
        zzbfi.zzh = zzbga;
        zzbfi.zzd |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzbfg.zzc(), "zzf", zzbgj.zza, "zzg", "zzh", "zzi", zzbfw.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbhy.class});
        } else if (i2 == 3) {
            return new zzbfi();
        } else {
            if (i2 == 4) {
                return new zzbfh((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzbga zzd() {
        zzbga zzbga = this.zzh;
        return zzbga == null ? zzbga.zzc() : zzbga;
    }
}
