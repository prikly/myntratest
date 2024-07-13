package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhco extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhco zzb;
    private int zzd;
    private zzgwv zze = zzgwv.zzb;
    private zzgwv zzf = zzgwv.zzb;
    private byte zzg = 2;

    static {
        zzhco zzhco = new zzhco();
        zzb = zzhco;
        zzgyd.zzaS(zzhco.class, zzhco);
    }

    private zzhco() {
    }

    public static zzhcn zza() {
        return (zzhcn) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzhco zzhco, zzgwv zzgwv) {
        zzhco.zzd |= 1;
        zzhco.zze = zzgwv;
    }

    static /* synthetic */ void zze(zzhco zzhco, zzgwv zzgwv) {
        zzhco.zzd |= 2;
        zzhco.zzf = zzgwv;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b2 = 1;
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzhco();
        } else {
            if (i2 == 4) {
                return new zzhcn((zzhbs) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b2 = 0;
            }
            this.zzg = b2;
            return null;
        }
    }
}
