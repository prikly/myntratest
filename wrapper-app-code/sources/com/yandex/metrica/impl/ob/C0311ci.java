package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ci  reason: case insensitive filesystem */
public class C0311ci {

    /* renamed from: a  reason: collision with root package name */
    public final long f5638a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5639b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5640c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5641d;

    public C0311ci(long j, long j2, long j3, long j4) {
        this.f5638a = j;
        this.f5639b = j2;
        this.f5640c = j3;
        this.f5641d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0311ci.class != obj.getClass()) {
            return false;
        }
        C0311ci ciVar = (C0311ci) obj;
        if (this.f5638a == ciVar.f5638a && this.f5639b == ciVar.f5639b && this.f5640c == ciVar.f5640c && this.f5641d == ciVar.f5641d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5638a;
        long j2 = this.f5639b;
        long j3 = this.f5640c;
        long j4 = this.f5641d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "SdkFingerprintingConfig{minCollectingInterval=" + this.f5638a + ", minFirstCollectingDelay=" + this.f5639b + ", minCollectingDelayAfterLaunch=" + this.f5640c + ", minRequestRetryInterval=" + this.f5641d + '}';
    }
}
