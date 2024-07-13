package com.criteo.publisher.a;

import android.content.Context;
import com.criteo.publisher.i;
import com.criteo.publisher.k0.g;
import com.criteo.publisher.l0.c;
import com.criteo.publisher.model.u;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.n0.d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AppEvents */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2286a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2287b;

    /* renamed from: c  reason: collision with root package name */
    private final i f2288c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2289d;

    /* renamed from: e  reason: collision with root package name */
    private final c f2290e;

    /* renamed from: f  reason: collision with root package name */
    private final u f2291f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f2292g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicLong f2293h = new AtomicLong(-1);

    public void a() {
    }

    public a(Context context, b bVar, i iVar, g gVar, c cVar, u uVar, Executor executor) {
        this.f2286a = context;
        this.f2287b = bVar;
        this.f2288c = iVar;
        this.f2289d = gVar;
        this.f2290e = cVar;
        this.f2291f = uVar;
        this.f2292g = executor;
    }

    private void a(String str) {
        if (e()) {
            long j = this.f2293h.get();
            if (j <= 0 || this.f2288c.a() >= j) {
                this.f2292g.execute(new com.criteo.publisher.k0.a(this.f2286a, this, this.f2287b, this.f2289d, this.f2291f, this.f2290e, str));
            }
        }
    }

    public void a(int i) {
        this.f2293h.set(this.f2288c.a() + ((long) (i * 1000)));
    }

    public void d() {
        a("Launch");
    }

    public void b() {
        a("Active");
    }

    public void c() {
        a("Inactive");
    }

    private boolean e() {
        return this.f2290e.g() && this.f2290e.i();
    }
}
