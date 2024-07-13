package com.criteo.publisher.l0.d;

import com.criteo.publisher.l0.d.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: GdprData */
public abstract class c {
    public abstract String a();

    public abstract Boolean b();

    public abstract Integer c();

    public static c a(String str, Boolean bool, Integer num) {
        return new b(str, bool, num);
    }

    public static TypeAdapter<c> a(Gson gson) {
        return new b.a(gson);
    }
}
