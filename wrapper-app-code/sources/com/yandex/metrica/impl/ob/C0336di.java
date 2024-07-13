package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.di  reason: case insensitive filesystem */
public class C0336di {

    /* renamed from: a  reason: collision with root package name */
    public final long f5683a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5684b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Integer> f5685c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f5686d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5687e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5688f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5689g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5690h;
    public final long i;
    public final long j;

    public C0336di(long j2, String str, List<Integer> list, List<Integer> list2, long j3, int i2, long j4, long j5, long j6, long j7) {
        this.f5683a = j2;
        this.f5684b = str;
        this.f5685c = A2.c(list);
        this.f5686d = A2.c(list2);
        this.f5687e = j3;
        this.f5688f = i2;
        this.f5689g = j4;
        this.f5690h = j5;
        this.i = j6;
        this.j = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0336di.class != obj.getClass()) {
            return false;
        }
        C0336di diVar = (C0336di) obj;
        if (this.f5683a == diVar.f5683a && this.f5687e == diVar.f5687e && this.f5688f == diVar.f5688f && this.f5689g == diVar.f5689g && this.f5690h == diVar.f5690h && this.i == diVar.i && this.j == diVar.j && this.f5684b.equals(diVar.f5684b) && this.f5685c.equals(diVar.f5685c)) {
            return this.f5686d.equals(diVar.f5686d);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f5683a;
        long j3 = this.f5687e;
        long j4 = this.f5689g;
        long j5 = this.f5690h;
        long j6 = this.i;
        long j7 = this.j;
        return (((((((((((((((((((int) (j2 ^ (j2 >>> 32))) * 31) + this.f5684b.hashCode()) * 31) + this.f5685c.hashCode()) * 31) + this.f5686d.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f5688f) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "SocketConfig{secondsToLive=" + this.f5683a + ", token='" + this.f5684b + '\'' + ", ports=" + this.f5685c + ", portsHttp=" + this.f5686d + ", firstDelaySeconds=" + this.f5687e + ", launchDelaySeconds=" + this.f5688f + ", openEventIntervalSeconds=" + this.f5689g + ", minFailedRequestIntervalSeconds=" + this.f5690h + ", minSuccessfulRequestIntervalSeconds=" + this.i + ", openRetryIntervalSeconds=" + this.j + '}';
    }
}
