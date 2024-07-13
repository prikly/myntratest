package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.b;
import com.criteo.publisher.model.b0.h;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NativeAssets */
public abstract class n {
    /* access modifiers changed from: package-private */
    public abstract m b();

    /* access modifiers changed from: package-private */
    @SerializedName("products")
    public abstract List<r> h();

    /* access modifiers changed from: package-private */
    @SerializedName("impressionPixels")
    public abstract List<p> i();

    /* access modifiers changed from: package-private */
    public abstract q j();

    public static TypeAdapter<n> a(Gson gson) {
        return new h.a(gson);
    }

    public r n() {
        return h().iterator().next();
    }

    public String c() {
        return b().a();
    }

    public String d() {
        return b().b();
    }

    public URL f() {
        return b().c().a();
    }

    public URI e() {
        return b().d();
    }

    public URI l() {
        return j().a();
    }

    public URL m() {
        return j().b();
    }

    public String k() {
        return j().c();
    }

    public List<URL> g() {
        ArrayList arrayList = new ArrayList();
        for (p a2 : i()) {
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    public static a a() {
        return new b.a();
    }

    /* compiled from: NativeAssets */
    static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract a a(m mVar);

        /* access modifiers changed from: package-private */
        public abstract a a(q qVar);

        /* access modifiers changed from: package-private */
        public abstract a a(List<r> list);

        /* access modifiers changed from: package-private */
        public abstract n a();

        /* access modifiers changed from: package-private */
        public abstract a b(List<p> list);

        /* access modifiers changed from: package-private */
        public abstract List<r> c();

        /* access modifiers changed from: package-private */
        public abstract List<p> d();

        a() {
        }

        /* access modifiers changed from: package-private */
        public n b() {
            if (c().isEmpty()) {
                throw new JsonParseException("Expect that native payload has, at least, one product.");
            } else if (!d().isEmpty()) {
                return a();
            } else {
                throw new JsonParseException("Expect that native payload has, at least, one impression pixel.");
            }
        }
    }
}
