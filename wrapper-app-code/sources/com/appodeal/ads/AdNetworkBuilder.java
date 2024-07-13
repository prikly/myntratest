package com.appodeal.ads;

import com.appodeal.ads.utils.ActivityRule;

public abstract class AdNetworkBuilder {
    public abstract AdNetwork build();

    public ActivityRule[] getAdActivityRules() {
        return new ActivityRule[0];
    }

    public abstract String getAdapterVersion();

    public abstract String getName();
}
