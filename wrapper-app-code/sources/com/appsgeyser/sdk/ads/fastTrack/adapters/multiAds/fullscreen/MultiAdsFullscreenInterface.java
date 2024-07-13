package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.content.Context;
import java.io.Serializable;

public interface MultiAdsFullscreenInterface {

    public interface FullscreenListener extends Serializable {
        void onFullscreenClicked();

        void onFullscreenClosed();

        void onFullscreenError(String str);

        void onFullscreenLoaded();

        void onFullscreenOpened();
    }

    boolean isFullscreenLoaded();

    void loadFullscreen();

    void setListener(FullscreenListener fullscreenListener);

    void showFullscreen(Context context);
}
