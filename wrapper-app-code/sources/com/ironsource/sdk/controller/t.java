package com.ironsource.sdk.controller;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.ironsource.sdk.utils.c;
import java.security.MessageDigest;

final class t {

    /* renamed from: a  reason: collision with root package name */
    String f9273a;

    t(String str) {
        this.f9273a = str;
    }

    private String a(String str) {
        try {
            return c.a(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return b(str);
        }
    }

    private String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() < 2) {
                    hexString = BuildConfig.ADAPTER_VERSION + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f9273a));
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
