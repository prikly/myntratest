package com.yandex.metrica.impl.ob;

public class Qc {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4823a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4824b;

    public Qc(boolean z, boolean z2) {
        this.f4823a = z;
        this.f4824b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qc.class != obj.getClass()) {
            return false;
        }
        Qc qc = (Qc) obj;
        if (this.f4823a == qc.f4823a && this.f4824b == qc.f4824b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4823a ? 1 : 0) * true) + (this.f4824b ? 1 : 0);
    }

    public String toString() {
        return "ProviderAccessFlags{lastKnownEnabled=" + this.f4823a + ", scanningEnabled=" + this.f4824b + '}';
    }
}
