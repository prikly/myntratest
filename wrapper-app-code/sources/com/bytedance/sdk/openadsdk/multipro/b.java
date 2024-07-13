package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.multipro.d.a;

/* compiled from: MultiGlobalInfo */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2157a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2158b;

    public static void a() {
        a.a("sp_multi_info", "is_support_multi_process", (Boolean) true);
        f2157a = true;
        f2158b = true;
    }

    public static void b() {
        f2157a = false;
        f2158b = true;
    }

    public static boolean c() {
        if (!f2158b) {
            f2157a = a.a("sp_multi_info", "is_support_multi_process", false);
            f2158b = true;
        }
        return f2157a;
    }
}
