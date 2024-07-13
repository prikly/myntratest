package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ti  reason: case insensitive filesystem */
public class C0730ti {

    /* renamed from: a  reason: collision with root package name */
    public final long f6847a;

    public C0730ti(long j) {
        this.f6847a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0730ti.class == obj.getClass() && this.f6847a == ((C0730ti) obj).f6847a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6847a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "StatSending{disabledReportingInterval=" + this.f6847a + '}';
    }
}
