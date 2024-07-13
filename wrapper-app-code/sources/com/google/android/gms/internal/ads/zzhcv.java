package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhcv extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhcv zzb;
    private int zzd;
    private int zze;
    private zzgwv zzf = zzgwv.zzb;
    private zzgwv zzg = zzgwv.zzb;

    static {
        zzhcv zzhcv = new zzhcv();
        zzb = zzhcv;
        zzgyd.zzaS(zzhcv.class, zzhcv);
    }

    private zzhcv() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzhcv();
        } else {
            if (i2 == 4) {
                return new zzhcu((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
