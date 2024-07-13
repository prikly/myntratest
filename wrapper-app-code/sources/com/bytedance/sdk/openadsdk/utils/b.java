package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.e;
import com.bytedance.sdk.openadsdk.core.h;

/* compiled from: AutoTestUtils */
public class b {
    public static String a(String str) {
        if (!l.c() || TextUtils.isEmpty(str)) {
            return str;
        }
        e eVar = new e(h.d().n());
        StringBuilder sb = new StringBuilder(str);
        for (String contains : eVar.b()) {
            if (sb.toString().contains(contains)) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(eVar.a());
                } else {
                    sb.append("?");
                    sb.append(eVar.a());
                }
            }
        }
        return sb.toString();
    }
}
