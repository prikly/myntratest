package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhdh extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhdh zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zzi = "";
    private String zzj = "";

    static {
        zzhdh zzhdh = new zzhdh();
        zzb = zzhdh;
        zzgyd.zzaS(zzhdh.class, zzhdh);
    }

    private zzhdh() {
    }

    public static zzhdg zza() {
        return (zzhdg) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzhdh zzhdh, String str) {
        zzhdh.zzd |= 1;
        zzhdh.zze = str;
    }

    static /* synthetic */ void zze(zzhdh zzhdh, long j) {
        zzhdh.zzd |= 2;
        zzhdh.zzf = j;
    }

    static /* synthetic */ void zzf(zzhdh zzhdh, boolean z) {
        zzhdh.zzd |= 4;
        zzhdh.zzg = z;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzhdi.zza, "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzhdh();
        } else {
            if (i2 == 4) {
                return new zzhdg((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
