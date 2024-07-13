package com.criteo.publisher.model;

import com.google.gson.annotations.SerializedName;
import java.util.Collection;

/* compiled from: $AutoValue_CdbRequestSlot */
abstract class b extends q {

    /* renamed from: a  reason: collision with root package name */
    private final String f2718a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2719b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f2720c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f2721d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f2722e;

    /* renamed from: f  reason: collision with root package name */
    private final Collection<String> f2723f;

    b(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Collection<String> collection) {
        if (str != null) {
            this.f2718a = str;
            if (str2 != null) {
                this.f2719b = str2;
                this.f2720c = bool;
                this.f2721d = bool2;
                this.f2722e = bool3;
                if (collection != null) {
                    this.f2723f = collection;
                    return;
                }
                throw new NullPointerException("Null getSizes");
            }
            throw new NullPointerException("Null getPlacementId");
        }
        throw new NullPointerException("Null getImpressionId");
    }

    @SerializedName("impId")
    public String a() {
        return this.f2718a;
    }

    @SerializedName("placementId")
    public String b() {
        return this.f2719b;
    }

    @SerializedName("isNative")
    public Boolean e() {
        return this.f2720c;
    }

    @SerializedName("interstitial")
    public Boolean d() {
        return this.f2721d;
    }

    @SerializedName("rewarded")
    public Boolean f() {
        return this.f2722e;
    }

    @SerializedName("sizes")
    public Collection<String> c() {
        return this.f2723f;
    }

    public String toString() {
        return "CdbRequestSlot{getImpressionId=" + this.f2718a + ", getPlacementId=" + this.f2719b + ", isNativeAd=" + this.f2720c + ", isInterstitial=" + this.f2721d + ", isRewarded=" + this.f2722e + ", getSizes=" + this.f2723f + "}";
    }

    public boolean equals(Object obj) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f2718a.equals(qVar.a()) || !this.f2719b.equals(qVar.b()) || ((bool = this.f2720c) != null ? !bool.equals(qVar.e()) : qVar.e() != null) || ((bool2 = this.f2721d) != null ? !bool2.equals(qVar.d()) : qVar.d() != null) || ((bool3 = this.f2722e) != null ? !bool3.equals(qVar.f()) : qVar.f() != null) || !this.f2723f.equals(qVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((this.f2718a.hashCode() ^ 1000003) * 1000003) ^ this.f2719b.hashCode()) * 1000003;
        Boolean bool = this.f2720c;
        int i = 0;
        int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.f2721d;
        int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.f2722e;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f2723f.hashCode();
    }
}
