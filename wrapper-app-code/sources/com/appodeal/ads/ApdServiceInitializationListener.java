package com.appodeal.ads;

import com.appodeal.ads.networking.LoadingError;

@Deprecated
public interface ApdServiceInitializationListener {
    void onInitializationFailed(LoadingError loadingError);

    void onInitializationFinished();
}
