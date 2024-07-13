package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.z  reason: case insensitive filesystem */
public class C0855z {

    /* renamed from: a  reason: collision with root package name */
    public final a f7189a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f7190b;

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public C0855z(a aVar, Boolean bool) {
        this.f7189a = aVar;
        this.f7190b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0855z.class != obj.getClass()) {
            return false;
        }
        C0855z zVar = (C0855z) obj;
        if (this.f7189a != zVar.f7189a) {
            return false;
        }
        Boolean bool = this.f7190b;
        if (bool != null) {
            return bool.equals(zVar.f7190b);
        }
        if (zVar.f7190b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.f7189a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f7190b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
