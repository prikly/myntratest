package com.bytedance.sdk.component.widget.a;

/* compiled from: BaseAdapterInstance */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f19286b;

    /* renamed from: a  reason: collision with root package name */
    private volatile b f19287a;

    private a() {
    }

    public static a a() {
        if (f19286b == null) {
            synchronized (a.class) {
                if (f19286b == null) {
                    f19286b = new a();
                }
            }
        }
        return f19286b;
    }

    public void a(b bVar) {
        this.f19287a = bVar;
    }

    public b b() {
        return this.f19287a;
    }
}
