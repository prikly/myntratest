package com.yandex.metrica.impl.ob;

import com.yandex.metrica.gpllibrary.a;

/* renamed from: com.yandex.metrica.impl.ob.ac  reason: case insensitive filesystem */
public class C0255ac {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f5475a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5476b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5477c;

    public C0255ac(a.b bVar, long j, long j2) {
        this.f5475a = bVar;
        this.f5476b = j;
        this.f5477c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0255ac.class != obj.getClass()) {
            return false;
        }
        C0255ac acVar = (C0255ac) obj;
        if (this.f5476b == acVar.f5476b && this.f5477c == acVar.f5477c && this.f5475a == acVar.f5475a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5476b;
        long j2 = this.f5477c;
        return (((this.f5475a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "GplArguments{priority=" + this.f5475a + ", durationSeconds=" + this.f5476b + ", intervalSeconds=" + this.f5477c + '}';
    }
}
