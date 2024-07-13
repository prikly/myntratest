package com.applovin.exoplayer2.b;

import android.os.Handler;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.c.e;
import com.applovin.exoplayer2.c.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

public interface g {

    /* renamed from: com.applovin.exoplayer2.b.g$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(g gVar, int i, long j, long j2) {
        }

        public static void $default$a(g gVar, long j) {
        }

        @Deprecated
        public static void $default$a(g gVar, v vVar) {
        }

        public static void $default$a_(g gVar, boolean z) {
        }

        public static void $default$b(g gVar, v vVar, h hVar) {
        }

        public static void $default$b(g gVar, Exception exc) {
        }

        public static void $default$b(g gVar, String str) {
        }

        public static void $default$b(g gVar, String str, long j, long j2) {
        }

        public static void $default$c(g gVar, e eVar) {
        }

        public static void $default$c(g gVar, Exception exc) {
        }

        public static void $default$d(g gVar, e eVar) {
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f11233a;

        /* renamed from: b  reason: collision with root package name */
        private final g f11234b;

        public a(Handler handler, g gVar) {
            this.f11233a = gVar != null ? (Handler) com.applovin.exoplayer2.l.a.b(handler) : null;
            this.f11234b = gVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j, long j2) {
            ((g) ai.a(this.f11234b)).a(i, j, j2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(long j) {
            ((g) ai.a(this.f11234b)).a(j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(v vVar, h hVar) {
            ((g) ai.a(this.f11234b)).a(vVar);
            ((g) ai.a(this.f11234b)).b(vVar, hVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((g) ai.a(this.f11234b)).b(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            ((g) ai.a(this.f11234b)).b(str, j, j2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(boolean z) {
            ((g) ai.a(this.f11234b)).a_(z);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(e eVar) {
            eVar.a();
            ((g) ai.a(this.f11234b)).d(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(Exception exc) {
            ((g) ai.a(this.f11234b)).c(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(e eVar) {
            ((g) ai.a(this.f11234b)).c(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(Exception exc) {
            ((g) ai.a(this.f11234b)).b(exc);
        }

        public void a(int i, long j, long j2) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(i, j, j2) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        public void a(long j) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(j) {
                    public final /* synthetic */ long f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1);
                    }
                });
            }
        }

        public void a(e eVar) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.d(this.f$1);
                    }
                });
            }
        }

        public void a(v vVar, h hVar) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(vVar, hVar) {
                    public final /* synthetic */ v f$1;
                    public final /* synthetic */ h f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(Exception exc) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.d(this.f$1);
                    }
                });
            }
        }

        public void a(String str) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1);
                    }
                });
            }
        }

        public void a(String str, long j, long j2) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(str, j, j2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        public void a(boolean z) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(z) {
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.b(this.f$1);
                    }
                });
            }
        }

        public void b(e eVar) {
            eVar.a();
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.c(this.f$1);
                    }
                });
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f11233a;
            if (handler != null) {
                handler.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        g.a.this.c(this.f$1);
                    }
                });
            }
        }
    }

    void a(int i, long j, long j2);

    void a(long j);

    @Deprecated
    void a(v vVar);

    void a_(boolean z);

    void b(v vVar, h hVar);

    void b(Exception exc);

    void b(String str);

    void b(String str, long j, long j2);

    void c(e eVar);

    void c(Exception exc);

    void d(e eVar);
}
