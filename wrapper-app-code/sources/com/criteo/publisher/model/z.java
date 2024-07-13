package com.criteo.publisher.model;

import com.criteo.publisher.model.m;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Map;

/* compiled from: User */
public abstract class z {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract Map<String, Object> d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public static z a(String str, String str2, String str3, String str4, Map<String, Object> map) {
        return new m(str, "gaid", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, str2, str3, str4, map);
    }

    public static TypeAdapter<z> a(Gson gson) {
        return new m.a(gson);
    }
}
