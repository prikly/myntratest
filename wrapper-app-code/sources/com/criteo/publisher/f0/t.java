package com.criteo.publisher.f0;

import com.criteo.publisher.f0.f;
import com.criteo.publisher.f0.g;
import com.criteo.publisher.f0.h;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MetricRequest */
public abstract class t {
    /* access modifiers changed from: package-private */
    public abstract List<a> a();

    /* access modifiers changed from: package-private */
    @SerializedName("profile_id")
    public abstract int b();

    /* access modifiers changed from: package-private */
    @SerializedName("wrapper_version")
    public abstract String c();

    static t a(Collection<n> collection, String str, int i) {
        ArrayList arrayList = new ArrayList();
        for (n a2 : collection) {
            arrayList.add(a.a(a2));
        }
        return new f(arrayList, str, i);
    }

    public static TypeAdapter<t> a(Gson gson) {
        return new f.a(gson);
    }

    /* compiled from: MetricRequest */
    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract Long a();

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Long c();

        /* access modifiers changed from: package-private */
        public abstract String d();

        /* access modifiers changed from: package-private */
        public abstract List<b> e();

        /* access modifiers changed from: package-private */
        @SerializedName("isTimeout")
        public abstract boolean f();

        static a a(n nVar) {
            return new g(Collections.singletonList(b.a(nVar.e(), nVar.h(), nVar.i())), a(nVar.d(), nVar.c()), nVar.j(), 0, a(nVar.b(), nVar.c()), nVar.g());
        }

        public static TypeAdapter<a> a(Gson gson) {
            return new g.a(gson);
        }

        private static Long a(Long l, Long l2) {
            if (l == null || l2 == null) {
                return null;
            }
            return Long.valueOf(l.longValue() - l2.longValue());
        }
    }

    /* compiled from: MetricRequest */
    public static abstract class b {
        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract String b();

        /* access modifiers changed from: package-private */
        public abstract Integer c();

        static b a(String str, Integer num, boolean z) {
            return new h(str, num, z);
        }

        public static TypeAdapter<b> a(Gson gson) {
            return new h.a(gson);
        }
    }
}
