package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpd extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgpj zze;
    private zzgrx zzf;

    static {
        zzgpd zzgpd = new zzgpd();
        zzb = zzgpd;
        zzgyd.zzaS(zzgpd.class, zzgpd);
    }

    private zzgpd() {
    }

    public static zzgpc zzc() {
        return (zzgpc) zzb.zzaz();
    }

    public static zzgpd zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgpd) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzi(zzgpd zzgpd, zzgpj zzgpj) {
        zzgpj.getClass();
        zzgpd.zze = zzgpj;
    }

    static /* synthetic */ void zzj(zzgpd zzgpd, zzgrx zzgrx) {
        zzgrx.getClass();
        zzgpd.zzf = zzgrx;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgpd();
        } else {
            if (i2 == 4) {
                return new zzgpc((zzgpb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpj zzf() {
        zzgpj zzgpj = this.zze;
        return zzgpj == null ? zzgpj.zze() : zzgpj;
    }

    public final zzgrx zzg() {
        zzgrx zzgrx = this.zzf;
        return zzgrx == null ? zzgrx.zze() : zzgrx;
    }
}
