package com.criteo.publisher.model;

import java.util.Map;

/* compiled from: $AutoValue_User */
abstract class f extends z {

    /* renamed from: a  reason: collision with root package name */
    private final String f2785a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2786b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2787c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2788d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2789e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2790f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f2791g;

    f(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map) {
        this.f2785a = str;
        if (str2 != null) {
            this.f2786b = str2;
            if (str3 != null) {
                this.f2787c = str3;
                this.f2788d = str4;
                this.f2789e = str5;
                this.f2790f = str6;
                if (map != null) {
                    this.f2791g = map;
                    return;
                }
                throw new NullPointerException("Null ext");
            }
            throw new NullPointerException("Null deviceOs");
        }
        throw new NullPointerException("Null deviceIdType");
    }

    public String a() {
        return this.f2785a;
    }

    public String b() {
        return this.f2786b;
    }

    public String c() {
        return this.f2787c;
    }

    public String e() {
        return this.f2788d;
    }

    public String f() {
        return this.f2789e;
    }

    public String g() {
        return this.f2790f;
    }

    public Map<String, Object> d() {
        return this.f2791g;
    }

    public String toString() {
        return "User{deviceId=" + this.f2785a + ", deviceIdType=" + this.f2786b + ", deviceOs=" + this.f2787c + ", mopubConsent=" + this.f2788d + ", uspIab=" + this.f2789e + ", uspOptout=" + this.f2790f + ", ext=" + this.f2791g + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        String str4 = this.f2785a;
        if (str4 != null ? str4.equals(zVar.a()) : zVar.a() == null) {
            if (!this.f2786b.equals(zVar.b()) || !this.f2787c.equals(zVar.c()) || ((str = this.f2788d) != null ? !str.equals(zVar.e()) : zVar.e() != null) || ((str2 = this.f2789e) != null ? !str2.equals(zVar.f()) : zVar.f() != null) || ((str3 = this.f2790f) != null ? !str3.equals(zVar.g()) : zVar.g() != null) || !this.f2791g.equals(zVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2785a;
        int i = 0;
        int hashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f2786b.hashCode()) * 1000003) ^ this.f2787c.hashCode()) * 1000003;
        String str2 = this.f2788d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2789e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2790f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f2791g.hashCode();
    }
}
