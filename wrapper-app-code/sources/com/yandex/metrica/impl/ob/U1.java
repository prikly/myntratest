package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0593o1;
import com.yandex.metrica.impl.ob.J;
import com.yandex.metrica.rtm.wrapper.k;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class U1 implements C0593o1.c, k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final P0 f5065a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0593o1 f5066b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object f5067c;

    /* renamed from: d  reason: collision with root package name */
    private final ICommonExecutor f5068d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C0573n6 f5069e;

    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A3 f5070b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A3 a3) {
            super(U1.this, (a) null);
            this.f5070b = a3;
        }

        /* access modifiers changed from: package-private */
        public void a(IMetricaService iMetricaService) throws RemoteException {
            P0 a2 = U1.this.f5065a;
            A3 a3 = this.f5070b;
            ((T1) a2).getClass();
            Bundle bundle = new Bundle();
            synchronized (a3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", a3);
            }
            iMetricaService.b(bundle);
        }
    }

    class b extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A3 f5072b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A3 a3) {
            super(U1.this, (a) null);
            this.f5072b = a3;
        }

        /* access modifiers changed from: package-private */
        public void a(IMetricaService iMetricaService) throws RemoteException {
            P0 a2 = U1.this.f5065a;
            A3 a3 = this.f5072b;
            ((T1) a2).getClass();
            Bundle bundle = new Bundle();
            synchronized (a3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", a3);
            }
            iMetricaService.a(bundle);
        }
    }

    class c extends d {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f5074d = false;

        /* renamed from: e  reason: collision with root package name */
        private final Xl f5075e;

        c(f fVar, Xl xl) {
            super(fVar);
            this.f5075e = xl;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            f fVar = this.f5077b;
            if (fVar.b().f5581h == 0) {
                Context a2 = ((T1) U1.this.f5065a).a();
                Intent a3 = C0569n2.a(a2);
                fVar.b().f5578e = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b();
                a3.putExtras(fVar.b().b(fVar.a().c()));
                try {
                    a2.startService(a3);
                    return false;
                } catch (Throwable unused) {
                    U1.this.f5069e.a(fVar);
                    return false;
                }
            } else {
                U1.this.f5069e.a(fVar);
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
            if (r2.endsWith(":" + "Metrica") != false) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized java.lang.Void a() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f5074d     // Catch:{ all -> 0x0051 }
                r1 = 0
                if (r0 == 0) goto L_0x0008
                monitor-exit(r6)
                return r1
            L_0x0008:
                r0 = 1
                r6.f5074d = r0     // Catch:{ all -> 0x0051 }
                com.yandex.metrica.impl.ob.Xl r2 = r6.f5075e     // Catch:{ all -> 0x0051 }
                java.lang.String r3 = "Metrica"
                r2.getClass()     // Catch:{ all -> 0x0051 }
                java.lang.String r4 = r2.b()     // Catch:{ all -> 0x0038 }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
                if (r4 != 0) goto L_0x0038
                java.lang.String r2 = r2.b()     // Catch:{ all -> 0x0038 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
                r4.<init>()     // Catch:{ all -> 0x0038 }
                java.lang.String r5 = ":"
                r4.append(r5)     // Catch:{ all -> 0x0038 }
                r4.append(r3)     // Catch:{ all -> 0x0038 }
                java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0038 }
                boolean r2 = r2.endsWith(r3)     // Catch:{ all -> 0x0038 }
                if (r2 == 0) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0042
                com.yandex.metrica.impl.ob.U1$f r0 = r6.f5077b     // Catch:{ all -> 0x0051 }
                r6.a((com.yandex.metrica.impl.ob.U1.f) r0)     // Catch:{ all -> 0x0051 }
                monitor-exit(r6)
                return r1
            L_0x0042:
                com.yandex.metrica.impl.ob.U1 r0 = com.yandex.metrica.impl.ob.U1.this     // Catch:{ all -> 0x0051 }
                com.yandex.metrica.impl.ob.o1 r0 = r0.f5066b     // Catch:{ all -> 0x0051 }
                r0.g()     // Catch:{ all -> 0x0051 }
                java.lang.Void r0 = super.call()     // Catch:{ all -> 0x0051 }
                monitor-exit(r6)
                return r0
            L_0x0051:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.U1.c.a():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        public void a(f fVar) {
            U1.this.f5069e.a(fVar);
        }
    }

    class d extends g {

        /* renamed from: b  reason: collision with root package name */
        final f f5077b;

        d(f fVar) {
            super(U1.this, (a) null);
            this.f5077b = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a(IMetricaService iMetricaService) throws RemoteException {
            f fVar = this.f5077b;
            ((T1) U1.this.f5065a).a(iMetricaService, fVar.e(), fVar.f5080b);
        }

        /* access modifiers changed from: package-private */
        public void a(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object call() throws Exception {
            return call();
        }
    }

    public interface e {
        C0293c0 a(C0293c0 c0Var);
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private C0293c0 f5079a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Q1 f5080b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5081c = false;

        /* renamed from: d  reason: collision with root package name */
        private e f5082d;

        /* renamed from: e  reason: collision with root package name */
        private HashMap<J.a, Integer> f5083e;

        public f(C0293c0 c0Var, Q1 q1) {
            this.f5079a = c0Var;
            this.f5080b = new Q1(new A3(q1.a()), new CounterConfiguration(q1.b()), q1.e());
        }

        public C0293c0 b() {
            return this.f5079a;
        }

        public HashMap<J.a, Integer> c() {
            return this.f5083e;
        }

        public boolean d() {
            return this.f5081c;
        }

        /* access modifiers changed from: package-private */
        public C0293c0 e() {
            e eVar = this.f5082d;
            return eVar != null ? eVar.a(this.f5079a) : this.f5079a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.f5079a + ", mEnvironment=" + this.f5080b + ", mCrash=" + this.f5081c + ", mAction=" + this.f5082d + ", mTrimmedFields=" + this.f5083e + '}';
        }

        public f a(e eVar) {
            this.f5082d = eVar;
            return this;
        }

        public f a(HashMap<J.a, Integer> hashMap) {
            this.f5083e = hashMap;
            return this;
        }

        public f a(boolean z) {
            this.f5081c = z;
            return this;
        }

        public Q1 a() {
            return this.f5080b;
        }
    }

    private abstract class g implements Callable<Void> {
        private g() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(14:1|2|3|(2:5|6)|8|9|(1:15)|1|2|3|(0)|8|9|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[SYNTHETIC, Splitter:B:5:0x000e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r3 = this;
                r0 = 0
            L_0x0001:
                r1 = 0
                com.yandex.metrica.impl.ob.U1 r2 = com.yandex.metrica.impl.ob.U1.this     // Catch:{ all -> 0x0024 }
                com.yandex.metrica.impl.ob.o1 r2 = r2.f5066b     // Catch:{ all -> 0x0024 }
                com.yandex.metrica.IMetricaService r2 = r2.d()     // Catch:{ all -> 0x0024 }
                if (r2 == 0) goto L_0x0012
                r3.a((com.yandex.metrica.IMetricaService) r2)     // Catch:{ RemoteException -> 0x0012 }
                return r1
            L_0x0012:
                boolean r2 = r3.b()     // Catch:{ all -> 0x0024 }
                int r0 = r0 + 1
                if (r2 == 0) goto L_0x0023
                boolean r2 = com.yandex.metrica.impl.ob.C1.a()     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0023
                r2 = 2
                if (r0 < r2) goto L_0x0001
            L_0x0023:
                return r1
            L_0x0024:
                r0 = move-exception
                r3.a((java.lang.Throwable) r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.U1.g.call():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        public abstract void a(IMetricaService iMetricaService) throws RemoteException;

        /* access modifiers changed from: package-private */
        public void a(Throwable th) {
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0029 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b() {
            /*
                r5 = this;
                com.yandex.metrica.impl.ob.U1 r0 = com.yandex.metrica.impl.ob.U1.this
                com.yandex.metrica.impl.ob.o1 r0 = r0.f5066b
                r0.b()
                com.yandex.metrica.impl.ob.U1 r0 = com.yandex.metrica.impl.ob.U1.this
                java.lang.Object r0 = r0.f5067c
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.U1 r1 = com.yandex.metrica.impl.ob.U1.this     // Catch:{ all -> 0x0035 }
                com.yandex.metrica.impl.ob.o1 r1 = r1.f5066b     // Catch:{ all -> 0x0035 }
                boolean r1 = r1.e()     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x0032
                com.yandex.metrica.impl.ob.U1 r1 = com.yandex.metrica.impl.ob.U1.this     // Catch:{ InterruptedException -> 0x0029 }
                java.lang.Object r1 = r1.f5067c     // Catch:{ InterruptedException -> 0x0029 }
                r2 = 5000(0x1388, double:2.4703E-320)
                r4 = 0
                r1.wait(r2, r4)     // Catch:{ InterruptedException -> 0x0029 }
                goto L_0x0032
            L_0x0029:
                com.yandex.metrica.impl.ob.U1 r1 = com.yandex.metrica.impl.ob.U1.this     // Catch:{ all -> 0x0035 }
                java.lang.Object r1 = r1.f5067c     // Catch:{ all -> 0x0035 }
                r1.notifyAll()     // Catch:{ all -> 0x0035 }
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                r0 = 1
                return r0
            L_0x0035:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.U1.g.b():boolean");
        }

        /* synthetic */ g(U1 u1, a aVar) {
            this();
        }
    }

    class h extends g {

        /* renamed from: b  reason: collision with root package name */
        private final int f5085b;

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f5086c;

        h(U1 u1, int i, Bundle bundle) {
            super(u1, (a) null);
            this.f5085b = i;
            this.f5086c = bundle;
        }

        /* access modifiers changed from: package-private */
        public void a(IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.a(this.f5085b, this.f5086c);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U1(com.yandex.metrica.impl.ob.P0 r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.ob.P.g()
            com.yandex.metrica.impl.ob.Im r0 = r0.d()
            com.yandex.metrica.core.api.executors.ICommonExecutor r0 = r0.d()
            com.yandex.metrica.impl.ob.n6 r1 = new com.yandex.metrica.impl.ob.n6
            com.yandex.metrica.impl.ob.T1 r4 = (com.yandex.metrica.impl.ob.T1) r4
            android.content.Context r2 = r4.a()
            r1.<init>(r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.U1.<init>(com.yandex.metrica.impl.ob.P0):void");
    }

    public void onServiceConnected() {
        synchronized (this.f5067c) {
            this.f5067c.notifyAll();
        }
    }

    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(A3 a3) {
        return this.f5068d.submit(new b(a3));
    }

    public Future<Void> queueReport(f fVar) {
        Callable callable;
        ICommonExecutor iCommonExecutor = this.f5068d;
        if (fVar.d()) {
            callable = new c(fVar, P.g().h());
        } else {
            callable = new d(fVar);
        }
        return iCommonExecutor.submit(callable);
    }

    public Future<Void> queueResumeUserSession(A3 a3) {
        return this.f5068d.submit(new a(a3));
    }

    public void reportData(int i, Bundle bundle) {
        this.f5068d.submit(new h(this, i, bundle));
    }

    public void sendCrash(f fVar) {
        c cVar = new c(fVar, P.g().h());
        if (this.f5066b.e()) {
            try {
                this.f5068d.submit(cVar).get(4, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!cVar.f5074d) {
            try {
                cVar.a();
            } catch (Throwable unused2) {
            }
        }
    }

    public U1(P0 p0, ICommonExecutor iCommonExecutor, C0573n6 n6Var) {
        this.f5067c = new Object();
        this.f5065a = p0;
        this.f5068d = iCommonExecutor;
        this.f5069e = n6Var;
        C0593o1 c2 = ((T1) p0).c();
        this.f5066b = c2;
        c2.a((C0593o1.c) this);
    }
}
