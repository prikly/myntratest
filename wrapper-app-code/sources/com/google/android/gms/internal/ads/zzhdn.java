package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhdn extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhdn zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhdn zzhdn = new zzhdn();
        zzb = zzhdn;
        zzgyd.zzaS(zzhdn.class, zzhdn);
    }

    private zzhdn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzhdn();
        } else {
            if (i2 == 4) {
                return new zzhdm((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
