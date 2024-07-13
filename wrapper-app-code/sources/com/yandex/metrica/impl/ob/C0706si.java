package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.si  reason: case insensitive filesystem */
public final class C0706si {

    /* renamed from: a  reason: collision with root package name */
    private final int f6795a;

    public C0706si(int i) {
        this.f6795a = i;
    }

    public final int a() {
        return this.f6795a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0706si) && this.f6795a == ((C0706si) obj).f6795a;
        }
        return true;
    }

    public int hashCode() {
        return this.f6795a;
    }

    public String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f6795a + ")";
    }
}
