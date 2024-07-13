package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbid extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbid zzb;
    private int zzd;
    private int zze;

    static {
        zzbid zzbid = new zzbid();
        zzb = zzbid;
        zzgyd.zzaS(zzbid.class, zzbid);
    }

    private zzbid() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzbic.zza});
        } else if (i2 == 3) {
            return new zzbid();
        } else {
            if (i2 == 4) {
                return new zzbib((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
