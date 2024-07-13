package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhcw extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhcw zzb;
    private int zzd;
    private zzhcv zze;
    private zzgym zzf = zzaL();
    private zzgwv zzg = zzgwv.zzb;
    private zzgwv zzh;
    private int zzi;
    private zzgwv zzj;
    private byte zzk = 2;

    static {
        zzhcw zzhcw = new zzhcw();
        zzb = zzhcw;
        zzgyd.zzaS(zzhcw.class, zzhcw);
    }

    private zzhcw() {
        zzgwv zzgwv = zzgwv.zzb;
        this.zzh = zzgwv;
        this.zzj = zzgwv;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b2 = 1;
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzhco.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzhcw();
        } else {
            if (i2 == 4) {
                return new zzhct((zzhbs) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b2 = 0;
            }
            this.zzk = b2;
            return null;
        }
    }
}
