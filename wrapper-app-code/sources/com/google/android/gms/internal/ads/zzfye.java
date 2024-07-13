package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfye {
    public static int zza(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = zzfyt.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = zzfyt.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzj(i, i2, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfyt.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = zzj(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = zzj(i2, i3, "end index");
            } else {
                str = zzfyt.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void zzh(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i, int i2, String str) {
        if (i < 0) {
            return zzfyt.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return zzfyt.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
