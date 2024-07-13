package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzans extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzans zzb;
    private int zzd;
    private zzgym zze = zzaL();
    private zzgwv zzf = zzgwv.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzans zzans = new zzans();
        zzb = zzans;
        zzgyd.zzaS(zzans.class, zzans);
    }

    private zzans() {
    }

    public static zzanr zza() {
        return (zzanr) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzans zzans, zzgwv zzgwv) {
        zzgym zzgym = zzans.zze;
        if (!zzgym.zzc()) {
            zzans.zze = zzgyd.zzaM(zzgym);
        }
        zzans.zze.add(zzgwv);
    }

    static /* synthetic */ void zze(zzans zzans, zzgwv zzgwv) {
        zzans.zzd |= 1;
        zzans.zzf = zzgwv;
    }

    static /* synthetic */ void zzf(zzans zzans, int i) {
        zzans.zzh = i - 1;
        zzans.zzd |= 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzanm.zza, "zzh", zzank.zza});
        } else if (i2 == 3) {
            return new zzans();
        } else {
            if (i2 == 4) {
                return new zzanr((zzamk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
