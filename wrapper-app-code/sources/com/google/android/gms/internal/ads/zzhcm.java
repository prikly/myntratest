package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhcm extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhcm zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzhcm zzhcm = new zzhcm();
        zzb = zzhcm;
        zzgyd.zzaS(zzhcm.class, zzhcm);
    }

    private zzhcm() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzhcl.zza, "zzf", zzhcj.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzhcm();
        } else {
            if (i2 == 4) {
                return new zzhck((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
