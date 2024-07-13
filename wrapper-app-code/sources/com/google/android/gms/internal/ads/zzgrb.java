package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgrb extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgrb zzb;
    private zzgtb zzd;

    static {
        zzgrb zzgrb = new zzgrb();
        zzb = zzgrb;
        zzgyd.zzaS(zzgrb.class, zzgrb);
    }

    private zzgrb() {
    }

    public static zzgra zza() {
        return (zzgra) zzb.zzaz();
    }

    public static zzgrb zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgrb zzgrb, zzgtb zzgtb) {
        zzgtb.getClass();
        zzgrb.zzd = zzgtb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzgrb();
        } else {
            if (i2 == 4) {
                return new zzgra((zzgqz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgtb zze() {
        zzgtb zzgtb = this.zzd;
        return zzgtb == null ? zzgtb.zzd() : zzgtb;
    }
}
