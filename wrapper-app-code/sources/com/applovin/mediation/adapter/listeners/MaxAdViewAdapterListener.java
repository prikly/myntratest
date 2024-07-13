package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import android.view.View;
import com.applovin.mediation.adapter.MaxAdapterError;

public interface MaxAdViewAdapterListener extends MaxAdapterListener {
    void onAdViewAdClicked();

    void onAdViewAdClicked(Bundle bundle);

    void onAdViewAdCollapsed();

    void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onAdViewAdDisplayed();

    void onAdViewAdDisplayed(Bundle bundle);

    void onAdViewAdExpanded();

    void onAdViewAdHidden();

    void onAdViewAdHidden(Bundle bundle);

    void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError);

    void onAdViewAdLoaded(View view);

    void onAdViewAdLoaded(View view, Bundle bundle);
}
