package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ja  reason: case insensitive filesystem */
public class C0477ja {
    private static volatile C0477ja y;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, O7> f6055a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, S7> f6056b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, R7> f6057c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final M7 f6058d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f6059e;

    /* renamed from: f  reason: collision with root package name */
    private O7 f6060f;

    /* renamed from: g  reason: collision with root package name */
    private O7 f6061g;

    /* renamed from: h  reason: collision with root package name */
    private R7 f6062h;
    private R7 i;
    private R7 j;
    private R7 k;
    private S7 l;
    private S7 m;
    private S7 n;
    private S7 o;
    private S7 p;
    private S7 q;
    private U7 r;
    private T7 s;
    private V7 t;
    private S7 u;
    private C0426h8 v;
    private final B0 w;
    private final C0502ka x;

    public C0477ja(Context context, M7 m7, B0 b0) {
        this.f6059e = context;
        this.f6058d = m7;
        this.w = b0;
        this.x = new C0502ka(context, b0);
    }

    public static C0477ja a(Context context) {
        if (y == null) {
            synchronized (C0477ja.class) {
                if (y == null) {
                    y = new C0477ja(context.getApplicationContext(), C0475j8.a(), new B0());
                }
            }
        }
        return y;
    }

    private R7 k() {
        O7 o7;
        if (this.j == null) {
            synchronized (this) {
                if (this.f6061g == null) {
                    this.f6061g = new O7(this.f6059e, a("metrica_aip.db"), this.f6058d.a());
                }
                o7 = this.f6061g;
            }
            this.j = new C0428ha(new C0451i8(o7), "binary_data");
        }
        return this.j;
    }

    private S7 l() {
        C0426h8 h8Var;
        if (this.p == null) {
            synchronized (this) {
                if (this.v == null) {
                    String a2 = a("metrica_client_data.db");
                    Context context = this.f6059e;
                    this.v = new C0426h8(context, a2, new C0734tm(context, "metrica_client_data.db"), this.f6058d.b());
                }
                h8Var = this.v;
            }
            this.p = new C0527la("preferences", (C0401g8) h8Var);
        }
        return this.p;
    }

    private R7 m() {
        if (this.f6062h == null) {
            this.f6062h = new C0428ha(new C0451i8(r()), "binary_data");
        }
        return this.f6062h;
    }

    public synchronized S7 b(I3 i3) {
        S7 s7;
        String i32 = i3.toString();
        s7 = this.f6056b.get(i32);
        if (s7 == null) {
            s7 = new C0527la(c(i3), "preferences");
            this.f6056b.put(i32, s7);
        }
        return s7;
    }

    public synchronized S7 c() {
        if (this.q == null) {
            this.q = new C0552ma(this.f6059e, W7.CLIENT, l());
        }
        return this.q;
    }

    public synchronized S7 d() {
        return l();
    }

    public synchronized T7 e() {
        if (this.s == null) {
            this.s = new T7(r());
        }
        return this.s;
    }

    public synchronized U7 f() {
        if (this.r == null) {
            this.r = new U7(r());
        }
        return this.r;
    }

    public synchronized S7 g() {
        if (this.u == null) {
            String a2 = a("metrica_multiprocess_data.db");
            Context context = this.f6059e;
            this.u = new C0527la("preferences", (C0401g8) new C0426h8(context, a2, new C0734tm(context, "metrica_multiprocess_data.db"), this.f6058d.d()));
        }
        return this.u;
    }

    public synchronized V7 h() {
        if (this.t == null) {
            this.t = new V7(r(), "permissions");
        }
        return this.t;
    }

    public synchronized S7 i() {
        if (this.m == null) {
            Context context = this.f6059e;
            W7 w7 = W7.SERVICE;
            if (this.l == null) {
                this.l = new C0527la(r(), "preferences");
            }
            this.m = new C0552ma(context, w7, this.l);
        }
        return this.m;
    }

    public synchronized S7 j() {
        if (this.l == null) {
            this.l = new C0527la(r(), "preferences");
        }
        return this.l;
    }

    public synchronized R7 n() {
        if (this.i == null) {
            this.i = new C0453ia(this.f6059e, W7.SERVICE, m());
        }
        return this.i;
    }

    public synchronized R7 o() {
        return m();
    }

    public synchronized S7 p() {
        if (this.o == null) {
            Context context = this.f6059e;
            W7 w7 = W7.SERVICE;
            if (this.n == null) {
                this.n = new C0527la(r(), "startup");
            }
            this.o = new C0552ma(context, w7, this.n);
        }
        return this.o;
    }

    public synchronized S7 q() {
        if (this.n == null) {
            this.n = new C0527la(r(), "startup");
        }
        return this.n;
    }

    public synchronized O7 r() {
        String str;
        if (this.f6060f == null) {
            File c2 = this.w.c(this.f6059e);
            X7 e2 = this.f6058d.e();
            Context context = this.f6059e;
            if (c2 == null || (str = this.x.a("metrica_data.db", c2)) == null) {
                str = a("metrica_data.db");
            }
            this.f6060f = new O7(context, str, e2);
        }
        return this.f6060f;
    }

    public synchronized R7 b() {
        return k();
    }

    public synchronized O7 c(I3 i3) {
        O7 o7;
        String str;
        String str2 = "db_metrica_" + i3;
        o7 = this.f6055a.get(str2);
        if (o7 == null) {
            File c2 = this.w.c(this.f6059e);
            X7 c3 = this.f6058d.c();
            Context context = this.f6059e;
            if (c2 == null || (str = this.x.a(str2, c2)) == null) {
                str = a(str2);
            }
            O7 o72 = new O7(context, str, c3);
            this.f6055a.put(str2, o72);
            o7 = o72;
        }
        return o7;
    }

    public synchronized R7 a(I3 i3) {
        R7 r7;
        String i32 = i3.toString();
        r7 = this.f6057c.get(i32);
        if (r7 == null) {
            r7 = new C0428ha(new C0451i8(c(i3)), "binary_data");
            this.f6057c.put(i32, r7);
        }
        return r7;
    }

    public synchronized R7 a() {
        if (this.k == null) {
            this.k = new C0453ia(this.f6059e, W7.AUTO_INAPP, k());
        }
        return this.k;
    }

    private String a(String str) {
        return A2.a(21) ? this.x.a(str) : str;
    }
}
