package com.applovin.impl.mediation.debugger.b.b;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f14695a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14696b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14697c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14698d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14699e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14700f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14701g;

    public b(String str) {
        this(str, -1);
    }

    public b(String str, int i) {
        this.f14700f = str;
        this.f14701g = i;
        String[] split = str.split(",");
        boolean z = split.length == 3 || split.length == 4;
        this.f14699e = z;
        String str2 = "";
        if (z) {
            this.f14695a = a(split[0]);
            this.f14696b = a(split[1]);
            this.f14697c = a(split[2]);
            if (split.length == 4) {
                str2 = a(split[3]);
            }
        } else {
            this.f14695a = str2;
            this.f14696b = str2;
            this.f14697c = str2;
        }
        this.f14698d = str2;
    }

    private String a(String str) {
        return str.replace(173, ' ').trim();
    }

    public String a() {
        return this.f14695a;
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof b;
    }

    public String b() {
        return this.f14696b;
    }

    public String c() {
        return this.f14697c;
    }

    public String d() {
        return this.f14698d;
    }

    public boolean e() {
        return this.f14699e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.a((Object) this) || e() != bVar.e()) {
            return false;
        }
        String a2 = a();
        String a3 = bVar.a();
        if (a2 != null ? !a2.equals(a3) : a3 != null) {
            return false;
        }
        String b2 = b();
        String b3 = bVar.b();
        if (b2 != null ? !b2.equals(b3) : b3 != null) {
            return false;
        }
        String c2 = c();
        String c3 = bVar.c();
        if (c2 != null ? !c2.equals(c3) : c3 != null) {
            return false;
        }
        String d2 = d();
        String d3 = bVar.d();
        return d2 != null ? d2.equals(d3) : d3 == null;
    }

    public int hashCode() {
        int i = e() ? 79 : 97;
        String a2 = a();
        int i2 = 43;
        int hashCode = ((i + 59) * 59) + (a2 == null ? 43 : a2.hashCode());
        String b2 = b();
        int hashCode2 = (hashCode * 59) + (b2 == null ? 43 : b2.hashCode());
        String c2 = c();
        int hashCode3 = (hashCode2 * 59) + (c2 == null ? 43 : c2.hashCode());
        String d2 = d();
        int i3 = hashCode3 * 59;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return i3 + i2;
    }
}
