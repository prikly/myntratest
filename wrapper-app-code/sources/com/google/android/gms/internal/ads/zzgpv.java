package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpv extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpv zzb;
    private zzgpy zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgpv zzgpv = new zzgpv();
        zzb = zzgpv;
        zzgyd.zzaS(zzgpv.class, zzgpv);
    }

    private zzgpv() {
    }

    public static zzgpu zzc() {
        return (zzgpu) zzb.zzaz();
    }

    public static zzgpv zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgpv) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzg(zzgpv zzgpv, zzgpy zzgpy) {
        zzgpy.getClass();
        zzgpv.zzd = zzgpy;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgpv();
        } else {
            if (i2 == 4) {
                return new zzgpu((zzgpt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpy zzf() {
        zzgpy zzgpy = this.zzd;
        return zzgpy == null ? zzgpy.zze() : zzgpy;
    }
}
