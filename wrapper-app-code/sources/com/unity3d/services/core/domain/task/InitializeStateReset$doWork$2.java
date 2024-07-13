package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateReset;
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
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {39}, m = "invokeSuspend")
/* compiled from: InitializeStateReset.kt */
final class InitializeStateReset$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateReset.Params $params;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2(InitializeStateReset initializeStateReset, InitializeStateReset.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateReset;
        this.$params = params;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeStateReset$doWork$2(this.this$0, this.$params, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeStateReset$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba A[Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 != r3) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            goto L_0x005e
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.String r7 = "Unity Ads init: starting init"
            com.unity3d.services.core.log.DeviceLog.debug(r7)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            r7.<init>()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.webview.WebViewApp r1 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            r7.element = r1     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            T r1 = r7.element     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.webview.WebViewApp r1 = (com.unity3d.services.core.webview.WebViewApp) r1     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r1 == 0) goto L_0x0036
            r1.resetWebViewAppInitialization()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
        L_0x0036:
            T r1 = r7.element     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.webview.WebViewApp r1 = (com.unity3d.services.core.webview.WebViewApp) r1     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r1 == 0) goto L_0x0041
            com.unity3d.services.core.webview.WebView r1 = r1.getWebView()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x006d
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = r6.$params     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            long r4 = r1.getWebViewAppCreateTimeout()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1 r1 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$invokeSuspend$$inlined$runReturnSuspendCatching$lambda$1     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            r1.<init>(r7, r2, r6)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            r6.label = r3     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r4, r1, r6)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r7 != r0) goto L_0x005e
            return r0
        L_0x005e:
            kotlin.Unit r7 = (kotlin.Unit) r7     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r7 == 0) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.String r0 = "Reset failed on opening ConditionVariable"
            r7.<init>(r0)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            throw r7     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
        L_0x006d:
            com.unity3d.services.core.domain.task.InitializeStateReset r7 = r6.this$0     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            r7.unregisterLifecycleCallbacks()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(r2)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.io.File r7 = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r7 == 0) goto L_0x00ba
            r7 = 0
            com.unity3d.services.core.properties.SdkProperties.setInitialized(r7)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r0 = r6.$params     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.configuration.Configuration r0 = r0.getConfig()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.String[] r0 = r0.getModuleConfigurationList()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r0 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
        L_0x008e:
            int r1 = r0.length     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
        L_0x008f:
            if (r7 >= r1) goto L_0x00af
            r2 = r0[r7]     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r3 = r6.$params     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.configuration.IModuleConfiguration r2 = r3.getModuleConfiguration(r2)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            if (r2 == 0) goto L_0x00ac
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r3 = r6.$params     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            boolean r2 = r2.resetState(r3)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
        L_0x00ac:
            int r7 = r7 + 1
            goto L_0x008f
        L_0x00af:
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r7 = r6.$params     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            com.unity3d.services.core.configuration.Configuration r7 = r7.getConfig()     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r7)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            goto L_0x00cf
        L_0x00ba:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.String r0 = "Cache directory is NULL"
            r7.<init>(r0)     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
            throw r7     // Catch:{ CancellationException -> 0x00f1, all -> 0x00c4 }
        L_0x00c4:
            r7 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r7)
        L_0x00cf:
            boolean r0 = kotlin.Result.m49isSuccessimpl(r7)
            if (r0 == 0) goto L_0x00dc
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r7)
            goto L_0x00ec
        L_0x00dc:
            java.lang.Throwable r0 = kotlin.Result.m46exceptionOrNullimpl(r7)
            if (r0 == 0) goto L_0x00ec
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r7)
        L_0x00ec:
            kotlin.Result r7 = kotlin.Result.m43boximpl(r7)
            return r7
        L_0x00f1:
            r7 = move-exception
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
