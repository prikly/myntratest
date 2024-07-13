package io.bidmachine.ads.networks.notsy;

import io.bidmachine.AdsFormat;
import java.util.Map;

class InternalNotsyAdUnit {
    private final AdsFormat adsFormat;
    private final Map<String, String> customTargeting;
    private final InternalNotsyData internalNotsyData;

    InternalNotsyAdUnit(AdsFormat adsFormat2, InternalNotsyData internalNotsyData2, Map<String, String> map) {
        this.adsFormat = adsFormat2;
        this.internalNotsyData = internalNotsyData2;
        this.customTargeting = map;
    }

    /* access modifiers changed from: package-private */
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    /* access modifiers changed from: package-private */
    public InternalNotsyData getInternalNotsyData() {
        return this.internalNotsyData;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getCustomTargeting() {
        return this.customTargeting;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalNotsyAdUnit internalNotsyAdUnit = (InternalNotsyAdUnit) obj;
        if (this.adsFormat == internalNotsyAdUnit.adsFormat && this.internalNotsyData == internalNotsyAdUnit.internalNotsyData) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.adsFormat.hashCode() * 31) + this.internalNotsyData.hashCode();
    }
}
