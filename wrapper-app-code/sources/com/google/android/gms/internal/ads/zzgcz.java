package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgcz extends zzgda {
    public static int zza(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(zzfyt.zzb("Out of range: %s", Long.valueOf(j)));
    }

    public static int zzb(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static int zzc(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
