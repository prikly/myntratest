package com.explorestack.iab.vast;

public interface VastRequestListener extends VastErrorListener {
    void onVastLoaded(VastRequest vastRequest);
}
