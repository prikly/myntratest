package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.q1  reason: case insensitive filesystem */
public class C0642q1 implements C0618p1 {

    /* renamed from: a  reason: collision with root package name */
    private ICommonExecutor f6507a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C0618p1 f6508b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0369f1 f6509c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f6510d;

    /* renamed from: com.yandex.metrica.impl.ob.q1$a */
    class a extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f6511a;

        a(Bundle bundle) {
            this.f6511a = bundle;
        }

        public void a() throws Exception {
            C0642q1.this.f6508b.b(this.f6511a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$b */
    class b extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f6513a;

        b(Bundle bundle) {
            this.f6513a = bundle;
        }

        public void a() throws Exception {
            C0642q1.this.f6508b.a(this.f6513a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$c */
    class c extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Configuration f6515a;

        c(Configuration configuration) {
            this.f6515a = configuration;
        }

        public void a() throws Exception {
            C0642q1.this.f6508b.onConfigurationChanged(this.f6515a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$d */
    class d extends C0365em {
        d() {
        }

        public void a() {
            synchronized (C0642q1.this) {
                if (C0642q1.this.f6510d) {
                    C0642q1.this.f6509c.e();
                    C0642q1.this.f6508b.a();
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$e */
    class e extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f6518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6519b;

        e(Intent intent, int i) {
            this.f6518a = intent;
            this.f6519b = i;
        }

        public void a() {
            C0642q1.this.f6508b.a(this.f6518a, this.f6519b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$f */
    class f extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f6521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6523c;

        f(Intent intent, int i, int i2) {
            this.f6521a = intent;
            this.f6522b = i;
            this.f6523c = i2;
        }

        public void a() {
            C0642q1.this.f6508b.a(this.f6521a, this.f6522b, this.f6523c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$g */
    class g extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f6525a;

        g(Intent intent) {
            this.f6525a = intent;
        }

        public void a() {
            C0642q1.this.f6508b.a(this.f6525a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$h */
    class h extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f6527a;

        h(Intent intent) {
            this.f6527a = intent;
        }

        public void a() {
            C0642q1.this.f6508b.c(this.f6527a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$i */
    class i extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f6529a;

        i(Intent intent) {
            this.f6529a = intent;
        }

        public void a() {
            C0642q1.this.f6508b.b(this.f6529a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$j */
    class j extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f6533c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f6534d;

        j(String str, int i, String str2, Bundle bundle) {
            this.f6531a = str;
            this.f6532b = i;
            this.f6533c = str2;
            this.f6534d = bundle;
        }

        public void a() throws RemoteException {
            C0642q1.this.f6508b.a(this.f6531a, this.f6532b, this.f6533c, this.f6534d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$k */
    class k extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f6536a;

        k(Bundle bundle) {
            this.f6536a = bundle;
        }

        public void a() throws Exception {
            C0642q1.this.f6508b.reportData(this.f6536a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$l */
    class l extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6538a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f6539b;

        l(int i, Bundle bundle) {
            this.f6538a = i;
            this.f6539b = bundle;
        }

        public void a() throws Exception {
            C0642q1.this.f6508b.a(this.f6538a, this.f6539b);
        }
    }

    public C0642q1(C0618p1 p1Var) {
        this(F0.g().q().c(), p1Var, F0.g().h());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f6507a.execute(new c(configuration));
    }

    public void reportData(Bundle bundle) {
        this.f6507a.execute(new k(bundle));
    }

    public synchronized void a() {
        this.f6510d = true;
        this.f6507a.execute(new d());
    }

    public void b(Intent intent) {
        this.f6507a.execute(new i(intent));
    }

    public void c(Intent intent) {
        this.f6507a.execute(new h(intent));
    }

    public void b() {
        this.f6507a.removeAll();
        synchronized (this) {
            this.f6509c.f();
            this.f6510d = false;
        }
        this.f6508b.b();
    }

    public void a(Intent intent, int i2) {
        this.f6507a.execute(new e(intent, i2));
    }

    C0642q1(ICommonExecutor iCommonExecutor, C0618p1 p1Var, C0369f1 f1Var) {
        this.f6510d = false;
        this.f6507a = iCommonExecutor;
        this.f6508b = p1Var;
        this.f6509c = f1Var;
    }

    public void a(Intent intent, int i2, int i3) {
        this.f6507a.execute(new f(intent, i2, i3));
    }

    public void a(Intent intent) {
        this.f6507a.execute(new g(intent));
    }

    public void a(String str, int i2, String str2, Bundle bundle) {
        this.f6507a.execute(new j(str, i2, str2, bundle));
    }

    public void a(int i2, Bundle bundle) {
        this.f6507a.execute(new l(i2, bundle));
    }

    public void a(Bundle bundle) {
        this.f6507a.execute(new b(bundle));
    }

    public void a(MetricaService.d dVar) {
        this.f6508b.a(dVar);
    }

    public void b(Bundle bundle) {
        this.f6507a.execute(new a(bundle));
    }
}
