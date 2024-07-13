package io.bidmachine;

import io.bidmachine.unified.UnifiedAd;
import io.bidmachine.utils.BMError;

public interface AdProcessCallback {
    void processBeforeStartVisibilityTracker();

    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(BMError bMError);

    void processLoadSuccess();

    void processShowFail(BMError bMError);

    void processShown();

    void processVisibilityTrackerImpression();

    boolean processVisibilityTrackerShown(UnifiedAd<?, ?> unifiedAd);
}
