package com.bytedance.sdk.component.b.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Request */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public i f18929a;

    public abstract Object a();

    public abstract f b();

    public abstract String c();

    public abstract Map<String, List<String>> d();

    public abstract a e();

    public l f() {
        return null;
    }

    public void a(i iVar) {
        this.f18929a = iVar;
    }

    public a g() {
        return new a(this);
    }

    /* compiled from: Request */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        a f18930a;

        /* renamed from: b  reason: collision with root package name */
        Map<String, List<String>> f18931b;

        /* renamed from: c  reason: collision with root package name */
        f f18932c;

        /* renamed from: d  reason: collision with root package name */
        String f18933d;

        /* renamed from: e  reason: collision with root package name */
        Object f18934e;

        /* renamed from: f  reason: collision with root package name */
        l f18935f;

        public a() {
            this.f18931b = new HashMap();
        }

        public a a(a aVar) {
            this.f18930a = aVar;
            return this;
        }

        a(k kVar) {
            this.f18932c = kVar.b();
            this.f18933d = kVar.c();
            this.f18931b = kVar.d();
            this.f18934e = kVar.a();
            this.f18935f = kVar.f();
            this.f18930a = kVar.e();
        }

        public a a(Object obj) {
            this.f18934e = obj;
            return this;
        }

        public a a(String str) {
            return a(f.c(str));
        }

        public a a(f fVar) {
            this.f18932c = fVar;
            return this;
        }

        public a a(String str, String str2) {
            return b(str, str2);
        }

        public a b(String str, String str2) {
            if (!this.f18931b.containsKey(str)) {
                this.f18931b.put(str, new ArrayList());
            }
            this.f18931b.get(str).add(str2);
            return this;
        }

        public a a() {
            return a("GET", (l) null);
        }

        private a a(String str, l lVar) {
            this.f18933d = str;
            this.f18935f = lVar;
            return this;
        }

        public a a(l lVar) {
            return a("POST", lVar);
        }

        public k b() {
            return new k() {
                public String toString() {
                    return "";
                }

                public Object a() {
                    return a.this.f18934e;
                }

                public f b() {
                    return a.this.f18932c;
                }

                public String c() {
                    return a.this.f18933d;
                }

                public Map d() {
                    return a.this.f18931b;
                }

                public a e() {
                    return a.this.f18930a;
                }

                public l f() {
                    return a.this.f18935f;
                }
            };
        }
    }
}
