package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfw extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfw zzb;
    private int zzd;
    private int zze;
    private zzbhq zzf;

    static {
        zzbfw zzbfw = new zzbfw();
        zzb = zzbfw;
        zzgyd.zzaS(zzbfw.class, zzbfw);
    }

    private zzbfw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzbfu.zzc(), "zzf"});
        } else if (i2 == 3) {
            return new zzbfw();
        } else {
            if (i2 == 4) {
                return new zzbfv((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
