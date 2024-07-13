package com.appsgeyser.sdk.inapp.utils;

import android.util.Base64;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Decoder {
    public static String encrypt(String str, String str2, String str3) {
        byte[] decode = Base64.decode(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(md5(str2 + ":" + str3));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        while (sb3.length() < decode.length) {
            sb3.append(sb2);
        }
        byte[] bytes = sb3.substring(0, decode.length).getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[i] ^ bytes[i]);
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String md5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = BuildConfig.ADAPTER_VERSION + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
