package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", "com/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2$$special$$inlined$runCatching$lambda$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {60}, m = "invokeSuspend")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef $config$inlined;
    final /* synthetic */ Ref.ObjectRef $configurationLoader$inlined;
    final /* synthetic */ CoroutineScope $this_withContext$inlined;
    private /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader$doWork$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1(Continuation continuation, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2, CoroutineScope coroutineScope) {
        super(2, continuation);
        this.$configurationLoader$inlined = objectRef;
        this.$config$inlined = objectRef2;
        this.this$0 = initializeStateConfigWithLoader$doWork$2;
        this.$this_withContext$inlined = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 initializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 = new InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1(continuation, this.$configurationLoader$inlined, this.$config$inlined, this.this$0, this.$this_withContext$inlined);
        Number number = (Number) obj;
        number.intValue();
        initializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1.I$0 = number.intValue();
        return initializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            this.label = 1;
            if (BuildersKt.withContext(this.this$0.this$0.dispatchers.getIo(), new AnonymousClass1(this, (Continuation) null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", "com/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2$$special$$inlined$runCatching$lambda$1$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1$1  reason: invalid class name */
    /* compiled from: InitializeStateConfigWithLoader.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 this$0;

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
                ((IConfigurationLoader) this.this$0.$configurationLoader$inlined.element).loadConfiguration(new IConfigurationLoaderListener(this) {
                    final /* synthetic */ AnonymousClass1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public void onSuccess(Configuration configuration) {
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        this.this$0.this$0.$config$inlined.element = configuration;
                        ((Configuration) this.this$0.this$0.$config$inlined.element).saveToDisk();
                        TokenStorage.getInstance().setInitToken(((Configuration) this.this$0.this$0.$config$inlined.element).getUnifiedAuctionToken());
                    }

                    public void onError(String str) {
                        Intrinsics.checkNotNullParameter(str, "errorMsg");
                        SDKMetrics.getInstance().sendMetric(TSIMetric.newEmergencySwitchOff());
                        throw new AbortRetryException(str);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
