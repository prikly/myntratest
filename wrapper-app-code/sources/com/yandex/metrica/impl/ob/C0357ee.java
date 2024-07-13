package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ee  reason: case insensitive filesystem */
public class C0357ee implements C0760v0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5743a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f5744b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5745c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5746d;

    /* renamed from: e  reason: collision with root package name */
    public final C0736u0 f5747e;

    public C0357ee(String str, JSONObject jSONObject, boolean z, boolean z2, C0736u0 u0Var) {
        this.f5743a = str;
        this.f5744b = jSONObject;
        this.f5745c = z;
        this.f5746d = z2;
        this.f5747e = u0Var;
    }

    public C0736u0 a() {
        return this.f5747e;
    }

    public String toString() {
        return "PreloadInfoState{trackingId='" + this.f5743a + '\'' + ", additionalParameters=" + this.f5744b + ", wasSet=" + this.f5745c + ", autoTrackingEnabled=" + this.f5746d + ", source=" + this.f5747e + '}';
    }
}
