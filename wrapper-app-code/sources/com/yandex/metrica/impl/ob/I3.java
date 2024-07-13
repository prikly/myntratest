package com.yandex.metrica.impl.ob;

public class I3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4125a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4126b;

    public I3(String str, String str2) {
        this.f4125a = str;
        this.f4126b = str2;
    }

    public String a() {
        return this.f4126b;
    }

    public String b() {
        return this.f4125a;
    }

    public String c() {
        return this.f4125a + "_" + A2.a(this.f4126b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        I3 i3 = (I3) obj;
        String str = this.f4125a;
        if (str == null ? i3.f4125a != null : !str.equals(i3.f4125a)) {
            return false;
        }
        String str2 = this.f4126b;
        String str3 = i3.f4126b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4125a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4126b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f4125a + "_" + this.f4126b;
    }
}
