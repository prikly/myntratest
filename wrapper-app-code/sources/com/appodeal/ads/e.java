package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@DebugMetadata(c = "com.appodeal.ads.AdLifecycleTrackerImpl$onActivityPaused$1", f = "AdLifecycleTracker.kt", l = {70}, m = "invokeSuspend")
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16376b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f16376b = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new e(this.f16376b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f16375a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f16376b.f16351c = System.currentTimeMillis();
            this.f16375a = 1;
            if (DelayKt.delay(1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.f16376b.f16352d < this.f16376b.f16351c) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_PAUSE);
            this.f16376b.f16353e.set(true);
            d.g(this.f16376b);
        }
        return Unit.INSTANCE;
    }
}
