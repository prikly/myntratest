package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbhu extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbhu zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbhu zzbhu = new zzbhu();
        zzb = zzbhu;
        zzgyd.zzaS(zzbhu.class, zzbhu);
    }

    private zzbhu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzbhu();
        } else {
            if (i2 == 4) {
                return new zzbht((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
