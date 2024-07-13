package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.ob.C0635pi;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.vc  reason: case insensitive filesystem */
public class C0772vc {
    private static volatile C0772vc n;
    public static final long o = TimeUnit.MINUTES.toMillis(1);
    private static final Object p = new Object();
    public static final /* synthetic */ int q = 0;

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Object, Object> f6977a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6978b = false;

    /* renamed from: c  reason: collision with root package name */
    private C0554mc f6979c;

    /* renamed from: d  reason: collision with root package name */
    private C0635pi f6980d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Mc f6981e;

    /* renamed from: f  reason: collision with root package name */
    private c f6982f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f6983g;

    /* renamed from: h  reason: collision with root package name */
    private final Sb f6984h;
    private final U7 i;
    private final T7 j;
    private final Ed k;
    private boolean l = false;
    private final Object m = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.vc$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0635pi f6985a;

        a(C0635pi piVar) {
            this.f6985a = piVar;
        }

        public void run() {
            if (C0772vc.this.f6981e != null) {
                C0772vc.this.f6981e.a(this.f6985a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vc$b */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0554mc f6987a;

        b(C0554mc mcVar) {
            this.f6987a = mcVar;
        }

        public void run() {
            if (C0772vc.this.f6981e != null) {
                C0772vc.this.f6981e.a(this.f6987a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vc$c */
    static class c {
        c() {
        }
    }

    C0772vc(Context context, C0796wc wcVar, c cVar, C0635pi piVar) {
        this.f6984h = new Sb(context, wcVar.a(), wcVar.d());
        this.i = wcVar.c();
        this.j = wcVar.b();
        this.k = wcVar.e();
        this.f6977a = new WeakHashMap<>();
        this.f6982f = cVar;
        this.f6980d = piVar;
    }

    public void b(Object obj) {
        synchronized (this.m) {
            this.f6977a.remove(obj);
            b();
        }
    }

    public static C0772vc a(Context context) {
        if (n == null) {
            synchronized (p) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    n = new C0772vc(applicationContext, new C0796wc(applicationContext), new c(), new C0635pi.b(applicationContext).a());
                }
            }
        }
        return n;
    }

    private void b() {
        if (this.l) {
            if (!this.f6978b || this.f6977a.isEmpty()) {
                this.f6984h.f4925b.execute(new C0700sc(this));
                Runnable runnable = this.f6983g;
                if (runnable != null) {
                    this.f6984h.f4925b.remove(runnable);
                }
                this.l = false;
            }
        } else if (this.f6978b && !this.f6977a.isEmpty()) {
            if (this.f6981e == null) {
                c cVar = this.f6982f;
                Nc nc = new Nc(this.f6984h, this.i, this.j, this.f6980d, this.f6979c);
                cVar.getClass();
                this.f6981e = new Mc(nc);
            }
            this.f6984h.f4925b.execute(new C0724tc(this));
            if (this.f6983g == null) {
                C0748uc ucVar = new C0748uc(this);
                this.f6983g = ucVar;
                this.f6984h.f4925b.executeDelayed(ucVar, o);
            }
            this.f6984h.f4925b.execute(new C0676rc(this));
            this.l = true;
        }
    }

    public void a(Object obj) {
        synchronized (this.m) {
            this.f6977a.put(obj, (Object) null);
            b();
        }
    }

    public Location a() {
        Mc mc = this.f6981e;
        if (mc == null) {
            return null;
        }
        return mc.b();
    }

    public void a(boolean z) {
        synchronized (this.m) {
            if (this.f6978b != z) {
                this.f6978b = z;
                this.k.a(z);
                this.f6984h.f4926c.a(this.k.a());
                b();
            }
        }
    }

    public void a(C0635pi piVar, C0554mc mcVar) {
        synchronized (this.m) {
            this.f6980d = piVar;
            this.k.a(piVar);
            this.f6984h.f4926c.a(this.k.a());
            this.f6984h.f4925b.execute(new a(piVar));
            if (!A2.a((Object) this.f6979c, (Object) mcVar)) {
                a(mcVar);
            }
        }
    }

    public void a(C0554mc mcVar) {
        synchronized (this.m) {
            this.f6979c = mcVar;
        }
        this.f6984h.f4925b.execute(new b(mcVar));
    }

    static void b(C0772vc vcVar) {
        vcVar.f6984h.f4925b.executeDelayed(vcVar.f6983g, o);
    }
}
