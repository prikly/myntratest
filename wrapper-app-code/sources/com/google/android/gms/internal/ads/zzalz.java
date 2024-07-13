package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzalz extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzalz zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzalz zzalz = new zzalz();
        zzb = zzalz;
        zzgyd.zzaS(zzalz.class, zzalz);
    }

    private zzalz() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzalz();
        } else {
            if (i2 == 4) {
                return new zzaly((zzalw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
