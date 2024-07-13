package com.yandex.metrica;

import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private String f3612a;

    /* renamed from: b  reason: collision with root package name */
    private String f3613b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f3614c;

    public void a(String str) {
        this.f3613b = str;
    }

    public void b(String str) {
        this.f3612a = str;
    }

    public String c() {
        return this.f3612a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.f3612a;
        if (str == null ? gVar.f3612a != null : !str.equals(gVar.f3612a)) {
            return false;
        }
        String str2 = this.f3613b;
        if (str2 == null ? gVar.f3613b != null : !str2.equals(gVar.f3613b)) {
            return false;
        }
        Map<String, String> map = this.f3614c;
        Map<String, String> map2 = gVar.f3614c;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3612a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3613b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f3614c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public Map<String, String> a() {
        return this.f3614c;
    }

    public String b() {
        return this.f3613b;
    }

    public void a(Map<String, String> map) {
        this.f3614c = map;
    }
}
