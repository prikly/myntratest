package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfj extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzfj zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzfj zzfj = new zzfj();
        zza = zzfj;
        zzkf.zzbL(zzfj.class, zzfj);
    }

    private zzfj() {
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfj();
        } else {
            if (i2 == 4) {
                return new zzfi((zzez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
