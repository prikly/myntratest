package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhcr extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhcr zzb;
    private int zzd;
    private zzgwv zze = zzgwv.zzb;
    private zzgwv zzf;
    private zzgwv zzg;

    static {
        zzhcr zzhcr = new zzhcr();
        zzb = zzhcr;
        zzgyd.zzaS(zzhcr.class, zzhcr);
    }

    private zzhcr() {
        zzgwv zzgwv = zzgwv.zzb;
        this.zzf = zzgwv;
        this.zzg = zzgwv;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzhcr();
        } else {
            if (i2 == 4) {
                return new zzhcq((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
