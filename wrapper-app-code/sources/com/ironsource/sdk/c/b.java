package com.ironsource.sdk.c;

import android.webkit.JavascriptInterface;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private c f9044a;

    b(c cVar) {
        this.f9044a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f9044a.handleMessageFromAd(str);
    }
}
