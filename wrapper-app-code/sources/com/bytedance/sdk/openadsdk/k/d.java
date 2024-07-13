package com.bytedance.sdk.openadsdk.k;

import java.util.List;

/* compiled from: TrackAdUrlImplEmpty */
class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f2089a;

    public void a() {
    }

    public void a(List<String> list) {
    }

    public void b() {
    }

    public static d c() {
        if (f2089a == null) {
            synchronized (d.class) {
                if (f2089a == null) {
                    f2089a = new d();
                }
            }
        }
        return f2089a;
    }

    private d() {
    }
}
