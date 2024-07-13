package com.bytedance.sdk.openadsdk.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.SecureRandom;
import java.util.UUID;

/* compiled from: PangleUUID */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f2220a = new ThreadLocal<>();

    public static String a() {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = f2220a.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            f2220a.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        bArr[6] = (byte) (bArr[6] & Ascii.SI);
        bArr[6] = (byte) (bArr[6] | 64);
        bArr[8] = (byte) (bArr[8] & 63);
        bArr[8] = (byte) (bArr[8] | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return new UUID(j2, j).toString();
    }
}
