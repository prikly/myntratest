package com.criteo.publisher.model;

import com.criteo.publisher.k0.g;
import com.criteo.publisher.m0.d;
import com.criteo.publisher.m0.e;
import com.criteo.publisher.n0.u;
import com.criteo.publisher.s;

/* compiled from: WebViewData */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private String f2714a = "";

    /* renamed from: b  reason: collision with root package name */
    private u f2715b = u.NONE;

    /* renamed from: c  reason: collision with root package name */
    private final t f2716c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2717d;

    public a0(t tVar, g gVar) {
        this.f2716c = tVar;
        this.f2717d = gVar;
    }

    public boolean e() {
        return this.f2715b == u.LOADED;
    }

    public void a(String str) {
        this.f2714a = this.f2716c.b().replace(this.f2716c.a(), str);
    }

    public boolean f() {
        return this.f2715b == u.LOADING;
    }

    public String d() {
        return this.f2714a;
    }

    public void g() {
        this.f2715b = u.NONE;
        this.f2714a = "";
    }

    public void a() {
        this.f2715b = u.FAILED;
    }

    public void c() {
        this.f2715b = u.LOADED;
    }

    public void b() {
        this.f2715b = u.LOADING;
    }

    public void a(String str, u uVar, d dVar) {
        s.c().h1().execute(new e(str, this, uVar, dVar, this.f2717d));
    }
}
