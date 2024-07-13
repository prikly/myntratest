package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgre extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgre zzb;
    private zzgrh zzd;

    static {
        zzgre zzgre = new zzgre();
        zzb = zzgre;
        zzgyd.zzaS(zzgre.class, zzgre);
    }

    private zzgre() {
    }

    public static zzgrd zza() {
        return (zzgrd) zzb.zzaz();
    }

    public static zzgre zzd(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgre) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzf(zzgre zzgre, zzgrh zzgrh) {
        zzgrh.getClass();
        zzgre.zzd = zzgrh;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzgre();
        } else {
            if (i2 == 4) {
                return new zzgrd((zzgrc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgrh zze() {
        zzgrh zzgrh = this.zzd;
        return zzgrh == null ? zzgrh.zze() : zzgrh;
    }
}
