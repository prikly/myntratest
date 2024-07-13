package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbih extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbih zzb;
    private int zzd;
    private int zze = 1000;
    private zzbid zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbih zzbih = new zzbih();
        zzb = zzbih;
        zzgyd.zzaS(zzbih.class, zzbih);
    }

    private zzbih() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzbgj.zza, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbih();
        } else {
            if (i2 == 4) {
                return new zzbig((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
