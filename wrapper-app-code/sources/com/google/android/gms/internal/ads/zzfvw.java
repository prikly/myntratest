package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfvw extends zzfwo {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzfvw(String str, String str2, zzfvv zzfvv) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwo) {
            zzfwo zzfwo = (zzfwo) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfwo.zzb()) : zzfwo.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfwo.zza()) : zzfwo.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final int hashCode() {
        int i;
        String str = this.zza;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }
}
