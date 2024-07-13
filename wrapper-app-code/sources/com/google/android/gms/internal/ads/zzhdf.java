package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhdf extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhdf zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzhcs zzg;
    private zzhcw zzh;
    private int zzi;
    private zzgyi zzj = zzaI();
    private String zzk = "";
    private int zzl;
    private zzgym zzm = zzgyd.zzaL();
    private byte zzn = 2;

    static {
        zzhdf zzhdf = new zzhdf();
        zzb = zzhdf;
        zzgyd.zzaS(zzhdf.class, zzhdf);
    }

    private zzhdf() {
    }

    public static zzhde zzc() {
        return (zzhde) zzb.zzaz();
    }

    static /* synthetic */ void zzf(zzhdf zzhdf, int i) {
        zzhdf.zzd |= 1;
        zzhdf.zze = i;
    }

    static /* synthetic */ void zzg(zzhdf zzhdf, String str) {
        str.getClass();
        zzhdf.zzd |= 2;
        zzhdf.zzf = str;
    }

    static /* synthetic */ void zzh(zzhdf zzhdf, zzhcs zzhcs) {
        zzhcs.getClass();
        zzhdf.zzg = zzhcs;
        zzhdf.zzd |= 4;
    }

    static /* synthetic */ void zzi(zzhdf zzhdf, String str) {
        str.getClass();
        zzgym zzgym = zzhdf.zzm;
        if (!zzgym.zzc()) {
            zzhdf.zzm = zzgyd.zzaM(zzgym);
        }
        zzhdf.zzm.add(str);
    }

    static /* synthetic */ void zzj(zzhdf zzhdf, int i) {
        zzhdf.zzl = i - 1;
        zzhdf.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final String zze() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b2 = 1;
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhdc.zza, "zzm"});
        } else if (i2 == 3) {
            return new zzhdf();
        } else {
            if (i2 == 4) {
                return new zzhde((zzhbs) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b2 = 0;
            }
            this.zzn = b2;
            return null;
        }
    }
}
