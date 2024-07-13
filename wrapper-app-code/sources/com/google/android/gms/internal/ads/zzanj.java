package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzanj extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzanj zzb;
    private int zzd;
    private zzgwv zze = zzgwv.zzb;
    private zzgwv zzf;
    private zzgwv zzg;
    private zzgwv zzh;

    static {
        zzanj zzanj = new zzanj();
        zzb = zzanj;
        zzgyd.zzaS(zzanj.class, zzanj);
    }

    private zzanj() {
        zzgwv zzgwv = zzgwv.zzb;
        this.zzf = zzgwv;
        this.zzg = zzgwv;
        this.zzh = zzgwv;
    }

    public static zzani zza() {
        return (zzani) zzb.zzaz();
    }

    public static zzanj zzd(byte[] bArr, zzgxp zzgxp) throws zzgyp {
        return (zzanj) zzgyd.zzaH(zzb, bArr, zzgxp);
    }

    static /* synthetic */ void zzi(zzanj zzanj, zzgwv zzgwv) {
        zzanj.zzd |= 1;
        zzanj.zze = zzgwv;
    }

    static /* synthetic */ void zzj(zzanj zzanj, zzgwv zzgwv) {
        zzanj.zzd |= 2;
        zzanj.zzf = zzgwv;
    }

    static /* synthetic */ void zzk(zzanj zzanj, zzgwv zzgwv) {
        zzanj.zzd |= 4;
        zzanj.zzg = zzgwv;
    }

    static /* synthetic */ void zzl(zzanj zzanj, zzgwv zzgwv) {
        zzanj.zzd |= 8;
        zzanj.zzh = zzgwv;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzanj();
        } else {
            if (i2 == 4) {
                return new zzani((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgwv zze() {
        return this.zze;
    }

    public final zzgwv zzf() {
        return this.zzf;
    }

    public final zzgwv zzg() {
        return this.zzh;
    }

    public final zzgwv zzh() {
        return this.zzg;
    }
}
