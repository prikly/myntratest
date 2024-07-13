package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhcz extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhcz zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgwv zzg = zzgwv.zzb;
    private zzgwv zzh = zzgwv.zzb;

    static {
        zzhcz zzhcz = new zzhcz();
        zzb = zzhcz;
        zzgyd.zzaS(zzhcz.class, zzhcz);
    }

    private zzhcz() {
    }

    public static zzhcx zza() {
        return (zzhcx) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzhcz zzhcz, String str) {
        zzhcz.zzd |= 2;
        zzhcz.zzf = "image/png";
    }

    static /* synthetic */ void zze(zzhcz zzhcz, zzgwv zzgwv) {
        zzgwv.getClass();
        zzhcz.zzd |= 4;
        zzhcz.zzg = zzgwv;
    }

    static /* synthetic */ void zzf(zzhcz zzhcz, int i) {
        zzhcz.zze = 1;
        zzhcz.zzd = 1 | zzhcz.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzhcy.zza, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzhcz();
        } else {
            if (i2 == 4) {
                return new zzhcx((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
