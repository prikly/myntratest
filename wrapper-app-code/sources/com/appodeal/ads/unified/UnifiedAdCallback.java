package com.appodeal.ads.unified;

import android.os.Bundle;
import com.appodeal.ads.networking.LoadingError;

public abstract class UnifiedAdCallback {
    public abstract void onAdClicked();

    public abstract void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener);

    public abstract void onAdExpired();

    public abstract void onAdInfoRequested(Bundle bundle);

    public abstract void onAdLoadFailed(LoadingError loadingError);

    public abstract void onAdShowFailed();

    public abstract void printError(String str, Object obj);
}
