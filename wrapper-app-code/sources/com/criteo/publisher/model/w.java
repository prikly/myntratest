package com.criteo.publisher.model;

import com.criteo.publisher.model.k;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: RemoteConfigRequest */
public abstract class w {
    public abstract String a();

    @SerializedName("cpId")
    public abstract String b();

    public abstract String c();

    public abstract String d();

    @SerializedName("rtbProfileId")
    public abstract int e();

    public abstract String f();

    public static w a(String str, String str2, String str3, int i, String str4) {
        return new k(str, str2, str3, i, str4, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
    }

    public static TypeAdapter<w> a(Gson gson) {
        return new k.a(gson);
    }
}
