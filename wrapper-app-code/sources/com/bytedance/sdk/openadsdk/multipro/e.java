package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTPathConst */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f2177a = "com.bytedance.openadsdk";

    /* renamed from: b  reason: collision with root package name */
    public static String f2178b = ("content://" + f2177a + ".TTMultiProvider");

    static {
        a();
    }

    public static void a() {
        if (m.a() != null) {
            f2177a = m.a().getPackageName();
            f2178b = "content://" + f2177a + ".TTMultiProvider";
        }
    }
}
