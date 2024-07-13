package com.criteo.publisher.logging;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LogTag.kt */
public final class f {
    static {
        new f();
    }

    private f() {
    }

    public static final String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        return StringsKt.take("CriteoSdk" + str, 23);
    }
}
