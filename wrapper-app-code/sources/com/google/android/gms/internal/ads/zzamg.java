package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzamg extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzamg zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzamg zzamg = new zzamg();
        zzb = zzamg;
        zzgyd.zzaS(zzamg.class, zzamg);
    }

    private zzamg() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzd", "zze", zzamh.zza});
        } else if (i2 == 3) {
            return new zzamg();
        } else {
            if (i2 == 4) {
                return new zzamf((zzamc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
