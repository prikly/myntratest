package com.yandex.metrica.impl.ob;

public class Bd {

    /* renamed from: a  reason: collision with root package name */
    public final String f3764a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3765b;

    public Bd(String str, boolean z) {
        this.f3764a = str;
        this.f3765b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bd.class != obj.getClass()) {
            return false;
        }
        Bd bd = (Bd) obj;
        if (this.f3765b != bd.f3765b) {
            return false;
        }
        return this.f3764a.equals(bd.f3764a);
    }

    public int hashCode() {
        return (this.f3764a.hashCode() * 31) + (this.f3765b ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.f3764a + '\'' + ", granted=" + this.f3765b + '}';
    }
}
