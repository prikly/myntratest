package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.k.aa;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.HashMap;

public abstract class e<T> extends a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<T, b<T>> f12770a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private Handler f12771b;

    /* renamed from: c  reason: collision with root package name */
    private aa f12772c;

    private final class a implements g, q {

        /* renamed from: b  reason: collision with root package name */
        private final T f12774b;

        /* renamed from: c  reason: collision with root package name */
        private q.a f12775c;

        /* renamed from: d  reason: collision with root package name */
        private g.a f12776d;

        public a(T t) {
            this.f12775c = e.this.a((p.a) null);
            this.f12776d = e.this.b((p.a) null);
            this.f12774b = t;
        }

        private m a(m mVar) {
            long a2 = e.this.a(this.f12774b, mVar.f12827f);
            long a3 = e.this.a(this.f12774b, mVar.f12828g);
            return (a2 == mVar.f12827f && a3 == mVar.f12828g) ? mVar : new m(mVar.f12822a, mVar.f12823b, mVar.f12824c, mVar.f12825d, mVar.f12826e, a2, a3);
        }

        private boolean f(int i, p.a aVar) {
            p.a aVar2;
            if (aVar != null) {
                aVar2 = e.this.a(this.f12774b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a2 = e.this.a(this.f12774b, i);
            if (this.f12775c.f12834a != a2 || !ai.a((Object) this.f12775c.f12835b, (Object) aVar2)) {
                this.f12775c = e.this.a(a2, aVar2, 0);
            }
            if (this.f12776d.f11764a == a2 && ai.a((Object) this.f12776d.f11765b, (Object) aVar2)) {
                return true;
            }
            this.f12776d = e.this.a(a2, aVar2);
            return true;
        }

        public void a(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f12776d.a();
            }
        }

        public void a(int i, p.a aVar, int i2) {
            if (f(i, aVar)) {
                this.f12776d.a(i2);
            }
        }

        public void a(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.f12775c.a(jVar, a(mVar));
            }
        }

        public void a(int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.f12775c.a(jVar, a(mVar), iOException, z);
            }
        }

        public void a(int i, p.a aVar, m mVar) {
            if (f(i, aVar)) {
                this.f12775c.a(a(mVar));
            }
        }

        public void a(int i, p.a aVar, Exception exc) {
            if (f(i, aVar)) {
                this.f12776d.a(exc);
            }
        }

        public void b(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f12776d.b();
            }
        }

        public void b(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.f12775c.b(jVar, a(mVar));
            }
        }

        public void c(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f12776d.c();
            }
        }

        public void c(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.f12775c.c(jVar, a(mVar));
            }
        }

        public void d(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.f12776d.d();
            }
        }

        @Deprecated
        public /* synthetic */ void e(int i, p.a aVar) {
            g.CC.$default$e(this, i, aVar);
        }
    }

    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final p f12777a;

        /* renamed from: b  reason: collision with root package name */
        public final p.b f12778b;

        /* renamed from: c  reason: collision with root package name */
        public final e<T>.a f12779c;

        public b(p pVar, p.b bVar, e<T>.a aVar) {
            this.f12777a = pVar;
            this.f12778b = bVar;
            this.f12779c = aVar;
        }
    }

    protected e() {
    }

    /* access modifiers changed from: protected */
    public int a(T t, int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    public long a(T t, long j) {
        return j;
    }

    /* access modifiers changed from: protected */
    public p.a a(T t, p.a aVar) {
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void a() {
        for (b next : this.f12770a.values()) {
            next.f12777a.a(next.f12778b);
        }
    }

    /* access modifiers changed from: protected */
    public void a(aa aaVar) {
        this.f12772c = aaVar;
        this.f12771b = ai.a();
    }

    /* access modifiers changed from: protected */
    public final void a(T t, p pVar) {
        com.applovin.exoplayer2.l.a.a(!this.f12770a.containsKey(t));
        $$Lambda$e$OZCo_CmHiftu8XvuuLxkv425S0 r0 = new p.b(t) {
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void onSourceInfoRefreshed(p pVar, ba baVar) {
                e.this.b(this.f$1, pVar, baVar);
            }
        };
        a aVar = new a(t);
        this.f12770a.put(t, new b(pVar, r0, aVar));
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.f12771b), (q) aVar);
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.f12771b), (g) aVar);
        pVar.a((p.b) r0, this.f12772c);
        if (!d()) {
            pVar.b(r0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void b(T t, p pVar, ba baVar);

    /* access modifiers changed from: protected */
    public void b() {
        for (b next : this.f12770a.values()) {
            next.f12777a.b(next.f12778b);
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        for (b next : this.f12770a.values()) {
            next.f12777a.c(next.f12778b);
            next.f12777a.a((q) next.f12779c);
            next.f12777a.a((g) next.f12779c);
        }
        this.f12770a.clear();
    }

    public void e() throws IOException {
        for (b<T> bVar : this.f12770a.values()) {
            bVar.f12777a.e();
        }
    }
}
