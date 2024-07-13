package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.g;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.net.URI;

/* compiled from: NativeAdvertiser */
public abstract class m {
    /* access modifiers changed from: package-private */
    public abstract String a();

    /* access modifiers changed from: package-private */
    public abstract String b();

    /* access modifiers changed from: package-private */
    public abstract o c();

    /* access modifiers changed from: package-private */
    public abstract URI d();

    public static TypeAdapter<m> a(Gson gson) {
        return new g.a(gson);
    }
}
