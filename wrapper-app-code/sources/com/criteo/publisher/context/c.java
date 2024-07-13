package com.criteo.publisher.context;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextUtil.kt */
public final class c {
    static {
        new c();
    }

    private c() {
    }

    public static final Map<String, Object> a(AbstractContextData<?> abstractContextData) {
        Intrinsics.checkParameterIsNotNull(abstractContextData, "contextData");
        Map<String, Object> data = abstractContextData.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "contextData.getData()");
        return data;
    }
}
