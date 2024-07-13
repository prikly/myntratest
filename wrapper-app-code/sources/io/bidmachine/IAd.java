package io.bidmachine;

import io.bidmachine.AdRequest;
import io.bidmachine.IAd;
import io.bidmachine.models.AuctionResult;

interface IAd<SelfType extends IAd, AdRequestType extends AdRequest> {
    boolean canShow();

    void destroy();

    AuctionResult getAuctionResult();

    boolean isDestroyed();

    boolean isExpired();

    boolean isLoaded();

    boolean isLoading();

    SelfType load(AdRequestType adrequesttype);
}
