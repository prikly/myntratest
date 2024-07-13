package com.yandex.metrica.impl.ob;

public class Ph {

    /* renamed from: a  reason: collision with root package name */
    public final long f4783a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4784b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4785c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4786d;

    public Ph(long j, long j2, long j3, long j4) {
        this.f4783a = j;
        this.f4784b = j2;
        this.f4785c = j3;
        this.f4786d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ph.class != obj.getClass()) {
            return false;
        }
        Ph ph = (Ph) obj;
        if (this.f4783a == ph.f4783a && this.f4784b == ph.f4784b && this.f4785c == ph.f4785c && this.f4786d == ph.f4786d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4783a;
        long j2 = this.f4784b;
        long j3 = this.f4785c;
        long j4 = this.f4786d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "CacheControl{cellsAroundTtl=" + this.f4783a + ", wifiNetworksTtl=" + this.f4784b + ", lastKnownLocationTtl=" + this.f4785c + ", netInterfacesTtl=" + this.f4786d + '}';
    }
}
