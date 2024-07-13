package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0687s;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class K3 {

    /* renamed from: a  reason: collision with root package name */
    private final L3 f4391a;

    /* renamed from: b  reason: collision with root package name */
    private final Id f4392b;

    /* renamed from: c  reason: collision with root package name */
    private List<j> f4393c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final L3 f4394a;

        public b(L3 l3) {
            this.f4394a = l3;
        }

        /* access modifiers changed from: package-private */
        public K3 a(Id id) {
            return new K3(this.f4394a, id);
        }
    }

    static class c extends j {

        /* renamed from: b  reason: collision with root package name */
        private final Md f4395b;

        /* renamed from: c  reason: collision with root package name */
        private final C0302c9 f4396c;

        c(L3 l3) {
            super(l3);
            this.f4395b = new Md(l3.g(), l3.e().toString());
            this.f4396c = l3.f();
        }

        /* access modifiers changed from: protected */
        public void b() {
            C0349e6 e6Var = new C0349e6(this.f4396c, "background");
            if (!e6Var.h()) {
                long c2 = this.f4395b.c(-1);
                if (c2 != -1) {
                    e6Var.d(c2);
                }
                long a2 = this.f4395b.a(Long.MIN_VALUE);
                if (a2 != Long.MIN_VALUE) {
                    e6Var.a(a2);
                }
                long b2 = this.f4395b.b(0);
                if (b2 != 0) {
                    e6Var.c(b2);
                }
                long d2 = this.f4395b.d(0);
                if (d2 != 0) {
                    e6Var.e(d2);
                }
                e6Var.b();
            }
            C0349e6 e6Var2 = new C0349e6(this.f4396c, "foreground");
            if (!e6Var2.h()) {
                long g2 = this.f4395b.g(-1);
                if (-1 != g2) {
                    e6Var2.d(g2);
                }
                boolean booleanValue = this.f4395b.a(true).booleanValue();
                if (booleanValue) {
                    e6Var2.a(booleanValue);
                }
                long e2 = this.f4395b.e(Long.MIN_VALUE);
                if (e2 != Long.MIN_VALUE) {
                    e6Var2.a(e2);
                }
                long f2 = this.f4395b.f(0);
                if (f2 != 0) {
                    e6Var2.c(f2);
                }
                long h2 = this.f4395b.h(0);
                if (h2 != 0) {
                    e6Var2.e(h2);
                }
                e6Var2.b();
            }
            C0687s.a f3 = this.f4395b.f();
            if (f3 != null) {
                this.f4396c.a(f3);
            }
            String b3 = this.f4395b.b((String) null);
            if (!TextUtils.isEmpty(b3) && TextUtils.isEmpty(this.f4396c.n())) {
                this.f4396c.j(b3);
            }
            long i = this.f4395b.i(Long.MIN_VALUE);
            if (i != Long.MIN_VALUE && this.f4396c.b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f4396c.c(i);
            }
            this.f4395b.h();
            this.f4396c.d();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return this.f4395b.g();
        }
    }

    static class d extends k {
        d(L3 l3, Id id) {
            super(l3, id);
        }

        /* access modifiers changed from: protected */
        public void b() {
            d().a();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return a() instanceof U3;
        }
    }

    static class e extends j {

        /* renamed from: b  reason: collision with root package name */
        private final Jd f4397b;

        /* renamed from: c  reason: collision with root package name */
        private final C0252a9 f4398c;

        e(L3 l3, Jd jd) {
            super(l3);
            this.f4397b = jd;
            this.f4398c = l3.o();
        }

        /* access modifiers changed from: protected */
        public void b() {
            if ("DONE".equals(this.f4397b.c((String) null))) {
                this.f4398c.j();
            }
            if ("DONE".equals(this.f4397b.d((String) null))) {
                this.f4398c.k();
            }
            this.f4397b.h();
            this.f4397b.g();
            this.f4397b.i();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return "DONE".equals(this.f4397b.c((String) null)) || "DONE".equals(this.f4397b.d((String) null));
        }
    }

    static class f extends k {
        f(L3 l3, Id id) {
            super(l3, id);
        }

        /* access modifiers changed from: protected */
        public void b() {
            Id d2 = d();
            if (a() instanceof U3) {
                d2.b();
            } else {
                d2.c();
            }
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return a().o().g((String) null) == null;
        }
    }

    static class g extends j {

        /* renamed from: b  reason: collision with root package name */
        private final C0352e9 f4399b;

        g(L3 l3, C0352e9 e9Var) {
            super(l3);
            this.f4399b = e9Var;
        }

        /* access modifiers changed from: protected */
        public void b() {
            if (this.f4399b.a(new Rd("REFERRER_HANDLED", (String) null).a(), false)) {
                a().f().q();
            }
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return true;
        }
    }

    static class h extends j {
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        static final Rd f4400c = new Rd("SESSION_SLEEP_START", (String) null);
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        static final Rd f4401d = new Rd("SESSION_ID", (String) null);
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        static final Rd f4402e = new Rd("SESSION_COUNTER_ID", (String) null);
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        static final Rd f4403f = new Rd("SESSION_INIT_TIME", (String) null);
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        static final Rd f4404g = new Rd("SESSION_IS_ALIVE_REPORT_NEEDED", (String) null);
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        static final Rd f4405h = new Rd("BG_SESSION_ID", (String) null);
        @Deprecated
        static final Rd i = new Rd("BG_SESSION_SLEEP_START", (String) null);
        @Deprecated
        static final Rd j = new Rd("BG_SESSION_COUNTER_ID", (String) null);
        @Deprecated
        static final Rd k = new Rd("BG_SESSION_INIT_TIME", (String) null);
        @Deprecated
        static final Rd l = new Rd("BG_SESSION_IS_ALIVE_REPORT_NEEDED", (String) null);

        /* renamed from: b  reason: collision with root package name */
        private final C0302c9 f4406b;

        h(L3 l3) {
            super(l3);
            this.f4406b = l3.f();
        }

        /* access modifiers changed from: protected */
        public void b() {
            C0302c9 c9Var = this.f4406b;
            Rd rd = i;
            long a2 = c9Var.a(rd.a(), -2147483648L);
            if (a2 != -2147483648L) {
                C0349e6 e6Var = new C0349e6(this.f4406b, "background");
                if (!e6Var.h()) {
                    if (a2 != 0) {
                        e6Var.e(a2);
                    }
                    long a3 = this.f4406b.a(f4405h.a(), -1);
                    if (a3 != -1) {
                        e6Var.d(a3);
                    }
                    boolean a4 = this.f4406b.a(l.a(), true);
                    if (a4) {
                        e6Var.a(a4);
                    }
                    long a5 = this.f4406b.a(k.a(), Long.MIN_VALUE);
                    if (a5 != Long.MIN_VALUE) {
                        e6Var.a(a5);
                    }
                    long a6 = this.f4406b.a(j.a(), 0);
                    if (a6 != 0) {
                        e6Var.c(a6);
                    }
                    e6Var.b();
                }
            }
            C0302c9 c9Var2 = this.f4406b;
            Rd rd2 = f4400c;
            long a7 = c9Var2.a(rd2.a(), -2147483648L);
            if (a7 != -2147483648L) {
                C0349e6 e6Var2 = new C0349e6(this.f4406b, "foreground");
                if (!e6Var2.h()) {
                    if (a7 != 0) {
                        e6Var2.e(a7);
                    }
                    long a8 = this.f4406b.a(f4401d.a(), -1);
                    if (-1 != a8) {
                        e6Var2.d(a8);
                    }
                    boolean a9 = this.f4406b.a(f4404g.a(), true);
                    if (a9) {
                        e6Var2.a(a9);
                    }
                    long a10 = this.f4406b.a(f4403f.a(), Long.MIN_VALUE);
                    if (a10 != Long.MIN_VALUE) {
                        e6Var2.a(a10);
                    }
                    long a11 = this.f4406b.a(f4402e.a(), 0);
                    if (a11 != 0) {
                        e6Var2.c(a11);
                    }
                    e6Var2.b();
                }
            }
            this.f4406b.f(rd2.a());
            this.f4406b.f(f4401d.a());
            this.f4406b.f(f4402e.a());
            this.f4406b.f(f4403f.a());
            this.f4406b.f(f4404g.a());
            this.f4406b.f(f4405h.a());
            this.f4406b.f(rd.a());
            this.f4406b.f(j.a());
            this.f4406b.f(k.a());
            this.f4406b.f(l.a());
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return true;
        }
    }

    static class i extends j {

        /* renamed from: b  reason: collision with root package name */
        private final C0252a9 f4407b;

        /* renamed from: c  reason: collision with root package name */
        private final C0302c9 f4408c;

        /* renamed from: d  reason: collision with root package name */
        private final C0276b8 f4409d;

        /* renamed from: e  reason: collision with root package name */
        private final String f4410e = new Rd("LAST_REQUEST_ID").a();

        /* renamed from: f  reason: collision with root package name */
        private final String f4411f = new Rd("NEXT_EVENT_GLOBAL_NUMBER").a();

        /* renamed from: g  reason: collision with root package name */
        private final String f4412g = new Rd("CURRENT_SESSION_ID").a();

        /* renamed from: h  reason: collision with root package name */
        private final String f4413h = new Rd("ATTRIBUTION_ID").a();
        private final String i = new Rd("OPEN_ID").a();

        i(L3 l3) {
            super(l3);
            this.f4407b = l3.o();
            this.f4408c = l3.f();
            this.f4409d = l3.x();
        }

        /* access modifiers changed from: protected */
        public void b() {
            JSONObject jSONObject = new JSONObject();
            for (String next : this.f4408c.e()) {
                if (next.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(next.substring(21))), this.f4408c.a(next, 0));
                        this.f4408c.f(next);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f4409d.a(this.f4407b.f(), this.f4407b.g(), this.f4408c.c(this.f4410e) ? Integer.valueOf(this.f4408c.a(this.f4410e, -1)) : null, this.f4408c.c(this.f4411f) ? Integer.valueOf(this.f4408c.a(this.f4411f, 0)) : null, this.f4408c.c(this.f4412g) ? Long.valueOf(this.f4408c.a(this.f4412g, -1)) : null, this.f4408c.t(), jSONObject, this.f4408c.c(this.i) ? Integer.valueOf(this.f4408c.a(this.i, 1)) : null, this.f4408c.c(this.f4413h) ? Integer.valueOf(this.f4408c.a(this.f4413h, 1)) : null, this.f4408c.j());
            this.f4407b.h().i().d();
            this.f4408c.s().r().f(this.f4410e).f(this.f4411f).f(this.f4412g).f(this.f4413h).f(this.i).d();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return true;
        }
    }

    static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        private final L3 f4414a;

        j(L3 l3) {
            this.f4414a = l3;
        }

        /* access modifiers changed from: package-private */
        public L3 a() {
            return this.f4414a;
        }

        /* access modifiers changed from: protected */
        public abstract void b();

        /* access modifiers changed from: protected */
        public abstract boolean c();
    }

    private static abstract class k extends j {

        /* renamed from: b  reason: collision with root package name */
        private Id f4415b;

        k(L3 l3, Id id) {
            super(l3);
            this.f4415b = id;
        }

        public Id d() {
            return this.f4415b;
        }
    }

    static class l extends j {

        /* renamed from: b  reason: collision with root package name */
        private final C0252a9 f4416b;

        l(L3 l3) {
            super(l3);
            this.f4416b = l3.o();
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.f4416b.f(new Rd("first_event_description_key", (String) null).a()).d();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            return true;
        }
    }

    private void b() {
        LinkedList linkedList = new LinkedList();
        this.f4393c = linkedList;
        linkedList.add(new d(this.f4391a, this.f4392b));
        this.f4393c.add(new f(this.f4391a, this.f4392b));
        List<j> list = this.f4393c;
        L3 l3 = this.f4391a;
        list.add(new e(l3, l3.n()));
        this.f4393c.add(new c(this.f4391a));
        this.f4393c.add(new h(this.f4391a));
        List<j> list2 = this.f4393c;
        L3 l32 = this.f4391a;
        list2.add(new g(l32, l32.t()));
        this.f4393c.add(new l(this.f4391a));
        this.f4393c.add(new i(this.f4391a));
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!Id.f4136b.values().contains(this.f4391a.e().a())) {
            for (j next : this.f4393c) {
                if (next.c()) {
                    next.b();
                }
            }
        }
    }

    private K3(L3 l3, Id id) {
        this.f4391a = l3;
        this.f4392b = id;
        b();
    }
}
