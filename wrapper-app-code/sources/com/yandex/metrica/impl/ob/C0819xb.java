package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.appodeal.ads.AppodealNetworks;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.xb  reason: case insensitive filesystem */
public class C0819xb implements Eb {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7089a;

    /* renamed from: b  reason: collision with root package name */
    private C0635pi f7090b;

    /* renamed from: c  reason: collision with root package name */
    private volatile FutureTask<Void> f7091c;

    /* renamed from: d  reason: collision with root package name */
    private final g f7092d;

    /* renamed from: e  reason: collision with root package name */
    private final g f7093e;

    /* renamed from: f  reason: collision with root package name */
    private final g f7094f;

    /* renamed from: g  reason: collision with root package name */
    private final C0771vb f7095g;

    /* renamed from: h  reason: collision with root package name */
    private final C0771vb f7096h;
    private final C0771vb i;
    /* access modifiers changed from: private */
    public Context j;
    private ICommonExecutor k;
    /* access modifiers changed from: private */
    public volatile C0867zb l;

    /* renamed from: com.yandex.metrica.impl.ob.xb$a */
    class a implements Callable<Void> {
        a() {
        }

        public Object call() throws Exception {
            C0819xb xbVar = C0819xb.this;
            C0747ub a2 = C0819xb.a(xbVar, xbVar.j);
            C0819xb xbVar2 = C0819xb.this;
            C0747ub b2 = C0819xb.b(xbVar2, xbVar2.j);
            C0819xb xbVar3 = C0819xb.this;
            C0867zb unused = xbVar.l = new C0867zb(a2, b2, C0819xb.a(xbVar3, xbVar3.j, (Gb) new Fb()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$b */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Gb f7099b;

        b(Context context, Gb gb) {
            this.f7098a = context;
            this.f7099b = gb;
        }

        public Object call() throws Exception {
            C0867zb a2 = C0819xb.this.l;
            C0819xb xbVar = C0819xb.this;
            C0747ub a3 = C0819xb.a(xbVar, C0819xb.a(xbVar, this.f7098a), a2.a());
            C0819xb xbVar2 = C0819xb.this;
            C0747ub a4 = C0819xb.a(xbVar2, C0819xb.b(xbVar2, this.f7098a), a2.b());
            C0819xb xbVar3 = C0819xb.this;
            C0867zb unused = xbVar.l = new C0867zb(a3, a4, C0819xb.a(xbVar3, C0819xb.a(xbVar3, this.f7098a, this.f7099b), a2.c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$c */
    public static class c implements g {
        public boolean a(C0635pi piVar) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$d */
    public static class d implements g {
        public boolean a(C0635pi piVar) {
            return piVar != null && (piVar.f().v || !piVar.q());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$e */
    public static class e implements g {
        public boolean a(C0635pi piVar) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$f */
    public static class f implements g {
        public boolean a(C0635pi piVar) {
            return piVar != null && piVar.f().v;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$g */
    interface g {
        boolean a(C0635pi piVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$h */
    public static class h implements g {
        public boolean a(C0635pi piVar) {
            return piVar != null && (piVar.f().n || !piVar.q());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$i */
    public static class i implements g {
        public boolean a(C0635pi piVar) {
            return piVar != null && piVar.f().n;
        }
    }

    public C0819xb(g gVar, g gVar2, g gVar3, ICommonExecutor iCommonExecutor, String str) {
        this(gVar, gVar2, gVar3, iCommonExecutor, new C0795wb(new Kb("google")), new C0795wb(new Kb("huawei")), new C0795wb(new Kb(AppodealNetworks.YANDEX)), str);
    }

    static C0747ub a(C0819xb xbVar, C0747ub ubVar, C0747ub ubVar2) {
        xbVar.getClass();
        U0 u0 = ubVar.f6882b;
        return u0 != U0.OK ? new C0747ub(ubVar2.f6881a, u0, ubVar.f6883c) : ubVar;
    }

    public void c(Context context) {
        this.j = context.getApplicationContext();
    }

    C0819xb(g gVar, g gVar2, g gVar3, ICommonExecutor iCommonExecutor, C0771vb vbVar, C0771vb vbVar2, C0771vb vbVar3, String str) {
        this.f7089a = new Object();
        this.f7092d = gVar;
        this.f7093e = gVar2;
        this.f7094f = gVar3;
        this.f7095g = vbVar;
        this.f7096h = vbVar2;
        this.i = vbVar3;
        this.k = iCommonExecutor;
        this.l = new C0867zb();
    }

    private void c() {
        boolean z;
        if (this.j != null) {
            synchronized (this) {
                U0 u0 = this.l.a().f6882b;
                U0 u02 = U0.UNKNOWN;
                z = (u0 == u02 || this.l.b().f6882b == u02) ? false : true;
            }
            if (!z) {
                a(this.j);
            }
        }
    }

    public void b(Context context) {
        this.j = context.getApplicationContext();
        if (this.f7091c == null) {
            synchronized (this.f7089a) {
                if (this.f7091c == null) {
                    this.f7091c = new FutureTask<>(new a());
                    this.k.execute(this.f7091c);
                }
            }
        }
    }

    static C0747ub b(C0819xb xbVar, Context context) {
        if (xbVar.f7093e.a(xbVar.f7090b)) {
            return xbVar.f7096h.a(context);
        }
        C0635pi piVar = xbVar.f7090b;
        if (piVar == null || !piVar.q()) {
            return new C0747ub((C0723tb) null, U0.NO_STARTUP, "startup has not been received yet");
        }
        if (!xbVar.f7090b.f().v) {
            return new C0747ub((C0723tb) null, U0.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
        }
        return new C0747ub((C0723tb) null, U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Deprecated
    public Boolean b() {
        c();
        C0723tb tbVar = this.l.a().f6881a;
        if (tbVar == null) {
            return null;
        }
        return tbVar.f6826c;
    }

    public void a(Context context, C0635pi piVar) {
        this.f7090b = piVar;
        b(context);
    }

    public void a(C0635pi piVar) {
        this.f7090b = piVar;
    }

    public C0867zb a(Context context) {
        b(context);
        try {
            this.f7091c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.l;
    }

    public C0867zb a(Context context, Gb gb) {
        FutureTask futureTask = new FutureTask(new b(context.getApplicationContext(), gb));
        this.k.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.l;
    }

    static C0747ub a(C0819xb xbVar, Context context) {
        if (xbVar.f7092d.a(xbVar.f7090b)) {
            return xbVar.f7095g.a(context);
        }
        C0635pi piVar = xbVar.f7090b;
        if (piVar == null || !piVar.q()) {
            return new C0747ub((C0723tb) null, U0.NO_STARTUP, "startup has not been received yet");
        }
        if (!xbVar.f7090b.f().n) {
            return new C0747ub((C0723tb) null, U0.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
        }
        return new C0747ub((C0723tb) null, U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    static C0747ub a(C0819xb xbVar, Context context, Gb gb) {
        if (xbVar.f7094f.a(xbVar.f7090b)) {
            return xbVar.i.a(context, gb);
        }
        return new C0747ub((C0723tb) null, U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Deprecated
    public String a() {
        c();
        C0723tb tbVar = this.l.a().f6881a;
        if (tbVar == null) {
            return null;
        }
        return tbVar.f6825b;
    }
}
