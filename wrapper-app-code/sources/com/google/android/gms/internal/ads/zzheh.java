package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzheh {
    public static zzheh zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhec(cls.getSimpleName());
        }
        return new zzhee(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
