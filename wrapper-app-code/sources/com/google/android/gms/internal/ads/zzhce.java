package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhce extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhce zzb;
    private int zzd;
    private String zze = "";

    static {
        zzhce zzhce = new zzhce();
        zzb = zzhce;
        zzgyd.zzaS(zzhce.class, zzhce);
    }

    private zzhce() {
    }

    public static zzhcd zza() {
        return (zzhcd) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzhce zzhce, String str) {
        zzhce.zzd |= 1;
        zzhce.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzhce();
        } else {
            if (i2 == 4) {
                return new zzhcd((zzhbs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
