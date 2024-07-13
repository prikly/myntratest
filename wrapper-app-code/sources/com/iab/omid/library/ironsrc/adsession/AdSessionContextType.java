package com.iab.omid.library.ironsrc.adsession;

import com.onesignal.OSInAppMessageContentKt;

public enum AdSessionContextType {
    HTML(OSInAppMessageContentKt.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    private AdSessionContextType(String str) {
        this.typeString = str;
    }

    public final String toString() {
        return this.typeString;
    }
}
