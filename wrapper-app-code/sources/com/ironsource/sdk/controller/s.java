package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private t f9271a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9272b = false;

    s(t tVar) {
        this.f9271a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f9272b) {
            return "";
        }
        this.f9272b = true;
        return this.f9271a.f9273a;
    }
}
