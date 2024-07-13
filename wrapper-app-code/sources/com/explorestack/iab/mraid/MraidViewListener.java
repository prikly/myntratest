package com.explorestack.iab.mraid;

import com.explorestack.iab.utils.IabClickCallback;

public interface MraidViewListener {
    void onClose(MraidView mraidView);

    void onError(MraidView mraidView, int i);

    void onExpand(MraidView mraidView);

    void onLoaded(MraidView mraidView);

    void onOpenBrowser(MraidView mraidView, String str, IabClickCallback iabClickCallback);

    void onPlayVideo(MraidView mraidView, String str);

    void onShown(MraidView mraidView);
}
