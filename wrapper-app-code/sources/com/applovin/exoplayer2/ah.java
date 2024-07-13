package com.applovin.exoplayer2;

import android.os.Handler;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.j;
import com.applovin.exoplayer2.h.k;
import com.applovin.exoplayer2.h.l;
import com.applovin.exoplayer2.h.m;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.h.z;
import com.applovin.exoplayer2.k.aa;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ah {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f11072a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<n, c> f11073b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, c> f11074c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final d f11075d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final q.a f11076e = new q.a();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final g.a f11077f = new g.a();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<c, b> f11078g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Set<c> f11079h = new HashSet();
    private z i = new z.a(0);
    private boolean j;
    private aa k;

    private final class a implements g, q {

        /* renamed from: b  reason: collision with root package name */
        private final c f11081b;

        /* renamed from: c  reason: collision with root package name */
        private q.a f11082c;

        /* renamed from: d  reason: collision with root package name */
        private g.a f11083d;

        public a(c cVar) {
            this.f11082c = ah.this.f11076e;
            this.f11083d = ah.this.f11077f;
            this.f11081b = cVar;
        }

        private boolean f(int i, p.a aVar) {
            p.a aVar2;
            if (aVar != null) {
                aVar2 = ah.b(this.f11081b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a2 = ah.b(this.f11081b, i);
            if (this.f11082c.f12834a != a2 || !ai.a((Object) this.f11082c.f12835b, (Object) aVar2)) {
                this.f11082c = ah.this.f11076e.a(a2, aVar2, 0);
            }
            if (this.f11083d.f11764a == a2 && ai.a((Object) this.f11083d.f11765b, (Object) aVar2)) {
                return true;
            }
            this.f11083d = ah.this.f11077f.a(a2, aVar2);
            return true;
        }

        public void a(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f11083d.a();
            }
        }

        public void a(int i, p.a aVar, int i2) {
            if (f(i, aVar)) {
                this.f11083d.a(i2);
            }
        }

        public void a(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.f11082c.a(jVar, mVar);
            }
        }

        public void a(int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.f11082c.a(jVar, mVar, iOException, z);
            }
        }

        public void a(int i, p.a aVar, m mVar) {
            if (f(i, aVar)) {
                this.f11082c.a(mVar);
            }
        }

        public void a(int i, p.a aVar, Exception exc) {
            if (f(i, aVar)) {
                this.f11083d.a(exc);
            }
        }

        public void b(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f11083d.b();
            }
        }

        public void b(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.f11082c.b(jVar, mVar);
            }
        }

        public void c(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f11083d.c();
            }
        }

        public void c(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.f11082c.c(jVar, mVar);
            }
        }

        public void d(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f11083d.d();
            }
        }

        @Deprecated
        public /* synthetic */ void e(int i, p.a aVar) {
            g.CC.$default$e(this, i, aVar);
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final p f11084a;

        /* renamed from: b  reason: collision with root package name */
        public final p.b f11085b;

        /* renamed from: c  reason: collision with root package name */
        public final a f11086c;

        public b(p pVar, p.b bVar, a aVar) {
            this.f11084a = pVar;
            this.f11085b = bVar;
            this.f11086c = aVar;
        }
    }

    static final class c implements ag {

        /* renamed from: a  reason: collision with root package name */
        public final l f11087a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f11088b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<p.a> f11089c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f11090d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11091e;

        public c(p pVar, boolean z) {
            this.f11087a = new l(pVar, z);
        }

        public Object a() {
            return this.f11088b;
        }

        public void a(int i) {
            this.f11090d = i;
            this.f11091e = false;
            this.f11089c.clear();
        }

        public ba b() {
            return this.f11087a.f();
        }
    }

    public interface d {
        void e();
    }

    public ah(d dVar, com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.f11075d = dVar;
        if (aVar != null) {
            this.f11076e.a(handler, (q) aVar);
            this.f11077f.a(handler, (g) aVar);
        }
    }

    private static Object a(c cVar, Object obj) {
        return ap.a(cVar.f11088b, obj);
    }

    private static Object a(Object obj) {
        return ap.a(obj);
    }

    private void a(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            c remove = this.f11072a.remove(i4);
            this.f11074c.remove(remove.f11088b);
            b(i4, -remove.f11087a.f().b());
            remove.f11091e = true;
            if (this.j) {
                d(remove);
            }
        }
    }

    private void a(c cVar) {
        this.f11079h.add(cVar);
        b bVar = this.f11078g.get(cVar);
        if (bVar != null) {
            bVar.f11084a.a(bVar.f11085b);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(p pVar, ba baVar) {
        this.f11075d.e();
    }

    /* access modifiers changed from: private */
    public static int b(c cVar, int i2) {
        return i2 + cVar.f11090d;
    }

    /* access modifiers changed from: private */
    public static p.a b(c cVar, p.a aVar) {
        for (int i2 = 0; i2 < cVar.f11089c.size(); i2++) {
            if (cVar.f11089c.get(i2).f12832d == aVar.f12832d) {
                return aVar.a(a(cVar, aVar.f12829a));
            }
        }
        return null;
    }

    private static Object b(Object obj) {
        return ap.b(obj);
    }

    private void b(int i2, int i3) {
        while (i2 < this.f11072a.size()) {
            this.f11072a.get(i2).f11090d += i3;
            i2++;
        }
    }

    private void b(c cVar) {
        b bVar = this.f11078g.get(cVar);
        if (bVar != null) {
            bVar.f11084a.b(bVar.f11085b);
        }
    }

    private void c(c cVar) {
        l lVar = cVar.f11087a;
        $$Lambda$ah$unZuB8b_HPPhNiAYs794BihersY r1 = new p.b() {
            public final void onSourceInfoRefreshed(p pVar, ba baVar) {
                ah.this.a(pVar, baVar);
            }
        };
        a aVar = new a(cVar);
        this.f11078g.put(cVar, new b(lVar, r1, aVar));
        lVar.a(ai.b(), (q) aVar);
        lVar.a(ai.b(), (g) aVar);
        lVar.a((p.b) r1, this.k);
    }

    private void d(c cVar) {
        if (cVar.f11091e && cVar.f11089c.isEmpty()) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(this.f11078g.remove(cVar));
            bVar.f11084a.c(bVar.f11085b);
            bVar.f11084a.a((q) bVar.f11086c);
            bVar.f11084a.a((g) bVar.f11086c);
            this.f11079h.remove(cVar);
        }
    }

    private void e() {
        Iterator<c> it = this.f11079h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f11089c.isEmpty()) {
                b(next);
                it.remove();
            }
        }
    }

    public ba a(int i2, int i3, int i4, z zVar) {
        com.applovin.exoplayer2.l.a.a(i2 >= 0 && i2 <= i3 && i3 <= b() && i4 >= 0);
        this.i = zVar;
        if (i2 == i3 || i2 == i4) {
            return d();
        }
        int min = Math.min(i2, i4);
        int max = Math.max(((i3 - i2) + i4) - 1, i3 - 1);
        int i5 = this.f11072a.get(min).f11090d;
        ai.a(this.f11072a, i2, i3, i4);
        while (min <= max) {
            c cVar = this.f11072a.get(min);
            cVar.f11090d = i5;
            i5 += cVar.f11087a.f().b();
            min++;
        }
        return d();
    }

    public ba a(int i2, int i3, z zVar) {
        com.applovin.exoplayer2.l.a.a(i2 >= 0 && i2 <= i3 && i3 <= b());
        this.i = zVar;
        a(i2, i3);
        return d();
    }

    public ba a(int i2, List<c> list, z zVar) {
        int i3;
        if (!list.isEmpty()) {
            this.i = zVar;
            for (int i4 = i2; i4 < list.size() + i2; i4++) {
                c cVar = list.get(i4 - i2);
                if (i4 > 0) {
                    c cVar2 = this.f11072a.get(i4 - 1);
                    i3 = cVar2.f11090d + cVar2.f11087a.f().b();
                } else {
                    i3 = 0;
                }
                cVar.a(i3);
                b(i4, cVar.f11087a.f().b());
                this.f11072a.add(i4, cVar);
                this.f11074c.put(cVar.f11088b, cVar);
                if (this.j) {
                    c(cVar);
                    if (this.f11073b.isEmpty()) {
                        this.f11079h.add(cVar);
                    } else {
                        b(cVar);
                    }
                }
            }
        }
        return d();
    }

    public ba a(z zVar) {
        int b2 = b();
        if (zVar.a() != b2) {
            zVar = zVar.d().a(0, b2);
        }
        this.i = zVar;
        return d();
    }

    public ba a(List<c> list, z zVar) {
        a(0, this.f11072a.size());
        return a(this.f11072a.size(), list, zVar);
    }

    public n a(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j2) {
        Object a2 = a(aVar.f12829a);
        p.a b2 = aVar.a(b(aVar.f12829a));
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.f11074c.get(a2));
        a(cVar);
        cVar.f11089c.add(b2);
        k a3 = cVar.f11087a.b(b2, bVar, j2);
        this.f11073b.put(a3, cVar);
        e();
        return a3;
    }

    public void a(n nVar) {
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.f11073b.remove(nVar));
        cVar.f11087a.a(nVar);
        cVar.f11089c.remove(((k) nVar).f12802a);
        if (!this.f11073b.isEmpty()) {
            e();
        }
        d(cVar);
    }

    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(!this.j);
        this.k = aaVar;
        for (int i2 = 0; i2 < this.f11072a.size(); i2++) {
            c cVar = this.f11072a.get(i2);
            c(cVar);
            this.f11079h.add(cVar);
        }
        this.j = true;
    }

    public boolean a() {
        return this.j;
    }

    public int b() {
        return this.f11072a.size();
    }

    public void c() {
        for (b next : this.f11078g.values()) {
            try {
                next.f11084a.c(next.f11085b);
            } catch (RuntimeException e2) {
                com.applovin.exoplayer2.l.q.c("MediaSourceList", "Failed to release child source.", e2);
            }
            next.f11084a.a((q) next.f11086c);
            next.f11084a.a((g) next.f11086c);
        }
        this.f11078g.clear();
        this.f11079h.clear();
        this.j = false;
    }

    public ba d() {
        if (this.f11072a.isEmpty()) {
            return ba.f11359a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f11072a.size(); i3++) {
            c cVar = this.f11072a.get(i3);
            cVar.f11090d = i2;
            i2 += cVar.f11087a.f().b();
        }
        return new ap(this.f11072a, this.i);
    }
}
