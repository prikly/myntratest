package io.bidmachine;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdView;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.utils.BMError;

public abstract class AdView<SelfType extends AdView<SelfType, AdType, AdRequestType, AdObjectType, ExternalAdListenerType>, AdType extends ViewAd<AdType, AdRequestType, AdObjectType, ?, AdListener<AdType>>, AdRequestType extends AdRequest<AdRequestType, ?, ?>, AdObjectType extends ViewAdObject<AdRequestType, ?, ?>, ExternalAdListenerType extends AdListener<SelfType>> extends FrameLayout implements IAd<SelfType, AdRequestType> {
    private final AdListener<AdType> adListener;
    private AdType currentAd;
    /* access modifiers changed from: private */
    public ExternalAdListenerType externalListener;
    private boolean isAttachedToWindow;
    private boolean isShowPending;
    private AdType pendingAd;

    /* access modifiers changed from: protected */
    public abstract AdType createAd(Context context);

    public AdView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isShowPending = false;
        this.isAttachedToWindow = false;
        this.adListener = new AdListener<AdType>() {
            public void onAdLoaded(AdType adtype) {
                if (AdView.this.externalListener != null) {
                    AdView.this.externalListener.onAdLoaded(AdView.this);
                }
                AdView.this.performShow();
            }

            public void onAdLoadFailed(AdType adtype, BMError bMError) {
                if (AdView.this.externalListener != null) {
                    AdView.this.externalListener.onAdLoadFailed(AdView.this, bMError);
                }
            }

            public void onAdClicked(AdType adtype) {
                if (AdView.this.externalListener != null) {
                    AdView.this.externalListener.onAdClicked(AdView.this);
                }
            }

            public void onAdImpression(AdType adtype) {
                if (AdView.this.externalListener != null) {
                    AdView.this.externalListener.onAdImpression(AdView.this);
                }
            }

            public void onAdExpired(AdType adtype) {
                if (AdView.this.externalListener != null) {
                    AdView.this.externalListener.onAdExpired(AdView.this);
                }
            }
        };
    }

    public SelfType setListener(ExternalAdListenerType externaladlistenertype) {
        this.externalListener = externaladlistenertype;
        return this;
    }

    public SelfType load(AdRequestType adrequesttype) {
        this.isShowPending = true;
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            adtype.destroy();
        }
        AdType createAd = createAd(getContext());
        this.pendingAd = createAd;
        createAd.setListener(this.adListener);
        this.pendingAd.load(adrequesttype);
        return this;
    }

    public void destroy() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.destroy();
            this.currentAd = null;
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            adtype2.destroy();
            this.pendingAd = null;
        }
    }

    public boolean isLoaded() {
        return isLoaded(this.currentAd) || isLoaded(this.pendingAd);
    }

    private boolean isLoaded(AdType adtype) {
        return adtype != null && adtype.isLoaded();
    }

    public boolean isLoading() {
        AdType adtype = this.pendingAd;
        return adtype != null && adtype.isLoading();
    }

    public boolean isExpired() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isExpired();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isExpired();
    }

    public boolean isDestroyed() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isDestroyed();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isDestroyed();
    }

    public AuctionResult getAuctionResult() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            return adtype.getAuctionResult();
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            return adtype2.getAuctionResult();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AdType getCurrentAd() {
        return this.currentAd;
    }

    /* access modifiers changed from: protected */
    public AdType getPendingAd() {
        return this.pendingAd;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getVisibility() == 0) {
            performShow();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        performShow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        this.isShowPending = true;
    }

    public boolean canShow() {
        return canShow(this.currentAd) || canShow(this.pendingAd);
    }

    private boolean canShow(AdType adtype) {
        return adtype != null && adtype.canShow();
    }

    private boolean canPerformShow() {
        return this.isAttachedToWindow && this.isShowPending && getVisibility() != 8;
    }

    private void prepareDisplayRequest() {
        AdType adtype = this.pendingAd;
        if (adtype != null && adtype.isLoaded()) {
            AdType adtype2 = this.currentAd;
            if (adtype2 != null) {
                adtype2.destroy();
            }
            this.currentAd = this.pendingAd;
            this.pendingAd = null;
        }
    }

    /* access modifiers changed from: private */
    public void performShow() {
        if (canPerformShow()) {
            prepareDisplayRequest();
            if (canShow()) {
                this.currentAd.show(this);
                this.isShowPending = false;
            }
        }
    }
}
