package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfo extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfo zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbfo zzbfo = new zzbfo();
        zzb = zzbfo;
        zzgyd.zzaS(zzbfo.class, zzbfo);
    }

    private zzbfo() {
    }

    public static zzbfn zza() {
        return (zzbfn) zzb.zzaz();
    }

    public static zzbfo zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbfo zzbfo, boolean z) {
        zzbfo.zzd |= 1;
        zzbfo.zze = z;
    }

    static /* synthetic */ void zzf(zzbfo zzbfo, int i) {
        zzbfo.zzd |= 2;
        zzbfo.zzf = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzbfo();
        } else {
            if (i2 == 4) {
                return new zzbfn((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
