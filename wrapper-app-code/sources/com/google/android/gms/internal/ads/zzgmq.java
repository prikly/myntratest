package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmq {
    public static final zzgwa zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzgmp("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return zzgwa.zzb(bArr);
    }
}
