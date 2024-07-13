package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbil extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbil zzb;
    private int zzd;
    private int zze = 1000;
    private zzbid zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzbil zzbil = new zzbil();
        zzb = zzbil;
        zzgyd.zzaS(zzbil.class, zzbil);
    }

    private zzbil() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzbgj.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzbil();
        } else {
            if (i2 == 4) {
                return new zzbik((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
