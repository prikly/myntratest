package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommonDialogHelper */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f2198a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static IListenerManager f2199b;

    /* compiled from: CommonDialogHelper */
    public interface a {
        void a();

        void b();

        void c();
    }

    public static void a(String str) {
        a(str, 1);
    }

    public static void b(String str) {
        a(str, 2);
    }

    public static void c(String str) {
        a(str, 3);
    }

    public static a d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f2198a.remove(str);
    }

    private static void a(final String str, final int i) {
        if (!TextUtils.isEmpty(str)) {
            if (b.c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            c.b().broadcastDialogListener(str, i);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            a d2 = d(str);
            if (d2 != null) {
                if (i == 1) {
                    d2.a();
                } else if (i == 2) {
                    d2.b();
                } else if (i != 3) {
                    d2.c();
                } else {
                    d2.c();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static IListenerManager b() {
        if (f2199b == null) {
            f2199b = com.bytedance.sdk.openadsdk.multipro.aidl.a.c.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(2));
        }
        return f2199b;
    }
}
