package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgsa extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgsa zzb;
    private zzgsd zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgsa zzgsa = new zzgsa();
        zzb = zzgsa;
        zzgyd.zzaS(zzgsa.class, zzgsa);
    }

    private zzgsa() {
    }

    public static zzgrz zzc() {
        return (zzgrz) zzb.zzaz();
    }

    public static zzgsa zze() {
        return zzb;
    }

    public static zzgsa zzf(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgsa) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzh(zzgsa zzgsa, zzgsd zzgsd) {
        zzgsd.getClass();
        zzgsa.zzd = zzgsd;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgsa();
        } else {
            if (i2 == 4) {
                return new zzgrz((zzgry) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsd zzg() {
        zzgsd zzgsd = this.zzd;
        return zzgsd == null ? zzgsd.zze() : zzgsd;
    }
}
