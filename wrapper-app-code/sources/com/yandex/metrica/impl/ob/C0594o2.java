package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0640q;
import com.yandex.metrica.impl.ob.r;

/* renamed from: com.yandex.metrica.impl.ob.o2  reason: case insensitive filesystem */
public class C0594o2 {

    /* renamed from: a  reason: collision with root package name */
    private final C0640q f6378a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Ll<C0468j1> f6379b;

    /* renamed from: c  reason: collision with root package name */
    private final C0640q.b f6380c;

    /* renamed from: d  reason: collision with root package name */
    private final C0640q.b f6381d;

    /* renamed from: e  reason: collision with root package name */
    private final r f6382e;

    /* renamed from: f  reason: collision with root package name */
    private final C0616p f6383f;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    class a implements C0640q.b {

        /* renamed from: com.yandex.metrica.impl.ob.o2$a$a  reason: collision with other inner class name */
        class C0054a implements E1<C0468j1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f6385a;

            C0054a(Activity activity) {
                this.f6385a = activity;
            }

            public void b(Object obj) {
                C0594o2.a(C0594o2.this, this.f6385a, (C0468j1) obj);
            }
        }

        a() {
        }

        public void a(Activity activity, C0640q.a aVar) {
            C0594o2.this.f6379b.a(new C0054a(activity));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    class b implements C0640q.b {

        /* renamed from: com.yandex.metrica.impl.ob.o2$b$a */
        class a implements E1<C0468j1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f6388a;

            a(Activity activity) {
                this.f6388a = activity;
            }

            public void b(Object obj) {
                C0594o2.b(C0594o2.this, this.f6388a, (C0468j1) obj);
            }
        }

        b() {
        }

        public void a(Activity activity, C0640q.a aVar) {
            C0594o2.this.f6379b.a(new a(activity));
        }
    }

    public C0594o2(C0640q qVar, ICommonExecutor iCommonExecutor, C0616p pVar) {
        this(qVar, pVar, new Ll(iCommonExecutor), new r());
    }

    public void b(Activity activity, K0 k0) {
        if (activity != null) {
            this.f6383f.a(activity);
        }
        if (this.f6382e.a(activity, r.a.RESUMED)) {
            k0.a(activity);
        }
    }

    C0594o2(C0640q qVar, C0616p pVar, Ll<C0468j1> ll, r rVar) {
        this.f6378a = qVar;
        this.f6383f = pVar;
        this.f6379b = ll;
        this.f6382e = rVar;
        this.f6380c = new a();
        this.f6381d = new b();
    }

    public C0640q.c a() {
        this.f6378a.a(this.f6380c, C0640q.a.RESUMED);
        this.f6378a.a(this.f6381d, C0640q.a.PAUSED);
        return this.f6378a.a();
    }

    static void b(C0594o2 o2Var, Activity activity, K0 k0) {
        if (o2Var.f6382e.a(activity, r.a.PAUSED)) {
            ((C0468j1) k0).b(activity);
        }
    }

    public void a(Activity activity, K0 k0) {
        if (activity != null) {
            this.f6383f.a(activity);
        }
        if (this.f6382e.a(activity, r.a.PAUSED)) {
            k0.b(activity);
        }
    }

    public void a(C0468j1 j1Var) {
        this.f6379b.a(j1Var);
    }

    static void a(C0594o2 o2Var, Activity activity, K0 k0) {
        if (o2Var.f6382e.a(activity, r.a.RESUMED)) {
            ((C0468j1) k0).a(activity);
        }
    }
}
