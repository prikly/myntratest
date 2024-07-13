package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpy extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpy zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzgpy zzgpy = new zzgpy();
        zzb = zzgpy;
        zzgyd.zzaS(zzgpy.class, zzgpy);
    }

    private zzgpy() {
    }

    public static zzgpx zzc() {
        return (zzgpx) zzb.zzaz();
    }

    public static zzgpy zze() {
        return zzb;
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
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzgpy();
        } else {
            if (i2 == 4) {
                return new zzgpx((zzgpw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
