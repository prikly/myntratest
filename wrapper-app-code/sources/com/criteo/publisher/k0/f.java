package com.criteo.publisher.k0;

import com.criteo.publisher.logging.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkLogMessage.kt */
public final class f {
    static {
        new f();
    }

    private f() {
    }

    public static final e b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "requestPayload");
        return new e(0, "CDB Request initiated: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "responsePayload");
        return new e(0, "CDB Response received: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
