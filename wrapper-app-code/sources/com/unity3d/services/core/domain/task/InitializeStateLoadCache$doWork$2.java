package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.nio.charset.Charset;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadCache.kt */
final class InitializeStateLoadCache$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateLoadCache$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String Sha256;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.Companion;
                DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
                byte[] access$getWebViewData = this.this$0.getWebViewData();
                String str = null;
                if (!(access$getWebViewData == null || (Sha256 = Utilities.Sha256(access$getWebViewData)) == null || !Intrinsics.areEqual((Object) Sha256, (Object) this.$params.getConfig().getWebViewHash()))) {
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-8\")");
                    String str2 = new String(access$getWebViewData, forName);
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                    str = str2;
                }
                obj2 = Result.m44constructorimpl(str);
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m44constructorimpl(ResultKt.createFailure(th));
            }
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
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
