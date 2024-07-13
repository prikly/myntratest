package com.criteo.publisher.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* compiled from: $AutoValue_Publisher */
abstract class c extends v {

    /* renamed from: a  reason: collision with root package name */
    private final String f2768a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2769b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f2770c;

    c(String str, String str2, Map<String, Object> map) {
        if (str != null) {
            this.f2768a = str;
            if (str2 != null) {
                this.f2769b = str2;
                if (map != null) {
                    this.f2770c = map;
                    return;
                }
                throw new NullPointerException("Null ext");
            }
            throw new NullPointerException("Null criteoPublisherId");
        }
        throw new NullPointerException("Null bundleId");
    }

    public String a() {
        return this.f2768a;
    }

    @SerializedName("cpId")
    public String b() {
        return this.f2769b;
    }

    public Map<String, Object> c() {
        return this.f2770c;
    }

    public String toString() {
        return "Publisher{bundleId=" + this.f2768a + ", criteoPublisherId=" + this.f2769b + ", ext=" + this.f2770c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f2768a.equals(vVar.a()) || !this.f2769b.equals(vVar.b()) || !this.f2770c.equals(vVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f2768a.hashCode() ^ 1000003) * 1000003) ^ this.f2769b.hashCode()) * 1000003) ^ this.f2770c.hashCode();
    }
}
