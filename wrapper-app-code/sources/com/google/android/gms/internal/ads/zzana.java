package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzana extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzana zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzana zzana = new zzana();
        zzb = zzana;
        zzgyd.zzaS(zzana.class, zzana);
    }

    private zzana() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzanl.zza});
        } else if (i2 == 3) {
            return new zzana();
        } else {
            if (i2 == 4) {
                return new zzamz((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
