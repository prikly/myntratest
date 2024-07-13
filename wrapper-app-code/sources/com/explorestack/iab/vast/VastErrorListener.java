package com.explorestack.iab.vast;

import android.content.Context;

public interface VastErrorListener {
    void onVastError(Context context, VastRequest vastRequest, int i);
}
