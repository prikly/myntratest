package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpm extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpm zzb;
    private zzgpp zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgpm zzgpm = new zzgpm();
        zzb = zzgpm;
        zzgyd.zzaS(zzgpm.class, zzgpm);
    }

    private zzgpm() {
    }

    public static zzgpl zzc() {
        return (zzgpl) zzb.zzaz();
    }

    public static zzgpm zze() {
        return zzb;
    }

    public static zzgpm zzf(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgpm) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzh(zzgpm zzgpm, zzgpp zzgpp) {
        zzgpp.getClass();
        zzgpm.zzd = zzgpp;
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
            return new zzgpm();
        } else {
            if (i2 == 4) {
                return new zzgpl((zzgpk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpp zzg() {
        zzgpp zzgpp = this.zzd;
        return zzgpp == null ? zzgpp.zze() : zzgpp;
    }
}
