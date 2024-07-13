package com.bytedance.sdk.component.adexpress.a.a;

import com.bytedance.sdk.component.d.m;

/* compiled from: AdapterInstance */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f18303e;

    /* renamed from: a  reason: collision with root package name */
    private volatile b f18304a;

    /* renamed from: b  reason: collision with root package name */
    private volatile d f18305b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f18306c;

    /* renamed from: d  reason: collision with root package name */
    private volatile m f18307d;

    private a() {
    }

    public static a a() {
        if (f18303e == null) {
            synchronized (a.class) {
                if (f18303e == null) {
                    f18303e = new a();
                }
            }
        }
        return f18303e;
    }

    public void a(b bVar) {
        this.f18304a = bVar;
    }

    public b b() {
        return this.f18304a;
    }

    public void a(c cVar) {
        this.f18306c = cVar;
    }

    public c c() {
        return this.f18306c;
    }

    public void a(d dVar) {
        this.f18305b = dVar;
    }

    public d d() {
        return this.f18305b;
    }

    public void a(m mVar) {
        this.f18307d = mVar;
    }

    public m e() {
        return this.f18307d;
    }
}
