package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.cc  reason: case insensitive filesystem */
public class C0305cc {

    /* renamed from: a  reason: collision with root package name */
    public final Qc f5614a;

    /* renamed from: b  reason: collision with root package name */
    public final C0255ac f5615b;

    public C0305cc(Qc qc, C0255ac acVar) {
        this.f5614a = qc;
        this.f5615b = acVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0305cc.class != obj.getClass()) {
            return false;
        }
        C0305cc ccVar = (C0305cc) obj;
        if (!this.f5614a.equals(ccVar.f5614a)) {
            return false;
        }
        C0255ac acVar = this.f5615b;
        C0255ac acVar2 = ccVar.f5615b;
        if (acVar != null) {
            return acVar.equals(acVar2);
        }
        if (acVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f5614a.hashCode() * 31;
        C0255ac acVar = this.f5615b;
        return hashCode + (acVar != null ? acVar.hashCode() : 0);
    }

    public String toString() {
        return "GplCollectingConfig{providerAccessFlags=" + this.f5614a + ", arguments=" + this.f5615b + '}';
    }
}
