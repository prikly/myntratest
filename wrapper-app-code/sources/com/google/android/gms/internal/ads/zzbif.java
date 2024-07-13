package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbif extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbif zzb;
    private int zzd;
    private zzbhw zze;
    private int zzf = 1000;
    private zzbid zzg;
    private zzbhu zzh;

    static {
        zzbif zzbif = new zzbif();
        zzb = zzbif;
        zzgyd.zzaS(zzbif.class, zzbif);
    }

    private zzbif() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzbgj.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbif();
        } else {
            if (i2 == 4) {
                return new zzbie((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
