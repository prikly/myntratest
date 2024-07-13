package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzamj extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzamj zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzamj zzamj = new zzamj();
        zzb = zzamj;
        zzgyd.zzaS(zzamj.class, zzamj);
    }

    private zzamj() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzamj();
        } else {
            if (i2 == 4) {
                return new zzami((zzamc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
