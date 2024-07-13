package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RitInfo */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<Integer, p> f1529a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private String f1530b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f1531c = "";

    /* renamed from: d  reason: collision with root package name */
    private int f1532d;

    /* renamed from: e  reason: collision with root package name */
    private int f1533e;

    /* renamed from: f  reason: collision with root package name */
    private String f1534f;

    public String a() {
        return this.f1534f;
    }

    public String b() {
        return this.f1530b;
    }

    public String c() {
        return this.f1531c;
    }

    public int d() {
        return this.f1532d;
    }

    public void a(int i) {
        this.f1532d = i;
    }

    public int e() {
        return this.f1533e;
    }

    public void b(int i) {
        this.f1533e = i;
    }

    private void f() {
        this.f1530b = "";
        this.f1531c = "";
        this.f1532d = 0;
        this.f1533e = 0;
    }

    public void a(n nVar) {
        if (nVar != null) {
            String h2 = u.h(nVar);
            if (!TextUtils.isEmpty(h2)) {
                this.f1534f = h2;
            }
            String[] split = nVar.O().split("/");
            if (split.length >= 3) {
                this.f1530b = split[2];
            }
            if (nVar.aa() != null && !TextUtils.isEmpty(nVar.aa().c())) {
                this.f1531c = nVar.aa().c();
            }
        }
    }

    public static void b(n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.ac())) {
            Integer valueOf = Integer.valueOf(u.f(nVar));
            if (valueOf.intValue() != 0) {
                p pVar = null;
                if (f1529a == null) {
                    f1529a = new ConcurrentHashMap<>();
                }
                if (f1529a.containsKey(valueOf)) {
                    pVar = f1529a.get(valueOf);
                }
                if (pVar == null) {
                    pVar = new p();
                }
                String h2 = u.h(nVar);
                if (TextUtils.isEmpty(h2) || !h2.equals(pVar.a())) {
                    pVar.f();
                    pVar.a(nVar);
                    f1529a.put(valueOf, pVar);
                }
            }
        }
    }

    public static void c(int i) {
        p pVar;
        if (i != 0) {
            if (f1529a == null) {
                f1529a = new ConcurrentHashMap<>();
            }
            if (f1529a.containsKey(Integer.valueOf(i)) && (pVar = f1529a.get(Integer.valueOf(i))) != null) {
                pVar.b(1);
            }
        }
    }

    public static void c(n nVar) {
        p pVar;
        if (nVar != null) {
            Integer valueOf = Integer.valueOf(u.f(nVar));
            if (valueOf.intValue() != 0) {
                if (f1529a == null) {
                    f1529a = new ConcurrentHashMap<>();
                }
                if (f1529a.containsKey(valueOf) && (pVar = f1529a.get(valueOf)) != null) {
                    pVar.a(1);
                }
            }
        }
    }
}
