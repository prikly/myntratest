package com.criteo.publisher.m0;

import com.criteo.publisher.k0.g;
import com.criteo.publisher.model.a0;
import com.criteo.publisher.model.u;
import com.criteo.publisher.n0.r;
import com.criteo.publisher.n0.s;
import com.criteo.publisher.p;
import com.criteo.publisher.x;
import java.io.InputStream;
import java.net.URL;

/* compiled from: WebViewDataTask */
public class e extends x {

    /* renamed from: c  reason: collision with root package name */
    private final String f2702c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f2703d;

    /* renamed from: e  reason: collision with root package name */
    private final u f2704e;

    /* renamed from: f  reason: collision with root package name */
    private final d f2705f;

    /* renamed from: g  reason: collision with root package name */
    private final g f2706g;

    public e(String str, a0 a0Var, u uVar, d dVar, g gVar) {
        this.f2702c = str;
        this.f2703d = a0Var;
        this.f2704e = uVar;
        this.f2705f = dVar;
        this.f2706g = gVar;
    }

    public void a() throws Exception {
        try {
            String b2 = b();
            if (s.a((CharSequence) b2)) {
                c();
            } else {
                a(b2);
            }
        } catch (Throwable th) {
            if (s.a((CharSequence) null)) {
                c();
            } else {
                a((String) null);
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public String b() throws Exception {
        InputStream a2 = this.f2706g.a(new URL(this.f2702c), this.f2704e.b().get());
        try {
            String a3 = r.a(a2);
            if (a2 != null) {
                a2.close();
            }
            return a3;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f2703d.a(str);
        this.f2703d.c();
        this.f2705f.a(p.VALID);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f2703d.a();
        this.f2705f.a(p.INVALID_CREATIVE);
    }
}
