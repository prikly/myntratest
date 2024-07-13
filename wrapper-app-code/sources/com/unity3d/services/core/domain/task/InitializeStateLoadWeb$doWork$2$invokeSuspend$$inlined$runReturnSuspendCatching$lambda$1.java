package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.request.WebRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/unity3d/services/core/domain/task/InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1", "com/unity3d/services/core/domain/task/InitializeStateLoadWeb$doWork$2$$special$$inlined$runCatching$lambda$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1", f = "InitializeStateLoadWeb.kt", l = {52}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadWeb.kt */
final class InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 extends SuspendLambda implements Function2<Integer, Continuation<? super String>, Object> {
    final /* synthetic */ Ref.ObjectRef $request$inlined;
    final /* synthetic */ CoroutineScope $this_withContext$inlined;
    private /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateLoadWeb$doWork$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1(Continuation continuation, Ref.ObjectRef objectRef, InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2, CoroutineScope coroutineScope) {
        super(2, continuation);
        this.$request$inlined = objectRef;
        this.this$0 = initializeStateLoadWeb$doWork$2;
        this.$this_withContext$inlined = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 initializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 = new InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1(continuation, this.$request$inlined, this.this$0, this.$this_withContext$inlined);
        Number number = (Number) obj;
        number.intValue();
        initializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1.I$0 = number.intValue();
        return initializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryWebview();
            }
            this.label = 1;
            obj = BuildersKt.withContext(this.this$0.this$0.dispatchers.getIo(), new AnonymousClass1(this, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/unity3d/services/core/domain/task/InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1", "com/unity3d/services/core/domain/task/InitializeStateLoadWeb$doWork$2$$special$$inlined$runCatching$lambda$1$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1", f = "InitializeStateLoadWeb.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1$1  reason: invalid class name */
    /* compiled from: InitializeStateLoadWeb.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;
        final /* synthetic */ InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 this$0;

        {
            this.this$0 = r1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return ((WebRequest) this.this$0.$request$inlined.element).makeRequest();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
