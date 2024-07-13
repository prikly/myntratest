package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgou extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgou zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzgwv zze = zzgwv.zzb;
    private zzgpa zzf;

    static {
        zzgou zzgou = new zzgou();
        zzb = zzgou;
        zzgyd.zzaS(zzgou.class, zzgou);
    }

    private zzgou() {
    }

    public static zzgot zzc() {
        return (zzgot) zzb.zzaz();
    }

    public static zzgou zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgou) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzj(zzgou zzgou, zzgpa zzgpa) {
        zzgpa.getClass();
        zzgou.zzf = zzgpa;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgou();
        } else {
            if (i2 == 4) {
                return new zzgot((zzgos) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpa zzf() {
        zzgpa zzgpa = this.zzf;
        return zzgpa == null ? zzgpa.zze() : zzgpa;
    }

    public final zzgwv zzg() {
        return this.zze;
    }
}
