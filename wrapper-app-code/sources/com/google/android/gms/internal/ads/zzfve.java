package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfve {
    private static zzfve zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfve(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static zzfve zzb(Context context) {
        if (zza == null) {
            zza = new zzfve(context);
        }
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final long zza(String str, long j) {
        return this.zzc.getLong(str, -1);
    }

    /* access modifiers changed from: package-private */
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(String str, Object obj) throws IOException {
        boolean z;
        if (obj instanceof String) {
            z = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            z = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            z = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.zzb;
            Log.e("PaidLifecycleSPHandler", str2);
            throw new IllegalArgumentException(str2);
        }
        if (!z) {
            String str3 = "Failed to store " + str + " for app " + this.zzb;
            Log.e("PaidLifecycleSPHandler", str3);
            throw new IOException(str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str) throws IOException {
        if (!this.zzc.edit().remove(str).commit()) {
            String str2 = "Failed to remove " + str + " for app " + this.zzb;
            Log.e("PaidLifecycleSPHandler", str2);
            throw new IOException(str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
