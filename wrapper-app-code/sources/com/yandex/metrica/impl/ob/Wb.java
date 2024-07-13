package com.yandex.metrica.impl.ob;

public class Wb {

    /* renamed from: a  reason: collision with root package name */
    public final long f5260a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5261b;

    public Wb(long j, long j2) {
        this.f5260a = j;
        this.f5261b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Wb.class != obj.getClass()) {
            return false;
        }
        Wb wb = (Wb) obj;
        if (this.f5260a == wb.f5260a && this.f5261b == wb.f5261b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5260a;
        long j2 = this.f5261b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ForcedCollectingArguments{durationSeconds=" + this.f5260a + ", intervalSeconds=" + this.f5261b + '}';
    }
}
