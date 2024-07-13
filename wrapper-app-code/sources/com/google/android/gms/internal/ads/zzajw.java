package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzajw {
    private final String zza;
    private final String zzb;

    public zzajw(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajw zzajw = (zzajw) obj;
            return TextUtils.equals(this.zza, zzajw.zza) && TextUtils.equals(this.zzb, zzajw.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
