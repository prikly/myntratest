package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.l.m;
import com.applovin.exoplayer2.l.p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d f13559a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13560b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f13561c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f13562d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f13563e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f13564f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13565g;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void invoke(T t, m mVar);
    }

    private static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f13566a;

        /* renamed from: b  reason: collision with root package name */
        private m.a f13567b = new m.a();

        /* renamed from: c  reason: collision with root package name */
        private boolean f13568c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13569d;

        public c(T t) {
            this.f13566a = t;
        }

        public void a(int i, a<T> aVar) {
            if (!this.f13569d) {
                if (i != -1) {
                    this.f13567b.a(i);
                }
                this.f13568c = true;
                aVar.invoke(this.f13566a);
            }
        }

        public void a(b<T> bVar) {
            this.f13569d = true;
            if (this.f13568c) {
                bVar.invoke(this.f13566a, this.f13567b.a());
            }
        }

        public void b(b<T> bVar) {
            if (!this.f13569d && this.f13568c) {
                m a2 = this.f13567b.a();
                this.f13567b = new m.a();
                this.f13568c = false;
                bVar.invoke(this.f13566a, a2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f13566a.equals(((c) obj).f13566a);
        }

        public int hashCode() {
            return this.f13566a.hashCode();
        }
    }

    public p(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private p(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f13559a = dVar;
        this.f13562d = copyOnWriteArraySet;
        this.f13561c = bVar;
        this.f13563e = new ArrayDeque<>();
        this.f13564f = new ArrayDeque<>();
        this.f13560b = dVar.a(looper, new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                return p.this.a(message);
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    /* access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.f13562d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f13561c);
            if (this.f13560b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public p<T> a(Looper looper, b<T> bVar) {
        return new p<>(this.f13562d, looper, this.f13559a, bVar);
    }

    public void a() {
        if (!this.f13564f.isEmpty()) {
            if (!this.f13560b.a(0)) {
                o oVar = this.f13560b;
                oVar.a(oVar.b(0));
            }
            boolean z = !this.f13563e.isEmpty();
            this.f13563e.addAll(this.f13564f);
            this.f13564f.clear();
            if (!z) {
                while (!this.f13563e.isEmpty()) {
                    this.f13563e.peekFirst().run();
                    this.f13563e.removeFirst();
                }
            }
        }
    }

    public void a(int i, a<T> aVar) {
        this.f13564f.add(new Runnable(new CopyOnWriteArraySet(this.f13562d), i, aVar) {
            public final /* synthetic */ CopyOnWriteArraySet f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ p.a f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                p.a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    public void a(T t) {
        if (!this.f13565g) {
            a.b(t);
            this.f13562d.add(new c(t));
        }
    }

    public void b() {
        Iterator<c<T>> it = this.f13562d.iterator();
        while (it.hasNext()) {
            it.next().a(this.f13561c);
        }
        this.f13562d.clear();
        this.f13565g = true;
    }

    public void b(int i, a<T> aVar) {
        a(i, aVar);
        a();
    }

    public void b(T t) {
        Iterator<c<T>> it = this.f13562d.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f13566a.equals(t)) {
                next.a(this.f13561c);
                this.f13562d.remove(next);
            }
        }
    }
}
