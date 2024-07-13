package com.bytedance.sdk.component.d.c;

import com.bytedance.sdk.component.d.g;
import com.bytedance.sdk.component.d.j;
import java.util.Map;

/* compiled from: ImageResponse */
public class d<T> implements j {

    /* renamed from: a  reason: collision with root package name */
    private String f19056a;

    /* renamed from: b  reason: collision with root package name */
    private String f19057b;

    /* renamed from: c  reason: collision with root package name */
    private T f19058c;

    /* renamed from: d  reason: collision with root package name */
    private int f19059d;

    /* renamed from: e  reason: collision with root package name */
    private int f19060e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f19061f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19062g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19063h;
    private g i;
    private int j;

    public d a(c cVar, T t) {
        this.f19058c = t;
        this.f19056a = cVar.e();
        this.f19057b = cVar.a();
        this.f19059d = cVar.b();
        this.f19060e = cVar.c();
        this.f19063h = cVar.l();
        this.i = cVar.m();
        this.j = cVar.n();
        return this;
    }

    public d a(c cVar, T t, Map<String, String> map, boolean z) {
        this.f19061f = map;
        this.f19062g = z;
        return a(cVar, t);
    }

    public String a() {
        return this.f19057b;
    }

    public T b() {
        return this.f19058c;
    }

    public Map<String, String> c() {
        return this.f19061f;
    }

    public boolean d() {
        return this.f19063h;
    }

    public g e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }
}
