package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzamy extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzamy zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzamy zzamy = new zzamy();
        zzb = zzamy;
        zzgyd.zzaS(zzamy.class, zzamy);
    }

    private zzamy() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzamq.zza, "zzf"});
        } else if (i2 == 3) {
            return new zzamy();
        } else {
            if (i2 == 4) {
                return new zzamx((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
