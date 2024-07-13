package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgsd extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgsd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgsd zzgsd = new zzgsd();
        zzb = zzgsd;
        zzgyd.zzaS(zzgsd.class, zzgsd);
    }

    private zzgsd() {
    }

    public static zzgsc zzc() {
        return (zzgsc) zzb.zzaz();
    }

    public static zzgsd zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgsd();
        } else {
            if (i2 == 4) {
                return new zzgsc((zzgsb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzg() {
        int zzb2 = zzgru.zzb(this.zzd);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
