package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.view.ViewGroup;
import java.io.Serializable;

public interface MultiAdsBannerInterface {

    public interface BannerListener extends Serializable {
        void onBannerClicked();

        void onBannerError(String str);

        void onBannerLoaded();
    }

    void loadBanner(ViewGroup viewGroup);

    void onPause();

    void onResume();

    void setListener(BannerListener bannerListener);
}
