package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaza {
    public static final zzaza zza = new zzaza(new zzayz[0]);
    public final int zzb;
    private final zzayz[] zzc;
    private int zzd;

    public zzaza(zzayz... zzayzArr) {
        this.zzc = zzayzArr;
        this.zzb = zzayzArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaza zzaza = (zzaza) obj;
            return this.zzb == zzaza.zzb && Arrays.equals(this.zzc, zzaza.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzayz zzayz) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzayz) {
                return i;
            }
        }
        return -1;
    }

    public final zzayz zzb(int i) {
        return this.zzc[i];
    }
}
