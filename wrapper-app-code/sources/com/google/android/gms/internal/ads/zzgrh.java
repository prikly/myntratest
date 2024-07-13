package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgrh extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgrh zzb;
    private zzgrq zzd;
    private zzgrb zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgrh zzgrh = new zzgrh();
        zzb = zzgrh;
        zzgyd.zzaS(zzgrh.class, zzgrh);
    }

    private zzgrh() {
    }

    public static zzgrg zzc() {
        return (zzgrg) zzb.zzaz();
    }

    public static zzgrh zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgrh zzgrh, zzgrq zzgrq) {
        zzgrq.getClass();
        zzgrh.zzd = zzgrq;
    }

    static /* synthetic */ void zzh(zzgrh zzgrh, zzgrb zzgrb) {
        zzgrb.getClass();
        zzgrh.zze = zzgrb;
    }

    public final zzgrb zza() {
        zzgrb zzgrb = this.zze;
        return zzgrb == null ? zzgrb.zzd() : zzgrb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgrh();
        } else {
            if (i2 == 4) {
                return new zzgrg((zzgrf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgrq zzf() {
        zzgrq zzgrq = this.zzd;
        return zzgrq == null ? zzgrq.zzd() : zzgrq;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
