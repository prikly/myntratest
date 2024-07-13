package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfy extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfy zzb;
    private int zzd;
    private String zze = "";
    private zzgym zzf = zzaL();
    private int zzg;

    static {
        zzbfy zzbfy = new zzbfy();
        zzb = zzbfy;
        zzgyd.zzaS(zzbfy.class, zzbfy);
    }

    private zzbfy() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzbfw.class, "zzg", zzbgj.zza});
        } else if (i2 == 3) {
            return new zzbfy();
        } else {
            if (i2 == 4) {
                return new zzbfx((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
