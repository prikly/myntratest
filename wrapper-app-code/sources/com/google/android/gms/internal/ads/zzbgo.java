package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbgo extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbgo zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzgyi zzg = zzaI();
    private zzbhu zzh;

    static {
        zzbgo zzbgo = new zzbgo();
        zzb = zzbgo;
        zzgyd.zzaS(zzbgo.class, zzbgo);
    }

    private zzbgo() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbgj.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbgo();
        } else {
            if (i2 == 4) {
                return new zzbgn((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
