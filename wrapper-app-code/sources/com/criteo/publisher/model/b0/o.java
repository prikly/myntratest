package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.i;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.net.URL;

/* compiled from: NativeImage */
public abstract class o {
    /* access modifiers changed from: package-private */
    public abstract URL a();

    public static TypeAdapter<o> a(Gson gson) {
        return new i.a(gson);
    }
}
