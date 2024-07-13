package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbga extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbga zzb;
    private int zzd;
    private String zze = "";
    private zzgym zzf = zzaL();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzbga zzbga = new zzbga();
        zzb = zzbga;
        zzgyd.zzaS(zzbga.class, zzbga);
    }

    private zzbga() {
    }

    public static zzbga zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbga zzbga, String str) {
        str.getClass();
        zzbga.zzd |= 1;
        zzbga.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgyh zzgyh = zzbgj.zza;
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", zzbfw.class, "zzg", zzgyh, "zzh", zzgyh, "zzi", zzgyh});
        } else if (i2 == 3) {
            return new zzbga();
        } else {
            if (i2 == 4) {
                return new zzbfz((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
