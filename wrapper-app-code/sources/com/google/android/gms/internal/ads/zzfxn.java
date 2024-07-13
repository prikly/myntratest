package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzfxn extends zzfxm {
    private final char zza;

    zzfxn(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }

    public final boolean zzb(char c2) {
        return c2 == this.zza;
    }
}
