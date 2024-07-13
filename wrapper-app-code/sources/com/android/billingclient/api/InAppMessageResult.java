package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class InAppMessageResult {
    private final String mPurchaseToken;
    private final int mResponseCode;

    public InAppMessageResult(int i, String str) {
        this.mResponseCode = i;
        this.mPurchaseToken = str;
    }
}
