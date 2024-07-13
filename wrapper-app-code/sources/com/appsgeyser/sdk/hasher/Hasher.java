package com.appsgeyser.sdk.hasher;

import com.appodeal.ads.adapters.admob.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher {
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
