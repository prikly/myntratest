package com.bytedance.sdk.openadsdk.h.c;

import com.bytedance.sdk.openadsdk.h.a;

/* compiled from: LogUploaderImplEmpty */
class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f1997a;

    public void a() {
    }

    public void a(a aVar) {
    }

    public void a(a aVar, boolean z) {
    }

    public void b() {
    }

    public static e c() {
        if (f1997a == null) {
            synchronized (e.class) {
                if (f1997a == null) {
                    f1997a = new e();
                }
            }
        }
        return f1997a;
    }

    private e() {
    }
}
