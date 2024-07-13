package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public class zzbkl {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbkl(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbkl zza(String str, double d2) {
        return new zzbkl(str, Double.valueOf(d2), 3);
    }

    public static zzbkl zzb(String str, long j) {
        return new zzbkl(str, Long.valueOf(j), 2);
    }

    public static zzbkl zzc(String str, String str2) {
        return new zzbkl(str, str2, 4);
    }

    public static zzbkl zzd(String str, boolean z) {
        return new zzbkl(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzblo zza2 = zzblq.zza();
        if (zza2 == null) {
            if (zzblq.zzb() != null) {
                zzblq.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zza2.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i == 1) {
            return zza2.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        if (i != 2) {
            return zza2.zzd(this.zza, (String) this.zzb);
        }
        return zza2.zzb(this.zza, ((Double) this.zzb).doubleValue());
    }
}
