package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhdp extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhdp zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgyi zzg = zzaI();
    private int zzh;
    private zzgym zzi = zzaL();
    private zzgwv zzj = zzgwv.zzb;

    static {
        zzhdp zzhdp = new zzhdp();
        zzb = zzhdp;
        zzgyd.zzaS(zzhdp.class, zzhdp);
    }

    private zzhdp() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzhdn.class, "zzj"});
        } else if (i2 == 3) {
            return new zzhdp();
        } else {
            if (i2 == 4) {
                return new zzhdo((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
