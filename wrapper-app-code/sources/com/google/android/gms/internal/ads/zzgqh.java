package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgqh extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgqh zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzgwv zze = zzgwv.zzb;

    static {
        zzgqh zzgqh = new zzgqh();
        zzb = zzgqh;
        zzgyd.zzaS(zzgqh.class, zzgqh);
    }

    private zzgqh() {
    }

    public static zzgqg zzc() {
        return (zzgqg) zzb.zzaz();
    }

    public static zzgqh zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgqh) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgqh();
        } else {
            if (i2 == 4) {
                return new zzgqg((zzgqf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgwv zzf() {
        return this.zze;
    }
}
