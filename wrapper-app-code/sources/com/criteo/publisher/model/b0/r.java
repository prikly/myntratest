package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.net.URI;
import java.net.URL;

/* compiled from: NativeProduct */
public abstract class r {
    public abstract String a();

    public abstract URI b();

    public abstract String c();

    /* access modifiers changed from: package-private */
    public abstract o d();

    public abstract String f();

    public abstract String g();

    public static TypeAdapter<r> a(Gson gson) {
        return new l.a(gson);
    }

    public URL e() {
        return d().a();
    }
}
