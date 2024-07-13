package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzamb extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzamb zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private long zzj;
    private long zzk;
    private String zzl = "";
    private long zzm;
    private String zzn = "";
    private String zzo = "";
    private zzgym zzp = zzaL();
    private int zzq;

    static {
        zzamb zzamb = new zzamb();
        zzb = zzamb;
        zzgyd.zzaS(zzamb.class, zzamb);
    }

    private zzamb() {
    }

    public static zzalx zza() {
        return (zzalx) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzamb zzamb, long j) {
        zzamb.zzd |= 2;
        zzamb.zzf = j;
    }

    static /* synthetic */ void zze(zzamb zzamb, String str) {
        str.getClass();
        zzamb.zzd |= 4;
        zzamb.zzg = str;
    }

    static /* synthetic */ void zzf(zzamb zzamb, String str) {
        str.getClass();
        zzamb.zzd |= 8;
        zzamb.zzh = str;
    }

    static /* synthetic */ void zzg(zzamb zzamb, String str) {
        zzamb.zzd |= 16;
        zzamb.zzi = str;
    }

    static /* synthetic */ void zzh(zzamb zzamb, String str) {
        zzamb.zzd |= 1024;
        zzamb.zzo = str;
    }

    static /* synthetic */ void zzi(zzamb zzamb, String str) {
        str.getClass();
        zzamb.zzd |= 1;
        zzamb.zze = str;
    }

    static /* synthetic */ void zzj(zzamb zzamb, int i) {
        zzamb.zzq = i - 1;
        zzamb.zzd |= 2048;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzalz.class, "zzq", zzama.zza});
        } else if (i2 == 3) {
            return new zzamb();
        } else {
            if (i2 == 4) {
                return new zzalx((zzalw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
