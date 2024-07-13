package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzghg implements Comparable {
    private final byte[] zza;

    /* synthetic */ zzghg(byte[] bArr, zzghf zzghf) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzghg zzghg = (zzghg) obj;
        int length = this.zza.length;
        int length2 = zzghg.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i];
            byte b3 = zzghg.zza[i];
            if (b2 != b3) {
                return b2 - b3;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghg)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzghg) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgvo.zza(this.zza);
    }
}
