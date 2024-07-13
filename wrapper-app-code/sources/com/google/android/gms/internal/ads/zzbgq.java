package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbgq extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbgq zzb;
    private int zzd;
    private int zze;
    private zzgyi zzf = zzaI();

    static {
        zzbgq zzbgq = new zzbgq();
        zzb = zzbgq;
        zzgyd.zzaS(zzbgq.class, zzbgq);
    }

    private zzbgq() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzd", "zze", zzbgj.zza, "zzf"});
        } else if (i2 == 3) {
            return new zzbgq();
        } else {
            if (i2 == 4) {
                return new zzbgp((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
