package io.bidmachine;

public abstract class FullScreenAdRequestParameters extends AdRequestParameters {
    private final AdContentType adContentType;

    public FullScreenAdRequestParameters(AdsType adsType, AdContentType adContentType2) {
        super(adsType);
        this.adContentType = adContentType2;
    }

    public AdContentType getAdContentType() {
        return this.adContentType;
    }

    public boolean isContentTypeMatch(AdContentType adContentType2) {
        return this.adContentType == AdContentType.All || this.adContentType == adContentType2;
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof FullScreenAdRequestParameters) && isParametersMatchedInternal((FullScreenAdRequestParameters) adRequestParameters);
    }

    private boolean isParametersMatchedInternal(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        return isContentTypeMatch(fullScreenAdRequestParameters.getAdContentType());
    }
}
