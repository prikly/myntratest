package com.yandex.metrica.impl.ob;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.c8  reason: case insensitive filesystem */
public final class C0301c8 {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f5599a;

    /* renamed from: b  reason: collision with root package name */
    private final C0376f8 f5600b;

    /* renamed from: c  reason: collision with root package name */
    private final C0376f8 f5601c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5602d;

    /* renamed from: e  reason: collision with root package name */
    private final C0326d8 f5603e;

    public C0301c8(C0376f8 f8Var, C0376f8 f8Var2, String str, C0326d8 d8Var) {
        this.f5600b = f8Var;
        this.f5601c = f8Var2;
        this.f5602d = str;
        this.f5603e = d8Var;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        if (this.f5599a == null) {
            JSONObject a2 = this.f5603e.a(a(this.f5600b), a(this.f5601c));
            this.f5599a = a2;
            a(a2);
        }
        jSONObject = this.f5599a;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileContents");
        }
        return jSONObject;
    }

    private final JSONObject a(C0376f8 f8Var) {
        try {
            String c2 = f8Var.c();
            return c2 != null ? new JSONObject(c2) : new JSONObject();
        } catch (Throwable th) {
            a(th);
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "contents.toString()");
        try {
            this.f5600b.a(jSONObject2);
        } catch (Throwable th) {
            a(th);
        }
        try {
            this.f5601c.a(jSONObject2);
        } catch (Throwable th2) {
            a(th2);
        }
        return;
    }

    private final void a(Throwable th) {
        M0 a2 = C0609oh.a();
        C0584nh nhVar = (C0584nh) a2;
        nhVar.reportEvent("vital_data_provider_exception", (Map<String, Object>) MapsKt.mapOf(TuplesKt.to("tag", this.f5602d), TuplesKt.to("exception", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName())));
        M0 a3 = C0609oh.a();
        ((C0584nh) a3).reportError("Error during reading vital data for tag = " + this.f5602d, th);
    }
}
