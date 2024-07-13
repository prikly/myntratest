package com.iab.omid.library.amazon.adsession;

import com.unity3d.services.core.device.MimeTypes;

public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);
    
    private final String creativeType;

    private CreativeType(String str) {
        this.creativeType = str;
    }

    public String toString() {
        return this.creativeType;
    }
}
