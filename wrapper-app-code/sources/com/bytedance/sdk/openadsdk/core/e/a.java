package com.bytedance.sdk.openadsdk.core.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AdInfo */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f1032a;

    /* renamed from: b  reason: collision with root package name */
    private int f1033b;

    /* renamed from: c  reason: collision with root package name */
    private String f1034c;

    /* renamed from: d  reason: collision with root package name */
    private List<n> f1035d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private String f1036e;

    /* renamed from: f  reason: collision with root package name */
    private long f1037f;

    public static Map<String, n> a(a aVar) {
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (n next : aVar.b()) {
            if (!TextUtils.isEmpty(next.af())) {
                hashMap.put(next.af(), next);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public int a() {
        return this.f1033b;
    }

    public void a(int i) {
        this.f1033b = i;
    }

    public void a(long j) {
        this.f1037f = j;
    }

    public void a(n nVar) {
        this.f1035d.add(nVar);
    }

    public void a(String str) {
        this.f1032a = str;
    }

    public List<n> b() {
        return this.f1035d;
    }

    public void b(String str) {
        this.f1034c = str;
    }

    public String c() {
        return this.f1036e;
    }

    public void c(String str) {
        this.f1036e = str;
    }
}
