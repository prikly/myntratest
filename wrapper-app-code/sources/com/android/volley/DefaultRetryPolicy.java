package com.android.volley;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class DefaultRetryPolicy implements RetryPolicy {
    private final float mBackoffMultiplier;
    private int mCurrentRetryCount;
    private int mCurrentTimeoutMs;
    private final int mMaxNumRetries;

    public DefaultRetryPolicy() {
        this(IronSourceConstants.IS_INSTANCE_NOT_FOUND, 0, 1.0f);
    }

    public DefaultRetryPolicy(int i, int i2, float f2) {
        this.mCurrentTimeoutMs = i;
        this.mMaxNumRetries = i2;
        this.mBackoffMultiplier = f2;
    }

    public int getCurrentTimeout() {
        return this.mCurrentTimeoutMs;
    }

    public int getCurrentRetryCount() {
        return this.mCurrentRetryCount;
    }

    public void retry(VolleyError volleyError) throws VolleyError {
        this.mCurrentRetryCount++;
        int i = this.mCurrentTimeoutMs;
        this.mCurrentTimeoutMs = (int) (((float) i) + (((float) i) * this.mBackoffMultiplier));
        if (!hasAttemptRemaining()) {
            throw volleyError;
        }
    }

    /* access modifiers changed from: protected */
    public boolean hasAttemptRemaining() {
        return this.mCurrentRetryCount <= this.mMaxNumRetries;
    }
}
