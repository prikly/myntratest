package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbin extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbin zzb;
    private int zzd;
    private int zze = 1000;
    private zzbid zzf;
    private zzbhu zzg;

    static {
        zzbin zzbin = new zzbin();
        zzb = zzbin;
        zzgyd.zzaS(zzbin.class, zzbin);
    }

    private zzbin() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzbgj.zza, "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbin();
        } else {
            if (i2 == 4) {
                return new zzbim((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
