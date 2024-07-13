package com.adcolony.sdk;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class d1 {
    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            byte b3 = (b2 >>> 4) & Ascii.SI;
            int i = 0;
            while (true) {
                sb.append((char) ((b3 < 0 || b3 > 9) ? (b3 - 10) + 97 : b3 + 48));
                b3 = b2 & Ascii.SI;
                int i2 = i + 1;
                if (i >= 1) {
                    break;
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    static String a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(str.getBytes("iso-8859-1"), 0, str.length());
        return a(instance.digest());
    }
}
