package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/unity3d/services/core/domain/task/InitializeStateNetworkError$doWork$2$1$success$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
/* compiled from: InitializeStateNetworkError.kt */
final class InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError$doWork$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1(Continuation continuation, InitializeStateNetworkError$doWork$2 initializeStateNetworkError$doWork$2) {
        super(2, continuation);
        this.this$0 = initializeStateNetworkError$doWork$2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1(continuation, this.this$0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = this;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            this.this$0.this$0.startListening(cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 initializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 = (InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
