package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbho extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbho zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbho zzbho = new zzbho();
        zzb = zzbho;
        zzgyd.zzaS(zzbho.class, zzbho);
    }

    private zzbho() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzbho();
        } else {
            if (i2 == 4) {
                return new zzbhn((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
