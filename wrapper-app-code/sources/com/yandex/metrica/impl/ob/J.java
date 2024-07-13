package com.yandex.metrica.impl.ob;

import java.util.HashMap;

public class J extends C0293c0 {
    private HashMap<a, Integer> r;
    private C0391fn<String> s;
    private C0391fn<String> t;
    private C0391fn<String> u;
    private C0391fn<byte[]> v;
    private C0391fn<String> w;
    private C0391fn<String> x;

    public enum a {
        NAME,
        VALUE,
        USER_INFO
    }

    public J(C0315cm cmVar) {
        this.r = new HashMap<>();
        a(cmVar);
    }

    private String g(String str) {
        String a2 = this.s.a(str);
        a(str, a2, a.NAME);
        return a2;
    }

    private String h(String str) {
        String a2 = this.t.a(str);
        a(str, a2, a.VALUE);
        return a2;
    }

    public static C0293c0 s() {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_SEND_USER_PROFILE.b();
        return c0Var;
    }

    private void u() {
        this.f5581h = 0;
        for (Integer intValue : this.r.values()) {
            this.f5581h += intValue.intValue();
        }
    }

    public J a(HashMap<a, Integer> hashMap) {
        this.r = hashMap;
        return this;
    }

    public C0293c0 b(String str) {
        String a2 = this.s.a(str);
        a(str, a2, a.NAME);
        this.f5574a = a2;
        return this;
    }

    public C0293c0 d(String str) {
        return super.d(this.w.a(str));
    }

    public C0293c0 e(String str) {
        String a2 = this.x.a(str);
        a(str, a2, a.USER_INFO);
        return super.e(a2);
    }

    public C0293c0 f(String str) {
        String a2 = this.t.a(str);
        a(str, a2, a.VALUE);
        this.f5575b = a2;
        return this;
    }

    public J i(String str) {
        String a2 = this.u.a(str);
        a(str, a2, a.VALUE);
        this.f5575b = a2;
        return this;
    }

    public HashMap<a, Integer> t() {
        return this.r;
    }

    private void a(C0315cm cmVar) {
        this.s = new C0341dn(1000, "event name", cmVar);
        this.t = new C0316cn(245760, "event value", cmVar);
        this.u = new C0316cn(1024000, "event extended value", cmVar);
        this.v = new Tm(245760, "event value bytes", cmVar);
        this.w = new C0341dn(200, "user profile id", cmVar);
        this.x = new C0341dn(10000, "UserInfo", cmVar);
    }

    public J(String str, String str2, int i, C0315cm cmVar) {
        this(str, str2, i, 0, cmVar);
    }

    public J(String str, String str2, int i, int i2, C0315cm cmVar) {
        this.r = new HashMap<>();
        a(cmVar);
        this.f5575b = h(str);
        this.f5574a = g(str2);
        this.f5578e = i;
        this.f5579f = i2;
    }

    private void a(String str, String str2, a aVar) {
        if (C0267b.b(str, str2)) {
            this.r.put(aVar, Integer.valueOf(C0267b.b(str).length - C0267b.b(str2).length));
        } else {
            this.r.remove(aVar);
        }
        u();
    }

    public final C0293c0 a(byte[] bArr) {
        byte[] a2 = this.v.a(bArr);
        a aVar = a.VALUE;
        if (bArr.length != a2.length) {
            this.r.put(aVar, Integer.valueOf(bArr.length - a2.length));
        } else {
            this.r.remove(aVar);
        }
        u();
        return super.a(a2);
    }

    static C0293c0 a(String str, C0315cm cmVar) {
        J j = new J(cmVar);
        j.f5578e = C0244a1.EVENT_TYPE_SET_USER_PROFILE_ID.b();
        return super.d(j.w.a(str));
    }

    public J(byte[] bArr, String str, int i, C0315cm cmVar) {
        this.r = new HashMap<>();
        a(cmVar);
        a(bArr);
        this.f5574a = g(str);
        this.f5578e = i;
    }
}
