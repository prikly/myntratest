package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgrk extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgrk zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgrn zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgrk zzgrk = new zzgrk();
        zzb = zzgrk;
        zzgyd.zzaS(zzgrk.class, zzgrk);
    }

    private zzgrk() {
    }

    public static zzgrj zzc() {
        return (zzgrj) zzb.zzaz();
    }

    public static zzgrk zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgrk) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzi(zzgrk zzgrk, zzgrn zzgrn) {
        zzgrn.getClass();
        zzgrk.zze = zzgrn;
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
            return new zzgrk();
        } else {
            if (i2 == 4) {
                return new zzgrj((zzgri) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgrn zzf() {
        zzgrn zzgrn = this.zze;
        return zzgrn == null ? zzgrn.zzf() : zzgrn;
    }

    public final zzgwv zzg() {
        return this.zzf;
    }
}
