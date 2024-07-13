package com.google.android.exoplayer2.upstream;

public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    private final int minimumLoadableRetryCount;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.minimumLoadableRetryCount = i;
    }
}
