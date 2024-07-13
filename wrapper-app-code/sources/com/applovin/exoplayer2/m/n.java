package com.applovin.exoplayer2.m;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.exoplayer2.c.e;
import com.applovin.exoplayer2.c.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.v;

public interface n {

    /* renamed from: com.applovin.exoplayer2.m.n$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(n nVar, int i, long j) {
        }

        public static void $default$a(n nVar, long j, int i) {
        }

        public static void $default$a(n nVar, e eVar) {
        }

        public static void $default$a(n nVar, o oVar) {
        }

        public static void $default$a(n nVar, v vVar, h hVar) {
        }

        public static void $default$a(n nVar, Exception exc) {
        }

        public static void $default$a(n nVar, Object obj, long j) {
        }

        public static void $default$a(n nVar, String str) {
        }

        public static void $default$a(n nVar, String str, long j, long j2) {
        }

        @Deprecated
        public static void $default$a_(n nVar, v vVar) {
        }

        public static void $default$b(n nVar, e eVar) {
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f13754a;

        /* renamed from: b  reason: collision with root package name */
        private final n f13755b;

        public a(Handler handler, n nVar) {
            this.f13754a = nVar != null ? (Handler) com.applovin.exoplayer2.l.a.b(handler) : null;
            this.f13755b = nVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(Object obj, long j) {
            ((n) ai.a(this.f13755b)).a(obj, j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j) {
            ((n) ai.a(this.f13755b)).a(i, j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(long j, int i) {
            ((n) ai.a(this.f13755b)).a(j, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(o oVar) {
            ((n) ai.a(this.f13755b)).a(oVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(v vVar, h hVar) {
            ((n) ai.a(this.f13755b)).a_(vVar);
            ((n) ai.a(this.f13755b)).a(vVar, hVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Exception exc) {
            ((n) ai.a(this.f13755b)).a(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((n) ai.a(this.f13755b)).a(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            ((n) ai.a(this.f13755b)).a(str, j, j2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(e eVar) {
            eVar.a();
            ((n) ai.a(this.f13755b)).b(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(e eVar) {
            ((n) ai.a(this.f13755b)).a(eVar);
        }

        public void a(int i, long j) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(i, j) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        n.a.this.b(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(long j, int i) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(j, i) {
                    public final /* synthetic */ long f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r4;
                    }

                    public final void run() {
                        n.a.this.b(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(e eVar) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        n.a.this.d(this.f$1);
                    }
                });
            }
        }

        public void a(o oVar) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(oVar) {
                    public final /* synthetic */ o f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        n.a.this.b(this.f$1);
                    }
                });
            }
        }

        public void a(v vVar, h hVar) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(vVar, hVar) {
                    public final /* synthetic */ v f$1;
                    public final /* synthetic */ h f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        n.a.this.b(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(Exception exc) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        n.a.this.b(this.f$1);
                    }
                });
            }
        }

        public void a(Object obj) {
            if (this.f13754a != null) {
                this.f13754a.post(new Runnable(obj, SystemClock.elapsedRealtime()) {
                    public final /* synthetic */ Object f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        n.a.this.a(this.f$1, this.f$2);
                    }
                });
            }
        }

        public void a(String str) {
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        n.a.this.b(this.f$1);
                    }
                });
            }
        }

        public void a(String str, long j, long j2) {
            Handler handler = this.f13754a;
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
                        n.a.this.b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        public void b(e eVar) {
            eVar.a();
            Handler handler = this.f13754a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        n.a.this.c(this.f$1);
                    }
                });
            }
        }
    }

    void a(int i, long j);

    void a(long j, int i);

    void a(e eVar);

    void a(o oVar);

    void a(v vVar, h hVar);

    void a(Exception exc);

    void a(Object obj, long j);

    void a(String str);

    void a(String str, long j, long j2);

    @Deprecated
    void a_(v vVar);

    void b(e eVar);
}
