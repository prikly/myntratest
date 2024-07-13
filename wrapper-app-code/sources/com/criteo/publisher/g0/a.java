package com.criteo.publisher.g0;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyDependency.kt */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f2516a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2517b;

    private final T b() {
        return this.f2516a.getValue();
    }

    public a(String str, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "supplier");
        this.f2517b = str;
        this.f2516a = LazyKt.lazy(function0);
    }

    public final T a() {
        return b();
    }

    public String toString() {
        String str = this.f2517b;
        if (str != null) {
            String str2 = "LazyDependency(" + str + ')';
            if (str2 != null) {
                return str2;
            }
        }
        return super.toString();
    }
}
