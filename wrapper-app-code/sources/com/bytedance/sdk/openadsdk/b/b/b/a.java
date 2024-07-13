package com.bytedance.sdk.openadsdk.b.b.b;

import com.bytedance.sdk.openadsdk.b.b.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import org.json.JSONObject;

/* compiled from: BaseEventModel */
public class a<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    private n f233a;

    /* renamed from: b  reason: collision with root package name */
    private String f234b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f235c;

    /* renamed from: d  reason: collision with root package name */
    private T f236d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f237e = false;

    public a(n nVar, String str, JSONObject jSONObject, T t) {
        this.f233a = nVar;
        this.f234b = str;
        this.f235c = jSONObject;
        this.f236d = t;
    }

    public n a() {
        return this.f233a;
    }

    public String b() {
        return this.f234b;
    }

    public JSONObject c() {
        if (this.f235c == null) {
            this.f235c = new JSONObject();
        }
        return this.f235c;
    }

    public T d() {
        return this.f236d;
    }

    public boolean e() {
        return this.f237e;
    }

    public void a(boolean z) {
        this.f237e = z;
    }
}
