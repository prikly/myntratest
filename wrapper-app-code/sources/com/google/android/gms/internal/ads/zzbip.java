package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbip extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbip zzb;
    private int zzd;
    private int zze = 1000;
    private zzbid zzf;

    static {
        zzbip zzbip = new zzbip();
        zzb = zzbip;
        zzgyd.zzaS(zzbip.class, zzbip);
    }

    private zzbip() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzbgj.zza, "zzf"});
        } else if (i2 == 3) {
            return new zzbip();
        } else {
            if (i2 == 4) {
                return new zzbio((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
