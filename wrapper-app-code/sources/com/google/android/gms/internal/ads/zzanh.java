package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzanh extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzanh zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgyi zzh = zzaI();
    private long zzi;

    static {
        zzanh zzanh = new zzanh();
        zzb = zzanh;
        zzgyd.zzaS(zzanh.class, zzanh);
    }

    private zzanh() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzanh();
        } else {
            if (i2 == 4) {
                return new zzang((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
