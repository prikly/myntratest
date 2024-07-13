package com.google.android.gms.internal.ads;

import com.onesignal.OSInAppMessageContentKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public enum zzfpw {
    HTML(OSInAppMessageContentKt.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String zze;

    private zzfpw(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
