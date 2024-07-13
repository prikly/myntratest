package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbge extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbge zzb;
    private int zzd;
    private String zze = "";
    private zzbhu zzf;
    private int zzg;
    private zzbhw zzh;
    private int zzi;
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzbge zzbge = new zzbge();
        zzb = zzbge;
        zzgyd.zzaS(zzbge.class, zzbge);
    }

    private zzbge() {
    }

    public static zzbge zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbge zzbge, String str) {
        zzbge.zzd |= 1;
        zzbge.zze = str;
    }

    static /* synthetic */ void zze(zzbge zzbge, zzbhw zzbhw) {
        zzbhw.getClass();
        zzbge.zzh = zzbhw;
        zzbge.zzd |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgyh zzgyh = zzbgj.zza;
            return zzaP(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgyh, "zzk", zzgyh, "zzl", zzgyh});
        } else if (i2 == 3) {
            return new zzbge();
        } else {
            if (i2 == 4) {
                return new zzbgd((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
