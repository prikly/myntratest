package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgti extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgti zzb;
    private zzgsw zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgti zzgti = new zzgti();
        zzb = zzgti;
        zzgyd.zzaS(zzgti.class, zzgti);
    }

    private zzgti() {
    }

    public static zzgth zzd() {
        return (zzgth) zzb.zzaz();
    }

    static /* synthetic */ void zzg(zzgti zzgti, zzgsw zzgsw) {
        zzgsw.getClass();
        zzgti.zzd = zzgsw;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgti();
        } else {
            if (i2 == 4) {
                return new zzgth((zzgtf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsw zzc() {
        zzgsw zzgsw = this.zzd;
        return zzgsw == null ? zzgsw.zze() : zzgsw;
    }

    public final zzguc zzf() {
        zzguc zzb2 = zzguc.zzb(this.zzg);
        return zzb2 == null ? zzguc.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return this.zzd != null;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
