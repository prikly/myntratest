package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgvo {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            sb.append("0123456789abcdef".charAt(b3 >> 4));
            sb.append("0123456789abcdef".charAt(b3 & Ascii.SI));
        }
        return sb.toString();
    }
}
