package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgul extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgul zzb;
    private int zzd;

    static {
        zzgul zzgul = new zzgul();
        zzb = zzgul;
        zzgyd.zzaS(zzgul.class, zzgul);
    }

    private zzgul() {
    }

    public static zzgul zzc() {
        return zzb;
    }

    public static zzgul zzd(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgul) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzgul();
        } else {
            if (i2 == 4) {
                return new zzguk((zzguj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
