package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbgc extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbgc zzb;
    private int zzd;
    private int zze;
    private zzbhu zzf;
    private zzbhu zzg;
    private zzbhu zzh;
    private zzgym zzi = zzaL();
    private int zzj;

    static {
        zzbgc zzbgc = new zzbgc();
        zzb = zzbgc;
        zzgyd.zzaS(zzbgc.class, zzbgc);
    }

    private zzbgc() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzbhu.class, "zzj"});
        } else if (i2 == 3) {
            return new zzbgc();
        } else {
            if (i2 == 4) {
                return new zzbgb((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
