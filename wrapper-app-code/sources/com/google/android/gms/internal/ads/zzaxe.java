package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaxe {
    public final String zza;
    public final boolean zzb;

    public zzaxe(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzaxe.class) {
            zzaxe zzaxe = (zzaxe) obj;
            return TextUtils.equals(this.zza, zzaxe.zza) && this.zzb == zzaxe.zzb;
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.zzb ? 1237 : 1231);
    }
}
