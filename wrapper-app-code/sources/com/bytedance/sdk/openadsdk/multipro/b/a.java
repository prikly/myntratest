package com.bytedance.sdk.openadsdk.multipro.b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: VideoControllerDataModel */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2159a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2160b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2161c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2162d;

    /* renamed from: e  reason: collision with root package name */
    public long f2163e;

    /* renamed from: f  reason: collision with root package name */
    public long f2164f;

    /* renamed from: g  reason: collision with root package name */
    public long f2165g;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a$a  reason: collision with other inner class name */
    /* compiled from: VideoControllerDataModel */
    public interface C0014a {
        a f();
    }

    public a a(boolean z) {
        this.f2162d = z;
        return this;
    }

    public a b(boolean z) {
        this.f2159a = z;
        return this;
    }

    public a c(boolean z) {
        this.f2160b = z;
        return this;
    }

    public a d(boolean z) {
        this.f2161c = z;
        return this;
    }

    public a a(long j) {
        this.f2163e = j;
        return this;
    }

    public a b(long j) {
        this.f2164f = j;
        return this;
    }

    public a c(long j) {
        this.f2165g = j;
        return this;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f2159a);
            jSONObject.put("isFromVideoDetailPage", this.f2160b);
            jSONObject.put("isFromDetailPage", this.f2161c);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.f2163e);
            jSONObject.put("totalPlayDuration", this.f2164f);
            jSONObject.put("currentPlayPosition", this.f2165g);
            jSONObject.put("isAutoPlay", this.f2162d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.b(jSONObject.optBoolean("isCompleted"));
        aVar.c(jSONObject.optBoolean("isFromVideoDetailPage"));
        aVar.d(jSONObject.optBoolean("isFromDetailPage"));
        aVar.a(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
        aVar.b(jSONObject.optLong("totalPlayDuration"));
        aVar.c(jSONObject.optLong("currentPlayPosition"));
        aVar.a(jSONObject.optBoolean("isAutoPlay"));
        return aVar;
    }
}
