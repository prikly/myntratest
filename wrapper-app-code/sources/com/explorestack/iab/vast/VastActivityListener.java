package com.explorestack.iab.vast;

import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.vast.activity.VastActivity;

public interface VastActivityListener extends VastErrorListener {
    void onVastClick(VastActivity vastActivity, VastRequest vastRequest, IabClickCallback iabClickCallback, String str);

    void onVastComplete(VastActivity vastActivity, VastRequest vastRequest);

    void onVastDismiss(VastActivity vastActivity, VastRequest vastRequest, boolean z);

    void onVastShown(VastActivity vastActivity, VastRequest vastRequest);
}
