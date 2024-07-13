package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbhk extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbhk zzb;
    private int zzd;
    private zzgym zze = zzaL();
    private int zzf;
    private int zzg;
    private long zzh;
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private int zzl;

    static {
        zzbhk zzbhk = new zzbhk();
        zzb = zzbhk;
        zzgyd.zzaS(zzbhk.class, zzbhk);
    }

    private zzbhk() {
    }

    public static zzbhg zza() {
        return (zzbhg) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbhk zzbhk, Iterable iterable) {
        zzgym zzgym = zzbhk.zze;
        if (!zzgym.zzc()) {
            zzbhk.zze = zzgyd.zzaM(zzgym);
        }
        zzgwe.zzau(iterable, zzbhk.zze);
    }

    static /* synthetic */ void zze(zzbhk zzbhk, int i) {
        zzbhk.zzd |= 1;
        zzbhk.zzf = i;
    }

    static /* synthetic */ void zzf(zzbhk zzbhk, int i) {
        zzbhk.zzd |= 2;
        zzbhk.zzg = i;
    }

    static /* synthetic */ void zzg(zzbhk zzbhk, long j) {
        zzbhk.zzd |= 4;
        zzbhk.zzh = j;
    }

    static /* synthetic */ void zzh(zzbhk zzbhk, String str) {
        str.getClass();
        zzbhk.zzd |= 8;
        zzbhk.zzi = str;
    }

    static /* synthetic */ void zzi(zzbhk zzbhk, String str) {
        str.getClass();
        zzbhk.zzd |= 16;
        zzbhk.zzj = str;
    }

    static /* synthetic */ void zzj(zzbhk zzbhk, long j) {
        zzbhk.zzd |= 32;
        zzbhk.zzk = j;
    }

    static /* synthetic */ void zzk(zzbhk zzbhk, int i) {
        zzbhk.zzd |= 64;
        zzbhk.zzl = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzbhf.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new zzbhk();
        } else {
            if (i2 == 4) {
                return new zzbhg((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
