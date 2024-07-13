package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhcs extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhcs zzb;
    private int zzd;
    private zzhcr zze;
    private zzgym zzf = zzaL();
    private zzgwv zzg = zzgwv.zzb;
    private zzgwv zzh = zzgwv.zzb;
    private int zzi;
    private byte zzj = 2;

    static {
        zzhcs zzhcs = new zzhcs();
        zzb = zzhcs;
        zzgyd.zzaS(zzhcs.class, zzhcs);
    }

    private zzhcs() {
    }

    public static zzhcp zza() {
        return (zzhcp) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzhcs zzhcs, zzhco zzhco) {
        zzhco.getClass();
        zzgym zzgym = zzhcs.zzf;
        if (!zzgym.zzc()) {
            zzhcs.zzf = zzgyd.zzaM(zzgym);
        }
        zzhcs.zzf.add(zzhco);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b2 = 1;
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzhco.class, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzhcs();
        } else {
            if (i2 == 4) {
                return new zzhcp((zzhbs) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b2 = 0;
            }
            this.zzj = b2;
            return null;
        }
    }
}
