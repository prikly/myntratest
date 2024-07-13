package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgsi extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgsi zzb;
    private zzgsl zzd;

    static {
        zzgsi zzgsi = new zzgsi();
        zzb = zzgsi;
        zzgyd.zzaS(zzgsi.class, zzgsi);
    }

    private zzgsi() {
    }

    public static zzgsh zza() {
        return (zzgsh) zzb.zzaz();
    }

    public static zzgsi zzd(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgsi) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzf(zzgsi zzgsi, zzgsl zzgsl) {
        zzgsl.getClass();
        zzgsi.zzd = zzgsl;
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
            return new zzgsi();
        } else {
            if (i2 == 4) {
                return new zzgsh((zzgsg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsl zze() {
        zzgsl zzgsl = this.zzd;
        return zzgsl == null ? zzgsl.zzd() : zzgsl;
    }
}
