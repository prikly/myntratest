package io.bidmachine;

import android.content.Context;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.IAd;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.unified.UnifiedAd;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import java.util.List;

public abstract class BidMachineAd<SelfType extends IAd, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends AdObject<AdObjectParamsType, UnifiedAdRequestParamsType, ?>, AdObjectParamsType extends AdObjectParams, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, AdListenerType extends AdListener<SelfType>> implements IAd<SelfType, AdRequestType> {
    private final String TAG = Utils.generateTag("BidMachineAd", this);
    public final AdProcessCallback adProcessCallback = new AdProcessCallback() {
        public void processBeforeStartVisibilityTracker() {
        }

        public boolean processVisibilityTrackerShown(UnifiedAd<?, ?> unifiedAd) {
            return true;
        }

        public void processLoadSuccess() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Loading.ordinal()) {
                BidMachineAd.this.log("processLoadSuccess");
                State unused = BidMachineAd.this.currentState = State.Success;
                Utils.onUiThread(new Runnable() {
                    public void run() {
                        if (BidMachineAd.this.listener != null) {
                            BidMachineAd.this.log("notify AdLoaded");
                            BidMachineAd.this.listener.onAdLoaded(BidMachineAd.this);
                        }
                    }
                });
            }
        }

        public void processLoadFail(final BMError bMError) {
            BidMachineAd.this.log(String.format("processLoadFail - %s", new Object[]{bMError}));
            State unused = BidMachineAd.this.currentState = State.Failed;
            Utils.onUiThread(new Runnable() {
                public void run() {
                    if (BidMachineAd.this.listener != null) {
                        BidMachineAd.this.log("notify AdLoadFailed");
                        BidMachineAd.this.listener.onAdLoadFailed(BidMachineAd.this, bMError);
                    }
                }
            });
        }

        public void processFillAd() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal()) {
                BidMachineAd.this.log("processFillAd");
            }
        }

        public void processShowFail(final BMError bMError) {
            BidMachineAd.this.log(String.format("processShowFail - %s", new Object[]{bMError}));
            Utils.onUiThread(new Runnable() {
                public void run() {
                    if (BidMachineAd.this.listener instanceof AdFullScreenListener) {
                        BidMachineAd.this.log("notify AdShowFailed");
                        ((AdFullScreenListener) BidMachineAd.this.listener).onAdShowFailed(BidMachineAd.this, bMError);
                    }
                }
            });
        }

        public void processShown() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal()) {
                BidMachineAd.this.log("processShown");
                Utils.onUiThread(new Runnable() {
                    public void run() {
                        if (BidMachineAd.this.listener != null) {
                            BidMachineAd.this.log("notify AdImpression");
                            BidMachineAd.this.listener.onAdImpression(BidMachineAd.this);
                        }
                    }
                });
            }
        }

        public void processVisibilityTrackerImpression() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal()) {
                BidMachineAd.this.log("processImpression");
            }
        }

        public void processClicked() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal()) {
                BidMachineAd.this.log("processClicked");
                Utils.onUiThread(new Runnable() {
                    public void run() {
                        if (BidMachineAd.this.listener != null) {
                            BidMachineAd.this.log("notify AdClicked");
                            BidMachineAd.this.listener.onAdClicked(BidMachineAd.this);
                        }
                    }
                });
            }
        }

        public void processFinished() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal() && !BidMachineAd.this.isFinishTracked) {
                boolean unused = BidMachineAd.this.isFinishTracked = true;
                BidMachineAd.this.log("processFinished");
                Utils.onUiThread(new Runnable() {
                    public void run() {
                        if (BidMachineAd.this.listener instanceof AdRewardedListener) {
                            BidMachineAd.this.log("notify AdRewarded");
                            ((AdRewardedListener) BidMachineAd.this.listener).onAdRewarded(BidMachineAd.this);
                        }
                    }
                });
            }
        }

        public void processClosed() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal()) {
                BidMachineAd bidMachineAd = BidMachineAd.this;
                bidMachineAd.log(String.format("processClosed (%s)", new Object[]{Boolean.valueOf(bidMachineAd.isFinishTracked)}));
                Utils.onUiThread(new Runnable() {
                    public void run() {
                        if (BidMachineAd.this.listener instanceof AdFullScreenListener) {
                            BidMachineAd.this.log("notify AdClosed");
                            ((AdFullScreenListener) BidMachineAd.this.listener).onAdClosed(BidMachineAd.this, BidMachineAd.this.isFinishTracked);
                        }
                    }
                });
            }
        }

        public void processExpired() {
            if (BidMachineAd.this.currentState.ordinal() <= State.Success.ordinal()) {
                BidMachineAd.this.log("processExpired");
                State unused = BidMachineAd.this.currentState = State.Expired;
                Utils.onUiThread(new Runnable() {
                    public void run() {
                        if (BidMachineAd.this.listener != null) {
                            BidMachineAd.this.log("notify AdExpired");
                            BidMachineAd.this.listener.onAdExpired(BidMachineAd.this);
                        }
                    }
                });
            }
        }

        public void processDestroy() {
            BidMachineAd.this.log("destroy requested");
            State unused = BidMachineAd.this.currentState = State.Destroyed;
            AdResponse adResponse = BidMachineAd.this.getAdResponse();
            if (adResponse != null) {
                adResponse.removeCallback(this);
            }
            if (BidMachineAd.this.adRequest != null) {
                BidMachineAd bidMachineAd = BidMachineAd.this;
                bidMachineAd.detachRequest(bidMachineAd.adRequest);
                BidMachineAd.this.adRequest.destroy();
                BidMachineAd.this.adRequest = null;
            }
        }
    };
    AdRequestType adRequest;
    private final AdRequest.AdRequestListener<AdRequestType> adRequestListener = new AdRequest.AdRequestListener<AdRequestType>() {
        public void onRequestSuccess(AdRequestType adrequesttype, AuctionResult auctionResult) {
            if (adrequesttype == BidMachineAd.this.adRequest) {
                BidMachineAd.this.processRequestSuccess(adrequesttype);
            }
        }

        public void onRequestFailed(AdRequestType adrequesttype, BMError bMError) {
            if (adrequesttype == BidMachineAd.this.adRequest) {
                BidMachineAd.this.processRequestFail(bMError);
            }
        }

        public void onRequestExpired(AdRequestType adrequesttype) {
            if (adrequesttype == BidMachineAd.this.adRequest) {
                BidMachineAd.this.adProcessCallback.processExpired();
            }
        }
    };
    private final AdsType adsType;
    private final Context context;
    private final ContextProvider contextProvider;
    /* access modifiers changed from: private */
    public State currentState = State.Idle;
    private final AdRequest.InternalAdRequestListener<AdRequestType> internalAdRequestListener = new AdRequest.InternalAdRequestListener<AdRequestType>() {
        public void onRequestDestroyed(AdRequestType adrequesttype) {
            if (adrequesttype == BidMachineAd.this.adRequest) {
                BidMachineAd.this.destroy();
            }
        }
    };
    /* access modifiers changed from: private */
    public boolean isFinishTracked;
    /* access modifiers changed from: private */
    public AdListenerType listener;
    final TrackingObject trackingObject;

    enum State {
        Idle,
        Requesting,
        Loading,
        Success,
        Failed,
        Destroyed,
        Expired
    }

    /* access modifiers changed from: protected */
    public abstract AdObjectType createAdObject(ContextProvider contextProvider2, AdRequestType adrequesttype, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback2);

    public BidMachineAd(Context context2, AdsType adsType2) {
        this.context = context2;
        this.adsType = adsType2;
        this.contextProvider = new SimpleContextProvider(context2);
        this.trackingObject = new SimpleTrackingObject() {
            public List<String> getTrackingUrls(TrackEventType trackEventType) {
                AdResponse adResponse = BidMachineAd.this.getAdResponse();
                if (adResponse != null) {
                    return adResponse.getTrackUrls(trackEventType);
                }
                return null;
            }
        };
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: package-private */
    public AdsType getAdsType() {
        return this.adsType;
    }

    /* access modifiers changed from: package-private */
    public ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    public AuctionResult getAuctionResult() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAuctionResult();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final AdResponse getAdResponse() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype == null) {
            return null;
        }
        return adrequesttype.getAdResponse();
    }

    /* access modifiers changed from: protected */
    public final AdObjectType getLoadedAdObject() {
        AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            return null;
        }
        try {
            return adResponse.getAdObject();
        } catch (Throwable unused) {
            return null;
        }
    }

    public SelfType setListener(AdListenerType adlistenertype) {
        this.listener = adlistenertype;
        return this;
    }

    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    public SelfType load(AdRequestType adrequesttype) {
        log("load requested");
        BidMachineEvents.eventStart(this.trackingObject, TrackEventType.Load);
        if (!BidMachineImpl.get().isInitialized()) {
            processRequestFail(BMError.internal("BidMachine not initialized"));
            return this;
        } else if (this.currentState != State.Idle) {
            log("request process abort because it's already processing");
            return this;
        } else if (adrequesttype == null) {
            processRequestFail(BMError.notFound("AdRequest"));
            return this;
        } else {
            detachRequest(this.adRequest);
            this.adRequest = adrequesttype;
            attachRequest(adrequesttype);
            processRequest(adrequesttype);
            return this;
        }
    }

    public void destroy() {
        this.adProcessCallback.processDestroy();
        BidMachineEvents.clear(this.trackingObject);
    }

    public boolean isLoading() {
        return this.currentState == State.Requesting || this.currentState == State.Loading;
    }

    public boolean isLoaded() {
        return getLoadedAdObject() != null && this.currentState == State.Success;
    }

    public boolean canShow() {
        return isLoaded() && isCanShowAd();
    }

    public boolean isDestroyed() {
        return this.currentState == State.Destroyed;
    }

    public boolean isExpired() {
        return this.currentState == State.Expired;
    }

    /* access modifiers changed from: package-private */
    public AdObjectType prepareShow() {
        if (isDestroyed()) {
            processShowFail(BMError.Destroyed);
            return null;
        } else if (isExpired()) {
            processShowFail(BMError.Expired);
            return null;
        } else if (!isLoaded()) {
            processShowFail(BMError.internal("Ad not loaded"));
            return null;
        } else if (isCanShowAd()) {
            return getLoadedAdObject();
        } else {
            processShowFail(BMError.ResponseDuplicated);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isCanShowAd() {
        AdResponse adResponse = getAdResponse();
        return adResponse != null && !adResponse.wasShown();
    }

    private void processRequest(AdRequestType adrequesttype) {
        log("process request start");
        if (getAuctionResult() != null) {
            processRequestSuccess(adrequesttype);
            return;
        }
        this.currentState = State.Requesting;
        adrequesttype.request(this.context);
    }

    /* access modifiers changed from: package-private */
    public void processRequestSuccess(AdRequestType adrequesttype) {
        if (this.currentState.ordinal() <= State.Loading.ordinal()) {
            this.currentState = State.Loading;
            AdResponse adResponse = adrequesttype.getAdResponse();
            if (adResponse == null) {
                processRequestFail(BMError.incorrectContent("AdResponse is null"));
                return;
            }
            log("start loading");
            adResponse.loadAdObject(this.contextProvider, adrequesttype, this, this.adProcessCallback);
        }
    }

    private void attachRequest(AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.addListener(this.adRequestListener);
            adrequesttype.addInternalListener(this.internalAdRequestListener);
        }
    }

    /* access modifiers changed from: private */
    public void detachRequest(AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.removeListener(this.adRequestListener);
            adrequesttype.removeInternalListener(this.internalAdRequestListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void processRequestFail(BMError bMError) {
        if (this.currentState.ordinal() <= State.Loading.ordinal()) {
            trackEvent(TrackEventType.Load, bMError);
            this.adProcessCallback.processLoadFail(bMError);
        }
    }

    /* access modifiers changed from: package-private */
    public void processShowFail(BMError bMError) {
        trackEvent(TrackEventType.Show, bMError);
        this.adProcessCallback.processShowFail(bMError);
    }

    private void trackEvent(TrackEventType trackEventType, BMError bMError) {
        BidMachineEvents.eventFinish(this.trackingObject, trackEventType, getAdsType(), bMError);
    }

    public String toString() {
        return String.format("%s, state - %s, auctionResult - %s", new Object[]{this.TAG, this.currentState, getAuctionResult()});
    }

    /* access modifiers changed from: protected */
    public final void log(String str) {
        if (Logger.isLoggingEnabled()) {
            StringBuilder sb = new StringBuilder(this.adsType.name());
            AuctionResult auctionResult = getAuctionResult();
            if (auctionResult != null) {
                sb.append(" (");
                sb.append(auctionResult.getNetworkKey());
                sb.append(")");
            }
            Logger.log(this.TAG, String.format("%s - %s", new Object[]{sb, str}));
        }
    }
}
