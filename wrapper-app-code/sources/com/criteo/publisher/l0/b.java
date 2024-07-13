package com.criteo.publisher.l0;

import com.criteo.publisher.logging.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrivacyLogMessage.kt */
public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final e a(String str) {
        return new e(0, "MoPub consent set: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(boolean z) {
        return new e(0, "CCPA opt-out set: " + z, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
