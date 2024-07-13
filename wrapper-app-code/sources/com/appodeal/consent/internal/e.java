package com.appodeal.consent.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.consent.internal.InternalForm$show$1$1$1", f = "InternalForm.kt", l = {}, m = "invokeSuspend")
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f17851a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f17851a = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new e(this.f17851a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17851a.c().onOpened();
        return Unit.INSTANCE;
    }
}
