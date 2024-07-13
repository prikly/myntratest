package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhdk extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhdk zzb;
    private int zzd;
    private String zze = "";
    private zzgwv zzf = zzgwv.zzb;

    static {
        zzhdk zzhdk = new zzhdk();
        zzb = zzhdk;
        zzgyd.zzaS(zzhdk.class, zzhdk);
    }

    private zzhdk() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzhdk();
        } else {
            if (i2 == 4) {
                return new zzhdj((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
