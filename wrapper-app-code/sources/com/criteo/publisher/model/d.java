package com.criteo.publisher.model;

import com.google.gson.annotations.SerializedName;

/* compiled from: $AutoValue_RemoteConfigRequest */
abstract class d extends w {

    /* renamed from: a  reason: collision with root package name */
    private final String f2771a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2772b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2773c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2774d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2775e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2776f;

    d(String str, String str2, String str3, int i, String str4, String str5) {
        if (str != null) {
            this.f2771a = str;
            if (str2 != null) {
                this.f2772b = str2;
                if (str3 != null) {
                    this.f2773c = str3;
                    this.f2774d = i;
                    this.f2775e = str4;
                    if (str5 != null) {
                        this.f2776f = str5;
                        return;
                    }
                    throw new NullPointerException("Null deviceOs");
                }
                throw new NullPointerException("Null sdkVersion");
            }
            throw new NullPointerException("Null bundleId");
        }
        throw new NullPointerException("Null criteoPublisherId");
    }

    @SerializedName("cpId")
    public String b() {
        return this.f2771a;
    }

    public String a() {
        return this.f2772b;
    }

    public String f() {
        return this.f2773c;
    }

    @SerializedName("rtbProfileId")
    public int e() {
        return this.f2774d;
    }

    public String c() {
        return this.f2775e;
    }

    public String d() {
        return this.f2776f;
    }

    public String toString() {
        return "RemoteConfigRequest{criteoPublisherId=" + this.f2771a + ", bundleId=" + this.f2772b + ", sdkVersion=" + this.f2773c + ", profileId=" + this.f2774d + ", deviceId=" + this.f2775e + ", deviceOs=" + this.f2776f + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f2771a.equals(wVar.b()) || !this.f2772b.equals(wVar.a()) || !this.f2773c.equals(wVar.f()) || this.f2774d != wVar.e() || ((str = this.f2775e) != null ? !str.equals(wVar.c()) : wVar.c() != null) || !this.f2776f.equals(wVar.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((((this.f2771a.hashCode() ^ 1000003) * 1000003) ^ this.f2772b.hashCode()) * 1000003) ^ this.f2773c.hashCode()) * 1000003) ^ this.f2774d) * 1000003;
        String str = this.f2775e;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2776f.hashCode();
    }
}
