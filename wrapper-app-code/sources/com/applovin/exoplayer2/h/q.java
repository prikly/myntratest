package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface q {

    /* renamed from: com.applovin.exoplayer2.h.q$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(q qVar, int i, p.a aVar, j jVar, m mVar) {
        }

        public static void $default$a(q qVar, int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z) {
        }

        public static void $default$a(q qVar, int i, p.a aVar, m mVar) {
        }

        public static void $default$b(q qVar, int i, p.a aVar, j jVar, m mVar) {
        }

        public static void $default$c(q qVar, int i, p.a aVar, j jVar, m mVar) {
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12834a;

        /* renamed from: b  reason: collision with root package name */
        public final p.a f12835b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0124a> f12836c;

        /* renamed from: d  reason: collision with root package name */
        private final long f12837d;

        /* renamed from: com.applovin.exoplayer2.h.q$a$a  reason: collision with other inner class name */
        private static final class C0124a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f12838a;

            /* renamed from: b  reason: collision with root package name */
            public q f12839b;

            public C0124a(Handler handler, q qVar) {
                this.f12838a = handler;
                this.f12839b = qVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (p.a) null, 0);
        }

        private a(CopyOnWriteArrayList<C0124a> copyOnWriteArrayList, int i, p.a aVar, long j) {
            this.f12836c = copyOnWriteArrayList;
            this.f12834a = i;
            this.f12835b = aVar;
            this.f12837d = j;
        }

        private long a(long j) {
            long a2 = h.a(j);
            if (a2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f12837d + a2;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, j jVar, m mVar) {
            qVar.c(this.f12834a, this.f12835b, jVar, mVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, j jVar, m mVar, IOException iOException, boolean z) {
            qVar.a(this.f12834a, this.f12835b, jVar, mVar, iOException, z);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, m mVar) {
            qVar.a(this.f12834a, this.f12835b, mVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(q qVar, j jVar, m mVar) {
            qVar.b(this.f12834a, this.f12835b, jVar, mVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(q qVar, j jVar, m mVar) {
            qVar.a(this.f12834a, this.f12835b, jVar, mVar);
        }

        public a a(int i, p.a aVar, long j) {
            return new a(this.f12836c, i, aVar, j);
        }

        public void a(int i, v vVar, int i2, Object obj, long j) {
            a(new m(1, i, vVar, i2, obj, a(j), -9223372036854775807L));
        }

        public void a(Handler handler, q qVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(qVar);
            this.f12836c.add(new C0124a(handler, qVar));
        }

        public void a(j jVar, int i, int i2, v vVar, int i3, Object obj, long j, long j2) {
            j jVar2 = jVar;
            a(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)));
        }

        public void a(j jVar, int i, int i2, v vVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            j jVar2 = jVar;
            a(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)), iOException, z);
        }

        public void a(j jVar, m mVar) {
            Iterator<C0124a> it = this.f12836c.iterator();
            while (it.hasNext()) {
                C0124a next = it.next();
                ai.a(next.f12838a, (Runnable) new Runnable(next.f12839b, jVar, mVar) {
                    public final /* synthetic */ q f$1;
                    public final /* synthetic */ j f$2;
                    public final /* synthetic */ m f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        q.a.this.c(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        public void a(j jVar, m mVar, IOException iOException, boolean z) {
            Iterator<C0124a> it = this.f12836c.iterator();
            while (it.hasNext()) {
                C0124a next = it.next();
                ai.a(next.f12838a, (Runnable) new Runnable(next.f12839b, jVar, mVar, iOException, z) {
                    public final /* synthetic */ q f$1;
                    public final /* synthetic */ j f$2;
                    public final /* synthetic */ m f$3;
                    public final /* synthetic */ IOException f$4;
                    public final /* synthetic */ boolean f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    public final void run() {
                        q.a.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                    }
                });
            }
        }

        public void a(m mVar) {
            Iterator<C0124a> it = this.f12836c.iterator();
            while (it.hasNext()) {
                C0124a next = it.next();
                ai.a(next.f12838a, (Runnable) new Runnable(next.f12839b, mVar) {
                    public final /* synthetic */ q f$1;
                    public final /* synthetic */ m f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        q.a.this.a(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(q qVar) {
            Iterator<C0124a> it = this.f12836c.iterator();
            while (it.hasNext()) {
                C0124a next = it.next();
                if (next.f12839b == qVar) {
                    this.f12836c.remove(next);
                }
            }
        }

        public void b(j jVar, int i, int i2, v vVar, int i3, Object obj, long j, long j2) {
            j jVar2 = jVar;
            b(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)));
        }

        public void b(j jVar, m mVar) {
            Iterator<C0124a> it = this.f12836c.iterator();
            while (it.hasNext()) {
                C0124a next = it.next();
                ai.a(next.f12838a, (Runnable) new Runnable(next.f12839b, jVar, mVar) {
                    public final /* synthetic */ q f$1;
                    public final /* synthetic */ j f$2;
                    public final /* synthetic */ m f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        q.a.this.b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        public void c(j jVar, int i, int i2, v vVar, int i3, Object obj, long j, long j2) {
            j jVar2 = jVar;
            c(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)));
        }

        public void c(j jVar, m mVar) {
            Iterator<C0124a> it = this.f12836c.iterator();
            while (it.hasNext()) {
                C0124a next = it.next();
                ai.a(next.f12838a, (Runnable) new Runnable(next.f12839b, jVar, mVar) {
                    public final /* synthetic */ q f$1;
                    public final /* synthetic */ j f$2;
                    public final /* synthetic */ m f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        q.a.this.a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }
    }

    void a(int i, p.a aVar, j jVar, m mVar);

    void a(int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z);

    void a(int i, p.a aVar, m mVar);

    void b(int i, p.a aVar, j jVar, m mVar);

    void c(int i, p.a aVar, j jVar, m mVar);
}
