package com.criteo.publisher.f0;

import com.criteo.publisher.logging.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendingQueueLogMessage.kt */
public final class c0 {
    static {
        new c0();
    }

    private c0() {
    }

    public static final e a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "exception");
        return new e(5, "Error while reading queue file. Recovering by recreating it or using in-memory queue", th, "onRecoveringFromStaleQueueFile");
    }

    public static final e a(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "exception");
        return new e(5, "Error when polling element from queue file", exc, "onErrorWhenPollingQueueFile");
    }
}
