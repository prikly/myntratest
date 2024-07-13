package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbha extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbha zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbha zzbha = new zzbha();
        zzb = zzbha;
        zzgyd.zzaS(zzbha.class, zzbha);
    }

    private zzbha() {
    }

    public static zzbgt zza() {
        return (zzbgt) zzb.zzaz();
    }

    public static zzbha zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzbha zzbha, int i) {
        zzbha.zze = i - 1;
        zzbha.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzbha zzbha, int i) {
        zzbha.zzf = i - 1;
        zzbha.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", zzbgy.zza, "zzf", zzbgv.zza});
        } else if (i2 == 3) {
            return new zzbha();
        } else {
            if (i2 == 4) {
                return new zzbgt((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzbgw.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbgz.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
