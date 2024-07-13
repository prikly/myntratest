package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgtu extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgtu zzb;
    private String zzd = "";

    static {
        zzgtu zzgtu = new zzgtu();
        zzb = zzgtu;
        zzgyd.zzaS(zzgtu.class, zzgtu);
    }

    private zzgtu() {
    }

    public static zzgtu zzc() {
        return zzb;
    }

    public static zzgtu zzd(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgtu) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzgtu();
        } else {
            if (i2 == 4) {
                return new zzgtt((zzgts) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zze() {
        return this.zzd;
    }
}
