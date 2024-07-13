package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbhm extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbhm zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzbho zzo;

    static {
        zzbhm zzbhm = new zzbhm();
        zzb = zzbhm;
        zzgyd.zzaS(zzbhm.class, zzbhm);
    }

    private zzbhm() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgyh zzgyh = zzbgj.zza;
            return zzaP(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", zzgyh, "zzf", zzgyh, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        } else if (i2 == 3) {
            return new zzbhm();
        } else {
            if (i2 == 4) {
                return new zzbhl((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
