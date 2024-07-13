package io.bidmachine;

import com.explorestack.protobuf.adcom.Placement;
import java.util.List;
import java.util.Map;

public abstract class AdRequestParameters {
    private final AdsType adsType;
    private String bidPayload;
    private CustomParams customParams;
    private List<NetworkConfig> networkConfigList;
    private String placementId;
    private PriceFloorParams priceFloorParams;
    private SessionAdParams sessionAdParams;
    private TargetingParams targetingParams;
    private Integer timeOutMs;

    public abstract boolean isPlacementObjectValid(Placement placement) throws Throwable;

    protected AdRequestParameters(AdsType adsType2) {
        this.adsType = adsType2;
    }

    public AdsType getAdsType() {
        return this.adsType;
    }

    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    /* access modifiers changed from: package-private */
    public void setPriceFloorParams(PriceFloorParams priceFloorParams2) {
        this.priceFloorParams = priceFloorParams2;
    }

    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    /* access modifiers changed from: package-private */
    public void setTargetingParams(TargetingParams targetingParams2) {
        this.targetingParams = targetingParams2;
    }

    public SessionAdParams getSessionAdParams() {
        return this.sessionAdParams;
    }

    /* access modifiers changed from: package-private */
    public void setSessionAdParams(SessionAdParams sessionAdParams2) {
        this.sessionAdParams = sessionAdParams2;
    }

    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    /* access modifiers changed from: package-private */
    public void setNetworkConfigList(List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    /* access modifiers changed from: package-private */
    public void setTimeOutMs(Integer num) {
        this.timeOutMs = num;
    }

    public String getBidPayload() {
        return this.bidPayload;
    }

    /* access modifiers changed from: package-private */
    public void setBidPayload(String str) {
        this.bidPayload = str;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    /* access modifiers changed from: package-private */
    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public CustomParams getCustomParams() {
        return this.customParams;
    }

    /* access modifiers changed from: package-private */
    public void setCustomParams(CustomParams customParams2) {
        this.customParams = customParams2;
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return this.adsType == adRequestParameters.adsType;
    }

    public boolean isPricePassedByPriceFloor(double d2) {
        PriceFloorParams priceFloorParams2 = this.priceFloorParams;
        if (priceFloorParams2 == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams2.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        for (Double doubleValue : priceFloors.values()) {
            if (d2 > doubleValue.doubleValue()) {
                return true;
            }
        }
        return false;
    }
}
