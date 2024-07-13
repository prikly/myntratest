package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgqw extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgqw zzb;

    static {
        zzgqw zzgqw = new zzgqw();
        zzb = zzgqw;
        zzgyd.zzaS(zzgqw.class, zzgqw);
    }

    private zzgqw() {
    }

    public static zzgqw zzc() {
        return zzb;
    }

    public static zzgqw zzd(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgqw) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzgqw();
        }
        if (i2 == 4) {
            return new zzgqv((zzgqu) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
