package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbhs extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbhs zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzbhu zzg;

    static {
        zzbhs zzbhs = new zzbhs();
        zzb = zzbhs;
        zzgyd.zzaS(zzbhs.class, zzbhs);
    }

    private zzbhs() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbgj.zza, "zzg"});
        } else if (i2 == 3) {
            return new zzbhs();
        } else {
            if (i2 == 4) {
                return new zzbhr((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
