package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2$1$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef $config;
    final /* synthetic */ Ref.ObjectRef $configurationLoader;
    final /* synthetic */ CoroutineScope $this_withContext$inlined;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader$doWork$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Continuation continuation, InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2, CoroutineScope coroutineScope) {
        super(2, continuation);
        this.$configurationLoader = objectRef;
        this.$config = objectRef2;
        this.this$0 = initializeStateConfigWithLoader$doWork$2;
        this.$this_withContext$inlined = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2(this.$configurationLoader, this.$config, continuation, this.this$0, this.$this_withContext$inlined);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ((IConfigurationLoader) this.$configurationLoader.element).loadConfiguration(new IConfigurationLoaderListener(this) {
                final /* synthetic */ InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2 this$0;

                {
                    this.this$0 = r1;
                }

                public void onSuccess(Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "configuration");
                    this.this$0.$config.element = configuration;
                    ((Configuration) this.this$0.$config.element).saveToDisk();
                    TokenStorage.getInstance().setInitToken(((Configuration) this.this$0.$config.element).getUnifiedAuctionToken());
                }

                public void onError(String str) {
                    Intrinsics.checkNotNullParameter(str, "errorMsg");
                    SDKMetrics.getInstance().sendMetric(TSIMetric.newEmergencySwitchOff());
                    throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(str), this.this$0.this$0.$params.getConfig());
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
