package com.appodeal.ads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

public final class o0 extends Lambda implements Function0<CoroutineScope> {

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f17006a = new o0();

    public o0() {
        super(0);
    }

    public final Object invoke() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }
}
