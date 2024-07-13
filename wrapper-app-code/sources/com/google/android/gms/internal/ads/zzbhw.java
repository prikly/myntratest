package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbhw extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbhw zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbhw zzbhw = new zzbhw();
        zzb = zzbhw;
        zzgyd.zzaS(zzbhw.class, zzbhw);
    }

    private zzbhw() {
    }

    public static zzbhv zza() {
        return (zzbhv) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbhw zzbhw, int i) {
        zzbhw.zzd |= 1;
        zzbhw.zze = i;
    }

    static /* synthetic */ void zze(zzbhw zzbhw, int i) {
        zzbhw.zzd |= 2;
        zzbhw.zzf = i;
    }

    static /* synthetic */ void zzf(zzbhw zzbhw, int i) {
        zzbhw.zzd |= 4;
        zzbhw.zzg = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbhw();
        } else {
            if (i2 == 4) {
                return new zzbhv((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
