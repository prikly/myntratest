package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfv extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfv zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzfv zzfv = new zzfv();
        zza = zzfv;
        zzkf.zzbL(zzfv.class, zzfv);
    }

    private zzfv() {
    }

    public static zzfu zza() {
        return (zzfu) zza.zzbx();
    }

    static /* synthetic */ void zzc(zzfv zzfv, String str) {
        str.getClass();
        zzfv.zzd |= 1;
        zzfv.zze = str;
    }

    static /* synthetic */ void zzd(zzfv zzfv, long j) {
        zzfv.zzd |= 2;
        zzfv.zzf = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfv();
        } else {
            if (i2 == 4) {
                return new zzfu((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
