package com.criteo.publisher.f0;

import com.criteo.publisher.f0.t;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: $AutoValue_MetricRequest */
abstract class b extends t {

    /* renamed from: a  reason: collision with root package name */
    private final List<t.a> f2415a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2416b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2417c;

    b(List<t.a> list, String str, int i) {
        if (list != null) {
            this.f2415a = list;
            if (str != null) {
                this.f2416b = str;
                this.f2417c = i;
                return;
            }
            throw new NullPointerException("Null wrapperVersion");
        }
        throw new NullPointerException("Null feedbacks");
    }

    /* access modifiers changed from: package-private */
    public List<t.a> a() {
        return this.f2415a;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("wrapper_version")
    public String c() {
        return this.f2416b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("profile_id")
    public int b() {
        return this.f2417c;
    }

    public String toString() {
        return "MetricRequest{feedbacks=" + this.f2415a + ", wrapperVersion=" + this.f2416b + ", profileId=" + this.f2417c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f2415a.equals(tVar.a()) || !this.f2416b.equals(tVar.c()) || this.f2417c != tVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f2415a.hashCode() ^ 1000003) * 1000003) ^ this.f2416b.hashCode()) * 1000003) ^ this.f2417c;
    }
}
