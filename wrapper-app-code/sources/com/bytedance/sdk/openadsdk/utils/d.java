package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommonPermissionUtils */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f2202a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static IListenerManager f2203b;

    /* compiled from: CommonPermissionUtils */
    public interface a {
        void a();

        void a(String str);
    }

    public static void a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            if (b.c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            l.b("MultiProcess", "handleYes-1，key=" + str);
                            d.b().broadcastPermissionListener(str, (String) null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            a b2 = b(str);
            if (b2 != null) {
                b2.a();
            }
        }
    }

    public static void a(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (b.c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            l.b("MultiProcess", "handleNo-1，key=" + str + "，permission=" + str2);
                            d.b().broadcastPermissionListener(str, str2);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            a b2 = b(str);
            if (b2 != null) {
                b2.a(str2);
            }
        }
    }

    private static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f2202a.remove(str);
    }

    /* access modifiers changed from: private */
    public static IListenerManager b() {
        if (f2203b == null) {
            f2203b = com.bytedance.sdk.openadsdk.multipro.aidl.a.d.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(4));
        }
        return f2203b;
    }
}
