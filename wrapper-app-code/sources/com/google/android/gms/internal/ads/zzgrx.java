package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgrx extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgrx zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgsd zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgrx zzgrx = new zzgrx();
        zzb = zzgrx;
        zzgyd.zzaS(zzgrx.class, zzgrx);
    }

    private zzgrx() {
    }

    public static zzgrw zzc() {
        return (zzgrw) zzb.zzaz();
    }

    public static zzgrx zze() {
        return zzb;
    }

    public static zzgrx zzf(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgrx) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzj(zzgrx zzgrx, zzgsd zzgsd) {
        zzgsd.getClass();
        zzgrx.zze = zzgsd;
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
            return new zzgrx();
        } else {
            if (i2 == 4) {
                return new zzgrw((zzgrv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsd zzg() {
        zzgsd zzgsd = this.zze;
        return zzgsd == null ? zzgsd.zze() : zzgsd;
    }

    public final zzgwv zzh() {
        return this.zzf;
    }
}
