package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {28}, m = "invokeSuspend")
/* compiled from: InitializeStateConfig.kt */
final class InitializeStateConfig$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfig.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$2(InitializeStateConfig initializeStateConfig, InitializeStateConfig.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfig;
        this.$params = params;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeStateConfig$doWork$2(this.this$0, this.$params, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateConfig$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Result.Companion companion = Result.Companion;
            DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
            Configuration configuration = new Configuration(SdkProperties.getConfigUrl(), this.$params.getConfig().getExperimentsReader());
            this.label = 1;
            obj = this.this$0.initializeStateConfigWithLoader.invoke(new InitializeStateConfigWithLoader.Params(configuration), this);
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
        Object r5 = ((Result) obj).m51unboximpl();
        ResultKt.throwOnFailure(r5);
        obj2 = Result.m44constructorimpl((Configuration) r5);
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
}
