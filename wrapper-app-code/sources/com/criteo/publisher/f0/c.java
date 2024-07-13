package com.criteo.publisher.f0;

import com.criteo.publisher.f0.t;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: $AutoValue_MetricRequest_MetricRequestFeedback */
abstract class c extends t.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<t.b> f2420a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f2421b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2422c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2423d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f2424e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2425f;

    c(List<t.b> list, Long l, boolean z, long j, Long l2, String str) {
        if (list != null) {
            this.f2420a = list;
            this.f2421b = l;
            this.f2422c = z;
            this.f2423d = j;
            this.f2424e = l2;
            this.f2425f = str;
            return;
        }
        throw new NullPointerException("Null slots");
    }

    /* access modifiers changed from: package-private */
    public List<t.b> e() {
        return this.f2420a;
    }

    /* access modifiers changed from: package-private */
    public Long c() {
        return this.f2421b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("isTimeout")
    public boolean f() {
        return this.f2422c;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f2423d;
    }

    /* access modifiers changed from: package-private */
    public Long a() {
        return this.f2424e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f2425f;
    }

    public String toString() {
        return "MetricRequestFeedback{slots=" + this.f2420a + ", elapsed=" + this.f2421b + ", timeout=" + this.f2422c + ", cdbCallStartElapsed=" + this.f2423d + ", cdbCallEndElapsed=" + this.f2424e + ", requestGroupId=" + this.f2425f + "}";
    }

    public boolean equals(Object obj) {
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        if (this.f2420a.equals(aVar.e()) && ((l = this.f2421b) != null ? l.equals(aVar.c()) : aVar.c() == null) && this.f2422c == aVar.f() && this.f2423d == aVar.b() && ((l2 = this.f2424e) != null ? l2.equals(aVar.a()) : aVar.a() == null)) {
            String str = this.f2425f;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f2420a.hashCode() ^ 1000003) * 1000003;
        Long l = this.f2421b;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        int i2 = this.f2422c ? 1231 : 1237;
        long j = this.f2423d;
        int i3 = (((hashCode2 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l2 = this.f2424e;
        int hashCode3 = (i3 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str = this.f2425f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 ^ i;
    }
}
