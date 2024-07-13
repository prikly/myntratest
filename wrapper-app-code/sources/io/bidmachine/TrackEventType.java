package io.bidmachine;

import io.bidmachine.protobuf.EventTypeExtended;

public enum TrackEventType {
    GetBidToken(-1, 513, 513),
    InitLoading(-1, 506, 506),
    AuctionRequest(-1, 507, 507),
    AuctionRequestCancel(-1, 508, 508),
    AuctionRequestExpired(-1, 509, 509),
    AuctionRequestDestroy(-1, 510, 510),
    Load(-1, 500, 500),
    FillAd(-1, 512, 512),
    Impression(-1, 502, 502),
    Show(1, 501, 501),
    Click(-1, 503, 503),
    Close(-1, 504, 504),
    Expired(-1, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE),
    Error(-1, 1000, 1000),
    Destroy(-1, 505, 505),
    TrackingError(-1, 1001, 1001),
    HeaderBiddingNetworksPrepare(-1, EventTypeExtended.EVENT_TYPE_EXTENDED_ALL_HB_NETWORKS_PREPARED_VALUE, EventTypeExtended.EVENT_TYPE_EXTENDED_ALL_HB_NETWORKS_PREPARED_VALUE),
    HeaderBiddingNetworkInitialize(-1, 701, 701),
    HeaderBiddingNetworkPrepare(-1, 702, 702),
    MediationWin(-1, -1, -1),
    MediationLoss(-1, -1, -1);
    
    private final int ortbActionValue;
    private final int ortbExtValue;
    private final int ortbValue;

    private TrackEventType(int i, int i2, int i3) {
        this.ortbValue = i;
        this.ortbExtValue = i2;
        this.ortbActionValue = i3;
    }

    public static TrackEventType fromNumber(int i) {
        for (TrackEventType trackEventType : values()) {
            if (trackEventType.ortbValue == i || trackEventType.ortbExtValue == i) {
                return trackEventType;
            }
        }
        return null;
    }

    public int getOrtbActionValue() {
        return this.ortbActionValue;
    }

    public String toString() {
        return String.format("%s (%s)", new Object[]{name(), Integer.valueOf(this.ortbExtValue)});
    }
}
