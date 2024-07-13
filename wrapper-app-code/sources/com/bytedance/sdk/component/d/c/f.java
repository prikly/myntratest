package com.bytedance.sdk.component.d.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.b;
import com.bytedance.sdk.component.d.c;
import com.bytedance.sdk.component.d.c.a.a;
import com.bytedance.sdk.component.d.c.a.b.e;
import com.bytedance.sdk.component.d.d;
import com.bytedance.sdk.component.d.k;
import com.bytedance.sdk.component.d.l;
import com.bytedance.sdk.component.d.o;
import com.bytedance.sdk.component.d.p;
import com.bytedance.sdk.component.d.q;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadFactory */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<c>> f19080a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final l f19081b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, p> f19082c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, q> f19083d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<String, c> f19084e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private d f19085f;

    /* renamed from: g  reason: collision with root package name */
    private k f19086g;

    /* renamed from: h  reason: collision with root package name */
    private ExecutorService f19087h;
    private o i;

    public f(Context context, l lVar) {
        this.f19081b = (l) h.a(lVar);
        a.a(context, lVar.h());
    }

    public Collection<q> a() {
        return this.f19083d.values();
    }

    public Collection<c> b() {
        return this.f19084e.values();
    }

    public p a(b bVar) {
        if (bVar == null) {
            bVar = a.f();
        }
        String file = bVar.e().toString();
        p pVar = this.f19082c.get(file);
        if (pVar != null) {
            return pVar;
        }
        p d2 = d(bVar);
        this.f19082c.put(file, d2);
        return d2;
    }

    private p d(b bVar) {
        p d2 = this.f19081b.d();
        if (d2 != null) {
            return com.bytedance.sdk.component.d.c.a.b.a.a(d2);
        }
        return com.bytedance.sdk.component.d.c.a.b.a.a(bVar.b());
    }

    public q b(b bVar) {
        if (bVar == null) {
            bVar = a.f();
        }
        String file = bVar.e().toString();
        q qVar = this.f19083d.get(file);
        if (qVar != null) {
            return qVar;
        }
        q e2 = e(bVar);
        this.f19083d.put(file, e2);
        return e2;
    }

    private q e(b bVar) {
        q e2 = this.f19081b.e();
        if (e2 != null) {
            return e2;
        }
        return e.a(bVar.b());
    }

    public c c(b bVar) {
        if (bVar == null) {
            bVar = a.f();
        }
        String file = bVar.e().toString();
        c cVar = this.f19084e.get(file);
        if (cVar != null) {
            return cVar;
        }
        c f2 = f(bVar);
        this.f19084e.put(file, f2);
        return f2;
    }

    public c a(String str) {
        return c(a.a(new File(str)));
    }

    private c f(b bVar) {
        c f2 = this.f19081b.f();
        if (f2 != null) {
            return f2;
        }
        return new com.bytedance.sdk.component.d.c.a.a.b(bVar.e(), bVar.a(), e());
    }

    public d c() {
        if (this.f19085f == null) {
            this.f19085f = h();
        }
        return this.f19085f;
    }

    private d h() {
        d c2 = this.f19081b.c();
        return c2 == null ? com.bytedance.sdk.component.d.b.b.a() : c2;
    }

    public k d() {
        if (this.f19086g == null) {
            this.f19086g = i();
        }
        return this.f19086g;
    }

    private k i() {
        k a2 = this.f19081b.a();
        if (a2 != null) {
            return a2;
        }
        return com.bytedance.sdk.component.d.a.b.a();
    }

    public ExecutorService e() {
        if (this.f19087h == null) {
            this.f19087h = j();
        }
        return this.f19087h;
    }

    private ExecutorService j() {
        ExecutorService b2 = this.f19081b.b();
        if (b2 != null) {
            return b2;
        }
        return com.bytedance.sdk.component.d.a.c.a();
    }

    public Map<String, List<c>> f() {
        return this.f19080a;
    }

    public com.bytedance.sdk.component.d.c.b.a a(c cVar) {
        ImageView.ScaleType d2 = cVar.d();
        if (d2 == null) {
            d2 = com.bytedance.sdk.component.d.c.b.a.f19021a;
        }
        Bitmap.Config h2 = cVar.h();
        if (h2 == null) {
            h2 = com.bytedance.sdk.component.d.c.b.a.f19022b;
        }
        return new com.bytedance.sdk.component.d.c.b.a(cVar.b(), cVar.c(), d2, h2);
    }

    public o g() {
        if (this.i == null) {
            this.i = k();
        }
        return this.i;
    }

    private o k() {
        o g2 = this.f19081b.g();
        return g2 == null ? new g() : g2;
    }
}
