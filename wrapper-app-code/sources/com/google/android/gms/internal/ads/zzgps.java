package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgps extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgps zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgpy zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgps zzgps = new zzgps();
        zzb = zzgps;
        zzgyd.zzaS(zzgps.class, zzgps);
    }

    private zzgps() {
    }

    public static zzgpr zzc() {
        return (zzgpr) zzb.zzaz();
    }

    public static zzgps zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgps) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzi(zzgps zzgps, zzgpy zzgpy) {
        zzgpy.getClass();
        zzgps.zze = zzgpy;
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
            return new zzgps();
        } else {
            if (i2 == 4) {
                return new zzgpr((zzgpq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpy zzf() {
        zzgpy zzgpy = this.zze;
        return zzgpy == null ? zzgpy.zze() : zzgpy;
    }

    public final zzgwv zzg() {
        return this.zzf;
    }
}
