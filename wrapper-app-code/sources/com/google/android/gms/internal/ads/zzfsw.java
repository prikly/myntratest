package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfsw extends zzgyd implements zzgzo {
    private static final zzgyj zzb = new zzfst();
    /* access modifiers changed from: private */
    public static final zzfsw zzd;
    private int zze;
    private zzgyi zzf = zzaI();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfsw zzfsw = new zzfsw();
        zzd = zzfsw;
        zzgyd.zzaS(zzfsw.class, zzfsw);
    }

    private zzfsw() {
    }

    public static zzfsv zza() {
        return (zzfsv) zzd.zzaz();
    }

    static /* synthetic */ void zzd(zzfsw zzfsw, String str) {
        str.getClass();
        zzfsw.zze |= 1;
        zzfsw.zzg = str;
    }

    static /* synthetic */ void zze(zzfsw zzfsw, int i) {
        zzgyi zzgyi = zzfsw.zzf;
        if (!zzgyi.zzc()) {
            zzfsw.zzf = zzgyd.zzaJ(zzgyi);
        }
        zzfsw.zzf.zzh(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfsu.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzfsw();
        } else {
            if (i2 == 4) {
                return new zzfsv((zzfst) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }
}
