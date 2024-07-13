package com.appodeal.ads.regulator;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@DebugMetadata(c = "com.appodeal.ads.regulator.ConsentSdkImpl$sendAction$1", f = "ConsentSdk.kt", l = {208}, m = "invokeSuspend")
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f17160b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f17161c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, a aVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f17160b = dVar;
        this.f17161c = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new g(this.f17160b, this.f17161c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f17159a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow a2 = this.f17160b.f17139e;
            a aVar = this.f17161c;
            this.f17159a = 1;
            if (a2.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
