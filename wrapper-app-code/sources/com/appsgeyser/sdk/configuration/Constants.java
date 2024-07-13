package com.appsgeyser.sdk.configuration;

public class Constants {
    public static final String PLATFORM_VERSION = "2.44.s";
    private static long fullScreenDelay = -1;

    public enum ReferrerInfoStatus {
        OK,
        FEATURE_NOT_SUPPORTED,
        UNAVAILABLE,
        REMOTE_EXCEPTION
    }

    public static long getFullScreenDelay() {
        long j = fullScreenDelay;
        if (j != -1) {
            return j;
        }
        return 2000;
    }

    public static void setFullScreenDelay(long j) {
        fullScreenDelay = j;
    }
}
