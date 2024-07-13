package com.criteo.publisher.model;

import com.criteo.publisher.model.j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* compiled from: Publisher */
public abstract class v {
    public abstract String a();

    @SerializedName("cpId")
    public abstract String b();

    public abstract Map<String, Object> c();

    public static v a(String str, String str2, Map<String, Object> map) {
        return new j(str, str2, map);
    }

    public static TypeAdapter<v> a(Gson gson) {
        return new j.a(gson);
    }
}
