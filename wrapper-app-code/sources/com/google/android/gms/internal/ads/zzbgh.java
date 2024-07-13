package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbgh extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbgh zzb;
    private int zzd;
    private int zze;
    private zzbhw zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzbgh zzbgh = new zzbgh();
        zzb = zzbgh;
        zzgyd.zzaS(zzbgh.class, zzbgh);
    }

    private zzbgh() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzbgg.zza, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbgh();
        } else {
            if (i2 == 4) {
                return new zzbgf((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
