package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgso extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgso zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgsr zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgso zzgso = new zzgso();
        zzb = zzgso;
        zzgyd.zzaS(zzgso.class, zzgso);
    }

    private zzgso() {
    }

    public static zzgsn zzc() {
        return (zzgsn) zzb.zzaz();
    }

    public static zzgso zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgso) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzi(zzgso zzgso, zzgsr zzgsr) {
        zzgsr.getClass();
        zzgso.zze = zzgsr;
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
            return new zzgso();
        } else {
            if (i2 == 4) {
                return new zzgsn((zzgsm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsr zzf() {
        zzgsr zzgsr = this.zze;
        return zzgsr == null ? zzgsr.zzf() : zzgsr;
    }

    public final zzgwv zzg() {
        return this.zzf;
    }

    public final boolean zzk() {
        return this.zze != null;
    }
}
