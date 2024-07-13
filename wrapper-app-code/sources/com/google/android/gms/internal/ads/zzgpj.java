package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpj extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpj zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgpp zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgpj zzgpj = new zzgpj();
        zzb = zzgpj;
        zzgyd.zzaS(zzgpj.class, zzgpj);
    }

    private zzgpj() {
    }

    public static zzgpi zzc() {
        return (zzgpi) zzb.zzaz();
    }

    public static zzgpj zze() {
        return zzb;
    }

    public static zzgpj zzf(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgpj) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzj(zzgpj zzgpj, zzgpp zzgpp) {
        zzgpp.getClass();
        zzgpj.zze = zzgpp;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgpj();
        } else {
            if (i2 == 4) {
                return new zzgpi((zzgph) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpp zzg() {
        zzgpp zzgpp = this.zze;
        return zzgpp == null ? zzgpp.zze() : zzgpp;
    }

    public final zzgwv zzh() {
        return this.zzf;
    }
}
