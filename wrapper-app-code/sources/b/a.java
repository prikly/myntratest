package b;

import io.bidmachine.analytics.entity.Event;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f9762a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9763b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9764c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9765d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f9766e;

    /* renamed from: f  reason: collision with root package name */
    public final JSONObject f9767f;

    public a(String str, long j, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f9762a = str;
        this.f9763b = j;
        this.f9764c = str2;
        this.f9765d = str3;
        this.f9766e = jSONObject;
        this.f9767f = jSONObject2;
    }

    public a(String str, Event event) {
        this(UUID.randomUUID().toString(), event.getTimestamp(), str, event.getName(), a.a.a((Map<?, ?>) event.getDimensions()), a.a.a((Map<?, ?>) event.getMetrics()));
    }

    public String a() {
        return this.f9764c;
    }

    public JSONObject b() {
        return this.f9766e;
    }

    public String c() {
        return this.f9762a;
    }

    public JSONObject d() {
        return this.f9767f;
    }

    public String e() {
        return this.f9765d;
    }

    public long f() {
        return this.f9763b;
    }
}
