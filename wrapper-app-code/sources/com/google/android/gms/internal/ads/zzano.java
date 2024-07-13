package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzano extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzano zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgwv zzg = zzgwv.zzb;

    static {
        zzano zzano = new zzano();
        zzb = zzano;
        zzgyd.zzaS(zzano.class, zzano);
    }

    private zzano() {
    }

    public static zzano zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzano();
        } else {
            if (i2 == 4) {
                return new zzann((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
