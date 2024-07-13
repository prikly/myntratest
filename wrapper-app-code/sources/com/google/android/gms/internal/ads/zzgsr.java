package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgsr extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgsr zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgsl zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgsr zzgsr = new zzgsr();
        zzb = zzgsr;
        zzgyd.zzaS(zzgsr.class, zzgsr);
    }

    private zzgsr() {
    }

    public static zzgsq zzd() {
        return (zzgsq) zzb.zzaz();
    }

    public static zzgsr zzf() {
        return zzb;
    }

    public static zzgsr zzg(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgsr) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzj(zzgsr zzgsr, zzgsl zzgsl) {
        zzgsl.getClass();
        zzgsr.zze = zzgsl;
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
            return new zzgsr();
        } else {
            if (i2 == 4) {
                return new zzgsq((zzgsp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsl zzc() {
        zzgsl zzgsl = this.zze;
        return zzgsl == null ? zzgsl.zzd() : zzgsl;
    }

    public final zzgwv zzh() {
        return this.zzf;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}
