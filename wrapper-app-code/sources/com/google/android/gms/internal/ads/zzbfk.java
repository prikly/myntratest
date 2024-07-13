package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfk extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfk zzb;
    private int zzd;
    private int zze;
    private zzbfo zzf;
    private zzbfq zzg;

    static {
        zzbfk zzbfk = new zzbfk();
        zzb = zzbfk;
        zzgyd.zzaS(zzbfk.class, zzbfk);
    }

    private zzbfk() {
    }

    public static zzbfj zza() {
        return (zzbfj) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbfk zzbfk, zzbfo zzbfo) {
        zzbfo.getClass();
        zzbfk.zzf = zzbfo;
        zzbfk.zzd |= 2;
    }

    static /* synthetic */ void zze(zzbfk zzbfk, zzbfq zzbfq) {
        zzbfq.getClass();
        zzbfk.zzg = zzbfq;
        zzbfk.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzbfk zzbfk, int i) {
        zzbfk.zze = 1;
        zzbfk.zzd = 1 | zzbfk.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzbfm.zza, "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbfk();
        } else {
            if (i2 == 4) {
                return new zzbfj((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
