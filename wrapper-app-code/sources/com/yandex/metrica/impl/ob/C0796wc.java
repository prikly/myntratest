package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

/* renamed from: com.yandex.metrica.impl.ob.wc  reason: case insensitive filesystem */
public class C0796wc {

    /* renamed from: a  reason: collision with root package name */
    private final IHandlerExecutor f7038a = F0.g().q().b();

    /* renamed from: b  reason: collision with root package name */
    private final U7 f7039b;

    /* renamed from: c  reason: collision with root package name */
    private final T7 f7040c;

    /* renamed from: d  reason: collision with root package name */
    private final Ed f7041d;

    /* renamed from: e  reason: collision with root package name */
    private final C0845yd f7042e;

    public C0796wc(Context context) {
        this.f7039b = C0477ja.a(context).f();
        this.f7040c = C0477ja.a(context).e();
        Ed ed = new Ed();
        this.f7041d = ed;
        this.f7042e = new C0845yd(ed.a());
    }

    public IHandlerExecutor a() {
        return this.f7038a;
    }

    public T7 b() {
        return this.f7040c;
    }

    public U7 c() {
        return this.f7039b;
    }

    public C0845yd d() {
        return this.f7042e;
    }

    public Ed e() {
        return this.f7041d;
    }
}
