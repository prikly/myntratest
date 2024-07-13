package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: AppSigning */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, ArrayList<String>> f19241a = new HashMap<>();

    public static ArrayList<String> a(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (!(context == null || str == null)) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f19241a.get(str) != null) {
                return f19241a.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : b(context, packageName)) {
                    String str2 = "error!";
                    if ("MD5".equals(str)) {
                        str2 = a(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        str2 = a(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = a(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e2) {
                l.b(e2.toString());
            }
            f19241a.put(str, arrayList);
        }
        return arrayList;
    }

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> a2 = a(context, "SHA1");
        if (!(a2 == null || a2.size() == 0)) {
            for (int i = 0; i < a2.size(); i++) {
                sb.append(a2.get(i));
                if (i < a2.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static Signature[] b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e2) {
            l.b(e2.toString());
            return null;
        }
    }

    private static String a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return "error!";
            }
            byte[] digest = instance.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 & 255) | Ascii.NUL).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e2) {
            l.b(e2.toString());
            return "error!";
        }
    }
}