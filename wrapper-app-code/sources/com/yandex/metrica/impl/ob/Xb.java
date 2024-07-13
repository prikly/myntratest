package com.yandex.metrica.impl.ob;

public class Xb {

    /* renamed from: a  reason: collision with root package name */
    public final Qc f5332a;

    /* renamed from: b  reason: collision with root package name */
    public final Wb f5333b;

    public Xb(Qc qc, Wb wb) {
        this.f5332a = qc;
        this.f5333b = wb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Xb.class != obj.getClass()) {
            return false;
        }
        Xb xb = (Xb) obj;
        if (!this.f5332a.equals(xb.f5332a)) {
            return false;
        }
        Wb wb = this.f5333b;
        Wb wb2 = xb.f5333b;
        if (wb != null) {
            return wb.equals(wb2);
        }
        if (wb2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f5332a.hashCode() * 31;
        Wb wb = this.f5333b;
        return hashCode + (wb != null ? wb.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.f5332a + ", arguments=" + this.f5333b + '}';
    }
}
