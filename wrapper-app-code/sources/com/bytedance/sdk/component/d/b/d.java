package com.bytedance.sdk.component.d.b;

import com.bytedance.sdk.component.d.f;
import com.bytedance.sdk.component.d.g;
import java.util.Map;

/* compiled from: HttpResponse */
public class d<T> implements f {

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f18947a;

    /* renamed from: b  reason: collision with root package name */
    private int f18948b;

    /* renamed from: c  reason: collision with root package name */
    private T f18949c;

    /* renamed from: d  reason: collision with root package name */
    private String f18950d;

    /* renamed from: e  reason: collision with root package name */
    private g f18951e;

    public d(int i, T t, String str) {
        this.f18948b = i;
        this.f18949c = t;
        this.f18950d = str;
    }

    public d(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.f18947a = map;
    }

    public g a() {
        return this.f18951e;
    }

    public void a(g gVar) {
        this.f18951e = gVar;
    }

    public int b() {
        return this.f18948b;
    }

    public T c() {
        return this.f18949c;
    }

    public String d() {
        return this.f18950d;
    }

    public Map<String, String> e() {
        return this.f18947a;
    }
}
