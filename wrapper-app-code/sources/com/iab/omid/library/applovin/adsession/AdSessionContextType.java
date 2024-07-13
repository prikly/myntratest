package com.iab.omid.library.applovin.adsession;

import com.onesignal.OSInAppMessageContentKt;

public enum AdSessionContextType {
    HTML(OSInAppMessageContentKt.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    private AdSessionContextType(String str) {
        this.typeString = str;
    }

    public String toString() {
        return this.typeString;
    }
}
