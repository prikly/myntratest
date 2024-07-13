package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzasc extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzasc zzb;
    private int zzd;
    private zzasf zze;
    private zzgwv zzf = zzgwv.zzb;
    private zzgwv zzg = zzgwv.zzb;

    static {
        zzasc zzasc = new zzasc();
        zzb = zzasc;
        zzgyd.zzaS(zzasc.class, zzasc);
    }

    private zzasc() {
    }

    public static zzasc zzc(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzasc) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzasc();
        } else {
            if (i2 == 4) {
                return new zzasb((zzasa) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzasf zzd() {
        zzasf zzasf = this.zze;
        return zzasf == null ? zzasf.zzg() : zzasf;
    }

    public final zzgwv zze() {
        return this.zzg;
    }

    public final zzgwv zzf() {
        return this.zzf;
    }
}
