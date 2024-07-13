package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.ob.D1;
import java.util.Map;

public class O extends D1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0277b9 f4628a;

    class a extends SparseArray<D1.a> {
        a() {
            put(47, new c(O.this.f4628a));
            put(66, new d(O.this, O.this.f4628a));
            put(89, new b(O.this.f4628a));
            put(99, new e(O.this.f4628a));
            put(105, new f(O.this.f4628a));
        }
    }

    private class d implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0277b9 f4632a;

        public d(O o, C0277b9 b9Var) {
            this.f4632a = b9Var;
        }

        public void a(Context context) {
            this.f4632a.f(new Rd("COOKIE_BROWSERS", (String) null).a());
            this.f4632a.f(new Rd("BIND_ID_URL", (String) null).a());
            L0.a(context, "b_meta.dat");
            L0.a(context, "browsers.dat");
        }
    }

    static class e implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0277b9 f4633a;

        e(C0277b9 b9Var) {
            this.f4633a = b9Var;
        }

        public void a(Context context) {
            this.f4633a.f(new Rd("DEVICE_ID_POSSIBLE", (String) null).a()).d();
        }
    }

    static class f implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0277b9 f4634a;

        f(C0277b9 b9Var) {
            this.f4634a = b9Var;
        }

        public void a(Context context) {
            this.f4634a.f(new Rd("STARTUP_REQUEST_TIME", (String) null).a()).d();
        }
    }

    public O(Context context) {
        this(new C0277b9(C0477ja.a(context).d()));
    }

    /* access modifiers changed from: package-private */
    public SparseArray<D1.a> a() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public int a(Nd nd) {
        return (int) this.f4628a.b(-1);
    }

    O(C0277b9 b9Var) {
        this.f4628a = b9Var;
    }

    /* access modifiers changed from: protected */
    public void a(Nd nd, int i) {
        this.f4628a.e((long) i);
        nd.g().b();
    }

    static class b implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0277b9 f4630a;

        b(C0277b9 b9Var) {
            this.f4630a = b9Var;
        }

        public void a(Context context) {
            String l = this.f4630a.l((String) null);
            String n = this.f4630a.n((String) null);
            String m = this.f4630a.m((String) null);
            String g2 = this.f4630a.g((String) null);
            String h2 = this.f4630a.h((String) null);
            String j = this.f4630a.j((String) null);
            this.f4630a.e(a(l));
            this.f4630a.i(a(n));
            this.f4630a.d(a(m));
            this.f4630a.a(a(g2));
            this.f4630a.b(a(h2));
            this.f4630a.h(a(j));
        }

        private W0 a(String str) {
            boolean isEmpty = TextUtils.isEmpty(str);
            return new W0(str, isEmpty ? U0.UNKNOWN : U0.OK, isEmpty ? "no identifier saved in previous version" : null);
        }
    }

    static class c implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private C0277b9 f4631a;

        public c(C0277b9 b9Var) {
            this.f4631a = b9Var;
        }

        public void a(Context context) {
            Ld ld = new Ld(context);
            if (A2.b((Map) ld.g())) {
                return;
            }
            if (this.f4631a.n((String) null) == null || this.f4631a.l((String) null) == null) {
                String e2 = ld.e((String) null);
                if (a(e2, this.f4631a.l((String) null))) {
                    this.f4631a.s(e2);
                }
                String f2 = ld.f((String) null);
                if (a(f2, this.f4631a.n((String) null))) {
                    this.f4631a.t(f2);
                }
                String b2 = ld.b((String) null);
                if (a(b2, this.f4631a.g((String) null))) {
                    this.f4631a.o(b2);
                }
                String c2 = ld.c((String) null);
                if (a(c2, this.f4631a.h((String) null))) {
                    this.f4631a.p(c2);
                }
                String d2 = ld.d((String) null);
                if (a(d2, this.f4631a.j((String) null))) {
                    this.f4631a.q(d2);
                }
                long a2 = ld.a(-1);
                if (a2 != -1 && this.f4631a.d(-1) == -1) {
                    this.f4631a.h(a2);
                }
                this.f4631a.d();
                ld.f().b();
            }
        }

        private boolean a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
