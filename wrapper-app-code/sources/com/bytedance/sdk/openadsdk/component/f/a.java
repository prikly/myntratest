package com.bytedance.sdk.openadsdk.component.f;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.b;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.openadsdk.core.m;
import java.io.File;

/* compiled from: TTAppOpenUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f581a;

    public static File a(String str, int i) {
        return a(m.a(), com.bytedance.sdk.openadsdk.component.a.a(m.a()).a(String.valueOf(i)), str);
    }

    public static String a() {
        if (TextUtils.isEmpty(f581a)) {
            f581a = b.a().getCacheDir() + File.separator + "proxy_cache";
        }
        return f581a;
    }

    public static File b(String str, int i) {
        return a(m.a(), com.bytedance.sdk.openadsdk.component.a.a(m.a()).h(i), str);
    }

    public static String a(Context context, int i) {
        return f.a(context, com.bytedance.sdk.openadsdk.multipro.b.c(), com.bytedance.sdk.openadsdk.component.a.a(m.a()).a(String.valueOf(i))).getAbsolutePath();
    }

    public static File a(Context context, String str, String str2) {
        return f.a(context, com.bytedance.sdk.openadsdk.multipro.b.c(), str, str2);
    }

    public static void a(File file) {
        if (file != null) {
            try {
                f.b(file);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context) {
        try {
            com.bytedance.sdk.openadsdk.component.a.a(context).a();
        } catch (Throwable unused) {
        }
    }
}
