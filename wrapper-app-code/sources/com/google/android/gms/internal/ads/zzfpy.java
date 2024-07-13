package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public enum zzfpy {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);
    
    private final String zzg;

    private zzfpy(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
