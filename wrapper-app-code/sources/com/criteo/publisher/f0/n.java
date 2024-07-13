package com.criteo.publisher.f0;

import com.criteo.publisher.f0.a;
import com.criteo.publisher.f0.e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: Metric */
public abstract class n {
    /* access modifiers changed from: package-private */
    public abstract Long b();

    /* access modifiers changed from: package-private */
    public abstract Long c();

    /* access modifiers changed from: package-private */
    public abstract Long d();

    /* access modifiers changed from: package-private */
    public abstract String e();

    /* access modifiers changed from: package-private */
    public abstract Integer f();

    /* access modifiers changed from: package-private */
    public abstract String g();

    /* access modifiers changed from: package-private */
    public abstract Integer h();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();

    /* access modifiers changed from: package-private */
    public abstract boolean k();

    /* access modifiers changed from: package-private */
    public abstract a l();

    public static a a(String str) {
        return a().a(str);
    }

    public static TypeAdapter<n> a(Gson gson) {
        return new e.a(gson);
    }

    /* compiled from: Metric */
    static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract a a(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a a(Long l);

        /* access modifiers changed from: package-private */
        @Deprecated
        public abstract a a(String str);

        /* access modifiers changed from: package-private */
        public abstract a a(boolean z);

        /* access modifiers changed from: package-private */
        public abstract n a();

        /* access modifiers changed from: package-private */
        public abstract a b(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a b(Long l);

        /* access modifiers changed from: package-private */
        public abstract a b(String str);

        /* access modifiers changed from: package-private */
        public abstract a b(boolean z);

        /* access modifiers changed from: package-private */
        public abstract a c(Long l);

        /* access modifiers changed from: package-private */
        public abstract a c(boolean z);

        a() {
        }
    }

    @Deprecated
    public static a a() {
        return new a.b().c(false).b(false).a(false);
    }
}
