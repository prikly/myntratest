package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbia extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbia zzb;
    private int zzd;
    private int zze = 1000;
    private zzbid zzf;
    private zzbhu zzg;

    static {
        zzbia zzbia = new zzbia();
        zzb = zzbia;
        zzgyd.zzaS(zzbia.class, zzbia);
    }

    private zzbia() {
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
            return new zzbia();
        } else {
            if (i2 == 4) {
                return new zzbhz((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
