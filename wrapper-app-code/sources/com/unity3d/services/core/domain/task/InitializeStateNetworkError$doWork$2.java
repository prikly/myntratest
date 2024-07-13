package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
/* compiled from: InitializeStateNetworkError.kt */
final class InitializeStateNetworkError$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateNetworkError$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Result.Companion companion = Result.Companion;
            DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            this.this$0.maximumConnectedEvents = this.$params.getConfig().getMaximumConnectedEvents();
            this.this$0.connectedEventThreshold = this.$params.getConfig().getConnectedEventThreshold();
            this.label = 1;
            obj = TimeoutKt.withTimeoutOrNull(this.$params.getConfig().getNetworkErrorTimeout(), new InitializeStateNetworkError$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1((Continuation) null, this), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m44constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Unit) obj) != null) {
            obj2 = Result.m44constructorimpl(Unit.INSTANCE);
            if (Result.m49isSuccessimpl(obj2)) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.m44constructorimpl(obj2);
            } else {
                Throwable r0 = Result.m46exceptionOrNullimpl(obj2);
                if (r0 != null) {
                    Result.Companion companion4 = Result.Companion;
                    obj2 = Result.m44constructorimpl(ResultKt.createFailure(r0));
                }
            }
            return Result.m43boximpl(obj2);
        }
        ConnectivityMonitor.removeListener(this.this$0);
        throw new Exception("No connected events within the timeout!");
    }
}
