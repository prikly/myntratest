package com.criteo.publisher.n0;

import com.criteo.publisher.f0.n;
import com.criteo.publisher.f0.t;
import com.criteo.publisher.l0.d.c;
import com.criteo.publisher.model.b0.m;
import com.criteo.publisher.model.b0.p;
import com.criteo.publisher.model.b0.r;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.q;
import com.criteo.publisher.model.v;
import com.criteo.publisher.model.w;
import com.criteo.publisher.model.y;
import com.criteo.publisher.model.z;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: AutoValueGson_CustomAdapterFactory */
final class f extends j {
    f() {
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (o.class.isAssignableFrom(rawType)) {
            return o.a(gson);
        }
        if (q.class.isAssignableFrom(rawType)) {
            return q.a(gson);
        }
        if (c.class.isAssignableFrom(rawType)) {
            return c.a(gson);
        }
        if (n.class.isAssignableFrom(rawType)) {
            return n.a(gson);
        }
        if (t.class.isAssignableFrom(rawType)) {
            return t.a(gson);
        }
        if (t.a.class.isAssignableFrom(rawType)) {
            return t.a.a(gson);
        }
        if (t.b.class.isAssignableFrom(rawType)) {
            return t.b.a(gson);
        }
        if (m.class.isAssignableFrom(rawType)) {
            return m.a(gson);
        }
        if (com.criteo.publisher.model.b0.n.class.isAssignableFrom(rawType)) {
            return com.criteo.publisher.model.b0.n.a(gson);
        }
        if (com.criteo.publisher.model.b0.o.class.isAssignableFrom(rawType)) {
            return com.criteo.publisher.model.b0.o.a(gson);
        }
        if (p.class.isAssignableFrom(rawType)) {
            return p.a(gson);
        }
        if (com.criteo.publisher.model.b0.q.class.isAssignableFrom(rawType)) {
            return com.criteo.publisher.model.b0.q.a(gson);
        }
        if (r.class.isAssignableFrom(rawType)) {
            return r.a(gson);
        }
        if (v.class.isAssignableFrom(rawType)) {
            return v.a(gson);
        }
        if (w.class.isAssignableFrom(rawType)) {
            return w.a(gson);
        }
        if (y.class.isAssignableFrom(rawType)) {
            return y.a(gson);
        }
        if (z.class.isAssignableFrom(rawType)) {
            return z.a(gson);
        }
        return null;
    }
}
