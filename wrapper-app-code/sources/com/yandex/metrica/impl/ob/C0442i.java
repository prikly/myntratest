package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.i  reason: case insensitive filesystem */
public class C0442i {

    /* renamed from: a  reason: collision with root package name */
    public final int f5952a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5953b;

    public C0442i(int i, int i2) {
        this.f5952a = i;
        this.f5953b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0442i.class != obj.getClass()) {
            return false;
        }
        C0442i iVar = (C0442i) obj;
        return this.f5952a == iVar.f5952a && this.f5953b == iVar.f5953b;
    }

    public int hashCode() {
        return (this.f5952a * 31) + this.f5953b;
    }

    public String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.f5952a + ", firstCollectingInappMaxAgeSeconds=" + this.f5953b + "}";
    }
}
