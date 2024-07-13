package com.bytedance.sdk.openadsdk.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.e.b.c;
import com.bytedance.sdk.openadsdk.utils.s;
import java.util.Map;

/* compiled from: NetHook */
public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public static c f421a;

    public String a() {
        return "net";
    }

    public static String a(c cVar, String str) {
        c a2;
        if (!s.c() || (a2 = b.a("net")) == null) {
            return str;
        }
        Map map = (Map) a2.a(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                cVar.b(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
