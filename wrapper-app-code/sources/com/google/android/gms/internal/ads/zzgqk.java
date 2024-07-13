package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgqk extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgqk zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgqk zzgqk = new zzgqk();
        zzb = zzgqk;
        zzgyd.zzaS(zzgqk.class, zzgqk);
    }

    private zzgqk() {
    }

    public static zzgqj zzc() {
        return (zzgqj) zzb.zzaz();
    }

    public static zzgqk zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgqk) zzgyd.zzaF(zzb, zzgwv, zzgxp);
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        } else if (i2 == 3) {
            return new zzgqk();
        } else {
            if (i2 == 4) {
                return new zzgqj((zzgqi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
