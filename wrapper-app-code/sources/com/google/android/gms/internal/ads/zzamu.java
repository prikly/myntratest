package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzamu extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzamu zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzamu zzamu = new zzamu();
        zzb = zzamu;
        zzgyd.zzaS(zzamu.class, zzamu);
    }

    private zzamu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgyh zzgyh = zzanl.zza;
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzgyh, "zzg", zzgyh});
        } else if (i2 == 3) {
            return new zzamu();
        } else {
            if (i2 == 4) {
                return new zzamt((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
