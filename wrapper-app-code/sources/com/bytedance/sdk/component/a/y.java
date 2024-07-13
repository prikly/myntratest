package com.bytedance.sdk.component.a;

import android.text.TextUtils;

/* compiled from: SerializeHelper */
class y {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18299a;

    static String a() {
        return "";
    }

    static String a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":");
        sb.append(th instanceof s ? ((s) th).f18267a : 0);
        sb.append("}");
        return sb.toString();
    }

    static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = f18299a ? str.substring(1, str.length() - 1) : "";
        String str2 = "{\"code\":1,\"__data\":" + str;
        if (!substring.isEmpty()) {
            return str2 + "," + substring + "}";
        }
        return str2 + "}";
    }

    static void a(boolean z) {
        f18299a = z;
    }
}
