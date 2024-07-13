package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.w0  reason: case insensitive filesystem */
public final class C0784w0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f7014a;

    public C0784w0(long j) {
        this.f7014a = j;
    }

    public final long a() {
        return this.f7014a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0784w0) && this.f7014a == ((C0784w0) obj).f7014a;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f7014a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "EasyCollectingConfig(firstLaunchDelaySeconds=" + this.f7014a + ")";
    }
}
