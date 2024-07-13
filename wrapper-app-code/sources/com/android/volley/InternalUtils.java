package com.android.volley;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class InternalUtils {
    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

    private static String convertToHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = HEX_CHARS;
            cArr[i2] = cArr2[b2 >>> 4];
            cArr[i2 + 1] = cArr2[b2 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static String sha1Hash(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return convertToHex(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
