package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbir extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbir zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbir zzbir = new zzbir();
        zzb = zzbir;
        zzgyd.zzaS(zzbir.class, zzbir);
    }

    private zzbir() {
    }

    public static zzbiq zza() {
        return (zzbiq) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbir zzbir, boolean z) {
        zzbir.zzd |= 1;
        zzbir.zze = z;
    }

    static /* synthetic */ void zze(zzbir zzbir, int i) {
        zzbir.zzd |= 2;
        zzbir.zzf = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzbir();
        } else {
            if (i2 == 4) {
                return new zzbiq((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzf() {
        return this.zze;
    }
}
