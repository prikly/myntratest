package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbgs extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbgs zzb;
    private int zzd;
    private zzbgo zze;
    private zzgym zzf = zzaL();
    private int zzg;
    private zzbhu zzh;

    static {
        zzbgs zzbgs = new zzbgs();
        zzb = zzbgs;
        zzgyd.zzaS(zzbgs.class, zzbgs);
    }

    private zzbgs() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbhs.class, "zzg", zzbgj.zza, "zzh"});
        } else if (i2 == 3) {
            return new zzbgs();
        } else {
            if (i2 == 4) {
                return new zzbgr((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
