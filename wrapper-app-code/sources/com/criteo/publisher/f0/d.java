package com.criteo.publisher.f0;

import com.criteo.publisher.f0.t;

/* compiled from: $AutoValue_MetricRequest_MetricRequestSlot */
abstract class d extends t.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2426a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f2427b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2428c;

    d(String str, Integer num, boolean z) {
        this.f2426a = str;
        this.f2427b = num;
        this.f2428c = z;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f2426a;
    }

    /* access modifiers changed from: package-private */
    public Integer c() {
        return this.f2427b;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f2428c;
    }

    public String toString() {
        return "MetricRequestSlot{impressionId=" + this.f2426a + ", zoneId=" + this.f2427b + ", cachedBidUsed=" + this.f2428c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.b)) {
            return false;
        }
        t.b bVar = (t.b) obj;
        String str = this.f2426a;
        if (str != null ? str.equals(bVar.b()) : bVar.b() == null) {
            Integer num = this.f2427b;
            if (num != null ? num.equals(bVar.c()) : bVar.c() == null) {
                if (this.f2428c == bVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2426a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.f2427b;
        if (num != null) {
            i = num.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.f2428c ? 1231 : 1237);
    }
}
