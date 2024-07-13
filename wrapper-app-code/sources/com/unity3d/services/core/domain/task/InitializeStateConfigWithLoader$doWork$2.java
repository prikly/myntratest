package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 80, 83}, m = "invokeSuspend")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, continuation);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: kotlinx.coroutines.CoroutineScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: kotlinx.coroutines.CoroutineScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0130 A[Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0163 A[Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a2 A[Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b9 A[Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r9 = r22
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            r11 = 3
            r12 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0059
            if (r0 == r7) goto L_0x0042
            if (r0 == r12) goto L_0x0028
            if (r0 != r11) goto L_0x0020
            java.lang.Object r0 = r9.L$1
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            java.lang.Object r1 = r9.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r23)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            goto L_0x0196
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            java.lang.Object r0 = r9.L$3
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            java.lang.Object r1 = r9.L$2
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r2 = r9.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r3 = r9.L$0
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.throwOnFailure(r23)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r7 = r0
            r8 = r1
            r6 = r3
            r0 = r23
            goto L_0x0157
        L_0x0042:
            java.lang.Object r0 = r9.L$2
            r1 = r0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r9.L$1
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r9.L$0
            r3 = r0
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.throwOnFailure(r23)     // Catch:{ all -> 0x0056 }
            goto L_0x0115
        L_0x0056:
            r0 = move-exception
            goto L_0x0120
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r23)
            java.lang.Object r0 = r9.L$0
            r13 = r0
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.PrivacyConfigStorage r0 = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.device.reader.DeviceInfoDataFactory r1 = new com.unity3d.services.core.device.reader.DeviceInfoDataFactory     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r1.<init>()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r14.<init>()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.ConfigurationLoader r2 = new com.unity3d.services.core.configuration.ConfigurationLoader     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.ConfigurationRequestFactory r3 = new com.unity3d.services.core.configuration.ConfigurationRequestFactory     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r4 = r9.$params     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r4 = r4.getConfig()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.InitRequestType r5 = com.unity3d.services.core.configuration.InitRequestType.TOKEN     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.device.reader.IDeviceInfoDataContainer r5 = r1.getDeviceInfoData(r5)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r3.<init>(r4, r5)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.IConfigurationLoader r2 = (com.unity3d.services.core.configuration.IConfigurationLoader) r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r14.element = r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.PrivacyConfigurationLoader r2 = new com.unity3d.services.core.configuration.PrivacyConfigurationLoader     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            T r3 = r14.element     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.IConfigurationLoader r3 = (com.unity3d.services.core.configuration.IConfigurationLoader) r3     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.ConfigurationRequestFactory r4 = new com.unity3d.services.core.configuration.ConfigurationRequestFactory     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r5 = r9.$params     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r5 = r5.getConfig()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.InitRequestType r6 = com.unity3d.services.core.configuration.InitRequestType.PRIVACY     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.device.reader.IDeviceInfoDataContainer r1 = r1.getDeviceInfoData(r6)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r4.<init>(r5, r1)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r2.<init>(r3, r4, r0)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.IConfigurationLoader r2 = (com.unity3d.services.core.configuration.IConfigurationLoader) r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r14.element = r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r15.<init>()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r0 = new com.unity3d.services.core.configuration.Configuration     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r0.<init>()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r15.element = r0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r0 = r9.$params     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.configuration.Configuration r0 = r0.getConfig()     // Catch:{ all -> 0x011c }
            int r0 = r0.getMaxRetries()     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r1 = r9.$params     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ all -> 0x011c }
            double r16 = r1.getRetryScalingFactor()     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r1 = r9.$params     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ all -> 0x011c }
            long r18 = r1.getRetryDelay()     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.domain.task.InitializationException r1 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.configuration.ErrorState r2 = com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest     // Catch:{ all -> 0x011c }
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x011c }
            r3.<init>()     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r4 = r9.$params     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.configuration.Configuration r4 = r4.getConfig()     // Catch:{ all -> 0x011c }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x011c }
            r8 = r1
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x011c }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 r20 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1     // Catch:{ all -> 0x011c }
            r2 = 0
            r1 = r20
            r3 = r14
            r4 = r15
            r5 = r22
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x011c }
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20     // Catch:{ all -> 0x011c }
            r9.L$0 = r13     // Catch:{ all -> 0x011c }
            r9.L$1 = r14     // Catch:{ all -> 0x011c }
            r9.L$2 = r15     // Catch:{ all -> 0x011c }
            r9.label = r7     // Catch:{ all -> 0x011c }
            r1 = r18
            r3 = r0
            r4 = r16
            r6 = r8
            r7 = r20
            r8 = r22
            java.lang.Object r0 = com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(r1, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x011c }
            if (r0 != r10) goto L_0x0112
            return r10
        L_0x0112:
            r3 = r13
            r2 = r14
            r1 = r15
        L_0x0115:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x012a
        L_0x011c:
            r0 = move-exception
            r3 = r13
            r2 = r14
            r1 = r15
        L_0x0120:
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
        L_0x012a:
            boolean r0 = kotlin.Result.m48isFailureimpl(r0)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            if (r0 == 0) goto L_0x01b9
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader r0 = r9.this$0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError r0 = r0.initializeStateNetworkError     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params r4 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r5 = r9.$params     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r5 = r5.getConfig()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.BaseParams r4 = (com.unity3d.services.core.domain.task.BaseParams) r4     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$0 = r3     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$1 = r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$2 = r1     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$3 = r1     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.label = r12     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Object r0 = r0.invoke(r4, r9)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            if (r0 != r10) goto L_0x0154
            return r10
        L_0x0154:
            r7 = r1
            r8 = r7
            r6 = r3
        L_0x0157:
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Object r0 = r0.m51unboximpl()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            boolean r0 = kotlin.Result.m49isSuccessimpl(r0)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            if (r0 == 0) goto L_0x01a2
            com.unity3d.services.core.configuration.IInitializeEventsMetricSender r0 = com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r0.onRetryConfig()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader r0 = r9.this$0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.ISDKDispatchers r0 = r0.dispatchers     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.getIo()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2 r12 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r4 = 0
            r1 = r12
            r3 = r8
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$0 = r8     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$1 = r7     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r1 = 0
            r9.L$2 = r1     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.L$3 = r1     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r9.label = r11     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r12, r9)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            if (r0 != r10) goto L_0x0194
            return r10
        L_0x0194:
            r0 = r7
            r1 = r8
        L_0x0196:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            T r2 = r1.element     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r2 = (com.unity3d.services.core.configuration.Configuration) r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r21 = r1
            r1 = r0
            r0 = r21
            goto L_0x01bf
        L_0x01a2:
            com.unity3d.services.core.domain.task.InitializationException r0 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.String r3 = "No connected events within the timeout!"
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r3 = r9.$params     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r0.<init>(r1, r2, r3)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            throw r0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
        L_0x01b9:
            T r0 = r1.element     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r2 = r0
            com.unity3d.services.core.configuration.Configuration r2 = (com.unity3d.services.core.configuration.Configuration) r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            r0 = r1
        L_0x01bf:
            r1.element = r2     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            T r0 = r0.element     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            com.unity3d.services.core.configuration.Configuration r0 = (com.unity3d.services.core.configuration.Configuration) r0     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)     // Catch:{ CancellationException -> 0x01f7, all -> 0x01ca }
            goto L_0x01d5
        L_0x01ca:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
        L_0x01d5:
            boolean r1 = kotlin.Result.m49isSuccessimpl(r0)
            if (r1 == 0) goto L_0x01e2
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
            goto L_0x01f2
        L_0x01e2:
            java.lang.Throwable r1 = kotlin.Result.m46exceptionOrNullimpl(r0)
            if (r1 == 0) goto L_0x01f2
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
        L_0x01f2:
            kotlin.Result r0 = kotlin.Result.m43boximpl(r0)
            return r0
        L_0x01f7:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
