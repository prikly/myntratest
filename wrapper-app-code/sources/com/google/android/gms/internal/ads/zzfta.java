package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfta extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzfta zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfsw zzh;

    static {
        zzfta zzfta = new zzfta();
        zzb = zzfta;
        zzgyd.zzaS(zzfta.class, zzfta);
    }

    private zzfta() {
    }

    public static zzfsy zza() {
        return (zzfsy) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzfta zzfta, String str) {
        str.getClass();
        zzfta.zzd |= 2;
        zzfta.zzf = str;
    }

    static /* synthetic */ void zze(zzfta zzfta, zzfsw zzfsw) {
        zzfsw.getClass();
        zzfta.zzh = zzfsw;
        zzfta.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzfta zzfta, int i) {
        zzfta.zze = 1;
        zzfta.zzd = 1 | zzfta.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfsz.zza, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzfta();
        } else {
            if (i2 == 4) {
                return new zzfsy((zzfsx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
