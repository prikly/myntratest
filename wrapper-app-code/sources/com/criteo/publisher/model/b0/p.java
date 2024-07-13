package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.net.URL;

/* compiled from: NativeImpressionPixel */
public abstract class p {
    /* access modifiers changed from: package-private */
    public abstract URL a();

    public static TypeAdapter<p> a(Gson gson) {
        return new j.a(gson);
    }
}
