package com.onesignal;

import android.content.Context;

class DelayedConsentInitializationParameters {
    private final String appId;
    private final Context context;

    DelayedConsentInitializationParameters(Context context2, String str) {
        this.context = context2;
        this.appId = str;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: package-private */
    public String getAppId() {
        return this.appId;
    }
}
