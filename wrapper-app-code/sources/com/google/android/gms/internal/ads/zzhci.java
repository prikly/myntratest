package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhci extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhci zzb;
    private int zzd;
    private String zze = "";
    private zzhch zzf;
    private long zzg;
    private String zzh = "";

    static {
        zzhci zzhci = new zzhci();
        zzb = zzhci;
        zzgyd.zzaS(zzhci.class, zzhci);
    }

    private zzhci() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzhci();
        } else {
            if (i2 == 4) {
                return new zzhcf((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
