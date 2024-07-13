package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzaze {
    protected final zzayz zza;
    protected final int[] zzb;
    private final zzatd[] zzc;
    private int zzd;

    public zzaze(zzayz zzayz, int... iArr) {
        if (zzayz != null) {
            this.zza = zzayz;
            this.zzc = new zzatd[1];
            for (int i = 0; i <= 0; i++) {
                this.zzc[i] = zzayz.zzb(iArr[i]);
            }
            Arrays.sort(this.zzc, new zzazd((zzazc) null));
            this.zzb = new int[1];
            for (int i2 = 0; i2 <= 0; i2++) {
                this.zzb[i2] = zzayz.zza(this.zzc[i2]);
            }
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaze zzaze = (zzaze) obj;
            return this.zza == zzaze.zza && Arrays.equals(this.zzb, zzaze.zzb);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzb);
        this.zzd = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzatd zzc(int i) {
        return this.zzc[i];
    }

    public final zzayz zzd() {
        return this.zza;
    }
}
