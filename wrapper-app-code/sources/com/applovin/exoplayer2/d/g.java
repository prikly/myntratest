package com.applovin.exoplayer2.d;

import android.os.Handler;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface g {

    /* renamed from: com.applovin.exoplayer2.d.g$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(g gVar, int i, p.a aVar) {
        }

        public static void $default$a(g gVar, int i, p.a aVar, int i2) {
        }

        public static void $default$a(g gVar, int i, p.a aVar, Exception exc) {
        }

        public static void $default$b(g gVar, int i, p.a aVar) {
        }

        public static void $default$c(g gVar, int i, p.a aVar) {
        }

        public static void $default$d(g gVar, int i, p.a aVar) {
        }

        @Deprecated
        public static void $default$e(g gVar, int i, p.a aVar) {
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11764a;

        /* renamed from: b  reason: collision with root package name */
        public final p.a f11765b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0112a> f11766c;

        /* renamed from: com.applovin.exoplayer2.d.g$a$a  reason: collision with other inner class name */
        private static final class C0112a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f11767a;

            /* renamed from: b  reason: collision with root package name */
            public g f11768b;

            public C0112a(Handler handler, g gVar) {
                this.f11767a = handler;
                this.f11768b = gVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (p.a) null);
        }

        private a(CopyOnWriteArrayList<C0112a> copyOnWriteArrayList, int i, p.a aVar) {
            this.f11766c = copyOnWriteArrayList;
            this.f11764a = i;
            this.f11765b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, int i) {
            gVar.e(this.f11764a, this.f11765b);
            gVar.a(this.f11764a, this.f11765b, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, Exception exc) {
            gVar.a(this.f11764a, this.f11765b, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(g gVar) {
            gVar.d(this.f11764a, this.f11765b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(g gVar) {
            gVar.c(this.f11764a, this.f11765b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(g gVar) {
            gVar.b(this.f11764a, this.f11765b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(g gVar) {
            gVar.a(this.f11764a, this.f11765b);
        }

        public a a(int i, p.a aVar) {
            return new a(this.f11766c, i, aVar);
        }

        public void a() {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                ai.a(next.f11767a, (Runnable) new Runnable(next.f11768b) {
                    public final /* synthetic */ g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.e(this.f$1);
                    }
                });
            }
        }

        public void a(int i) {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                ai.a(next.f11767a, (Runnable) new Runnable(next.f11768b, i) {
                    public final /* synthetic */ g f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        g.a.this.a(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(Handler handler, g gVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(gVar);
            this.f11766c.add(new C0112a(handler, gVar));
        }

        public void a(g gVar) {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                if (next.f11768b == gVar) {
                    this.f11766c.remove(next);
                }
            }
        }

        public void a(Exception exc) {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                ai.a(next.f11767a, (Runnable) new Runnable(next.f11768b, exc) {
                    public final /* synthetic */ g f$1;
                    public final /* synthetic */ Exception f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        g.a.this.a(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void b() {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                ai.a(next.f11767a, (Runnable) new Runnable(next.f11768b) {
                    public final /* synthetic */ g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.d(this.f$1);
                    }
                });
            }
        }

        public void c() {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                ai.a(next.f11767a, (Runnable) new Runnable(next.f11768b) {
                    public final /* synthetic */ g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.c(this.f$1);
                    }
                });
            }
        }

        public void d() {
            Iterator<C0112a> it = this.f11766c.iterator();
            while (it.hasNext()) {
                C0112a next = it.next();
                ai.a(next.f11767a, (Runnable) new Runnable(next.f11768b) {
                    public final /* synthetic */ g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1);
                    }
                });
            }
        }
    }

    void a(int i, p.a aVar);

    void a(int i, p.a aVar, int i2);

    void a(int i, p.a aVar, Exception exc);

    void b(int i, p.a aVar);

    void c(int i, p.a aVar);

    void d(int i, p.a aVar);

    @Deprecated
    void e(int i, p.a aVar);
}
