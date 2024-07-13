package com.yandex.metrica.impl.ob;

import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.i4  reason: case insensitive filesystem */
public class C0447i4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5967a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5968b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f5969c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5970d;

    /* renamed from: e  reason: collision with root package name */
    private final CounterConfiguration.b f5971e;

    public C0447i4(String str, String str2, Integer num, String str3, CounterConfiguration.b bVar) {
        this.f5967a = str;
        this.f5968b = str2;
        this.f5969c = num;
        this.f5970d = str3;
        this.f5971e = bVar;
    }

    public String a() {
        return this.f5967a;
    }

    public String b() {
        return this.f5968b;
    }

    public Integer c() {
        return this.f5969c;
    }

    public String d() {
        return this.f5970d;
    }

    public CounterConfiguration.b e() {
        return this.f5971e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0447i4.class != obj.getClass()) {
            return false;
        }
        C0447i4 i4Var = (C0447i4) obj;
        String str = this.f5967a;
        if (str == null ? i4Var.f5967a != null : !str.equals(i4Var.f5967a)) {
            return false;
        }
        if (!this.f5968b.equals(i4Var.f5968b)) {
            return false;
        }
        Integer num = this.f5969c;
        if (num == null ? i4Var.f5969c != null : !num.equals(i4Var.f5969c)) {
            return false;
        }
        String str2 = this.f5970d;
        if (str2 == null ? i4Var.f5970d != null : !str2.equals(i4Var.f5970d)) {
            return false;
        }
        if (this.f5971e == i4Var.f5971e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5967a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f5968b.hashCode()) * 31;
        Integer num = this.f5969c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f5970d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f5971e.hashCode();
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.f5967a + '\'' + ", mPackageName='" + this.f5968b + '\'' + ", mProcessID=" + this.f5969c + ", mProcessSessionID='" + this.f5970d + '\'' + ", mReporterType=" + this.f5971e + '}';
    }

    public static C0447i4 a(C0859z3 z3Var) {
        return new C0447i4(z3Var.b().a(), z3Var.a().f(), z3Var.a().g(), z3Var.a().h(), z3Var.b().k());
    }
}
