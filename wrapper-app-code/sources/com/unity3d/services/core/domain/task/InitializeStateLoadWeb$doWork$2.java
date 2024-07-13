package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {50, 57, 59}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadWeb.kt */
final class InitializeStateLoadWeb$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb initializeStateLoadWeb, InitializeStateLoadWeb.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadWeb;
        this.$params = params;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.this$0, this.$params, continuation);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateLoadWeb$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019f, code lost:
        com.unity3d.services.core.log.DeviceLog.exception("Malformed URL", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b8, code lost:
        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.MalformedWebviewRequest, r0, r9.$params.getConfig());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ba, code lost:
        r1 = kotlin.Result.Companion;
        r0 = kotlin.Result.m44constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0014, B:22:0x006a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df A[Catch:{ MalformedURLException -> 0x019e, CancellationException -> 0x01e6, all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0109 A[Catch:{ MalformedURLException -> 0x019e, CancellationException -> 0x01e6, all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130 A[Catch:{ MalformedURLException -> 0x019e, CancellationException -> 0x01e6, all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0147 A[Catch:{ MalformedURLException -> 0x019e, CancellationException -> 0x01e6, all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015d A[Catch:{ MalformedURLException -> 0x019e, CancellationException -> 0x01e6, all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0182 A[Catch:{ MalformedURLException -> 0x019e, CancellationException -> 0x01e6, all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r9 = r16
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x003e
            if (r0 == r13) goto L_0x002f
            if (r0 == r12) goto L_0x0023
            if (r0 != r11) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r0 = r17
            goto L_0x0128
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r0 = r9.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1 = r0
            r0 = r17
            goto L_0x00fd
        L_0x002f:
            java.lang.Object r0 = r9.L$0
            r1 = r0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x003b }
            r0 = r17
            goto L_0x00c6
        L_0x003b:
            r0 = move-exception
            goto L_0x00cf
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1.<init>()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r2 = "Unity Ads init: loading webapp from "
            r1.append(r2)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r2 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r2 = r2.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r2 = r2.getWebViewUrl()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1.append(r2)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.log.DeviceLog.info(r1)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r15.<init>()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.request.WebRequest r1 = new com.unity3d.services.core.request.WebRequest     // Catch:{ MalformedURLException -> 0x019e }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r2 = r9.$params     // Catch:{ MalformedURLException -> 0x019e }
            com.unity3d.services.core.configuration.Configuration r2 = r2.getConfig()     // Catch:{ MalformedURLException -> 0x019e }
            java.lang.String r2 = r2.getWebViewUrl()     // Catch:{ MalformedURLException -> 0x019e }
            java.lang.String r3 = "GET"
            r1.<init>(r2, r3, r14)     // Catch:{ MalformedURLException -> 0x019e }
            r15.element = r1     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r1 = r9.$params     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ all -> 0x00cd }
            int r3 = r1.getMaxRetries()     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r1 = r9.$params     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ all -> 0x00cd }
            double r4 = r1.getRetryScalingFactor()     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r1 = r9.$params     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ all -> 0x00cd }
            long r1 = r1.getRetryDelay()     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.domain.task.InitializationException r6 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.configuration.ErrorState r7 = com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest     // Catch:{ all -> 0x00cd }
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ all -> 0x00cd }
            r8.<init>()     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r11 = r9.$params     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.configuration.Configuration r11 = r11.getConfig()     // Catch:{ all -> 0x00cd }
            r6.<init>(r7, r8, r11)     // Catch:{ all -> 0x00cd }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00cd }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 r7 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1     // Catch:{ all -> 0x00cd }
            r7.<init>(r14, r15, r9, r0)     // Catch:{ all -> 0x00cd }
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch:{ all -> 0x00cd }
            r9.L$0 = r15     // Catch:{ all -> 0x00cd }
            r9.label = r13     // Catch:{ all -> 0x00cd }
            r8 = r16
            java.lang.Object r0 = com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(r1, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x00cd }
            if (r0 != r10) goto L_0x00c5
            return r10
        L_0x00c5:
            r1 = r15
        L_0x00c6:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)     // Catch:{ all -> 0x003b }
            goto L_0x00d9
        L_0x00cd:
            r0 = move-exception
            r1 = r15
        L_0x00cf:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
        L_0x00d9:
            boolean r2 = kotlin.Result.m48isFailureimpl(r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            if (r2 == 0) goto L_0x0147
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r0 = r9.this$0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError r0 = r0.initializeStateNetworkError     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params r2 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r3 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.BaseParams r2 = (com.unity3d.services.core.domain.task.BaseParams) r2     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r9.L$0 = r1     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r9.label = r12     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            if (r0 != r10) goto L_0x00fd
            return r10
        L_0x00fd:
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Object r0 = r0.m51unboximpl()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            boolean r0 = kotlin.Result.m49isSuccessimpl(r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            if (r0 == 0) goto L_0x0130
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r0 = r9.this$0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.ISDKDispatchers r0 = r0.dispatchers     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.getIo()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r2.<init>(r1, r14)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r9.L$0 = r14     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1 = 3
            r9.label = r1     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r2, r9)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            if (r0 != r10) goto L_0x0128
            return r10
        L_0x0128:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r1 = "if (haveNetwork.isSucces…config)\n                }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            goto L_0x0151
        L_0x0130:
            com.unity3d.services.core.domain.task.InitializationException r0 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r3 = "No connected events within the timeout!"
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r3 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r0.<init>(r1, r2, r3)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            throw r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
        L_0x0147:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r1 = "webViewDataResult.getOrThrow()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
        L_0x0151:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r1 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r1 = r1.getWebViewHash()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            if (r1 == 0) goto L_0x0180
            java.lang.String r2 = com.unity3d.services.core.misc.Utilities.Sha256((java.lang.String) r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r2 = r2 ^ r13
            if (r2 != 0) goto L_0x0169
            goto L_0x0180
        L_0x0169:
            com.unity3d.services.core.domain.task.InitializationException r0 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.InvalidHash     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r3 = "Invalid webViewHash"
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r3 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r0.<init>(r1, r2, r3)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            throw r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
        L_0x0180:
            if (r1 == 0) goto L_0x018e
            java.io.File r1 = new java.io.File     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.String r2 = com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1.<init>(r2)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.misc.Utilities.writeFile(r1, r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
        L_0x018e:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$LoadWebResult r1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$LoadWebResult     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r2 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r2 = r2.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1.<init>(r2, r0)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r1)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            goto L_0x01c4
        L_0x019e:
            r0 = move-exception
            java.lang.String r1 = "Malformed URL"
            r2 = r0
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.log.DeviceLog.exception(r1, r2)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializationException r1 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.ErrorState r2 = com.unity3d.services.core.configuration.ErrorState.MalformedWebviewRequest     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r3 = r9.$params     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            r1.<init>(r2, r0, r3)     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
            throw r1     // Catch:{ CancellationException -> 0x01e6, all -> 0x01b9 }
        L_0x01b9:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
        L_0x01c4:
            boolean r1 = kotlin.Result.m49isSuccessimpl(r0)
            if (r1 == 0) goto L_0x01d1
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
            goto L_0x01e1
        L_0x01d1:
            java.lang.Throwable r1 = kotlin.Result.m46exceptionOrNullimpl(r0)
            if (r1 == 0) goto L_0x01e1
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
        L_0x01e1:
            kotlin.Result r0 = kotlin.Result.m43boximpl(r0)
            return r0
        L_0x01e6:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
