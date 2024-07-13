package com.ironsource.sdk.g;

import com.ironsource.sdk.j.a;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f9515a;

    /* renamed from: b  reason: collision with root package name */
    public String f9516b;

    /* renamed from: c  reason: collision with root package name */
    public int f9517c = -1;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f9518d;

    /* renamed from: e  reason: collision with root package name */
    public int f9519e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9520f;

    /* renamed from: g  reason: collision with root package name */
    public a f9521g;

    public c(String str, String str2, Map<String, String> map, a aVar) {
        this.f9516b = str;
        this.f9515a = str2;
        this.f9518d = map;
        this.f9521g = aVar;
        this.f9519e = 0;
        this.f9520f = false;
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f9516b);
        hashMap.put("demandSourceName", this.f9515a);
        Map<String, String> map = this.f9518d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final synchronized void a(int i) {
        this.f9519e = i;
    }
}
