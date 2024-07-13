package com.bytedance.sdk.component.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.t;
import com.bytedance.sdk.component.a.v;
import com.bytedance.sdk.component.a.w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* compiled from: CallHandler */
class g implements w.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f18219a;

    /* renamed from: b  reason: collision with root package name */
    private final u f18220b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b> f18221c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d.b> f18222d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<q> f18223e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Set<d> f18224f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final m f18225g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f18226h;
    private final boolean i;
    /* access modifiers changed from: private */
    public final a j;

    g(j jVar, a aVar, v vVar) {
        this.j = aVar;
        this.f18219a = jVar.f18239d;
        u uVar = new u(vVar, jVar.l, jVar.m);
        this.f18220b = uVar;
        uVar.a((w.a) this);
        this.f18220b.a(jVar.p);
        this.f18225g = jVar.i;
        this.f18226h = jVar.f18243h;
        this.i = jVar.o;
    }

    /* access modifiers changed from: package-private */
    public a a(q qVar, f fVar) throws Exception {
        b bVar = this.f18221c.get(qVar.f18248d);
        if (bVar != null) {
            try {
                x b2 = b(fVar.f18216b, bVar);
                fVar.f18218d = b2;
                if (b2 == null) {
                    if (this.f18225g != null) {
                        this.f18225g.a(fVar.f18216b, qVar.f18248d, 1);
                    }
                    i.a("Permission denied, call: " + qVar);
                    throw new s(-1);
                } else if (bVar instanceof e) {
                    i.a("Processing stateless call: " + qVar);
                    return a(qVar, (e) bVar, fVar);
                } else if (bVar instanceof c) {
                    i.a("Processing raw call: " + qVar);
                    return a(qVar, (c) bVar, b2);
                }
            } catch (v.a e2) {
                i.a("No remote permission config fetched, call pending: " + qVar, e2);
                this.f18223e.add(qVar);
                return new a(false, y.a());
            }
        }
        d.b bVar2 = this.f18222d.get(qVar.f18248d);
        if (bVar2 != null) {
            d a2 = bVar2.a();
            a2.a(qVar.f18248d);
            x b3 = b(fVar.f18216b, a2);
            fVar.f18218d = b3;
            if (b3 != null) {
                i.a("Processing stateful call: " + qVar);
                return a(qVar, a2, fVar);
            }
            i.a("Permission denied, call: " + qVar);
            a2.e();
            throw new s(-1);
        }
        m mVar = this.f18225g;
        if (mVar != null) {
            mVar.a(fVar.f18216b, qVar.f18248d, 2);
        }
        i.b("Received call: " + qVar + ", but not registered.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, e<?, ?> eVar) {
        eVar.a(str);
        this.f18221c.put(str, eVar);
        i.a("JsBridge stateless method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, d.b bVar) {
        this.f18222d.put(str, bVar);
        i.a("JsBridge stateful method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (d f2 : this.f18224f) {
            f2.f();
        }
        this.f18224f.clear();
        this.f18221c.clear();
        this.f18222d.clear();
        this.f18220b.b(this);
    }

    private a a(q qVar, e eVar, f fVar) throws Exception {
        return new a(true, y.a(this.f18219a.a(eVar.a(a(qVar.f18249e, (b) eVar), fVar))));
    }

    private a a(final q qVar, final d dVar, f fVar) throws Exception {
        this.f18224f.add(dVar);
        dVar.a(a(qVar.f18249e, (b) dVar), fVar, new d.a() {
            public void a(Object obj) {
                if (g.this.j != null) {
                    g.this.j.b(y.a(g.this.f18219a.a(obj)), qVar);
                    g.this.f18224f.remove(dVar);
                }
            }

            public void a(Throwable th) {
                if (g.this.j != null) {
                    g.this.j.b(y.a(th), qVar);
                    g.this.f18224f.remove(dVar);
                }
            }
        });
        return new a(false, y.a());
    }

    private a a(final q qVar, c cVar, x xVar) throws Exception {
        cVar.a(qVar, new t(qVar.f18248d, xVar, new t.a() {
        }));
        return new a(false, y.a());
    }

    private Object a(String str, b bVar) throws JSONException {
        return this.f18219a.a(str, a((Object) bVar)[0]);
    }

    private x b(String str, b bVar) {
        if (this.i) {
            return x.PRIVATE;
        }
        return this.f18220b.a(this.f18226h, str, bVar);
    }

    private static Type[] a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* compiled from: CallHandler */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f18232a;

        /* renamed from: b  reason: collision with root package name */
        String f18233b;

        private a(boolean z, String str) {
            this.f18232a = z;
            this.f18233b = str;
        }
    }
}
