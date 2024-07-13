package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgqe extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgqe zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgqe zzgqe = new zzgqe();
        zzb = zzgqe;
        zzgyd.zzaS(zzgqe.class, zzgqe);
    }

    private zzgqe() {
    }

    public static zzgqd zzc() {
        return (zzgqd) zzb.zzaz();
    }

    public static zzgqe zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgqe) zzgyd.zzaF(zzb, zzgwv, zzgxp);
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgqe();
        } else {
            if (i2 == 4) {
                return new zzgqd((zzgqc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
