package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgrn extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgrn zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgrh zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;
    /* access modifiers changed from: private */
    public zzgwv zzg = zzgwv.zzb;

    static {
        zzgrn zzgrn = new zzgrn();
        zzb = zzgrn;
        zzgyd.zzaS(zzgrn.class, zzgrn);
    }

    private zzgrn() {
    }

    public static zzgrm zzd() {
        return (zzgrm) zzb.zzaz();
    }

    public static zzgrn zzf() {
        return zzb;
    }

    public static zzgrn zzg(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgrn) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzk(zzgrn zzgrn, zzgrh zzgrh) {
        zzgrh.getClass();
        zzgrn.zze = zzgrh;
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
            return zzaP(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgrn();
        } else {
            if (i2 == 4) {
                return new zzgrm((zzgrl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgrh zzc() {
        zzgrh zzgrh = this.zze;
        return zzgrh == null ? zzgrh.zze() : zzgrh;
    }

    public final zzgwv zzh() {
        return this.zzf;
    }

    public final zzgwv zzi() {
        return this.zzg;
    }
}
