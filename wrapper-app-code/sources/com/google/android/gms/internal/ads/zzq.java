package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzq {
    public static final zzq zza = new zzq(1, 2, 3, (byte[]) null);
    public static final zzn zzb = zzp.zza;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final byte[] zzf;
    private int zzg;

    public zzq(int i, int i2, int i3, byte[] bArr) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = bArr;
    }

    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzq zzq = (zzq) obj;
            return this.zzc == zzq.zzc && this.zzd == zzq.zzd && this.zze == zzq.zze && Arrays.equals(this.zzf, zzq.zzf);
        }
    }

    public final int hashCode() {
        int i = this.zzg;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.zzc + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzd) * 31) + this.zze) * 31) + Arrays.hashCode(this.zzf);
        this.zzg = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.zzc;
        int i2 = this.zzd;
        int i3 = this.zze;
        boolean z = this.zzf != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}
