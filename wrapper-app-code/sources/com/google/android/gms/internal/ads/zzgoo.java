package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgoo {
    private final zzggo zza;
    private final int zzb;
    private final zzghb zzc;

    /* synthetic */ zzgoo(zzggo zzggo, int i, zzghb zzghb, zzgon zzgon) {
        this.zza = zzggo;
        this.zzb = i;
        this.zzc = zzghb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoo)) {
            return false;
        }
        zzgoo zzgoo = (zzgoo) obj;
        if (this.zza == zzgoo.zza && this.zzb == zzgoo.zzb && this.zzc.equals(zzgoo.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc});
    }

    public final int zza() {
        return this.zzb;
    }
}
