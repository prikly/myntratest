package com.criteo.publisher.model;

import com.criteo.publisher.n0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004R\u001c\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00178V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/criteo/publisher/model/BannerAdUnit;", "Lcom/criteo/publisher/model/AdUnit;", "", "component1", "()Ljava/lang/String;", "Lcom/criteo/publisher/model/AdSize;", "component2", "()Lcom/criteo/publisher/model/AdSize;", "adUnitId", "size", "copy", "(Ljava/lang/String;Lcom/criteo/publisher/model/AdSize;)Lcom/criteo/publisher/model/BannerAdUnit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdUnitId", "Lcom/criteo/publisher/util/AdUnitType;", "getAdUnitType", "()Lcom/criteo/publisher/util/AdUnitType;", "adUnitType", "Lcom/criteo/publisher/model/AdSize;", "getSize", "<init>", "(Ljava/lang/String;Lcom/criteo/publisher/model/AdSize;)V", "publisher-sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BannerAdUnit.kt */
public final class BannerAdUnit implements AdUnit {
    private final String adUnitId;
    private final AdSize size;

    public static /* synthetic */ BannerAdUnit copy$default(BannerAdUnit bannerAdUnit, String str, AdSize adSize, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdUnit.getAdUnitId();
        }
        if ((i & 2) != 0) {
            adSize = bannerAdUnit.size;
        }
        return bannerAdUnit.copy(str, adSize);
    }

    public final String component1() {
        return getAdUnitId();
    }

    public final AdSize component2() {
        return this.size;
    }

    public final BannerAdUnit copy(String str, AdSize adSize) {
        Intrinsics.checkParameterIsNotNull(str, "adUnitId");
        Intrinsics.checkParameterIsNotNull(adSize, "size");
        return new BannerAdUnit(str, adSize);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdUnit)) {
            return false;
        }
        BannerAdUnit bannerAdUnit = (BannerAdUnit) obj;
        return Intrinsics.areEqual((Object) getAdUnitId(), (Object) bannerAdUnit.getAdUnitId()) && Intrinsics.areEqual((Object) this.size, (Object) bannerAdUnit.size);
    }

    public int hashCode() {
        String adUnitId2 = getAdUnitId();
        int i = 0;
        int hashCode = (adUnitId2 != null ? adUnitId2.hashCode() : 0) * 31;
        AdSize adSize = this.size;
        if (adSize != null) {
            i = adSize.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "BannerAdUnit(adUnitId=" + getAdUnitId() + ", size=" + this.size + ")";
    }

    public BannerAdUnit(String str, AdSize adSize) {
        Intrinsics.checkParameterIsNotNull(str, "adUnitId");
        Intrinsics.checkParameterIsNotNull(adSize, "size");
        this.adUnitId = str;
        this.size = adSize;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public final AdSize getSize() {
        return this.size;
    }

    public a getAdUnitType() {
        return a.CRITEO_BANNER;
    }
}
