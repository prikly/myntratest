package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzane extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzane zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzane zzane = new zzane();
        zzb = zzane;
        zzgyd.zzaS(zzane.class, zzane);
    }

    private zzane() {
    }

    public static zzand zza() {
        return (zzand) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzane zzane, long j) {
        zzane.zzd |= 1;
        zzane.zze = j;
    }

    static /* synthetic */ void zze(zzane zzane, long j) {
        zzane.zzd |= 4;
        zzane.zzg = j;
    }

    static /* synthetic */ void zzf(zzane zzane, long j) {
        zzane.zzd |= 8;
        zzane.zzh = j;
    }

    static /* synthetic */ void zzg(zzane zzane, long j) {
        zzane.zzd |= 16;
        zzane.zzi = j;
    }

    static /* synthetic */ void zzh(zzane zzane, long j) {
        zzane.zzd |= 32;
        zzane.zzj = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new zzane();
        } else {
            if (i2 == 4) {
                return new zzand((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
